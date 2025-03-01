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

package com.google.cloud.edgecontainer.v1;

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
import com.google.cloud.edgecontainer.v1.stub.EdgeContainerStub;
import com.google.cloud.edgecontainer.v1.stub.EdgeContainerStubSettings;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: EdgeContainer API provides management of Kubernetes Clusters on Google Edge
 * Cloud deployments.
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
 * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
 *   ClusterName name = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
 *   Cluster response = edgeContainerClient.getCluster(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the EdgeContainerClient object to clean up resources such
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
 *      <td><p> ListClusters</td>
 *      <td><p> Lists Clusters in a given project and location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listClusters(ListClustersRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listClusters(LocationName parent)
 *           <li><p> listClusters(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listClustersPagedCallable()
 *           <li><p> listClustersCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetCluster</td>
 *      <td><p> Gets details of a single Cluster.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getCluster(GetClusterRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getCluster(ClusterName name)
 *           <li><p> getCluster(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getClusterCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateCluster</td>
 *      <td><p> Creates a new Cluster in a given project and location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createClusterAsync(CreateClusterRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> createClusterAsync(LocationName parent, Cluster cluster, String clusterId)
 *           <li><p> createClusterAsync(String parent, Cluster cluster, String clusterId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createClusterOperationCallable()
 *           <li><p> createClusterCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateCluster</td>
 *      <td><p> Updates the parameters of a single Cluster.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateClusterAsync(UpdateClusterRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> updateClusterAsync(Cluster cluster, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateClusterOperationCallable()
 *           <li><p> updateClusterCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpgradeCluster</td>
 *      <td><p> Upgrades a single cluster.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> upgradeClusterAsync(UpgradeClusterRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> upgradeClusterAsync(ClusterName name, String targetVersion, UpgradeClusterRequest.Schedule schedule)
 *           <li><p> upgradeClusterAsync(String name, String targetVersion, UpgradeClusterRequest.Schedule schedule)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> upgradeClusterOperationCallable()
 *           <li><p> upgradeClusterCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteCluster</td>
 *      <td><p> Deletes a single Cluster.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteClusterAsync(DeleteClusterRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteClusterAsync(ClusterName name)
 *           <li><p> deleteClusterAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteClusterOperationCallable()
 *           <li><p> deleteClusterCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateAccessToken</td>
 *      <td><p> Generates an access token for a Cluster.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateAccessToken(GenerateAccessTokenRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> generateAccessToken(ClusterName cluster)
 *           <li><p> generateAccessToken(String cluster)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateAccessTokenCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateOfflineCredential</td>
 *      <td><p> Generates an offline credential for a Cluster.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateOfflineCredential(GenerateOfflineCredentialRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> generateOfflineCredential(ClusterName cluster)
 *           <li><p> generateOfflineCredential(String cluster)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateOfflineCredentialCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListNodePools</td>
 *      <td><p> Lists NodePools in a given project and location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listNodePools(ListNodePoolsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listNodePools(ClusterName parent)
 *           <li><p> listNodePools(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listNodePoolsPagedCallable()
 *           <li><p> listNodePoolsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetNodePool</td>
 *      <td><p> Gets details of a single NodePool.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getNodePool(GetNodePoolRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getNodePool(NodePoolName name)
 *           <li><p> getNodePool(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getNodePoolCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateNodePool</td>
 *      <td><p> Creates a new NodePool in a given project and location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createNodePoolAsync(CreateNodePoolRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> createNodePoolAsync(ClusterName parent, NodePool nodePool, String nodePoolId)
 *           <li><p> createNodePoolAsync(String parent, NodePool nodePool, String nodePoolId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createNodePoolOperationCallable()
 *           <li><p> createNodePoolCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateNodePool</td>
 *      <td><p> Updates the parameters of a single NodePool.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateNodePoolAsync(UpdateNodePoolRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> updateNodePoolAsync(NodePool nodePool, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateNodePoolOperationCallable()
 *           <li><p> updateNodePoolCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteNodePool</td>
 *      <td><p> Deletes a single NodePool.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteNodePoolAsync(DeleteNodePoolRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteNodePoolAsync(NodePoolName name)
 *           <li><p> deleteNodePoolAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteNodePoolOperationCallable()
 *           <li><p> deleteNodePoolCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListMachines</td>
 *      <td><p> Lists Machines in a given project and location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listMachines(ListMachinesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listMachines(LocationName parent)
 *           <li><p> listMachines(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listMachinesPagedCallable()
 *           <li><p> listMachinesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetMachine</td>
 *      <td><p> Gets details of a single Machine.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getMachine(GetMachineRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getMachine(MachineName name)
 *           <li><p> getMachine(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getMachineCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListVpnConnections</td>
 *      <td><p> Lists VPN connections in a given project and location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listVpnConnections(ListVpnConnectionsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listVpnConnections(LocationName parent)
 *           <li><p> listVpnConnections(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listVpnConnectionsPagedCallable()
 *           <li><p> listVpnConnectionsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetVpnConnection</td>
 *      <td><p> Gets details of a single VPN connection.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getVpnConnection(GetVpnConnectionRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getVpnConnection(VpnConnectionName name)
 *           <li><p> getVpnConnection(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getVpnConnectionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateVpnConnection</td>
 *      <td><p> Creates a new VPN connection in a given project and location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createVpnConnectionAsync(CreateVpnConnectionRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> createVpnConnectionAsync(LocationName parent, VpnConnection vpnConnection, String vpnConnectionId)
 *           <li><p> createVpnConnectionAsync(String parent, VpnConnection vpnConnection, String vpnConnectionId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createVpnConnectionOperationCallable()
 *           <li><p> createVpnConnectionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteVpnConnection</td>
 *      <td><p> Deletes a single VPN connection.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteVpnConnectionAsync(DeleteVpnConnectionRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteVpnConnectionAsync(VpnConnectionName name)
 *           <li><p> deleteVpnConnectionAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteVpnConnectionOperationCallable()
 *           <li><p> deleteVpnConnectionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetServerConfig</td>
 *      <td><p> Gets the server config.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getServerConfig(GetServerConfigRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getServerConfig(LocationName name)
 *           <li><p> getServerConfig(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getServerConfigCallable()
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
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of EdgeContainerSettings to
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
 * EdgeContainerSettings edgeContainerSettings =
 *     EdgeContainerSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * EdgeContainerClient edgeContainerClient = EdgeContainerClient.create(edgeContainerSettings);
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
 * EdgeContainerSettings edgeContainerSettings =
 *     EdgeContainerSettings.newBuilder().setEndpoint(myEndpoint).build();
 * EdgeContainerClient edgeContainerClient = EdgeContainerClient.create(edgeContainerSettings);
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
 * EdgeContainerSettings edgeContainerSettings =
 *     EdgeContainerSettings.newHttpJsonBuilder().build();
 * EdgeContainerClient edgeContainerClient = EdgeContainerClient.create(edgeContainerSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class EdgeContainerClient implements BackgroundResource {
  private final EdgeContainerSettings settings;
  private final EdgeContainerStub stub;
  private final OperationsClient httpJsonOperationsClient;
  private final com.google.longrunning.OperationsClient operationsClient;

  /** Constructs an instance of EdgeContainerClient with default settings. */
  public static final EdgeContainerClient create() throws IOException {
    return create(EdgeContainerSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of EdgeContainerClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final EdgeContainerClient create(EdgeContainerSettings settings)
      throws IOException {
    return new EdgeContainerClient(settings);
  }

  /**
   * Constructs an instance of EdgeContainerClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(EdgeContainerSettings).
   */
  public static final EdgeContainerClient create(EdgeContainerStub stub) {
    return new EdgeContainerClient(stub);
  }

  /**
   * Constructs an instance of EdgeContainerClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected EdgeContainerClient(EdgeContainerSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((EdgeContainerStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  protected EdgeContainerClient(EdgeContainerStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  public final EdgeContainerSettings getSettings() {
    return settings;
  }

  public EdgeContainerStub getStub() {
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
   * Lists Clusters in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (Cluster element : edgeContainerClient.listClusters(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent location, which owns this collection of clusters.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListClustersPagedResponse listClusters(LocationName parent) {
    ListClustersRequest request =
        ListClustersRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listClusters(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Clusters in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (Cluster element : edgeContainerClient.listClusters(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent location, which owns this collection of clusters.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListClustersPagedResponse listClusters(String parent) {
    ListClustersRequest request = ListClustersRequest.newBuilder().setParent(parent).build();
    return listClusters(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Clusters in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ListClustersRequest request =
   *       ListClustersRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   for (Cluster element : edgeContainerClient.listClusters(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListClustersPagedResponse listClusters(ListClustersRequest request) {
    return listClustersPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Clusters in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ListClustersRequest request =
   *       ListClustersRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   ApiFuture<Cluster> future =
   *       edgeContainerClient.listClustersPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Cluster element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListClustersRequest, ListClustersPagedResponse>
      listClustersPagedCallable() {
    return stub.listClustersPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Clusters in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ListClustersRequest request =
   *       ListClustersRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   while (true) {
   *     ListClustersResponse response = edgeContainerClient.listClustersCallable().call(request);
   *     for (Cluster element : response.getClustersList()) {
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
  public final UnaryCallable<ListClustersRequest, ListClustersResponse> listClustersCallable() {
    return stub.listClustersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ClusterName name = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
   *   Cluster response = edgeContainerClient.getCluster(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the cluster.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Cluster getCluster(ClusterName name) {
    GetClusterRequest request =
        GetClusterRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getCluster(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String name = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString();
   *   Cluster response = edgeContainerClient.getCluster(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the cluster.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Cluster getCluster(String name) {
    GetClusterRequest request = GetClusterRequest.newBuilder().setName(name).build();
    return getCluster(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GetClusterRequest request =
   *       GetClusterRequest.newBuilder()
   *           .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .build();
   *   Cluster response = edgeContainerClient.getCluster(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Cluster getCluster(GetClusterRequest request) {
    return getClusterCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GetClusterRequest request =
   *       GetClusterRequest.newBuilder()
   *           .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .build();
   *   ApiFuture<Cluster> future = edgeContainerClient.getClusterCallable().futureCall(request);
   *   // Do something.
   *   Cluster response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetClusterRequest, Cluster> getClusterCallable() {
    return stub.getClusterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Cluster in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Cluster cluster = Cluster.newBuilder().build();
   *   String clusterId = "clusterId561939637";
   *   Cluster response = edgeContainerClient.createClusterAsync(parent, cluster, clusterId).get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent location where this cluster will be created.
   * @param cluster Required. The cluster to create.
   * @param clusterId Required. A client-specified unique identifier for the cluster.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Cluster, OperationMetadata> createClusterAsync(
      LocationName parent, Cluster cluster, String clusterId) {
    CreateClusterRequest request =
        CreateClusterRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setCluster(cluster)
            .setClusterId(clusterId)
            .build();
    return createClusterAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Cluster in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   Cluster cluster = Cluster.newBuilder().build();
   *   String clusterId = "clusterId561939637";
   *   Cluster response = edgeContainerClient.createClusterAsync(parent, cluster, clusterId).get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent location where this cluster will be created.
   * @param cluster Required. The cluster to create.
   * @param clusterId Required. A client-specified unique identifier for the cluster.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Cluster, OperationMetadata> createClusterAsync(
      String parent, Cluster cluster, String clusterId) {
    CreateClusterRequest request =
        CreateClusterRequest.newBuilder()
            .setParent(parent)
            .setCluster(cluster)
            .setClusterId(clusterId)
            .build();
    return createClusterAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Cluster in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   CreateClusterRequest request =
   *       CreateClusterRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setClusterId("clusterId561939637")
   *           .setCluster(Cluster.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Cluster response = edgeContainerClient.createClusterAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Cluster, OperationMetadata> createClusterAsync(
      CreateClusterRequest request) {
    return createClusterOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Cluster in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   CreateClusterRequest request =
   *       CreateClusterRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setClusterId("clusterId561939637")
   *           .setCluster(Cluster.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Cluster, OperationMetadata> future =
   *       edgeContainerClient.createClusterOperationCallable().futureCall(request);
   *   // Do something.
   *   Cluster response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateClusterRequest, Cluster, OperationMetadata>
      createClusterOperationCallable() {
    return stub.createClusterOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Cluster in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   CreateClusterRequest request =
   *       CreateClusterRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setClusterId("clusterId561939637")
   *           .setCluster(Cluster.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future = edgeContainerClient.createClusterCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateClusterRequest, Operation> createClusterCallable() {
    return stub.createClusterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   Cluster cluster = Cluster.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Cluster response = edgeContainerClient.updateClusterAsync(cluster, updateMask).get();
   * }
   * }</pre>
   *
   * @param cluster The updated cluster.
   * @param updateMask Field mask is used to specify the fields to be overwritten in the Cluster
   *     resource by the update. The fields specified in the update_mask are relative to the
   *     resource, not the full request. A field will be overwritten if it is in the mask. If the
   *     user does not provide a mask then all fields will be overwritten.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Cluster, OperationMetadata> updateClusterAsync(
      Cluster cluster, FieldMask updateMask) {
    UpdateClusterRequest request =
        UpdateClusterRequest.newBuilder().setCluster(cluster).setUpdateMask(updateMask).build();
    return updateClusterAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   UpdateClusterRequest request =
   *       UpdateClusterRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setCluster(Cluster.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Cluster response = edgeContainerClient.updateClusterAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Cluster, OperationMetadata> updateClusterAsync(
      UpdateClusterRequest request) {
    return updateClusterOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   UpdateClusterRequest request =
   *       UpdateClusterRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setCluster(Cluster.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Cluster, OperationMetadata> future =
   *       edgeContainerClient.updateClusterOperationCallable().futureCall(request);
   *   // Do something.
   *   Cluster response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<UpdateClusterRequest, Cluster, OperationMetadata>
      updateClusterOperationCallable() {
    return stub.updateClusterOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   UpdateClusterRequest request =
   *       UpdateClusterRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setCluster(Cluster.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future = edgeContainerClient.updateClusterCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateClusterRequest, Operation> updateClusterCallable() {
    return stub.updateClusterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Upgrades a single cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ClusterName name = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
   *   String targetVersion = "targetVersion-1639412217";
   *   UpgradeClusterRequest.Schedule schedule = UpgradeClusterRequest.Schedule.forNumber(0);
   *   Cluster response =
   *       edgeContainerClient.upgradeClusterAsync(name, targetVersion, schedule).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the cluster.
   * @param targetVersion Required. The version the cluster is going to be upgraded to.
   * @param schedule The schedule for the upgrade.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Cluster, OperationMetadata> upgradeClusterAsync(
      ClusterName name, String targetVersion, UpgradeClusterRequest.Schedule schedule) {
    UpgradeClusterRequest request =
        UpgradeClusterRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setTargetVersion(targetVersion)
            .setSchedule(schedule)
            .build();
    return upgradeClusterAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Upgrades a single cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String name = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString();
   *   String targetVersion = "targetVersion-1639412217";
   *   UpgradeClusterRequest.Schedule schedule = UpgradeClusterRequest.Schedule.forNumber(0);
   *   Cluster response =
   *       edgeContainerClient.upgradeClusterAsync(name, targetVersion, schedule).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the cluster.
   * @param targetVersion Required. The version the cluster is going to be upgraded to.
   * @param schedule The schedule for the upgrade.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Cluster, OperationMetadata> upgradeClusterAsync(
      String name, String targetVersion, UpgradeClusterRequest.Schedule schedule) {
    UpgradeClusterRequest request =
        UpgradeClusterRequest.newBuilder()
            .setName(name)
            .setTargetVersion(targetVersion)
            .setSchedule(schedule)
            .build();
    return upgradeClusterAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Upgrades a single cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   UpgradeClusterRequest request =
   *       UpgradeClusterRequest.newBuilder()
   *           .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .setTargetVersion("targetVersion-1639412217")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Cluster response = edgeContainerClient.upgradeClusterAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Cluster, OperationMetadata> upgradeClusterAsync(
      UpgradeClusterRequest request) {
    return upgradeClusterOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Upgrades a single cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   UpgradeClusterRequest request =
   *       UpgradeClusterRequest.newBuilder()
   *           .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .setTargetVersion("targetVersion-1639412217")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Cluster, OperationMetadata> future =
   *       edgeContainerClient.upgradeClusterOperationCallable().futureCall(request);
   *   // Do something.
   *   Cluster response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<UpgradeClusterRequest, Cluster, OperationMetadata>
      upgradeClusterOperationCallable() {
    return stub.upgradeClusterOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Upgrades a single cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   UpgradeClusterRequest request =
   *       UpgradeClusterRequest.newBuilder()
   *           .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .setTargetVersion("targetVersion-1639412217")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       edgeContainerClient.upgradeClusterCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpgradeClusterRequest, Operation> upgradeClusterCallable() {
    return stub.upgradeClusterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ClusterName name = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
   *   edgeContainerClient.deleteClusterAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the cluster.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteClusterAsync(ClusterName name) {
    DeleteClusterRequest request =
        DeleteClusterRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return deleteClusterAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String name = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString();
   *   edgeContainerClient.deleteClusterAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the cluster.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteClusterAsync(String name) {
    DeleteClusterRequest request = DeleteClusterRequest.newBuilder().setName(name).build();
    return deleteClusterAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   DeleteClusterRequest request =
   *       DeleteClusterRequest.newBuilder()
   *           .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   edgeContainerClient.deleteClusterAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteClusterAsync(
      DeleteClusterRequest request) {
    return deleteClusterOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   DeleteClusterRequest request =
   *       DeleteClusterRequest.newBuilder()
   *           .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Empty, OperationMetadata> future =
   *       edgeContainerClient.deleteClusterOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteClusterRequest, Empty, OperationMetadata>
      deleteClusterOperationCallable() {
    return stub.deleteClusterOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   DeleteClusterRequest request =
   *       DeleteClusterRequest.newBuilder()
   *           .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future = edgeContainerClient.deleteClusterCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteClusterRequest, Operation> deleteClusterCallable() {
    return stub.deleteClusterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates an access token for a Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ClusterName cluster = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
   *   GenerateAccessTokenResponse response = edgeContainerClient.generateAccessToken(cluster);
   * }
   * }</pre>
   *
   * @param cluster Required. The resource name of the cluster.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateAccessTokenResponse generateAccessToken(ClusterName cluster) {
    GenerateAccessTokenRequest request =
        GenerateAccessTokenRequest.newBuilder()
            .setCluster(cluster == null ? null : cluster.toString())
            .build();
    return generateAccessToken(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates an access token for a Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String cluster = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString();
   *   GenerateAccessTokenResponse response = edgeContainerClient.generateAccessToken(cluster);
   * }
   * }</pre>
   *
   * @param cluster Required. The resource name of the cluster.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateAccessTokenResponse generateAccessToken(String cluster) {
    GenerateAccessTokenRequest request =
        GenerateAccessTokenRequest.newBuilder().setCluster(cluster).build();
    return generateAccessToken(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates an access token for a Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GenerateAccessTokenRequest request =
   *       GenerateAccessTokenRequest.newBuilder()
   *           .setCluster(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .build();
   *   GenerateAccessTokenResponse response = edgeContainerClient.generateAccessToken(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateAccessTokenResponse generateAccessToken(GenerateAccessTokenRequest request) {
    return generateAccessTokenCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates an access token for a Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GenerateAccessTokenRequest request =
   *       GenerateAccessTokenRequest.newBuilder()
   *           .setCluster(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .build();
   *   ApiFuture<GenerateAccessTokenResponse> future =
   *       edgeContainerClient.generateAccessTokenCallable().futureCall(request);
   *   // Do something.
   *   GenerateAccessTokenResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateAccessTokenRequest, GenerateAccessTokenResponse>
      generateAccessTokenCallable() {
    return stub.generateAccessTokenCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates an offline credential for a Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ClusterName cluster = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
   *   GenerateOfflineCredentialResponse response =
   *       edgeContainerClient.generateOfflineCredential(cluster);
   * }
   * }</pre>
   *
   * @param cluster Required. The resource name of the cluster.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateOfflineCredentialResponse generateOfflineCredential(ClusterName cluster) {
    GenerateOfflineCredentialRequest request =
        GenerateOfflineCredentialRequest.newBuilder()
            .setCluster(cluster == null ? null : cluster.toString())
            .build();
    return generateOfflineCredential(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates an offline credential for a Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String cluster = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString();
   *   GenerateOfflineCredentialResponse response =
   *       edgeContainerClient.generateOfflineCredential(cluster);
   * }
   * }</pre>
   *
   * @param cluster Required. The resource name of the cluster.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateOfflineCredentialResponse generateOfflineCredential(String cluster) {
    GenerateOfflineCredentialRequest request =
        GenerateOfflineCredentialRequest.newBuilder().setCluster(cluster).build();
    return generateOfflineCredential(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates an offline credential for a Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GenerateOfflineCredentialRequest request =
   *       GenerateOfflineCredentialRequest.newBuilder()
   *           .setCluster(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .build();
   *   GenerateOfflineCredentialResponse response =
   *       edgeContainerClient.generateOfflineCredential(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateOfflineCredentialResponse generateOfflineCredential(
      GenerateOfflineCredentialRequest request) {
    return generateOfflineCredentialCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates an offline credential for a Cluster.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GenerateOfflineCredentialRequest request =
   *       GenerateOfflineCredentialRequest.newBuilder()
   *           .setCluster(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .build();
   *   ApiFuture<GenerateOfflineCredentialResponse> future =
   *       edgeContainerClient.generateOfflineCredentialCallable().futureCall(request);
   *   // Do something.
   *   GenerateOfflineCredentialResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateOfflineCredentialRequest, GenerateOfflineCredentialResponse>
      generateOfflineCredentialCallable() {
    return stub.generateOfflineCredentialCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists NodePools in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ClusterName parent = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
   *   for (NodePool element : edgeContainerClient.listNodePools(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent cluster, which owns this collection of node pools.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNodePoolsPagedResponse listNodePools(ClusterName parent) {
    ListNodePoolsRequest request =
        ListNodePoolsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listNodePools(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists NodePools in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String parent = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString();
   *   for (NodePool element : edgeContainerClient.listNodePools(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent cluster, which owns this collection of node pools.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNodePoolsPagedResponse listNodePools(String parent) {
    ListNodePoolsRequest request = ListNodePoolsRequest.newBuilder().setParent(parent).build();
    return listNodePools(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists NodePools in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ListNodePoolsRequest request =
   *       ListNodePoolsRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   for (NodePool element : edgeContainerClient.listNodePools(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNodePoolsPagedResponse listNodePools(ListNodePoolsRequest request) {
    return listNodePoolsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists NodePools in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ListNodePoolsRequest request =
   *       ListNodePoolsRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   ApiFuture<NodePool> future =
   *       edgeContainerClient.listNodePoolsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (NodePool element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListNodePoolsRequest, ListNodePoolsPagedResponse>
      listNodePoolsPagedCallable() {
    return stub.listNodePoolsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists NodePools in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ListNodePoolsRequest request =
   *       ListNodePoolsRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   while (true) {
   *     ListNodePoolsResponse response = edgeContainerClient.listNodePoolsCallable().call(request);
   *     for (NodePool element : response.getNodePoolsList()) {
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
  public final UnaryCallable<ListNodePoolsRequest, ListNodePoolsResponse> listNodePoolsCallable() {
    return stub.listNodePoolsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single NodePool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   NodePoolName name = NodePoolName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[NODE_POOL]");
   *   NodePool response = edgeContainerClient.getNodePool(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the node pool.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NodePool getNodePool(NodePoolName name) {
    GetNodePoolRequest request =
        GetNodePoolRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getNodePool(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single NodePool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String name =
   *       NodePoolName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[NODE_POOL]").toString();
   *   NodePool response = edgeContainerClient.getNodePool(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the node pool.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NodePool getNodePool(String name) {
    GetNodePoolRequest request = GetNodePoolRequest.newBuilder().setName(name).build();
    return getNodePool(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single NodePool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GetNodePoolRequest request =
   *       GetNodePoolRequest.newBuilder()
   *           .setName(
   *               NodePoolName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[NODE_POOL]").toString())
   *           .build();
   *   NodePool response = edgeContainerClient.getNodePool(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final NodePool getNodePool(GetNodePoolRequest request) {
    return getNodePoolCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single NodePool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GetNodePoolRequest request =
   *       GetNodePoolRequest.newBuilder()
   *           .setName(
   *               NodePoolName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[NODE_POOL]").toString())
   *           .build();
   *   ApiFuture<NodePool> future = edgeContainerClient.getNodePoolCallable().futureCall(request);
   *   // Do something.
   *   NodePool response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetNodePoolRequest, NodePool> getNodePoolCallable() {
    return stub.getNodePoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new NodePool in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ClusterName parent = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
   *   NodePool nodePool = NodePool.newBuilder().build();
   *   String nodePoolId = "nodePoolId1121557241";
   *   NodePool response =
   *       edgeContainerClient.createNodePoolAsync(parent, nodePool, nodePoolId).get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent cluster where this node pool will be created.
   * @param nodePool Required. The node pool to create.
   * @param nodePoolId Required. A client-specified unique identifier for the node pool.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<NodePool, OperationMetadata> createNodePoolAsync(
      ClusterName parent, NodePool nodePool, String nodePoolId) {
    CreateNodePoolRequest request =
        CreateNodePoolRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setNodePool(nodePool)
            .setNodePoolId(nodePoolId)
            .build();
    return createNodePoolAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new NodePool in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String parent = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString();
   *   NodePool nodePool = NodePool.newBuilder().build();
   *   String nodePoolId = "nodePoolId1121557241";
   *   NodePool response =
   *       edgeContainerClient.createNodePoolAsync(parent, nodePool, nodePoolId).get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent cluster where this node pool will be created.
   * @param nodePool Required. The node pool to create.
   * @param nodePoolId Required. A client-specified unique identifier for the node pool.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<NodePool, OperationMetadata> createNodePoolAsync(
      String parent, NodePool nodePool, String nodePoolId) {
    CreateNodePoolRequest request =
        CreateNodePoolRequest.newBuilder()
            .setParent(parent)
            .setNodePool(nodePool)
            .setNodePoolId(nodePoolId)
            .build();
    return createNodePoolAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new NodePool in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   CreateNodePoolRequest request =
   *       CreateNodePoolRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .setNodePoolId("nodePoolId1121557241")
   *           .setNodePool(NodePool.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   NodePool response = edgeContainerClient.createNodePoolAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<NodePool, OperationMetadata> createNodePoolAsync(
      CreateNodePoolRequest request) {
    return createNodePoolOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new NodePool in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   CreateNodePoolRequest request =
   *       CreateNodePoolRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .setNodePoolId("nodePoolId1121557241")
   *           .setNodePool(NodePool.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<NodePool, OperationMetadata> future =
   *       edgeContainerClient.createNodePoolOperationCallable().futureCall(request);
   *   // Do something.
   *   NodePool response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateNodePoolRequest, NodePool, OperationMetadata>
      createNodePoolOperationCallable() {
    return stub.createNodePoolOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new NodePool in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   CreateNodePoolRequest request =
   *       CreateNodePoolRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
   *           .setNodePoolId("nodePoolId1121557241")
   *           .setNodePool(NodePool.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       edgeContainerClient.createNodePoolCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateNodePoolRequest, Operation> createNodePoolCallable() {
    return stub.createNodePoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single NodePool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   NodePool nodePool = NodePool.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   NodePool response = edgeContainerClient.updateNodePoolAsync(nodePool, updateMask).get();
   * }
   * }</pre>
   *
   * @param nodePool The updated node pool.
   * @param updateMask Field mask is used to specify the fields to be overwritten in the NodePool
   *     resource by the update. The fields specified in the update_mask are relative to the
   *     resource, not the full request. A field will be overwritten if it is in the mask. If the
   *     user does not provide a mask then all fields will be overwritten.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<NodePool, OperationMetadata> updateNodePoolAsync(
      NodePool nodePool, FieldMask updateMask) {
    UpdateNodePoolRequest request =
        UpdateNodePoolRequest.newBuilder().setNodePool(nodePool).setUpdateMask(updateMask).build();
    return updateNodePoolAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single NodePool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   UpdateNodePoolRequest request =
   *       UpdateNodePoolRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setNodePool(NodePool.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   NodePool response = edgeContainerClient.updateNodePoolAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<NodePool, OperationMetadata> updateNodePoolAsync(
      UpdateNodePoolRequest request) {
    return updateNodePoolOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single NodePool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   UpdateNodePoolRequest request =
   *       UpdateNodePoolRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setNodePool(NodePool.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<NodePool, OperationMetadata> future =
   *       edgeContainerClient.updateNodePoolOperationCallable().futureCall(request);
   *   // Do something.
   *   NodePool response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<UpdateNodePoolRequest, NodePool, OperationMetadata>
      updateNodePoolOperationCallable() {
    return stub.updateNodePoolOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single NodePool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   UpdateNodePoolRequest request =
   *       UpdateNodePoolRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setNodePool(NodePool.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       edgeContainerClient.updateNodePoolCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateNodePoolRequest, Operation> updateNodePoolCallable() {
    return stub.updateNodePoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single NodePool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   NodePoolName name = NodePoolName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[NODE_POOL]");
   *   edgeContainerClient.deleteNodePoolAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the node pool.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteNodePoolAsync(NodePoolName name) {
    DeleteNodePoolRequest request =
        DeleteNodePoolRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return deleteNodePoolAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single NodePool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String name =
   *       NodePoolName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[NODE_POOL]").toString();
   *   edgeContainerClient.deleteNodePoolAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the node pool.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteNodePoolAsync(String name) {
    DeleteNodePoolRequest request = DeleteNodePoolRequest.newBuilder().setName(name).build();
    return deleteNodePoolAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single NodePool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   DeleteNodePoolRequest request =
   *       DeleteNodePoolRequest.newBuilder()
   *           .setName(
   *               NodePoolName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[NODE_POOL]").toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   edgeContainerClient.deleteNodePoolAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteNodePoolAsync(
      DeleteNodePoolRequest request) {
    return deleteNodePoolOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single NodePool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   DeleteNodePoolRequest request =
   *       DeleteNodePoolRequest.newBuilder()
   *           .setName(
   *               NodePoolName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[NODE_POOL]").toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Empty, OperationMetadata> future =
   *       edgeContainerClient.deleteNodePoolOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteNodePoolRequest, Empty, OperationMetadata>
      deleteNodePoolOperationCallable() {
    return stub.deleteNodePoolOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single NodePool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   DeleteNodePoolRequest request =
   *       DeleteNodePoolRequest.newBuilder()
   *           .setName(
   *               NodePoolName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[NODE_POOL]").toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       edgeContainerClient.deleteNodePoolCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteNodePoolRequest, Operation> deleteNodePoolCallable() {
    return stub.deleteNodePoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Machines in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (Machine element : edgeContainerClient.listMachines(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent site, which owns this collection of machines.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMachinesPagedResponse listMachines(LocationName parent) {
    ListMachinesRequest request =
        ListMachinesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listMachines(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Machines in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (Machine element : edgeContainerClient.listMachines(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent site, which owns this collection of machines.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMachinesPagedResponse listMachines(String parent) {
    ListMachinesRequest request = ListMachinesRequest.newBuilder().setParent(parent).build();
    return listMachines(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Machines in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ListMachinesRequest request =
   *       ListMachinesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   for (Machine element : edgeContainerClient.listMachines(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMachinesPagedResponse listMachines(ListMachinesRequest request) {
    return listMachinesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Machines in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ListMachinesRequest request =
   *       ListMachinesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   ApiFuture<Machine> future =
   *       edgeContainerClient.listMachinesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Machine element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListMachinesRequest, ListMachinesPagedResponse>
      listMachinesPagedCallable() {
    return stub.listMachinesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Machines in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ListMachinesRequest request =
   *       ListMachinesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   while (true) {
   *     ListMachinesResponse response = edgeContainerClient.listMachinesCallable().call(request);
   *     for (Machine element : response.getMachinesList()) {
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
  public final UnaryCallable<ListMachinesRequest, ListMachinesResponse> listMachinesCallable() {
    return stub.listMachinesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Machine.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   MachineName name = MachineName.of("[PROJECT]", "[LOCATION]", "[MACHINE]");
   *   Machine response = edgeContainerClient.getMachine(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the machine.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Machine getMachine(MachineName name) {
    GetMachineRequest request =
        GetMachineRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getMachine(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Machine.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String name = MachineName.of("[PROJECT]", "[LOCATION]", "[MACHINE]").toString();
   *   Machine response = edgeContainerClient.getMachine(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the machine.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Machine getMachine(String name) {
    GetMachineRequest request = GetMachineRequest.newBuilder().setName(name).build();
    return getMachine(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Machine.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GetMachineRequest request =
   *       GetMachineRequest.newBuilder()
   *           .setName(MachineName.of("[PROJECT]", "[LOCATION]", "[MACHINE]").toString())
   *           .build();
   *   Machine response = edgeContainerClient.getMachine(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Machine getMachine(GetMachineRequest request) {
    return getMachineCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Machine.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GetMachineRequest request =
   *       GetMachineRequest.newBuilder()
   *           .setName(MachineName.of("[PROJECT]", "[LOCATION]", "[MACHINE]").toString())
   *           .build();
   *   ApiFuture<Machine> future = edgeContainerClient.getMachineCallable().futureCall(request);
   *   // Do something.
   *   Machine response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetMachineRequest, Machine> getMachineCallable() {
    return stub.getMachineCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists VPN connections in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (VpnConnection element : edgeContainerClient.listVpnConnections(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent location, which owns this collection of VPN connections.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListVpnConnectionsPagedResponse listVpnConnections(LocationName parent) {
    ListVpnConnectionsRequest request =
        ListVpnConnectionsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listVpnConnections(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists VPN connections in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (VpnConnection element : edgeContainerClient.listVpnConnections(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent location, which owns this collection of VPN connections.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListVpnConnectionsPagedResponse listVpnConnections(String parent) {
    ListVpnConnectionsRequest request =
        ListVpnConnectionsRequest.newBuilder().setParent(parent).build();
    return listVpnConnections(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists VPN connections in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ListVpnConnectionsRequest request =
   *       ListVpnConnectionsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   for (VpnConnection element : edgeContainerClient.listVpnConnections(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListVpnConnectionsPagedResponse listVpnConnections(
      ListVpnConnectionsRequest request) {
    return listVpnConnectionsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists VPN connections in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ListVpnConnectionsRequest request =
   *       ListVpnConnectionsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   ApiFuture<VpnConnection> future =
   *       edgeContainerClient.listVpnConnectionsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (VpnConnection element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListVpnConnectionsRequest, ListVpnConnectionsPagedResponse>
      listVpnConnectionsPagedCallable() {
    return stub.listVpnConnectionsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists VPN connections in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ListVpnConnectionsRequest request =
   *       ListVpnConnectionsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   while (true) {
   *     ListVpnConnectionsResponse response =
   *         edgeContainerClient.listVpnConnectionsCallable().call(request);
   *     for (VpnConnection element : response.getVpnConnectionsList()) {
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
  public final UnaryCallable<ListVpnConnectionsRequest, ListVpnConnectionsResponse>
      listVpnConnectionsCallable() {
    return stub.listVpnConnectionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single VPN connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   VpnConnectionName name = VpnConnectionName.of("[PROJECT]", "[LOCATION]", "[VPN_CONNECTION]");
   *   VpnConnection response = edgeContainerClient.getVpnConnection(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the vpn connection.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final VpnConnection getVpnConnection(VpnConnectionName name) {
    GetVpnConnectionRequest request =
        GetVpnConnectionRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getVpnConnection(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single VPN connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String name = VpnConnectionName.of("[PROJECT]", "[LOCATION]", "[VPN_CONNECTION]").toString();
   *   VpnConnection response = edgeContainerClient.getVpnConnection(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the vpn connection.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final VpnConnection getVpnConnection(String name) {
    GetVpnConnectionRequest request = GetVpnConnectionRequest.newBuilder().setName(name).build();
    return getVpnConnection(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single VPN connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GetVpnConnectionRequest request =
   *       GetVpnConnectionRequest.newBuilder()
   *           .setName(
   *               VpnConnectionName.of("[PROJECT]", "[LOCATION]", "[VPN_CONNECTION]").toString())
   *           .build();
   *   VpnConnection response = edgeContainerClient.getVpnConnection(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final VpnConnection getVpnConnection(GetVpnConnectionRequest request) {
    return getVpnConnectionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single VPN connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GetVpnConnectionRequest request =
   *       GetVpnConnectionRequest.newBuilder()
   *           .setName(
   *               VpnConnectionName.of("[PROJECT]", "[LOCATION]", "[VPN_CONNECTION]").toString())
   *           .build();
   *   ApiFuture<VpnConnection> future =
   *       edgeContainerClient.getVpnConnectionCallable().futureCall(request);
   *   // Do something.
   *   VpnConnection response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetVpnConnectionRequest, VpnConnection> getVpnConnectionCallable() {
    return stub.getVpnConnectionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new VPN connection in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   VpnConnection vpnConnection = VpnConnection.newBuilder().build();
   *   String vpnConnectionId = "vpnConnectionId887330733";
   *   VpnConnection response =
   *       edgeContainerClient
   *           .createVpnConnectionAsync(parent, vpnConnection, vpnConnectionId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent location where this vpn connection will be created.
   * @param vpnConnection Required. The VPN connection to create.
   * @param vpnConnectionId Required. The VPN connection identifier.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<VpnConnection, OperationMetadata> createVpnConnectionAsync(
      LocationName parent, VpnConnection vpnConnection, String vpnConnectionId) {
    CreateVpnConnectionRequest request =
        CreateVpnConnectionRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setVpnConnection(vpnConnection)
            .setVpnConnectionId(vpnConnectionId)
            .build();
    return createVpnConnectionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new VPN connection in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   VpnConnection vpnConnection = VpnConnection.newBuilder().build();
   *   String vpnConnectionId = "vpnConnectionId887330733";
   *   VpnConnection response =
   *       edgeContainerClient
   *           .createVpnConnectionAsync(parent, vpnConnection, vpnConnectionId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent location where this vpn connection will be created.
   * @param vpnConnection Required. The VPN connection to create.
   * @param vpnConnectionId Required. The VPN connection identifier.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<VpnConnection, OperationMetadata> createVpnConnectionAsync(
      String parent, VpnConnection vpnConnection, String vpnConnectionId) {
    CreateVpnConnectionRequest request =
        CreateVpnConnectionRequest.newBuilder()
            .setParent(parent)
            .setVpnConnection(vpnConnection)
            .setVpnConnectionId(vpnConnectionId)
            .build();
    return createVpnConnectionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new VPN connection in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   CreateVpnConnectionRequest request =
   *       CreateVpnConnectionRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setVpnConnectionId("vpnConnectionId887330733")
   *           .setVpnConnection(VpnConnection.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   VpnConnection response = edgeContainerClient.createVpnConnectionAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<VpnConnection, OperationMetadata> createVpnConnectionAsync(
      CreateVpnConnectionRequest request) {
    return createVpnConnectionOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new VPN connection in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   CreateVpnConnectionRequest request =
   *       CreateVpnConnectionRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setVpnConnectionId("vpnConnectionId887330733")
   *           .setVpnConnection(VpnConnection.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<VpnConnection, OperationMetadata> future =
   *       edgeContainerClient.createVpnConnectionOperationCallable().futureCall(request);
   *   // Do something.
   *   VpnConnection response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateVpnConnectionRequest, VpnConnection, OperationMetadata>
      createVpnConnectionOperationCallable() {
    return stub.createVpnConnectionOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new VPN connection in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   CreateVpnConnectionRequest request =
   *       CreateVpnConnectionRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setVpnConnectionId("vpnConnectionId887330733")
   *           .setVpnConnection(VpnConnection.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       edgeContainerClient.createVpnConnectionCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateVpnConnectionRequest, Operation> createVpnConnectionCallable() {
    return stub.createVpnConnectionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single VPN connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   VpnConnectionName name = VpnConnectionName.of("[PROJECT]", "[LOCATION]", "[VPN_CONNECTION]");
   *   edgeContainerClient.deleteVpnConnectionAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the vpn connection.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteVpnConnectionAsync(
      VpnConnectionName name) {
    DeleteVpnConnectionRequest request =
        DeleteVpnConnectionRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteVpnConnectionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single VPN connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String name = VpnConnectionName.of("[PROJECT]", "[LOCATION]", "[VPN_CONNECTION]").toString();
   *   edgeContainerClient.deleteVpnConnectionAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the vpn connection.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteVpnConnectionAsync(String name) {
    DeleteVpnConnectionRequest request =
        DeleteVpnConnectionRequest.newBuilder().setName(name).build();
    return deleteVpnConnectionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single VPN connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   DeleteVpnConnectionRequest request =
   *       DeleteVpnConnectionRequest.newBuilder()
   *           .setName(
   *               VpnConnectionName.of("[PROJECT]", "[LOCATION]", "[VPN_CONNECTION]").toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   edgeContainerClient.deleteVpnConnectionAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteVpnConnectionAsync(
      DeleteVpnConnectionRequest request) {
    return deleteVpnConnectionOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single VPN connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   DeleteVpnConnectionRequest request =
   *       DeleteVpnConnectionRequest.newBuilder()
   *           .setName(
   *               VpnConnectionName.of("[PROJECT]", "[LOCATION]", "[VPN_CONNECTION]").toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Empty, OperationMetadata> future =
   *       edgeContainerClient.deleteVpnConnectionOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteVpnConnectionRequest, Empty, OperationMetadata>
      deleteVpnConnectionOperationCallable() {
    return stub.deleteVpnConnectionOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single VPN connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   DeleteVpnConnectionRequest request =
   *       DeleteVpnConnectionRequest.newBuilder()
   *           .setName(
   *               VpnConnectionName.of("[PROJECT]", "[LOCATION]", "[VPN_CONNECTION]").toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       edgeContainerClient.deleteVpnConnectionCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteVpnConnectionRequest, Operation> deleteVpnConnectionCallable() {
    return stub.deleteVpnConnectionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the server config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   LocationName name = LocationName.of("[PROJECT]", "[LOCATION]");
   *   ServerConfig response = edgeContainerClient.getServerConfig(name);
   * }
   * }</pre>
   *
   * @param name Required. The name (project and location) of the server config to get, specified in
   *     the format `projects/&#42;/locations/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ServerConfig getServerConfig(LocationName name) {
    GetServerConfigRequest request =
        GetServerConfigRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getServerConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the server config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   String name = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   ServerConfig response = edgeContainerClient.getServerConfig(name);
   * }
   * }</pre>
   *
   * @param name Required. The name (project and location) of the server config to get, specified in
   *     the format `projects/&#42;/locations/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ServerConfig getServerConfig(String name) {
    GetServerConfigRequest request = GetServerConfigRequest.newBuilder().setName(name).build();
    return getServerConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the server config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GetServerConfigRequest request =
   *       GetServerConfigRequest.newBuilder()
   *           .setName(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .build();
   *   ServerConfig response = edgeContainerClient.getServerConfig(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ServerConfig getServerConfig(GetServerConfigRequest request) {
    return getServerConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the server config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GetServerConfigRequest request =
   *       GetServerConfigRequest.newBuilder()
   *           .setName(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .build();
   *   ApiFuture<ServerConfig> future =
   *       edgeContainerClient.getServerConfigCallable().futureCall(request);
   *   // Do something.
   *   ServerConfig response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetServerConfigRequest, ServerConfig> getServerConfigCallable() {
    return stub.getServerConfigCallable();
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
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Location element : edgeContainerClient.listLocations(request).iterateAll()) {
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
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Location> future =
   *       edgeContainerClient.listLocationsPagedCallable().futureCall(request);
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
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListLocationsResponse response = edgeContainerClient.listLocationsCallable().call(request);
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
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   Location response = edgeContainerClient.getLocation(request);
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
   * try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<Location> future = edgeContainerClient.getLocationCallable().futureCall(request);
   *   // Do something.
   *   Location response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return stub.getLocationCallable();
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

  public static class ListClustersPagedResponse
      extends AbstractPagedListResponse<
          ListClustersRequest,
          ListClustersResponse,
          Cluster,
          ListClustersPage,
          ListClustersFixedSizeCollection> {

    public static ApiFuture<ListClustersPagedResponse> createAsync(
        PageContext<ListClustersRequest, ListClustersResponse, Cluster> context,
        ApiFuture<ListClustersResponse> futureResponse) {
      ApiFuture<ListClustersPage> futurePage =
          ListClustersPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListClustersPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListClustersPagedResponse(ListClustersPage page) {
      super(page, ListClustersFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListClustersPage
      extends AbstractPage<ListClustersRequest, ListClustersResponse, Cluster, ListClustersPage> {

    private ListClustersPage(
        PageContext<ListClustersRequest, ListClustersResponse, Cluster> context,
        ListClustersResponse response) {
      super(context, response);
    }

    private static ListClustersPage createEmptyPage() {
      return new ListClustersPage(null, null);
    }

    @Override
    protected ListClustersPage createPage(
        PageContext<ListClustersRequest, ListClustersResponse, Cluster> context,
        ListClustersResponse response) {
      return new ListClustersPage(context, response);
    }

    @Override
    public ApiFuture<ListClustersPage> createPageAsync(
        PageContext<ListClustersRequest, ListClustersResponse, Cluster> context,
        ApiFuture<ListClustersResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListClustersFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListClustersRequest,
          ListClustersResponse,
          Cluster,
          ListClustersPage,
          ListClustersFixedSizeCollection> {

    private ListClustersFixedSizeCollection(List<ListClustersPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListClustersFixedSizeCollection createEmptyCollection() {
      return new ListClustersFixedSizeCollection(null, 0);
    }

    @Override
    protected ListClustersFixedSizeCollection createCollection(
        List<ListClustersPage> pages, int collectionSize) {
      return new ListClustersFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListNodePoolsPagedResponse
      extends AbstractPagedListResponse<
          ListNodePoolsRequest,
          ListNodePoolsResponse,
          NodePool,
          ListNodePoolsPage,
          ListNodePoolsFixedSizeCollection> {

    public static ApiFuture<ListNodePoolsPagedResponse> createAsync(
        PageContext<ListNodePoolsRequest, ListNodePoolsResponse, NodePool> context,
        ApiFuture<ListNodePoolsResponse> futureResponse) {
      ApiFuture<ListNodePoolsPage> futurePage =
          ListNodePoolsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListNodePoolsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListNodePoolsPagedResponse(ListNodePoolsPage page) {
      super(page, ListNodePoolsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListNodePoolsPage
      extends AbstractPage<
          ListNodePoolsRequest, ListNodePoolsResponse, NodePool, ListNodePoolsPage> {

    private ListNodePoolsPage(
        PageContext<ListNodePoolsRequest, ListNodePoolsResponse, NodePool> context,
        ListNodePoolsResponse response) {
      super(context, response);
    }

    private static ListNodePoolsPage createEmptyPage() {
      return new ListNodePoolsPage(null, null);
    }

    @Override
    protected ListNodePoolsPage createPage(
        PageContext<ListNodePoolsRequest, ListNodePoolsResponse, NodePool> context,
        ListNodePoolsResponse response) {
      return new ListNodePoolsPage(context, response);
    }

    @Override
    public ApiFuture<ListNodePoolsPage> createPageAsync(
        PageContext<ListNodePoolsRequest, ListNodePoolsResponse, NodePool> context,
        ApiFuture<ListNodePoolsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListNodePoolsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListNodePoolsRequest,
          ListNodePoolsResponse,
          NodePool,
          ListNodePoolsPage,
          ListNodePoolsFixedSizeCollection> {

    private ListNodePoolsFixedSizeCollection(List<ListNodePoolsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListNodePoolsFixedSizeCollection createEmptyCollection() {
      return new ListNodePoolsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListNodePoolsFixedSizeCollection createCollection(
        List<ListNodePoolsPage> pages, int collectionSize) {
      return new ListNodePoolsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListMachinesPagedResponse
      extends AbstractPagedListResponse<
          ListMachinesRequest,
          ListMachinesResponse,
          Machine,
          ListMachinesPage,
          ListMachinesFixedSizeCollection> {

    public static ApiFuture<ListMachinesPagedResponse> createAsync(
        PageContext<ListMachinesRequest, ListMachinesResponse, Machine> context,
        ApiFuture<ListMachinesResponse> futureResponse) {
      ApiFuture<ListMachinesPage> futurePage =
          ListMachinesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListMachinesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListMachinesPagedResponse(ListMachinesPage page) {
      super(page, ListMachinesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListMachinesPage
      extends AbstractPage<ListMachinesRequest, ListMachinesResponse, Machine, ListMachinesPage> {

    private ListMachinesPage(
        PageContext<ListMachinesRequest, ListMachinesResponse, Machine> context,
        ListMachinesResponse response) {
      super(context, response);
    }

    private static ListMachinesPage createEmptyPage() {
      return new ListMachinesPage(null, null);
    }

    @Override
    protected ListMachinesPage createPage(
        PageContext<ListMachinesRequest, ListMachinesResponse, Machine> context,
        ListMachinesResponse response) {
      return new ListMachinesPage(context, response);
    }

    @Override
    public ApiFuture<ListMachinesPage> createPageAsync(
        PageContext<ListMachinesRequest, ListMachinesResponse, Machine> context,
        ApiFuture<ListMachinesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListMachinesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListMachinesRequest,
          ListMachinesResponse,
          Machine,
          ListMachinesPage,
          ListMachinesFixedSizeCollection> {

    private ListMachinesFixedSizeCollection(List<ListMachinesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListMachinesFixedSizeCollection createEmptyCollection() {
      return new ListMachinesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListMachinesFixedSizeCollection createCollection(
        List<ListMachinesPage> pages, int collectionSize) {
      return new ListMachinesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListVpnConnectionsPagedResponse
      extends AbstractPagedListResponse<
          ListVpnConnectionsRequest,
          ListVpnConnectionsResponse,
          VpnConnection,
          ListVpnConnectionsPage,
          ListVpnConnectionsFixedSizeCollection> {

    public static ApiFuture<ListVpnConnectionsPagedResponse> createAsync(
        PageContext<ListVpnConnectionsRequest, ListVpnConnectionsResponse, VpnConnection> context,
        ApiFuture<ListVpnConnectionsResponse> futureResponse) {
      ApiFuture<ListVpnConnectionsPage> futurePage =
          ListVpnConnectionsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListVpnConnectionsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListVpnConnectionsPagedResponse(ListVpnConnectionsPage page) {
      super(page, ListVpnConnectionsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListVpnConnectionsPage
      extends AbstractPage<
          ListVpnConnectionsRequest,
          ListVpnConnectionsResponse,
          VpnConnection,
          ListVpnConnectionsPage> {

    private ListVpnConnectionsPage(
        PageContext<ListVpnConnectionsRequest, ListVpnConnectionsResponse, VpnConnection> context,
        ListVpnConnectionsResponse response) {
      super(context, response);
    }

    private static ListVpnConnectionsPage createEmptyPage() {
      return new ListVpnConnectionsPage(null, null);
    }

    @Override
    protected ListVpnConnectionsPage createPage(
        PageContext<ListVpnConnectionsRequest, ListVpnConnectionsResponse, VpnConnection> context,
        ListVpnConnectionsResponse response) {
      return new ListVpnConnectionsPage(context, response);
    }

    @Override
    public ApiFuture<ListVpnConnectionsPage> createPageAsync(
        PageContext<ListVpnConnectionsRequest, ListVpnConnectionsResponse, VpnConnection> context,
        ApiFuture<ListVpnConnectionsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListVpnConnectionsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListVpnConnectionsRequest,
          ListVpnConnectionsResponse,
          VpnConnection,
          ListVpnConnectionsPage,
          ListVpnConnectionsFixedSizeCollection> {

    private ListVpnConnectionsFixedSizeCollection(
        List<ListVpnConnectionsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListVpnConnectionsFixedSizeCollection createEmptyCollection() {
      return new ListVpnConnectionsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListVpnConnectionsFixedSizeCollection createCollection(
        List<ListVpnConnectionsPage> pages, int collectionSize) {
      return new ListVpnConnectionsFixedSizeCollection(pages, collectionSize);
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
