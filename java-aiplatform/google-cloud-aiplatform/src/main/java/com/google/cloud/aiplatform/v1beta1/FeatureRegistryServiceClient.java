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

package com.google.cloud.aiplatform.v1beta1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.aiplatform.v1beta1.stub.FeatureRegistryServiceStub;
import com.google.cloud.aiplatform.v1beta1.stub.FeatureRegistryServiceStubSettings;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: The service that handles CRUD and List for resources for FeatureRegistry.
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
 * try (FeatureRegistryServiceClient featureRegistryServiceClient =
 *     FeatureRegistryServiceClient.create()) {
 *   FeatureGroupName name = FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]");
 *   FeatureGroup response = featureRegistryServiceClient.getFeatureGroup(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the FeatureRegistryServiceClient object to clean up
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
 *      <td><p> CreateFeatureGroup</td>
 *      <td><p> Creates a new FeatureGroup in a given project and location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createFeatureGroupAsync(CreateFeatureGroupRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> createFeatureGroupAsync(LocationName parent, FeatureGroup featureGroup, String featureGroupId)
 *           <li><p> createFeatureGroupAsync(String parent, FeatureGroup featureGroup, String featureGroupId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createFeatureGroupOperationCallable()
 *           <li><p> createFeatureGroupCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetFeatureGroup</td>
 *      <td><p> Gets details of a single FeatureGroup.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getFeatureGroup(GetFeatureGroupRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getFeatureGroup(FeatureGroupName name)
 *           <li><p> getFeatureGroup(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getFeatureGroupCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListFeatureGroups</td>
 *      <td><p> Lists FeatureGroups in a given project and location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listFeatureGroups(ListFeatureGroupsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listFeatureGroups(LocationName parent)
 *           <li><p> listFeatureGroups(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listFeatureGroupsPagedCallable()
 *           <li><p> listFeatureGroupsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateFeatureGroup</td>
 *      <td><p> Updates the parameters of a single FeatureGroup.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateFeatureGroupAsync(UpdateFeatureGroupRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> updateFeatureGroupAsync(FeatureGroup featureGroup, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateFeatureGroupOperationCallable()
 *           <li><p> updateFeatureGroupCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteFeatureGroup</td>
 *      <td><p> Deletes a single FeatureGroup.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteFeatureGroupAsync(DeleteFeatureGroupRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteFeatureGroupAsync(FeatureGroupName name, boolean force)
 *           <li><p> deleteFeatureGroupAsync(String name, boolean force)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteFeatureGroupOperationCallable()
 *           <li><p> deleteFeatureGroupCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateFeature</td>
 *      <td><p> Creates a new Feature in a given FeatureGroup.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createFeatureAsync(CreateFeatureRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> createFeatureAsync(EntityTypeName parent, Feature feature, String featureId)
 *           <li><p> createFeatureAsync(FeatureGroupName parent, Feature feature, String featureId)
 *           <li><p> createFeatureAsync(String parent, Feature feature, String featureId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createFeatureOperationCallable()
 *           <li><p> createFeatureCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> BatchCreateFeatures</td>
 *      <td><p> Creates a batch of Features in a given FeatureGroup.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> batchCreateFeaturesAsync(EntityTypeName parent, List&lt;CreateFeatureRequest&gt; requests)
 *           <li><p> batchCreateFeaturesAsync(FeatureGroupName parent, List&lt;CreateFeatureRequest&gt; requests)
 *           <li><p> batchCreateFeaturesAsync(String parent, List&lt;CreateFeatureRequest&gt; requests)
 *           <li><p> batchCreateFeaturesAsync(BatchCreateFeaturesRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> batchCreateFeaturesOperationCallable()
 *           <li><p> batchCreateFeaturesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetFeature</td>
 *      <td><p> Gets details of a single Feature.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getFeature(GetFeatureRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getFeature(FeatureName name)
 *           <li><p> getFeature(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getFeatureCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListFeatures</td>
 *      <td><p> Lists Features in a given FeatureGroup.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listFeatures(ListFeaturesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listFeatures(EntityTypeName parent)
 *           <li><p> listFeatures(FeatureGroupName parent)
 *           <li><p> listFeatures(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listFeaturesPagedCallable()
 *           <li><p> listFeaturesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateFeature</td>
 *      <td><p> Updates the parameters of a single Feature.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateFeatureAsync(UpdateFeatureRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> updateFeatureAsync(Feature feature, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateFeatureOperationCallable()
 *           <li><p> updateFeatureCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteFeature</td>
 *      <td><p> Deletes a single Feature.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteFeatureAsync(DeleteFeatureRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteFeatureAsync(FeatureName name)
 *           <li><p> deleteFeatureAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteFeatureOperationCallable()
 *           <li><p> deleteFeatureCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateFeatureMonitor</td>
 *      <td><p> Creates a new FeatureMonitor in a given project, location and FeatureGroup.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createFeatureMonitorAsync(CreateFeatureMonitorRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> createFeatureMonitorAsync(FeatureGroupName parent, FeatureMonitor featureMonitor, String featureMonitorId)
 *           <li><p> createFeatureMonitorAsync(String parent, FeatureMonitor featureMonitor, String featureMonitorId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createFeatureMonitorOperationCallable()
 *           <li><p> createFeatureMonitorCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetFeatureMonitor</td>
 *      <td><p> Gets details of a single FeatureMonitor.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getFeatureMonitor(GetFeatureMonitorRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getFeatureMonitor(FeatureMonitorName name)
 *           <li><p> getFeatureMonitor(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getFeatureMonitorCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListFeatureMonitors</td>
 *      <td><p> Lists FeatureGroups in a given project and location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listFeatureMonitors(ListFeatureMonitorsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listFeatureMonitors(FeatureGroupName parent)
 *           <li><p> listFeatureMonitors(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listFeatureMonitorsPagedCallable()
 *           <li><p> listFeatureMonitorsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateFeatureMonitor</td>
 *      <td><p> Updates the parameters of a single FeatureMonitor.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateFeatureMonitorAsync(UpdateFeatureMonitorRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> updateFeatureMonitorAsync(FeatureMonitor featureMonitor, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateFeatureMonitorOperationCallable()
 *           <li><p> updateFeatureMonitorCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteFeatureMonitor</td>
 *      <td><p> Deletes a single FeatureMonitor.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteFeatureMonitorAsync(DeleteFeatureMonitorRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteFeatureMonitorAsync(FeatureMonitorName name)
 *           <li><p> deleteFeatureMonitorAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteFeatureMonitorOperationCallable()
 *           <li><p> deleteFeatureMonitorCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateFeatureMonitorJob</td>
 *      <td><p> Creates a new feature monitor job.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createFeatureMonitorJob(CreateFeatureMonitorJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createFeatureMonitorJob(FeatureMonitorName parent, FeatureMonitorJob featureMonitorJob, long featureMonitorJobId)
 *           <li><p> createFeatureMonitorJob(String parent, FeatureMonitorJob featureMonitorJob, long featureMonitorJobId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createFeatureMonitorJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetFeatureMonitorJob</td>
 *      <td><p> Get a feature monitor job.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getFeatureMonitorJob(GetFeatureMonitorJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getFeatureMonitorJob(FeatureMonitorJobName name)
 *           <li><p> getFeatureMonitorJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getFeatureMonitorJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListFeatureMonitorJobs</td>
 *      <td><p> List feature monitor jobs.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listFeatureMonitorJobs(ListFeatureMonitorJobsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listFeatureMonitorJobs(FeatureMonitorName parent)
 *           <li><p> listFeatureMonitorJobs(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listFeatureMonitorJobsPagedCallable()
 *           <li><p> listFeatureMonitorJobsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListLocations</td>
 *      <td><p> Lists information about the supported locations for this service.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listLocations(ListLocationsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listLocationsPagedCallable()
 *           <li><p> listLocationsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetLocation</td>
 *      <td><p> Gets information about a location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getLocation(GetLocationRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getLocationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SetIamPolicy</td>
 *      <td><p> Sets the access control policy on the specified resource. Replacesany existing policy.
 * <p> Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED`errors.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> setIamPolicy(SetIamPolicyRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> setIamPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetIamPolicy</td>
 *      <td><p> Gets the access control policy for a resource. Returns an empty policyif the resource exists and does not have a policy set.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getIamPolicy(GetIamPolicyRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getIamPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> TestIamPermissions</td>
 *      <td><p> Returns permissions that a caller has on the specified resource. If theresource does not exist, this will return an empty set ofpermissions, not a `NOT_FOUND` error.
 * <p> Note: This operation is designed to be used for buildingpermission-aware UIs and command-line tools, not for authorizationchecking. This operation may "fail open" without warning.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> testIamPermissions(TestIamPermissionsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> testIamPermissionsCallable()
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
 * <p>This class can be customized by passing in a custom instance of FeatureRegistryServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * FeatureRegistryServiceSettings featureRegistryServiceSettings =
 *     FeatureRegistryServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * FeatureRegistryServiceClient featureRegistryServiceClient =
 *     FeatureRegistryServiceClient.create(featureRegistryServiceSettings);
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
 * FeatureRegistryServiceSettings featureRegistryServiceSettings =
 *     FeatureRegistryServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * FeatureRegistryServiceClient featureRegistryServiceClient =
 *     FeatureRegistryServiceClient.create(featureRegistryServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class FeatureRegistryServiceClient implements BackgroundResource {
  private final FeatureRegistryServiceSettings settings;
  private final FeatureRegistryServiceStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of FeatureRegistryServiceClient with default settings. */
  public static final FeatureRegistryServiceClient create() throws IOException {
    return create(FeatureRegistryServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of FeatureRegistryServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final FeatureRegistryServiceClient create(FeatureRegistryServiceSettings settings)
      throws IOException {
    return new FeatureRegistryServiceClient(settings);
  }

  /**
   * Constructs an instance of FeatureRegistryServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(FeatureRegistryServiceSettings).
   */
  public static final FeatureRegistryServiceClient create(FeatureRegistryServiceStub stub) {
    return new FeatureRegistryServiceClient(stub);
  }

  /**
   * Constructs an instance of FeatureRegistryServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected FeatureRegistryServiceClient(FeatureRegistryServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((FeatureRegistryServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  protected FeatureRegistryServiceClient(FeatureRegistryServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final FeatureRegistryServiceSettings getSettings() {
    return settings;
  }

  public FeatureRegistryServiceStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new FeatureGroup in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   FeatureGroup featureGroup = FeatureGroup.newBuilder().build();
   *   String featureGroupId = "featureGroupId-1768466396";
   *   FeatureGroup response =
   *       featureRegistryServiceClient
   *           .createFeatureGroupAsync(parent, featureGroup, featureGroupId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to create FeatureGroups. Format:
   *     `projects/{project}/locations/{location}`
   * @param featureGroup Required. The FeatureGroup to create.
   * @param featureGroupId Required. The ID to use for this FeatureGroup, which will become the
   *     final component of the FeatureGroup's resource name.
   *     <p>This value may be up to 128 characters, and valid characters are `[a-z0-9_]`. The first
   *     character cannot be a number.
   *     <p>The value must be unique within the project and location.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<FeatureGroup, CreateFeatureGroupOperationMetadata>
      createFeatureGroupAsync(
          LocationName parent, FeatureGroup featureGroup, String featureGroupId) {
    CreateFeatureGroupRequest request =
        CreateFeatureGroupRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setFeatureGroup(featureGroup)
            .setFeatureGroupId(featureGroupId)
            .build();
    return createFeatureGroupAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new FeatureGroup in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   FeatureGroup featureGroup = FeatureGroup.newBuilder().build();
   *   String featureGroupId = "featureGroupId-1768466396";
   *   FeatureGroup response =
   *       featureRegistryServiceClient
   *           .createFeatureGroupAsync(parent, featureGroup, featureGroupId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to create FeatureGroups. Format:
   *     `projects/{project}/locations/{location}`
   * @param featureGroup Required. The FeatureGroup to create.
   * @param featureGroupId Required. The ID to use for this FeatureGroup, which will become the
   *     final component of the FeatureGroup's resource name.
   *     <p>This value may be up to 128 characters, and valid characters are `[a-z0-9_]`. The first
   *     character cannot be a number.
   *     <p>The value must be unique within the project and location.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<FeatureGroup, CreateFeatureGroupOperationMetadata>
      createFeatureGroupAsync(String parent, FeatureGroup featureGroup, String featureGroupId) {
    CreateFeatureGroupRequest request =
        CreateFeatureGroupRequest.newBuilder()
            .setParent(parent)
            .setFeatureGroup(featureGroup)
            .setFeatureGroupId(featureGroupId)
            .build();
    return createFeatureGroupAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new FeatureGroup in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   CreateFeatureGroupRequest request =
   *       CreateFeatureGroupRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFeatureGroup(FeatureGroup.newBuilder().build())
   *           .setFeatureGroupId("featureGroupId-1768466396")
   *           .build();
   *   FeatureGroup response = featureRegistryServiceClient.createFeatureGroupAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<FeatureGroup, CreateFeatureGroupOperationMetadata>
      createFeatureGroupAsync(CreateFeatureGroupRequest request) {
    return createFeatureGroupOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new FeatureGroup in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   CreateFeatureGroupRequest request =
   *       CreateFeatureGroupRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFeatureGroup(FeatureGroup.newBuilder().build())
   *           .setFeatureGroupId("featureGroupId-1768466396")
   *           .build();
   *   OperationFuture<FeatureGroup, CreateFeatureGroupOperationMetadata> future =
   *       featureRegistryServiceClient.createFeatureGroupOperationCallable().futureCall(request);
   *   // Do something.
   *   FeatureGroup response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CreateFeatureGroupRequest, FeatureGroup, CreateFeatureGroupOperationMetadata>
      createFeatureGroupOperationCallable() {
    return stub.createFeatureGroupOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new FeatureGroup in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   CreateFeatureGroupRequest request =
   *       CreateFeatureGroupRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFeatureGroup(FeatureGroup.newBuilder().build())
   *           .setFeatureGroupId("featureGroupId-1768466396")
   *           .build();
   *   ApiFuture<Operation> future =
   *       featureRegistryServiceClient.createFeatureGroupCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateFeatureGroupRequest, Operation> createFeatureGroupCallable() {
    return stub.createFeatureGroupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureGroupName name = FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]");
   *   FeatureGroup response = featureRegistryServiceClient.getFeatureGroup(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the FeatureGroup resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeatureGroup getFeatureGroup(FeatureGroupName name) {
    GetFeatureGroupRequest request =
        GetFeatureGroupRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getFeatureGroup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String name = FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString();
   *   FeatureGroup response = featureRegistryServiceClient.getFeatureGroup(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the FeatureGroup resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeatureGroup getFeatureGroup(String name) {
    GetFeatureGroupRequest request = GetFeatureGroupRequest.newBuilder().setName(name).build();
    return getFeatureGroup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   GetFeatureGroupRequest request =
   *       GetFeatureGroupRequest.newBuilder()
   *           .setName(FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString())
   *           .build();
   *   FeatureGroup response = featureRegistryServiceClient.getFeatureGroup(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeatureGroup getFeatureGroup(GetFeatureGroupRequest request) {
    return getFeatureGroupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   GetFeatureGroupRequest request =
   *       GetFeatureGroupRequest.newBuilder()
   *           .setName(FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString())
   *           .build();
   *   ApiFuture<FeatureGroup> future =
   *       featureRegistryServiceClient.getFeatureGroupCallable().futureCall(request);
   *   // Do something.
   *   FeatureGroup response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetFeatureGroupRequest, FeatureGroup> getFeatureGroupCallable() {
    return stub.getFeatureGroupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists FeatureGroups in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (FeatureGroup element :
   *       featureRegistryServiceClient.listFeatureGroups(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list FeatureGroups. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeatureGroupsPagedResponse listFeatureGroups(LocationName parent) {
    ListFeatureGroupsRequest request =
        ListFeatureGroupsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listFeatureGroups(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists FeatureGroups in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (FeatureGroup element :
   *       featureRegistryServiceClient.listFeatureGroups(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list FeatureGroups. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeatureGroupsPagedResponse listFeatureGroups(String parent) {
    ListFeatureGroupsRequest request =
        ListFeatureGroupsRequest.newBuilder().setParent(parent).build();
    return listFeatureGroups(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists FeatureGroups in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   ListFeatureGroupsRequest request =
   *       ListFeatureGroupsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   for (FeatureGroup element :
   *       featureRegistryServiceClient.listFeatureGroups(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeatureGroupsPagedResponse listFeatureGroups(ListFeatureGroupsRequest request) {
    return listFeatureGroupsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists FeatureGroups in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   ListFeatureGroupsRequest request =
   *       ListFeatureGroupsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   ApiFuture<FeatureGroup> future =
   *       featureRegistryServiceClient.listFeatureGroupsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (FeatureGroup element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListFeatureGroupsRequest, ListFeatureGroupsPagedResponse>
      listFeatureGroupsPagedCallable() {
    return stub.listFeatureGroupsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists FeatureGroups in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   ListFeatureGroupsRequest request =
   *       ListFeatureGroupsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   while (true) {
   *     ListFeatureGroupsResponse response =
   *         featureRegistryServiceClient.listFeatureGroupsCallable().call(request);
   *     for (FeatureGroup element : response.getFeatureGroupsList()) {
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
  public final UnaryCallable<ListFeatureGroupsRequest, ListFeatureGroupsResponse>
      listFeatureGroupsCallable() {
    return stub.listFeatureGroupsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureGroup featureGroup = FeatureGroup.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   FeatureGroup response =
   *       featureRegistryServiceClient.updateFeatureGroupAsync(featureGroup, updateMask).get();
   * }
   * }</pre>
   *
   * @param featureGroup Required. The FeatureGroup's `name` field is used to identify the
   *     FeatureGroup to be updated. Format:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * @param updateMask Field mask is used to specify the fields to be overwritten in the
   *     FeatureGroup resource by the update. The fields specified in the update_mask are relative
   *     to the resource, not the full request. A field will be overwritten if it is in the mask. If
   *     the user does not provide a mask then only the non-empty fields present in the request will
   *     be overwritten. Set the update_mask to `&#42;` to override all fields.
   *     <p>Updatable fields:
   *     <p>&#42; `labels` &#42; `description` &#42; `big_query` &#42; `big_query.entity_id_columns`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<FeatureGroup, UpdateFeatureGroupOperationMetadata>
      updateFeatureGroupAsync(FeatureGroup featureGroup, FieldMask updateMask) {
    UpdateFeatureGroupRequest request =
        UpdateFeatureGroupRequest.newBuilder()
            .setFeatureGroup(featureGroup)
            .setUpdateMask(updateMask)
            .build();
    return updateFeatureGroupAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   UpdateFeatureGroupRequest request =
   *       UpdateFeatureGroupRequest.newBuilder()
   *           .setFeatureGroup(FeatureGroup.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   FeatureGroup response = featureRegistryServiceClient.updateFeatureGroupAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<FeatureGroup, UpdateFeatureGroupOperationMetadata>
      updateFeatureGroupAsync(UpdateFeatureGroupRequest request) {
    return updateFeatureGroupOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   UpdateFeatureGroupRequest request =
   *       UpdateFeatureGroupRequest.newBuilder()
   *           .setFeatureGroup(FeatureGroup.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   OperationFuture<FeatureGroup, UpdateFeatureGroupOperationMetadata> future =
   *       featureRegistryServiceClient.updateFeatureGroupOperationCallable().futureCall(request);
   *   // Do something.
   *   FeatureGroup response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          UpdateFeatureGroupRequest, FeatureGroup, UpdateFeatureGroupOperationMetadata>
      updateFeatureGroupOperationCallable() {
    return stub.updateFeatureGroupOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   UpdateFeatureGroupRequest request =
   *       UpdateFeatureGroupRequest.newBuilder()
   *           .setFeatureGroup(FeatureGroup.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       featureRegistryServiceClient.updateFeatureGroupCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateFeatureGroupRequest, Operation> updateFeatureGroupCallable() {
    return stub.updateFeatureGroupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureGroupName name = FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]");
   *   boolean force = true;
   *   featureRegistryServiceClient.deleteFeatureGroupAsync(name, force).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the FeatureGroup to be deleted. Format:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * @param force If set to true, any Features under this FeatureGroup will also be deleted.
   *     (Otherwise, the request will only work if the FeatureGroup has no Features.)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteFeatureGroupAsync(
      FeatureGroupName name, boolean force) {
    DeleteFeatureGroupRequest request =
        DeleteFeatureGroupRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setForce(force)
            .build();
    return deleteFeatureGroupAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String name = FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString();
   *   boolean force = true;
   *   featureRegistryServiceClient.deleteFeatureGroupAsync(name, force).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the FeatureGroup to be deleted. Format:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * @param force If set to true, any Features under this FeatureGroup will also be deleted.
   *     (Otherwise, the request will only work if the FeatureGroup has no Features.)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteFeatureGroupAsync(
      String name, boolean force) {
    DeleteFeatureGroupRequest request =
        DeleteFeatureGroupRequest.newBuilder().setName(name).setForce(force).build();
    return deleteFeatureGroupAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   DeleteFeatureGroupRequest request =
   *       DeleteFeatureGroupRequest.newBuilder()
   *           .setName(FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString())
   *           .setForce(true)
   *           .build();
   *   featureRegistryServiceClient.deleteFeatureGroupAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteFeatureGroupAsync(
      DeleteFeatureGroupRequest request) {
    return deleteFeatureGroupOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   DeleteFeatureGroupRequest request =
   *       DeleteFeatureGroupRequest.newBuilder()
   *           .setName(FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString())
   *           .setForce(true)
   *           .build();
   *   OperationFuture<Empty, DeleteOperationMetadata> future =
   *       featureRegistryServiceClient.deleteFeatureGroupOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteFeatureGroupRequest, Empty, DeleteOperationMetadata>
      deleteFeatureGroupOperationCallable() {
    return stub.deleteFeatureGroupOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   DeleteFeatureGroupRequest request =
   *       DeleteFeatureGroupRequest.newBuilder()
   *           .setName(FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString())
   *           .setForce(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       featureRegistryServiceClient.deleteFeatureGroupCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteFeatureGroupRequest, Operation> deleteFeatureGroupCallable() {
    return stub.deleteFeatureGroupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Feature in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   EntityTypeName parent =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
   *   Feature feature = Feature.newBuilder().build();
   *   String featureId = "featureId-420503887";
   *   Feature response =
   *       featureRegistryServiceClient.createFeatureAsync(parent, feature, featureId).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the EntityType or FeatureGroup to create a
   *     Feature. Format for entity_type as parent:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   *     Format for feature_group as parent:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * @param feature Required. The Feature to create.
   * @param featureId Required. The ID to use for the Feature, which will become the final component
   *     of the Feature's resource name.
   *     <p>This value may be up to 128 characters, and valid characters are `[a-z0-9_]`. The first
   *     character cannot be a number.
   *     <p>The value must be unique within an EntityType/FeatureGroup.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Feature, CreateFeatureOperationMetadata> createFeatureAsync(
      EntityTypeName parent, Feature feature, String featureId) {
    CreateFeatureRequest request =
        CreateFeatureRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setFeature(feature)
            .setFeatureId(featureId)
            .build();
    return createFeatureAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Feature in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureGroupName parent = FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]");
   *   Feature feature = Feature.newBuilder().build();
   *   String featureId = "featureId-420503887";
   *   Feature response =
   *       featureRegistryServiceClient.createFeatureAsync(parent, feature, featureId).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the EntityType or FeatureGroup to create a
   *     Feature. Format for entity_type as parent:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   *     Format for feature_group as parent:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * @param feature Required. The Feature to create.
   * @param featureId Required. The ID to use for the Feature, which will become the final component
   *     of the Feature's resource name.
   *     <p>This value may be up to 128 characters, and valid characters are `[a-z0-9_]`. The first
   *     character cannot be a number.
   *     <p>The value must be unique within an EntityType/FeatureGroup.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Feature, CreateFeatureOperationMetadata> createFeatureAsync(
      FeatureGroupName parent, Feature feature, String featureId) {
    CreateFeatureRequest request =
        CreateFeatureRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setFeature(feature)
            .setFeatureId(featureId)
            .build();
    return createFeatureAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Feature in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String parent =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *           .toString();
   *   Feature feature = Feature.newBuilder().build();
   *   String featureId = "featureId-420503887";
   *   Feature response =
   *       featureRegistryServiceClient.createFeatureAsync(parent, feature, featureId).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the EntityType or FeatureGroup to create a
   *     Feature. Format for entity_type as parent:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   *     Format for feature_group as parent:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * @param feature Required. The Feature to create.
   * @param featureId Required. The ID to use for the Feature, which will become the final component
   *     of the Feature's resource name.
   *     <p>This value may be up to 128 characters, and valid characters are `[a-z0-9_]`. The first
   *     character cannot be a number.
   *     <p>The value must be unique within an EntityType/FeatureGroup.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Feature, CreateFeatureOperationMetadata> createFeatureAsync(
      String parent, Feature feature, String featureId) {
    CreateFeatureRequest request =
        CreateFeatureRequest.newBuilder()
            .setParent(parent)
            .setFeature(feature)
            .setFeatureId(featureId)
            .build();
    return createFeatureAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Feature in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   CreateFeatureRequest request =
   *       CreateFeatureRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setFeature(Feature.newBuilder().build())
   *           .setFeatureId("featureId-420503887")
   *           .build();
   *   Feature response = featureRegistryServiceClient.createFeatureAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Feature, CreateFeatureOperationMetadata> createFeatureAsync(
      CreateFeatureRequest request) {
    return createFeatureOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Feature in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   CreateFeatureRequest request =
   *       CreateFeatureRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setFeature(Feature.newBuilder().build())
   *           .setFeatureId("featureId-420503887")
   *           .build();
   *   OperationFuture<Feature, CreateFeatureOperationMetadata> future =
   *       featureRegistryServiceClient.createFeatureOperationCallable().futureCall(request);
   *   // Do something.
   *   Feature response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateFeatureRequest, Feature, CreateFeatureOperationMetadata>
      createFeatureOperationCallable() {
    return stub.createFeatureOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Feature in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   CreateFeatureRequest request =
   *       CreateFeatureRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setFeature(Feature.newBuilder().build())
   *           .setFeatureId("featureId-420503887")
   *           .build();
   *   ApiFuture<Operation> future =
   *       featureRegistryServiceClient.createFeatureCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateFeatureRequest, Operation> createFeatureCallable() {
    return stub.createFeatureCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a batch of Features in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   EntityTypeName parent =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
   *   List<CreateFeatureRequest> requests = new ArrayList<>();
   *   BatchCreateFeaturesResponse response =
   *       featureRegistryServiceClient.batchCreateFeaturesAsync(parent, requests).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the EntityType/FeatureGroup to create the batch of
   *     Features under. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * @param requests Required. The request message specifying the Features to create. All Features
   *     must be created under the same parent EntityType / FeatureGroup. The `parent` field in each
   *     child request message can be omitted. If `parent` is set in a child request, then the value
   *     must match the `parent` value in this request message.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchCreateFeaturesResponse, BatchCreateFeaturesOperationMetadata>
      batchCreateFeaturesAsync(EntityTypeName parent, List<CreateFeatureRequest> requests) {
    BatchCreateFeaturesRequest request =
        BatchCreateFeaturesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .addAllRequests(requests)
            .build();
    return batchCreateFeaturesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a batch of Features in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureGroupName parent = FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]");
   *   List<CreateFeatureRequest> requests = new ArrayList<>();
   *   BatchCreateFeaturesResponse response =
   *       featureRegistryServiceClient.batchCreateFeaturesAsync(parent, requests).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the EntityType/FeatureGroup to create the batch of
   *     Features under. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * @param requests Required. The request message specifying the Features to create. All Features
   *     must be created under the same parent EntityType / FeatureGroup. The `parent` field in each
   *     child request message can be omitted. If `parent` is set in a child request, then the value
   *     must match the `parent` value in this request message.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchCreateFeaturesResponse, BatchCreateFeaturesOperationMetadata>
      batchCreateFeaturesAsync(FeatureGroupName parent, List<CreateFeatureRequest> requests) {
    BatchCreateFeaturesRequest request =
        BatchCreateFeaturesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .addAllRequests(requests)
            .build();
    return batchCreateFeaturesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a batch of Features in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String parent =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *           .toString();
   *   List<CreateFeatureRequest> requests = new ArrayList<>();
   *   BatchCreateFeaturesResponse response =
   *       featureRegistryServiceClient.batchCreateFeaturesAsync(parent, requests).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the EntityType/FeatureGroup to create the batch of
   *     Features under. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * @param requests Required. The request message specifying the Features to create. All Features
   *     must be created under the same parent EntityType / FeatureGroup. The `parent` field in each
   *     child request message can be omitted. If `parent` is set in a child request, then the value
   *     must match the `parent` value in this request message.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchCreateFeaturesResponse, BatchCreateFeaturesOperationMetadata>
      batchCreateFeaturesAsync(String parent, List<CreateFeatureRequest> requests) {
    BatchCreateFeaturesRequest request =
        BatchCreateFeaturesRequest.newBuilder().setParent(parent).addAllRequests(requests).build();
    return batchCreateFeaturesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a batch of Features in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   BatchCreateFeaturesRequest request =
   *       BatchCreateFeaturesRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .addAllRequests(new ArrayList<CreateFeatureRequest>())
   *           .build();
   *   BatchCreateFeaturesResponse response =
   *       featureRegistryServiceClient.batchCreateFeaturesAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchCreateFeaturesResponse, BatchCreateFeaturesOperationMetadata>
      batchCreateFeaturesAsync(BatchCreateFeaturesRequest request) {
    return batchCreateFeaturesOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a batch of Features in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   BatchCreateFeaturesRequest request =
   *       BatchCreateFeaturesRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .addAllRequests(new ArrayList<CreateFeatureRequest>())
   *           .build();
   *   OperationFuture<BatchCreateFeaturesResponse, BatchCreateFeaturesOperationMetadata> future =
   *       featureRegistryServiceClient.batchCreateFeaturesOperationCallable().futureCall(request);
   *   // Do something.
   *   BatchCreateFeaturesResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          BatchCreateFeaturesRequest,
          BatchCreateFeaturesResponse,
          BatchCreateFeaturesOperationMetadata>
      batchCreateFeaturesOperationCallable() {
    return stub.batchCreateFeaturesOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a batch of Features in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   BatchCreateFeaturesRequest request =
   *       BatchCreateFeaturesRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .addAllRequests(new ArrayList<CreateFeatureRequest>())
   *           .build();
   *   ApiFuture<Operation> future =
   *       featureRegistryServiceClient.batchCreateFeaturesCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<BatchCreateFeaturesRequest, Operation> batchCreateFeaturesCallable() {
    return stub.batchCreateFeaturesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureName name =
   *       FeatureName.ofProjectLocationFeatureGroupFeatureName(
   *           "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE]");
   *   Feature response = featureRegistryServiceClient.getFeature(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the Feature resource. Format for entity_type as parent:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   *     Format for feature_group as parent:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Feature getFeature(FeatureName name) {
    GetFeatureRequest request =
        GetFeatureRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getFeature(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String name =
   *       FeatureName.ofProjectLocationFeaturestoreEntityTypeFeatureName(
   *               "[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
   *           .toString();
   *   Feature response = featureRegistryServiceClient.getFeature(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the Feature resource. Format for entity_type as parent:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   *     Format for feature_group as parent:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Feature getFeature(String name) {
    GetFeatureRequest request = GetFeatureRequest.newBuilder().setName(name).build();
    return getFeature(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   GetFeatureRequest request =
   *       GetFeatureRequest.newBuilder()
   *           .setName(
   *               FeatureName.ofProjectLocationFeatureGroupFeatureName(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE]")
   *                   .toString())
   *           .setFeatureStatsAndAnomalySpec(FeatureStatsAndAnomalySpec.newBuilder().build())
   *           .build();
   *   Feature response = featureRegistryServiceClient.getFeature(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Feature getFeature(GetFeatureRequest request) {
    return getFeatureCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   GetFeatureRequest request =
   *       GetFeatureRequest.newBuilder()
   *           .setName(
   *               FeatureName.ofProjectLocationFeatureGroupFeatureName(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE]")
   *                   .toString())
   *           .setFeatureStatsAndAnomalySpec(FeatureStatsAndAnomalySpec.newBuilder().build())
   *           .build();
   *   ApiFuture<Feature> future =
   *       featureRegistryServiceClient.getFeatureCallable().futureCall(request);
   *   // Do something.
   *   Feature response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetFeatureRequest, Feature> getFeatureCallable() {
    return stub.getFeatureCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Features in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   EntityTypeName parent =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
   *   for (Feature element : featureRegistryServiceClient.listFeatures(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list Features. Format for
   *     entity_type as parent:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   *     Format for feature_group as parent:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeaturesPagedResponse listFeatures(EntityTypeName parent) {
    ListFeaturesRequest request =
        ListFeaturesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listFeatures(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Features in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureGroupName parent = FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]");
   *   for (Feature element : featureRegistryServiceClient.listFeatures(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list Features. Format for
   *     entity_type as parent:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   *     Format for feature_group as parent:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeaturesPagedResponse listFeatures(FeatureGroupName parent) {
    ListFeaturesRequest request =
        ListFeaturesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listFeatures(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Features in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String parent =
   *       EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *           .toString();
   *   for (Feature element : featureRegistryServiceClient.listFeatures(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to list Features. Format for
   *     entity_type as parent:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   *     Format for feature_group as parent:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeaturesPagedResponse listFeatures(String parent) {
    ListFeaturesRequest request = ListFeaturesRequest.newBuilder().setParent(parent).build();
    return listFeatures(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Features in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   ListFeaturesRequest request =
   *       ListFeaturesRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .setLatestStatsCount(-878108489)
   *           .build();
   *   for (Feature element : featureRegistryServiceClient.listFeatures(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeaturesPagedResponse listFeatures(ListFeaturesRequest request) {
    return listFeaturesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Features in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   ListFeaturesRequest request =
   *       ListFeaturesRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .setLatestStatsCount(-878108489)
   *           .build();
   *   ApiFuture<Feature> future =
   *       featureRegistryServiceClient.listFeaturesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Feature element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListFeaturesRequest, ListFeaturesPagedResponse>
      listFeaturesPagedCallable() {
    return stub.listFeaturesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Features in a given FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   ListFeaturesRequest request =
   *       ListFeaturesRequest.newBuilder()
   *           .setParent(
   *               EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .setLatestStatsCount(-878108489)
   *           .build();
   *   while (true) {
   *     ListFeaturesResponse response =
   *         featureRegistryServiceClient.listFeaturesCallable().call(request);
   *     for (Feature element : response.getFeaturesList()) {
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
  public final UnaryCallable<ListFeaturesRequest, ListFeaturesResponse> listFeaturesCallable() {
    return stub.listFeaturesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   Feature feature = Feature.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Feature response = featureRegistryServiceClient.updateFeatureAsync(feature, updateMask).get();
   * }
   * }</pre>
   *
   * @param feature Required. The Feature's `name` field is used to identify the Feature to be
   *     updated. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}/features/{feature}`
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}/features/{feature}`
   * @param updateMask Field mask is used to specify the fields to be overwritten in the Features
   *     resource by the update. The fields specified in the update_mask are relative to the
   *     resource, not the full request. A field will be overwritten if it is in the mask. If the
   *     user does not provide a mask then only the non-empty fields present in the request will be
   *     overwritten. Set the update_mask to `&#42;` to override all fields.
   *     <p>Updatable fields:
   *     <p>&#42; `description` &#42; `labels` &#42; `disable_monitoring` (Not supported for
   *     FeatureRegistryService Feature) &#42; `point_of_contact` (Not supported for
   *     FeaturestoreService FeatureStore)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Feature, UpdateFeatureOperationMetadata> updateFeatureAsync(
      Feature feature, FieldMask updateMask) {
    UpdateFeatureRequest request =
        UpdateFeatureRequest.newBuilder().setFeature(feature).setUpdateMask(updateMask).build();
    return updateFeatureAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   UpdateFeatureRequest request =
   *       UpdateFeatureRequest.newBuilder()
   *           .setFeature(Feature.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Feature response = featureRegistryServiceClient.updateFeatureAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Feature, UpdateFeatureOperationMetadata> updateFeatureAsync(
      UpdateFeatureRequest request) {
    return updateFeatureOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   UpdateFeatureRequest request =
   *       UpdateFeatureRequest.newBuilder()
   *           .setFeature(Feature.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   OperationFuture<Feature, UpdateFeatureOperationMetadata> future =
   *       featureRegistryServiceClient.updateFeatureOperationCallable().futureCall(request);
   *   // Do something.
   *   Feature response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<UpdateFeatureRequest, Feature, UpdateFeatureOperationMetadata>
      updateFeatureOperationCallable() {
    return stub.updateFeatureOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   UpdateFeatureRequest request =
   *       UpdateFeatureRequest.newBuilder()
   *           .setFeature(Feature.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       featureRegistryServiceClient.updateFeatureCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateFeatureRequest, Operation> updateFeatureCallable() {
    return stub.updateFeatureCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureName name =
   *       FeatureName.ofProjectLocationFeatureGroupFeatureName(
   *           "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE]");
   *   featureRegistryServiceClient.deleteFeatureAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the Features to be deleted. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}/features/{feature}`
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}/features/{feature}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteFeatureAsync(
      FeatureName name) {
    DeleteFeatureRequest request =
        DeleteFeatureRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return deleteFeatureAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String name =
   *       FeatureName.ofProjectLocationFeaturestoreEntityTypeFeatureName(
   *               "[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]", "[FEATURE]")
   *           .toString();
   *   featureRegistryServiceClient.deleteFeatureAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the Features to be deleted. Format:
   *     `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}/features/{feature}`
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}/features/{feature}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteFeatureAsync(String name) {
    DeleteFeatureRequest request = DeleteFeatureRequest.newBuilder().setName(name).build();
    return deleteFeatureAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   DeleteFeatureRequest request =
   *       DeleteFeatureRequest.newBuilder()
   *           .setName(
   *               FeatureName.ofProjectLocationFeatureGroupFeatureName(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE]")
   *                   .toString())
   *           .build();
   *   featureRegistryServiceClient.deleteFeatureAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteFeatureAsync(
      DeleteFeatureRequest request) {
    return deleteFeatureOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   DeleteFeatureRequest request =
   *       DeleteFeatureRequest.newBuilder()
   *           .setName(
   *               FeatureName.ofProjectLocationFeatureGroupFeatureName(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE]")
   *                   .toString())
   *           .build();
   *   OperationFuture<Empty, DeleteOperationMetadata> future =
   *       featureRegistryServiceClient.deleteFeatureOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteFeatureRequest, Empty, DeleteOperationMetadata>
      deleteFeatureOperationCallable() {
    return stub.deleteFeatureOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Feature.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   DeleteFeatureRequest request =
   *       DeleteFeatureRequest.newBuilder()
   *           .setName(
   *               FeatureName.ofProjectLocationFeatureGroupFeatureName(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       featureRegistryServiceClient.deleteFeatureCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteFeatureRequest, Operation> deleteFeatureCallable() {
    return stub.deleteFeatureCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new FeatureMonitor in a given project, location and FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureGroupName parent = FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]");
   *   FeatureMonitor featureMonitor = FeatureMonitor.newBuilder().build();
   *   String featureMonitorId = "featureMonitorId1191342527";
   *   FeatureMonitor response =
   *       featureRegistryServiceClient
   *           .createFeatureMonitorAsync(parent, featureMonitor, featureMonitorId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of FeatureGroup to create FeatureMonitor. Format:
   *     `projects/{project}/locations/{location}/featureGroups/{featuregroup}`
   * @param featureMonitor Required. The Monitor to create.
   * @param featureMonitorId Required. The ID to use for this FeatureMonitor, which will become the
   *     final component of the FeatureGroup's resource name.
   *     <p>This value may be up to 60 characters, and valid characters are `[a-z0-9_]`. The first
   *     character cannot be a number.
   *     <p>The value must be unique within the FeatureGroup.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<FeatureMonitor, CreateFeatureMonitorOperationMetadata>
      createFeatureMonitorAsync(
          FeatureGroupName parent, FeatureMonitor featureMonitor, String featureMonitorId) {
    CreateFeatureMonitorRequest request =
        CreateFeatureMonitorRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setFeatureMonitor(featureMonitor)
            .setFeatureMonitorId(featureMonitorId)
            .build();
    return createFeatureMonitorAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new FeatureMonitor in a given project, location and FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String parent = FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString();
   *   FeatureMonitor featureMonitor = FeatureMonitor.newBuilder().build();
   *   String featureMonitorId = "featureMonitorId1191342527";
   *   FeatureMonitor response =
   *       featureRegistryServiceClient
   *           .createFeatureMonitorAsync(parent, featureMonitor, featureMonitorId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of FeatureGroup to create FeatureMonitor. Format:
   *     `projects/{project}/locations/{location}/featureGroups/{featuregroup}`
   * @param featureMonitor Required. The Monitor to create.
   * @param featureMonitorId Required. The ID to use for this FeatureMonitor, which will become the
   *     final component of the FeatureGroup's resource name.
   *     <p>This value may be up to 60 characters, and valid characters are `[a-z0-9_]`. The first
   *     character cannot be a number.
   *     <p>The value must be unique within the FeatureGroup.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<FeatureMonitor, CreateFeatureMonitorOperationMetadata>
      createFeatureMonitorAsync(
          String parent, FeatureMonitor featureMonitor, String featureMonitorId) {
    CreateFeatureMonitorRequest request =
        CreateFeatureMonitorRequest.newBuilder()
            .setParent(parent)
            .setFeatureMonitor(featureMonitor)
            .setFeatureMonitorId(featureMonitorId)
            .build();
    return createFeatureMonitorAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new FeatureMonitor in a given project, location and FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   CreateFeatureMonitorRequest request =
   *       CreateFeatureMonitorRequest.newBuilder()
   *           .setParent(
   *               FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString())
   *           .setFeatureMonitor(FeatureMonitor.newBuilder().build())
   *           .setFeatureMonitorId("featureMonitorId1191342527")
   *           .build();
   *   FeatureMonitor response =
   *       featureRegistryServiceClient.createFeatureMonitorAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<FeatureMonitor, CreateFeatureMonitorOperationMetadata>
      createFeatureMonitorAsync(CreateFeatureMonitorRequest request) {
    return createFeatureMonitorOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new FeatureMonitor in a given project, location and FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   CreateFeatureMonitorRequest request =
   *       CreateFeatureMonitorRequest.newBuilder()
   *           .setParent(
   *               FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString())
   *           .setFeatureMonitor(FeatureMonitor.newBuilder().build())
   *           .setFeatureMonitorId("featureMonitorId1191342527")
   *           .build();
   *   OperationFuture<FeatureMonitor, CreateFeatureMonitorOperationMetadata> future =
   *       featureRegistryServiceClient.createFeatureMonitorOperationCallable().futureCall(request);
   *   // Do something.
   *   FeatureMonitor response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CreateFeatureMonitorRequest, FeatureMonitor, CreateFeatureMonitorOperationMetadata>
      createFeatureMonitorOperationCallable() {
    return stub.createFeatureMonitorOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new FeatureMonitor in a given project, location and FeatureGroup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   CreateFeatureMonitorRequest request =
   *       CreateFeatureMonitorRequest.newBuilder()
   *           .setParent(
   *               FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString())
   *           .setFeatureMonitor(FeatureMonitor.newBuilder().build())
   *           .setFeatureMonitorId("featureMonitorId1191342527")
   *           .build();
   *   ApiFuture<Operation> future =
   *       featureRegistryServiceClient.createFeatureMonitorCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateFeatureMonitorRequest, Operation>
      createFeatureMonitorCallable() {
    return stub.createFeatureMonitorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single FeatureMonitor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureMonitorName name =
   *       FeatureMonitorName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]");
   *   FeatureMonitor response = featureRegistryServiceClient.getFeatureMonitor(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the FeatureMonitor resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeatureMonitor getFeatureMonitor(FeatureMonitorName name) {
    GetFeatureMonitorRequest request =
        GetFeatureMonitorRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getFeatureMonitor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single FeatureMonitor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String name =
   *       FeatureMonitorName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]")
   *           .toString();
   *   FeatureMonitor response = featureRegistryServiceClient.getFeatureMonitor(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the FeatureMonitor resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeatureMonitor getFeatureMonitor(String name) {
    GetFeatureMonitorRequest request = GetFeatureMonitorRequest.newBuilder().setName(name).build();
    return getFeatureMonitor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single FeatureMonitor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   GetFeatureMonitorRequest request =
   *       GetFeatureMonitorRequest.newBuilder()
   *           .setName(
   *               FeatureMonitorName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]")
   *                   .toString())
   *           .build();
   *   FeatureMonitor response = featureRegistryServiceClient.getFeatureMonitor(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeatureMonitor getFeatureMonitor(GetFeatureMonitorRequest request) {
    return getFeatureMonitorCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single FeatureMonitor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   GetFeatureMonitorRequest request =
   *       GetFeatureMonitorRequest.newBuilder()
   *           .setName(
   *               FeatureMonitorName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]")
   *                   .toString())
   *           .build();
   *   ApiFuture<FeatureMonitor> future =
   *       featureRegistryServiceClient.getFeatureMonitorCallable().futureCall(request);
   *   // Do something.
   *   FeatureMonitor response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetFeatureMonitorRequest, FeatureMonitor> getFeatureMonitorCallable() {
    return stub.getFeatureMonitorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists FeatureGroups in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureGroupName parent = FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]");
   *   for (FeatureMonitor element :
   *       featureRegistryServiceClient.listFeatureMonitors(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the FeatureGroup to list FeatureMonitors. Format:
   *     `projects/{project}/locations/{location}/featureGroups/{featureGroup}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeatureMonitorsPagedResponse listFeatureMonitors(FeatureGroupName parent) {
    ListFeatureMonitorsRequest request =
        ListFeatureMonitorsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listFeatureMonitors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists FeatureGroups in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String parent = FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString();
   *   for (FeatureMonitor element :
   *       featureRegistryServiceClient.listFeatureMonitors(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the FeatureGroup to list FeatureMonitors. Format:
   *     `projects/{project}/locations/{location}/featureGroups/{featureGroup}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeatureMonitorsPagedResponse listFeatureMonitors(String parent) {
    ListFeatureMonitorsRequest request =
        ListFeatureMonitorsRequest.newBuilder().setParent(parent).build();
    return listFeatureMonitors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists FeatureGroups in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   ListFeatureMonitorsRequest request =
   *       ListFeatureMonitorsRequest.newBuilder()
   *           .setParent(
   *               FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   for (FeatureMonitor element :
   *       featureRegistryServiceClient.listFeatureMonitors(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeatureMonitorsPagedResponse listFeatureMonitors(
      ListFeatureMonitorsRequest request) {
    return listFeatureMonitorsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists FeatureGroups in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   ListFeatureMonitorsRequest request =
   *       ListFeatureMonitorsRequest.newBuilder()
   *           .setParent(
   *               FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   ApiFuture<FeatureMonitor> future =
   *       featureRegistryServiceClient.listFeatureMonitorsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (FeatureMonitor element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListFeatureMonitorsRequest, ListFeatureMonitorsPagedResponse>
      listFeatureMonitorsPagedCallable() {
    return stub.listFeatureMonitorsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists FeatureGroups in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   ListFeatureMonitorsRequest request =
   *       ListFeatureMonitorsRequest.newBuilder()
   *           .setParent(
   *               FeatureGroupName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   while (true) {
   *     ListFeatureMonitorsResponse response =
   *         featureRegistryServiceClient.listFeatureMonitorsCallable().call(request);
   *     for (FeatureMonitor element : response.getFeatureMonitorsList()) {
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
  public final UnaryCallable<ListFeatureMonitorsRequest, ListFeatureMonitorsResponse>
      listFeatureMonitorsCallable() {
    return stub.listFeatureMonitorsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single FeatureMonitor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureMonitor featureMonitor = FeatureMonitor.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   FeatureMonitor response =
   *       featureRegistryServiceClient.updateFeatureMonitorAsync(featureMonitor, updateMask).get();
   * }
   * }</pre>
   *
   * @param featureMonitor Required. The FeatureMonitor's `name` field is used to identify the
   *     FeatureMonitor to be updated. Format:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}/featureMonitors/{feature_monitor}`
   * @param updateMask Optional. Field mask is used to specify the fields to be overwritten in the
   *     FeatureMonitor resource by the update. The fields specified in the update_mask are relative
   *     to the resource, not the full request. A field will be overwritten if it is in the mask. If
   *     the user does not provide a mask then only the non-empty fields present in the request will
   *     be overwritten. Set the update_mask to `&#42;` to override all fields.
   *     <p>Updatable fields:
   *     <p>&#42; `labels`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<FeatureMonitor, UpdateFeatureMonitorOperationMetadata>
      updateFeatureMonitorAsync(FeatureMonitor featureMonitor, FieldMask updateMask) {
    UpdateFeatureMonitorRequest request =
        UpdateFeatureMonitorRequest.newBuilder()
            .setFeatureMonitor(featureMonitor)
            .setUpdateMask(updateMask)
            .build();
    return updateFeatureMonitorAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single FeatureMonitor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   UpdateFeatureMonitorRequest request =
   *       UpdateFeatureMonitorRequest.newBuilder()
   *           .setFeatureMonitor(FeatureMonitor.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   FeatureMonitor response =
   *       featureRegistryServiceClient.updateFeatureMonitorAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<FeatureMonitor, UpdateFeatureMonitorOperationMetadata>
      updateFeatureMonitorAsync(UpdateFeatureMonitorRequest request) {
    return updateFeatureMonitorOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single FeatureMonitor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   UpdateFeatureMonitorRequest request =
   *       UpdateFeatureMonitorRequest.newBuilder()
   *           .setFeatureMonitor(FeatureMonitor.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   OperationFuture<FeatureMonitor, UpdateFeatureMonitorOperationMetadata> future =
   *       featureRegistryServiceClient.updateFeatureMonitorOperationCallable().futureCall(request);
   *   // Do something.
   *   FeatureMonitor response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          UpdateFeatureMonitorRequest, FeatureMonitor, UpdateFeatureMonitorOperationMetadata>
      updateFeatureMonitorOperationCallable() {
    return stub.updateFeatureMonitorOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single FeatureMonitor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   UpdateFeatureMonitorRequest request =
   *       UpdateFeatureMonitorRequest.newBuilder()
   *           .setFeatureMonitor(FeatureMonitor.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       featureRegistryServiceClient.updateFeatureMonitorCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateFeatureMonitorRequest, Operation>
      updateFeatureMonitorCallable() {
    return stub.updateFeatureMonitorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single FeatureMonitor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureMonitorName name =
   *       FeatureMonitorName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]");
   *   featureRegistryServiceClient.deleteFeatureMonitorAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the FeatureMonitor to be deleted. Format:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}/featureMonitors/{feature_monitor}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteFeatureMonitorAsync(
      FeatureMonitorName name) {
    DeleteFeatureMonitorRequest request =
        DeleteFeatureMonitorRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteFeatureMonitorAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single FeatureMonitor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String name =
   *       FeatureMonitorName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]")
   *           .toString();
   *   featureRegistryServiceClient.deleteFeatureMonitorAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the FeatureMonitor to be deleted. Format:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}/featureMonitors/{feature_monitor}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteFeatureMonitorAsync(
      String name) {
    DeleteFeatureMonitorRequest request =
        DeleteFeatureMonitorRequest.newBuilder().setName(name).build();
    return deleteFeatureMonitorAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single FeatureMonitor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   DeleteFeatureMonitorRequest request =
   *       DeleteFeatureMonitorRequest.newBuilder()
   *           .setName(
   *               FeatureMonitorName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]")
   *                   .toString())
   *           .build();
   *   featureRegistryServiceClient.deleteFeatureMonitorAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteFeatureMonitorAsync(
      DeleteFeatureMonitorRequest request) {
    return deleteFeatureMonitorOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single FeatureMonitor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   DeleteFeatureMonitorRequest request =
   *       DeleteFeatureMonitorRequest.newBuilder()
   *           .setName(
   *               FeatureMonitorName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]")
   *                   .toString())
   *           .build();
   *   OperationFuture<Empty, DeleteOperationMetadata> future =
   *       featureRegistryServiceClient.deleteFeatureMonitorOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteFeatureMonitorRequest, Empty, DeleteOperationMetadata>
      deleteFeatureMonitorOperationCallable() {
    return stub.deleteFeatureMonitorOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single FeatureMonitor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   DeleteFeatureMonitorRequest request =
   *       DeleteFeatureMonitorRequest.newBuilder()
   *           .setName(
   *               FeatureMonitorName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       featureRegistryServiceClient.deleteFeatureMonitorCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteFeatureMonitorRequest, Operation>
      deleteFeatureMonitorCallable() {
    return stub.deleteFeatureMonitorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new feature monitor job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureMonitorName parent =
   *       FeatureMonitorName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]");
   *   FeatureMonitorJob featureMonitorJob = FeatureMonitorJob.newBuilder().build();
   *   long featureMonitorJobId = 816328651;
   *   FeatureMonitorJob response =
   *       featureRegistryServiceClient.createFeatureMonitorJob(
   *           parent, featureMonitorJob, featureMonitorJobId);
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of FeatureMonitor to create FeatureMonitorJob.
   *     Format:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}/featureMonitors/{feature_monitor}`
   * @param featureMonitorJob Required. The Monitor to create.
   * @param featureMonitorJobId Optional. Output only. System-generated ID for feature monitor job.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeatureMonitorJob createFeatureMonitorJob(
      FeatureMonitorName parent, FeatureMonitorJob featureMonitorJob, long featureMonitorJobId) {
    CreateFeatureMonitorJobRequest request =
        CreateFeatureMonitorJobRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setFeatureMonitorJob(featureMonitorJob)
            .setFeatureMonitorJobId(featureMonitorJobId)
            .build();
    return createFeatureMonitorJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new feature monitor job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String parent =
   *       FeatureMonitorName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]")
   *           .toString();
   *   FeatureMonitorJob featureMonitorJob = FeatureMonitorJob.newBuilder().build();
   *   long featureMonitorJobId = 816328651;
   *   FeatureMonitorJob response =
   *       featureRegistryServiceClient.createFeatureMonitorJob(
   *           parent, featureMonitorJob, featureMonitorJobId);
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of FeatureMonitor to create FeatureMonitorJob.
   *     Format:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}/featureMonitors/{feature_monitor}`
   * @param featureMonitorJob Required. The Monitor to create.
   * @param featureMonitorJobId Optional. Output only. System-generated ID for feature monitor job.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeatureMonitorJob createFeatureMonitorJob(
      String parent, FeatureMonitorJob featureMonitorJob, long featureMonitorJobId) {
    CreateFeatureMonitorJobRequest request =
        CreateFeatureMonitorJobRequest.newBuilder()
            .setParent(parent)
            .setFeatureMonitorJob(featureMonitorJob)
            .setFeatureMonitorJobId(featureMonitorJobId)
            .build();
    return createFeatureMonitorJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new feature monitor job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   CreateFeatureMonitorJobRequest request =
   *       CreateFeatureMonitorJobRequest.newBuilder()
   *           .setParent(
   *               FeatureMonitorName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]")
   *                   .toString())
   *           .setFeatureMonitorJob(FeatureMonitorJob.newBuilder().build())
   *           .setFeatureMonitorJobId(816328651)
   *           .build();
   *   FeatureMonitorJob response = featureRegistryServiceClient.createFeatureMonitorJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeatureMonitorJob createFeatureMonitorJob(CreateFeatureMonitorJobRequest request) {
    return createFeatureMonitorJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new feature monitor job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   CreateFeatureMonitorJobRequest request =
   *       CreateFeatureMonitorJobRequest.newBuilder()
   *           .setParent(
   *               FeatureMonitorName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]")
   *                   .toString())
   *           .setFeatureMonitorJob(FeatureMonitorJob.newBuilder().build())
   *           .setFeatureMonitorJobId(816328651)
   *           .build();
   *   ApiFuture<FeatureMonitorJob> future =
   *       featureRegistryServiceClient.createFeatureMonitorJobCallable().futureCall(request);
   *   // Do something.
   *   FeatureMonitorJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateFeatureMonitorJobRequest, FeatureMonitorJob>
      createFeatureMonitorJobCallable() {
    return stub.createFeatureMonitorJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get a feature monitor job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureMonitorJobName name =
   *       FeatureMonitorJobName.of(
   *           "[PROJECT]",
   *           "[LOCATION]",
   *           "[FEATURE_GROUP]",
   *           "[FEATURE_MONITOR]",
   *           "[FEATURE_MONITOR_JOB]");
   *   FeatureMonitorJob response = featureRegistryServiceClient.getFeatureMonitorJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the FeatureMonitorJob resource. Format:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}/featureMonitors/{feature_monitor}/featureMonitorJobs/{feature_monitor_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeatureMonitorJob getFeatureMonitorJob(FeatureMonitorJobName name) {
    GetFeatureMonitorJobRequest request =
        GetFeatureMonitorJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getFeatureMonitorJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get a feature monitor job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String name =
   *       FeatureMonitorJobName.of(
   *               "[PROJECT]",
   *               "[LOCATION]",
   *               "[FEATURE_GROUP]",
   *               "[FEATURE_MONITOR]",
   *               "[FEATURE_MONITOR_JOB]")
   *           .toString();
   *   FeatureMonitorJob response = featureRegistryServiceClient.getFeatureMonitorJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the FeatureMonitorJob resource. Format:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}/featureMonitors/{feature_monitor}/featureMonitorJobs/{feature_monitor_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeatureMonitorJob getFeatureMonitorJob(String name) {
    GetFeatureMonitorJobRequest request =
        GetFeatureMonitorJobRequest.newBuilder().setName(name).build();
    return getFeatureMonitorJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get a feature monitor job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   GetFeatureMonitorJobRequest request =
   *       GetFeatureMonitorJobRequest.newBuilder()
   *           .setName(
   *               FeatureMonitorJobName.of(
   *                       "[PROJECT]",
   *                       "[LOCATION]",
   *                       "[FEATURE_GROUP]",
   *                       "[FEATURE_MONITOR]",
   *                       "[FEATURE_MONITOR_JOB]")
   *                   .toString())
   *           .build();
   *   FeatureMonitorJob response = featureRegistryServiceClient.getFeatureMonitorJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeatureMonitorJob getFeatureMonitorJob(GetFeatureMonitorJobRequest request) {
    return getFeatureMonitorJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get a feature monitor job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   GetFeatureMonitorJobRequest request =
   *       GetFeatureMonitorJobRequest.newBuilder()
   *           .setName(
   *               FeatureMonitorJobName.of(
   *                       "[PROJECT]",
   *                       "[LOCATION]",
   *                       "[FEATURE_GROUP]",
   *                       "[FEATURE_MONITOR]",
   *                       "[FEATURE_MONITOR_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<FeatureMonitorJob> future =
   *       featureRegistryServiceClient.getFeatureMonitorJobCallable().futureCall(request);
   *   // Do something.
   *   FeatureMonitorJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetFeatureMonitorJobRequest, FeatureMonitorJob>
      getFeatureMonitorJobCallable() {
    return stub.getFeatureMonitorJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List feature monitor jobs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   FeatureMonitorName parent =
   *       FeatureMonitorName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]");
   *   for (FeatureMonitorJob element :
   *       featureRegistryServiceClient.listFeatureMonitorJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the FeatureMonitor to list FeatureMonitorJobs.
   *     Format:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}/featureMonitors/{feature_monitor}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeatureMonitorJobsPagedResponse listFeatureMonitorJobs(
      FeatureMonitorName parent) {
    ListFeatureMonitorJobsRequest request =
        ListFeatureMonitorJobsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listFeatureMonitorJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List feature monitor jobs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   String parent =
   *       FeatureMonitorName.of("[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]")
   *           .toString();
   *   for (FeatureMonitorJob element :
   *       featureRegistryServiceClient.listFeatureMonitorJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the FeatureMonitor to list FeatureMonitorJobs.
   *     Format:
   *     `projects/{project}/locations/{location}/featureGroups/{feature_group}/featureMonitors/{feature_monitor}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeatureMonitorJobsPagedResponse listFeatureMonitorJobs(String parent) {
    ListFeatureMonitorJobsRequest request =
        ListFeatureMonitorJobsRequest.newBuilder().setParent(parent).build();
    return listFeatureMonitorJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List feature monitor jobs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   ListFeatureMonitorJobsRequest request =
   *       ListFeatureMonitorJobsRequest.newBuilder()
   *           .setParent(
   *               FeatureMonitorName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]")
   *                   .toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   for (FeatureMonitorJob element :
   *       featureRegistryServiceClient.listFeatureMonitorJobs(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFeatureMonitorJobsPagedResponse listFeatureMonitorJobs(
      ListFeatureMonitorJobsRequest request) {
    return listFeatureMonitorJobsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List feature monitor jobs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   ListFeatureMonitorJobsRequest request =
   *       ListFeatureMonitorJobsRequest.newBuilder()
   *           .setParent(
   *               FeatureMonitorName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]")
   *                   .toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   ApiFuture<FeatureMonitorJob> future =
   *       featureRegistryServiceClient.listFeatureMonitorJobsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (FeatureMonitorJob element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListFeatureMonitorJobsRequest, ListFeatureMonitorJobsPagedResponse>
      listFeatureMonitorJobsPagedCallable() {
    return stub.listFeatureMonitorJobsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List feature monitor jobs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   ListFeatureMonitorJobsRequest request =
   *       ListFeatureMonitorJobsRequest.newBuilder()
   *           .setParent(
   *               FeatureMonitorName.of(
   *                       "[PROJECT]", "[LOCATION]", "[FEATURE_GROUP]", "[FEATURE_MONITOR]")
   *                   .toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   while (true) {
   *     ListFeatureMonitorJobsResponse response =
   *         featureRegistryServiceClient.listFeatureMonitorJobsCallable().call(request);
   *     for (FeatureMonitorJob element : response.getFeatureMonitorJobsList()) {
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
  public final UnaryCallable<ListFeatureMonitorJobsRequest, ListFeatureMonitorJobsResponse>
      listFeatureMonitorJobsCallable() {
    return stub.listFeatureMonitorJobsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Location element : featureRegistryServiceClient.listLocations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListLocationsPagedResponse listLocations(ListLocationsRequest request) {
    return listLocationsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Location> future =
   *       featureRegistryServiceClient.listLocationsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Location element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return stub.listLocationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListLocationsResponse response =
   *         featureRegistryServiceClient.listLocationsCallable().call(request);
   *     for (Location element : response.getLocationsList()) {
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
  public final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return stub.listLocationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   Location response = featureRegistryServiceClient.getLocation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Location getLocation(GetLocationRequest request) {
    return getLocationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<Location> future =
   *       featureRegistryServiceClient.getLocationCallable().futureCall(request);
   *   // Do something.
   *   Location response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return stub.getLocationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replacesany existing policy.
   *
   * <p>Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED`errors.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Policy response = featureRegistryServiceClient.setIamPolicy(request);
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
   * Sets the access control policy on the specified resource. Replacesany existing policy.
   *
   * <p>Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED`errors.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future =
   *       featureRegistryServiceClient.setIamPolicyCallable().futureCall(request);
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
   * Gets the access control policy for a resource. Returns an empty policyif the resource exists
   * and does not have a policy set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   Policy response = featureRegistryServiceClient.getIamPolicy(request);
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
   * Gets the access control policy for a resource. Returns an empty policyif the resource exists
   * and does not have a policy set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future =
   *       featureRegistryServiceClient.getIamPolicyCallable().futureCall(request);
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
   * Returns permissions that a caller has on the specified resource. If theresource does not exist,
   * this will return an empty set ofpermissions, not a `NOT_FOUND` error.
   *
   * <p>Note: This operation is designed to be used for buildingpermission-aware UIs and
   * command-line tools, not for authorizationchecking. This operation may "fail open" without
   * warning.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   TestIamPermissionsResponse response =
   *       featureRegistryServiceClient.testIamPermissions(request);
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
   * Returns permissions that a caller has on the specified resource. If theresource does not exist,
   * this will return an empty set ofpermissions, not a `NOT_FOUND` error.
   *
   * <p>Note: This operation is designed to be used for buildingpermission-aware UIs and
   * command-line tools, not for authorizationchecking. This operation may "fail open" without
   * warning.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeatureRegistryServiceClient featureRegistryServiceClient =
   *     FeatureRegistryServiceClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   ApiFuture<TestIamPermissionsResponse> future =
   *       featureRegistryServiceClient.testIamPermissionsCallable().futureCall(request);
   *   // Do something.
   *   TestIamPermissionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return stub.testIamPermissionsCallable();
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

  public static class ListFeatureGroupsPagedResponse
      extends AbstractPagedListResponse<
          ListFeatureGroupsRequest,
          ListFeatureGroupsResponse,
          FeatureGroup,
          ListFeatureGroupsPage,
          ListFeatureGroupsFixedSizeCollection> {

    public static ApiFuture<ListFeatureGroupsPagedResponse> createAsync(
        PageContext<ListFeatureGroupsRequest, ListFeatureGroupsResponse, FeatureGroup> context,
        ApiFuture<ListFeatureGroupsResponse> futureResponse) {
      ApiFuture<ListFeatureGroupsPage> futurePage =
          ListFeatureGroupsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListFeatureGroupsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListFeatureGroupsPagedResponse(ListFeatureGroupsPage page) {
      super(page, ListFeatureGroupsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListFeatureGroupsPage
      extends AbstractPage<
          ListFeatureGroupsRequest,
          ListFeatureGroupsResponse,
          FeatureGroup,
          ListFeatureGroupsPage> {

    private ListFeatureGroupsPage(
        PageContext<ListFeatureGroupsRequest, ListFeatureGroupsResponse, FeatureGroup> context,
        ListFeatureGroupsResponse response) {
      super(context, response);
    }

    private static ListFeatureGroupsPage createEmptyPage() {
      return new ListFeatureGroupsPage(null, null);
    }

    @Override
    protected ListFeatureGroupsPage createPage(
        PageContext<ListFeatureGroupsRequest, ListFeatureGroupsResponse, FeatureGroup> context,
        ListFeatureGroupsResponse response) {
      return new ListFeatureGroupsPage(context, response);
    }

    @Override
    public ApiFuture<ListFeatureGroupsPage> createPageAsync(
        PageContext<ListFeatureGroupsRequest, ListFeatureGroupsResponse, FeatureGroup> context,
        ApiFuture<ListFeatureGroupsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFeatureGroupsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListFeatureGroupsRequest,
          ListFeatureGroupsResponse,
          FeatureGroup,
          ListFeatureGroupsPage,
          ListFeatureGroupsFixedSizeCollection> {

    private ListFeatureGroupsFixedSizeCollection(
        List<ListFeatureGroupsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFeatureGroupsFixedSizeCollection createEmptyCollection() {
      return new ListFeatureGroupsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFeatureGroupsFixedSizeCollection createCollection(
        List<ListFeatureGroupsPage> pages, int collectionSize) {
      return new ListFeatureGroupsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListFeaturesPagedResponse
      extends AbstractPagedListResponse<
          ListFeaturesRequest,
          ListFeaturesResponse,
          Feature,
          ListFeaturesPage,
          ListFeaturesFixedSizeCollection> {

    public static ApiFuture<ListFeaturesPagedResponse> createAsync(
        PageContext<ListFeaturesRequest, ListFeaturesResponse, Feature> context,
        ApiFuture<ListFeaturesResponse> futureResponse) {
      ApiFuture<ListFeaturesPage> futurePage =
          ListFeaturesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListFeaturesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListFeaturesPagedResponse(ListFeaturesPage page) {
      super(page, ListFeaturesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListFeaturesPage
      extends AbstractPage<ListFeaturesRequest, ListFeaturesResponse, Feature, ListFeaturesPage> {

    private ListFeaturesPage(
        PageContext<ListFeaturesRequest, ListFeaturesResponse, Feature> context,
        ListFeaturesResponse response) {
      super(context, response);
    }

    private static ListFeaturesPage createEmptyPage() {
      return new ListFeaturesPage(null, null);
    }

    @Override
    protected ListFeaturesPage createPage(
        PageContext<ListFeaturesRequest, ListFeaturesResponse, Feature> context,
        ListFeaturesResponse response) {
      return new ListFeaturesPage(context, response);
    }

    @Override
    public ApiFuture<ListFeaturesPage> createPageAsync(
        PageContext<ListFeaturesRequest, ListFeaturesResponse, Feature> context,
        ApiFuture<ListFeaturesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFeaturesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListFeaturesRequest,
          ListFeaturesResponse,
          Feature,
          ListFeaturesPage,
          ListFeaturesFixedSizeCollection> {

    private ListFeaturesFixedSizeCollection(List<ListFeaturesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFeaturesFixedSizeCollection createEmptyCollection() {
      return new ListFeaturesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFeaturesFixedSizeCollection createCollection(
        List<ListFeaturesPage> pages, int collectionSize) {
      return new ListFeaturesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListFeatureMonitorsPagedResponse
      extends AbstractPagedListResponse<
          ListFeatureMonitorsRequest,
          ListFeatureMonitorsResponse,
          FeatureMonitor,
          ListFeatureMonitorsPage,
          ListFeatureMonitorsFixedSizeCollection> {

    public static ApiFuture<ListFeatureMonitorsPagedResponse> createAsync(
        PageContext<ListFeatureMonitorsRequest, ListFeatureMonitorsResponse, FeatureMonitor>
            context,
        ApiFuture<ListFeatureMonitorsResponse> futureResponse) {
      ApiFuture<ListFeatureMonitorsPage> futurePage =
          ListFeatureMonitorsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListFeatureMonitorsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListFeatureMonitorsPagedResponse(ListFeatureMonitorsPage page) {
      super(page, ListFeatureMonitorsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListFeatureMonitorsPage
      extends AbstractPage<
          ListFeatureMonitorsRequest,
          ListFeatureMonitorsResponse,
          FeatureMonitor,
          ListFeatureMonitorsPage> {

    private ListFeatureMonitorsPage(
        PageContext<ListFeatureMonitorsRequest, ListFeatureMonitorsResponse, FeatureMonitor>
            context,
        ListFeatureMonitorsResponse response) {
      super(context, response);
    }

    private static ListFeatureMonitorsPage createEmptyPage() {
      return new ListFeatureMonitorsPage(null, null);
    }

    @Override
    protected ListFeatureMonitorsPage createPage(
        PageContext<ListFeatureMonitorsRequest, ListFeatureMonitorsResponse, FeatureMonitor>
            context,
        ListFeatureMonitorsResponse response) {
      return new ListFeatureMonitorsPage(context, response);
    }

    @Override
    public ApiFuture<ListFeatureMonitorsPage> createPageAsync(
        PageContext<ListFeatureMonitorsRequest, ListFeatureMonitorsResponse, FeatureMonitor>
            context,
        ApiFuture<ListFeatureMonitorsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFeatureMonitorsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListFeatureMonitorsRequest,
          ListFeatureMonitorsResponse,
          FeatureMonitor,
          ListFeatureMonitorsPage,
          ListFeatureMonitorsFixedSizeCollection> {

    private ListFeatureMonitorsFixedSizeCollection(
        List<ListFeatureMonitorsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFeatureMonitorsFixedSizeCollection createEmptyCollection() {
      return new ListFeatureMonitorsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFeatureMonitorsFixedSizeCollection createCollection(
        List<ListFeatureMonitorsPage> pages, int collectionSize) {
      return new ListFeatureMonitorsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListFeatureMonitorJobsPagedResponse
      extends AbstractPagedListResponse<
          ListFeatureMonitorJobsRequest,
          ListFeatureMonitorJobsResponse,
          FeatureMonitorJob,
          ListFeatureMonitorJobsPage,
          ListFeatureMonitorJobsFixedSizeCollection> {

    public static ApiFuture<ListFeatureMonitorJobsPagedResponse> createAsync(
        PageContext<
                ListFeatureMonitorJobsRequest, ListFeatureMonitorJobsResponse, FeatureMonitorJob>
            context,
        ApiFuture<ListFeatureMonitorJobsResponse> futureResponse) {
      ApiFuture<ListFeatureMonitorJobsPage> futurePage =
          ListFeatureMonitorJobsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListFeatureMonitorJobsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListFeatureMonitorJobsPagedResponse(ListFeatureMonitorJobsPage page) {
      super(page, ListFeatureMonitorJobsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListFeatureMonitorJobsPage
      extends AbstractPage<
          ListFeatureMonitorJobsRequest,
          ListFeatureMonitorJobsResponse,
          FeatureMonitorJob,
          ListFeatureMonitorJobsPage> {

    private ListFeatureMonitorJobsPage(
        PageContext<
                ListFeatureMonitorJobsRequest, ListFeatureMonitorJobsResponse, FeatureMonitorJob>
            context,
        ListFeatureMonitorJobsResponse response) {
      super(context, response);
    }

    private static ListFeatureMonitorJobsPage createEmptyPage() {
      return new ListFeatureMonitorJobsPage(null, null);
    }

    @Override
    protected ListFeatureMonitorJobsPage createPage(
        PageContext<
                ListFeatureMonitorJobsRequest, ListFeatureMonitorJobsResponse, FeatureMonitorJob>
            context,
        ListFeatureMonitorJobsResponse response) {
      return new ListFeatureMonitorJobsPage(context, response);
    }

    @Override
    public ApiFuture<ListFeatureMonitorJobsPage> createPageAsync(
        PageContext<
                ListFeatureMonitorJobsRequest, ListFeatureMonitorJobsResponse, FeatureMonitorJob>
            context,
        ApiFuture<ListFeatureMonitorJobsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFeatureMonitorJobsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListFeatureMonitorJobsRequest,
          ListFeatureMonitorJobsResponse,
          FeatureMonitorJob,
          ListFeatureMonitorJobsPage,
          ListFeatureMonitorJobsFixedSizeCollection> {

    private ListFeatureMonitorJobsFixedSizeCollection(
        List<ListFeatureMonitorJobsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFeatureMonitorJobsFixedSizeCollection createEmptyCollection() {
      return new ListFeatureMonitorJobsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFeatureMonitorJobsFixedSizeCollection createCollection(
        List<ListFeatureMonitorJobsPage> pages, int collectionSize) {
      return new ListFeatureMonitorJobsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListLocationsPagedResponse
      extends AbstractPagedListResponse<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    public static ApiFuture<ListLocationsPagedResponse> createAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      ApiFuture<ListLocationsPage> futurePage =
          ListLocationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListLocationsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListLocationsPagedResponse(ListLocationsPage page) {
      super(page, ListLocationsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListLocationsPage
      extends AbstractPage<
          ListLocationsRequest, ListLocationsResponse, Location, ListLocationsPage> {

    private ListLocationsPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      super(context, response);
    }

    private static ListLocationsPage createEmptyPage() {
      return new ListLocationsPage(null, null);
    }

    @Override
    protected ListLocationsPage createPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      return new ListLocationsPage(context, response);
    }

    @Override
    public ApiFuture<ListLocationsPage> createPageAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListLocationsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    private ListLocationsFixedSizeCollection(List<ListLocationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListLocationsFixedSizeCollection createEmptyCollection() {
      return new ListLocationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListLocationsFixedSizeCollection createCollection(
        List<ListLocationsPage> pages, int collectionSize) {
      return new ListLocationsFixedSizeCollection(pages, collectionSize);
    }
  }
}
