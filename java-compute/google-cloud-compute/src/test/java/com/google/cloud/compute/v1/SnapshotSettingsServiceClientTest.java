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
import com.google.cloud.compute.v1.stub.HttpJsonSnapshotSettingsServiceStub;
import java.io.IOException;
import java.util.ArrayList;
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
public class SnapshotSettingsServiceClientTest {
  private static MockHttpService mockService;
  private static SnapshotSettingsServiceClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonSnapshotSettingsServiceStub.getMethodDescriptors(),
            SnapshotSettingsServiceSettings.getDefaultEndpoint());
    SnapshotSettingsServiceSettings settings =
        SnapshotSettingsServiceSettings.newBuilder()
            .setTransportChannelProvider(
                SnapshotSettingsServiceSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = SnapshotSettingsServiceClient.create(settings);
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
  public void getTest() throws Exception {
    SnapshotSettings expectedResponse =
        SnapshotSettings.newBuilder()
            .setStorageLocation(SnapshotSettingsStorageLocationSettings.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-6911";

    SnapshotSettings actualResponse = client.get(project);
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
      client.get(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void patchTest() throws Exception {
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
    SnapshotSettings snapshotSettingsResource = SnapshotSettings.newBuilder().build();

    Operation actualResponse = client.patchAsync(project, snapshotSettingsResource).get();
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
  public void patchExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-6911";
      SnapshotSettings snapshotSettingsResource = SnapshotSettings.newBuilder().build();
      client.patchAsync(project, snapshotSettingsResource).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }
}
