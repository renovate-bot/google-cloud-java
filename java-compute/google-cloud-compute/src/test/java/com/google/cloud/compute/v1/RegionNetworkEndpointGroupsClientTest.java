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

package com.google.cloud.compute.v1;

import static com.google.cloud.compute.v1.RegionNetworkEndpointGroupsClient.ListNetworkEndpointsPagedResponse;
import static com.google.cloud.compute.v1.RegionNetworkEndpointGroupsClient.ListPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.compute.v1.Operation.Status;
import com.google.cloud.compute.v1.stub.HttpJsonRegionNetworkEndpointGroupsStub;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class RegionNetworkEndpointGroupsClientTest {
  private static MockHttpService mockService;
  private static RegionNetworkEndpointGroupsClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonRegionNetworkEndpointGroupsStub.getMethodDescriptors(),
            RegionNetworkEndpointGroupsSettings.getDefaultEndpoint());
    RegionNetworkEndpointGroupsSettings settings =
        RegionNetworkEndpointGroupsSettings.newBuilder()
            .setTransportChannelProvider(
                RegionNetworkEndpointGroupsSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = RegionNetworkEndpointGroupsClient.create(settings);
  }

  @AfterClass
  public static void stopServer() {
    client.close();
  }

  @Before
  public void setUp() {}

  @After
  public void tearDown() throws Exception {
    mockService.reset();
  }

  @Test
  public void attachNetworkEndpointsTest() throws Exception {
    Operation expectedResponse =
        Operation.newBuilder()
            .setClientOperationId("clientOperationId-1230366697")
            .setCreationTimestamp("creationTimestamp-370203401")
            .setDescription("description-1724546052")
            .setEndTime("endTime-1607243192")
            .setError(Error.newBuilder().build())
            .setHttpErrorMessage("httpErrorMessage1577303431")
            .setHttpErrorStatusCode(0)
            .setId(3355)
            .setInsertTime("insertTime966165798")
            .setInstancesBulkInsertOperationMetadata(
                InstancesBulkInsertOperationMetadata.newBuilder().build())
            .setKind("kind3292052")
            .setName("name3373707")
            .setOperationGroupId("operationGroupId1716161683")
            .setOperationType("operationType91999553")
            .setProgress(-1001078227)
            .setRegion("region-934795532")
            .setSelfLink("selfLink1191800166")
            .setSetCommonInstanceMetadataOperationMetadata(
                SetCommonInstanceMetadataOperationMetadata.newBuilder().build())
            .setStartTime("startTime-2129294769")
            .setStatus(Status.DONE)
            .setStatusMessage("statusMessage-958704715")
            .setTargetId(-815576439)
            .setTargetLink("targetLink486368555")
            .setUser("user3599307")
            .addAllWarnings(new ArrayList<Warnings>())
            .setZone("zone3744684")
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-6911";
    String region = "region-9622";
    String networkEndpointGroup = "networkEndpointGroup-386";
    RegionNetworkEndpointGroupsAttachEndpointsRequest
        regionNetworkEndpointGroupsAttachEndpointsRequestResource =
            RegionNetworkEndpointGroupsAttachEndpointsRequest.newBuilder().build();

    Operation actualResponse =
        client
            .attachNetworkEndpointsAsync(
                project,
                region,
                networkEndpointGroup,
                regionNetworkEndpointGroupsAttachEndpointsRequestResource)
            .get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void attachNetworkEndpointsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-6911";
      String region = "region-9622";
      String networkEndpointGroup = "networkEndpointGroup-386";
      RegionNetworkEndpointGroupsAttachEndpointsRequest
          regionNetworkEndpointGroupsAttachEndpointsRequestResource =
              RegionNetworkEndpointGroupsAttachEndpointsRequest.newBuilder().build();
      client
          .attachNetworkEndpointsAsync(
              project,
              region,
              networkEndpointGroup,
              regionNetworkEndpointGroupsAttachEndpointsRequestResource)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteTest() throws Exception {
    Operation expectedResponse =
        Operation.newBuilder()
            .setClientOperationId("clientOperationId-1230366697")
            .setCreationTimestamp("creationTimestamp-370203401")
            .setDescription("description-1724546052")
            .setEndTime("endTime-1607243192")
            .setError(Error.newBuilder().build())
            .setHttpErrorMessage("httpErrorMessage1577303431")
            .setHttpErrorStatusCode(0)
            .setId(3355)
            .setInsertTime("insertTime966165798")
            .setInstancesBulkInsertOperationMetadata(
                InstancesBulkInsertOperationMetadata.newBuilder().build())
            .setKind("kind3292052")
            .setName("name3373707")
            .setOperationGroupId("operationGroupId1716161683")
            .setOperationType("operationType91999553")
            .setProgress(-1001078227)
            .setRegion("region-934795532")
            .setSelfLink("selfLink1191800166")
            .setSetCommonInstanceMetadataOperationMetadata(
                SetCommonInstanceMetadataOperationMetadata.newBuilder().build())
            .setStartTime("startTime-2129294769")
            .setStatus(Status.DONE)
            .setStatusMessage("statusMessage-958704715")
            .setTargetId(-815576439)
            .setTargetLink("targetLink486368555")
            .setUser("user3599307")
            .addAllWarnings(new ArrayList<Warnings>())
            .setZone("zone3744684")
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-6911";
    String region = "region-9622";
    String networkEndpointGroup = "networkEndpointGroup-386";

    Operation actualResponse = client.deleteAsync(project, region, networkEndpointGroup).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-6911";
      String region = "region-9622";
      String networkEndpointGroup = "networkEndpointGroup-386";
      client.deleteAsync(project, region, networkEndpointGroup).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void detachNetworkEndpointsTest() throws Exception {
    Operation expectedResponse =
        Operation.newBuilder()
            .setClientOperationId("clientOperationId-1230366697")
            .setCreationTimestamp("creationTimestamp-370203401")
            .setDescription("description-1724546052")
            .setEndTime("endTime-1607243192")
            .setError(Error.newBuilder().build())
            .setHttpErrorMessage("httpErrorMessage1577303431")
            .setHttpErrorStatusCode(0)
            .setId(3355)
            .setInsertTime("insertTime966165798")
            .setInstancesBulkInsertOperationMetadata(
                InstancesBulkInsertOperationMetadata.newBuilder().build())
            .setKind("kind3292052")
            .setName("name3373707")
            .setOperationGroupId("operationGroupId1716161683")
            .setOperationType("operationType91999553")
            .setProgress(-1001078227)
            .setRegion("region-934795532")
            .setSelfLink("selfLink1191800166")
            .setSetCommonInstanceMetadataOperationMetadata(
                SetCommonInstanceMetadataOperationMetadata.newBuilder().build())
            .setStartTime("startTime-2129294769")
            .setStatus(Status.DONE)
            .setStatusMessage("statusMessage-958704715")
            .setTargetId(-815576439)
            .setTargetLink("targetLink486368555")
            .setUser("user3599307")
            .addAllWarnings(new ArrayList<Warnings>())
            .setZone("zone3744684")
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-6911";
    String region = "region-9622";
    String networkEndpointGroup = "networkEndpointGroup-386";
    RegionNetworkEndpointGroupsDetachEndpointsRequest
        regionNetworkEndpointGroupsDetachEndpointsRequestResource =
            RegionNetworkEndpointGroupsDetachEndpointsRequest.newBuilder().build();

    Operation actualResponse =
        client
            .detachNetworkEndpointsAsync(
                project,
                region,
                networkEndpointGroup,
                regionNetworkEndpointGroupsDetachEndpointsRequestResource)
            .get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void detachNetworkEndpointsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-6911";
      String region = "region-9622";
      String networkEndpointGroup = "networkEndpointGroup-386";
      RegionNetworkEndpointGroupsDetachEndpointsRequest
          regionNetworkEndpointGroupsDetachEndpointsRequestResource =
              RegionNetworkEndpointGroupsDetachEndpointsRequest.newBuilder().build();
      client
          .detachNetworkEndpointsAsync(
              project,
              region,
              networkEndpointGroup,
              regionNetworkEndpointGroupsDetachEndpointsRequestResource)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void getTest() throws Exception {
    NetworkEndpointGroup expectedResponse =
        NetworkEndpointGroup.newBuilder()
            .putAllAnnotations(new HashMap<String, String>())
            .setAppEngine(NetworkEndpointGroupAppEngine.newBuilder().build())
            .setCloudFunction(NetworkEndpointGroupCloudFunction.newBuilder().build())
            .setCloudRun(NetworkEndpointGroupCloudRun.newBuilder().build())
            .setCreationTimestamp("creationTimestamp-370203401")
            .setDefaultPort(-650363969)
            .setDescription("description-1724546052")
            .setId(3355)
            .setKind("kind3292052")
            .setName("name3373707")
            .setNetwork("network1843485230")
            .setNetworkEndpointType("networkEndpointType1733109693")
            .setPscData(NetworkEndpointGroupPscData.newBuilder().build())
            .setPscTargetService("pscTargetService-1789055740")
            .setRegion("region-934795532")
            .setSelfLink("selfLink1191800166")
            .setSize(3530753)
            .setSubnetwork("subnetwork-1302785042")
            .setZone("zone3744684")
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-6911";
    String region = "region-9622";
    String networkEndpointGroup = "networkEndpointGroup-386";

    NetworkEndpointGroup actualResponse = client.get(project, region, networkEndpointGroup);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-6911";
      String region = "region-9622";
      String networkEndpointGroup = "networkEndpointGroup-386";
      client.get(project, region, networkEndpointGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void insertTest() throws Exception {
    Operation expectedResponse =
        Operation.newBuilder()
            .setClientOperationId("clientOperationId-1230366697")
            .setCreationTimestamp("creationTimestamp-370203401")
            .setDescription("description-1724546052")
            .setEndTime("endTime-1607243192")
            .setError(Error.newBuilder().build())
            .setHttpErrorMessage("httpErrorMessage1577303431")
            .setHttpErrorStatusCode(0)
            .setId(3355)
            .setInsertTime("insertTime966165798")
            .setInstancesBulkInsertOperationMetadata(
                InstancesBulkInsertOperationMetadata.newBuilder().build())
            .setKind("kind3292052")
            .setName("name3373707")
            .setOperationGroupId("operationGroupId1716161683")
            .setOperationType("operationType91999553")
            .setProgress(-1001078227)
            .setRegion("region-934795532")
            .setSelfLink("selfLink1191800166")
            .setSetCommonInstanceMetadataOperationMetadata(
                SetCommonInstanceMetadataOperationMetadata.newBuilder().build())
            .setStartTime("startTime-2129294769")
            .setStatus(Status.DONE)
            .setStatusMessage("statusMessage-958704715")
            .setTargetId(-815576439)
            .setTargetLink("targetLink486368555")
            .setUser("user3599307")
            .addAllWarnings(new ArrayList<Warnings>())
            .setZone("zone3744684")
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-6911";
    String region = "region-9622";
    NetworkEndpointGroup networkEndpointGroupResource = NetworkEndpointGroup.newBuilder().build();

    Operation actualResponse =
        client.insertAsync(project, region, networkEndpointGroupResource).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void insertExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-6911";
      String region = "region-9622";
      NetworkEndpointGroup networkEndpointGroupResource = NetworkEndpointGroup.newBuilder().build();
      client.insertAsync(project, region, networkEndpointGroupResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void listTest() throws Exception {
    NetworkEndpointGroup responsesElement = NetworkEndpointGroup.newBuilder().build();
    NetworkEndpointGroupList expectedResponse =
        NetworkEndpointGroupList.newBuilder()
            .setNextPageToken("")
            .addAllItems(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-6911";
    String region = "region-9622";

    ListPagedResponse pagedListResponse = client.list(project, region);

    List<NetworkEndpointGroup> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItemsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-6911";
      String region = "region-9622";
      client.list(project, region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listNetworkEndpointsTest() throws Exception {
    NetworkEndpointWithHealthStatus responsesElement =
        NetworkEndpointWithHealthStatus.newBuilder().build();
    NetworkEndpointGroupsListNetworkEndpoints expectedResponse =
        NetworkEndpointGroupsListNetworkEndpoints.newBuilder()
            .setNextPageToken("")
            .addAllItems(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-6911";
    String region = "region-9622";
    String networkEndpointGroup = "networkEndpointGroup-386";

    ListNetworkEndpointsPagedResponse pagedListResponse =
        client.listNetworkEndpoints(project, region, networkEndpointGroup);

    List<NetworkEndpointWithHealthStatus> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItemsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listNetworkEndpointsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-6911";
      String region = "region-9622";
      String networkEndpointGroup = "networkEndpointGroup-386";
      client.listNetworkEndpoints(project, region, networkEndpointGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
