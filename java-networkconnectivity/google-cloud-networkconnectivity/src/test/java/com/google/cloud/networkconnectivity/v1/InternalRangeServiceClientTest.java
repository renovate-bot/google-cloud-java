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

package com.google.cloud.networkconnectivity.v1;

import static com.google.cloud.networkconnectivity.v1.InternalRangeServiceClient.ListInternalRangesPagedResponse;
import static com.google.cloud.networkconnectivity.v1.InternalRangeServiceClient.ListLocationsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.Lists;
import com.google.iam.v1.AuditConfig;
import com.google.iam.v1.Binding;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.GetPolicyOptions;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class InternalRangeServiceClientTest {
  private static MockIAMPolicy mockIAMPolicy;
  private static MockInternalRangeService mockInternalRangeService;
  private static MockLocations mockLocations;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private InternalRangeServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockInternalRangeService = new MockInternalRangeService();
    mockLocations = new MockLocations();
    mockIAMPolicy = new MockIAMPolicy();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockInternalRangeService, mockLocations, mockIAMPolicy));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    InternalRangeServiceSettings settings =
        InternalRangeServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = InternalRangeServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void listInternalRangesTest() throws Exception {
    InternalRange responsesElement = InternalRange.newBuilder().build();
    ListInternalRangesResponse expectedResponse =
        ListInternalRangesResponse.newBuilder()
            .setNextPageToken("")
            .addAllInternalRanges(Arrays.asList(responsesElement))
            .build();
    mockInternalRangeService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListInternalRangesPagedResponse pagedListResponse = client.listInternalRanges(parent);

    List<InternalRange> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getInternalRangesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockInternalRangeService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListInternalRangesRequest actualRequest = ((ListInternalRangesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listInternalRangesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInternalRangeService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listInternalRanges(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listInternalRangesTest2() throws Exception {
    InternalRange responsesElement = InternalRange.newBuilder().build();
    ListInternalRangesResponse expectedResponse =
        ListInternalRangesResponse.newBuilder()
            .setNextPageToken("")
            .addAllInternalRanges(Arrays.asList(responsesElement))
            .build();
    mockInternalRangeService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListInternalRangesPagedResponse pagedListResponse = client.listInternalRanges(parent);

    List<InternalRange> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getInternalRangesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockInternalRangeService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListInternalRangesRequest actualRequest = ((ListInternalRangesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listInternalRangesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInternalRangeService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listInternalRanges(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getInternalRangeTest() throws Exception {
    InternalRange expectedResponse =
        InternalRange.newBuilder()
            .setName(InternalRangeName.of("[PROJECT]", "[LOCATION]", "[INTERNAL_RANGE]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setIpCidrRange("ipCidrRange-866375486")
            .setNetwork("network1843485230")
            .setPrefixLength(-1157046989)
            .addAllTargetCidrRange(new ArrayList<String>())
            .addAllUsers(new ArrayList<String>())
            .addAllOverlaps(new ArrayList<InternalRange.Overlap>())
            .setMigration(InternalRange.Migration.newBuilder().build())
            .setImmutable(true)
            .setAllocationOptions(InternalRange.AllocationOptions.newBuilder().build())
            .addAllExcludeCidrRanges(new ArrayList<String>())
            .build();
    mockInternalRangeService.addResponse(expectedResponse);

    InternalRangeName name = InternalRangeName.of("[PROJECT]", "[LOCATION]", "[INTERNAL_RANGE]");

    InternalRange actualResponse = client.getInternalRange(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockInternalRangeService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetInternalRangeRequest actualRequest = ((GetInternalRangeRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getInternalRangeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInternalRangeService.addException(exception);

    try {
      InternalRangeName name = InternalRangeName.of("[PROJECT]", "[LOCATION]", "[INTERNAL_RANGE]");
      client.getInternalRange(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getInternalRangeTest2() throws Exception {
    InternalRange expectedResponse =
        InternalRange.newBuilder()
            .setName(InternalRangeName.of("[PROJECT]", "[LOCATION]", "[INTERNAL_RANGE]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setIpCidrRange("ipCidrRange-866375486")
            .setNetwork("network1843485230")
            .setPrefixLength(-1157046989)
            .addAllTargetCidrRange(new ArrayList<String>())
            .addAllUsers(new ArrayList<String>())
            .addAllOverlaps(new ArrayList<InternalRange.Overlap>())
            .setMigration(InternalRange.Migration.newBuilder().build())
            .setImmutable(true)
            .setAllocationOptions(InternalRange.AllocationOptions.newBuilder().build())
            .addAllExcludeCidrRanges(new ArrayList<String>())
            .build();
    mockInternalRangeService.addResponse(expectedResponse);

    String name = "name3373707";

    InternalRange actualResponse = client.getInternalRange(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockInternalRangeService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetInternalRangeRequest actualRequest = ((GetInternalRangeRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getInternalRangeExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInternalRangeService.addException(exception);

    try {
      String name = "name3373707";
      client.getInternalRange(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createInternalRangeTest() throws Exception {
    InternalRange expectedResponse =
        InternalRange.newBuilder()
            .setName(InternalRangeName.of("[PROJECT]", "[LOCATION]", "[INTERNAL_RANGE]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setIpCidrRange("ipCidrRange-866375486")
            .setNetwork("network1843485230")
            .setPrefixLength(-1157046989)
            .addAllTargetCidrRange(new ArrayList<String>())
            .addAllUsers(new ArrayList<String>())
            .addAllOverlaps(new ArrayList<InternalRange.Overlap>())
            .setMigration(InternalRange.Migration.newBuilder().build())
            .setImmutable(true)
            .setAllocationOptions(InternalRange.AllocationOptions.newBuilder().build())
            .addAllExcludeCidrRanges(new ArrayList<String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createInternalRangeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInternalRangeService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    InternalRange internalRange = InternalRange.newBuilder().build();
    String internalRangeId = "internalRangeId-392750661";

    InternalRange actualResponse =
        client.createInternalRangeAsync(parent, internalRange, internalRangeId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockInternalRangeService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateInternalRangeRequest actualRequest = ((CreateInternalRangeRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(internalRange, actualRequest.getInternalRange());
    Assert.assertEquals(internalRangeId, actualRequest.getInternalRangeId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createInternalRangeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInternalRangeService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      InternalRange internalRange = InternalRange.newBuilder().build();
      String internalRangeId = "internalRangeId-392750661";
      client.createInternalRangeAsync(parent, internalRange, internalRangeId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createInternalRangeTest2() throws Exception {
    InternalRange expectedResponse =
        InternalRange.newBuilder()
            .setName(InternalRangeName.of("[PROJECT]", "[LOCATION]", "[INTERNAL_RANGE]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setIpCidrRange("ipCidrRange-866375486")
            .setNetwork("network1843485230")
            .setPrefixLength(-1157046989)
            .addAllTargetCidrRange(new ArrayList<String>())
            .addAllUsers(new ArrayList<String>())
            .addAllOverlaps(new ArrayList<InternalRange.Overlap>())
            .setMigration(InternalRange.Migration.newBuilder().build())
            .setImmutable(true)
            .setAllocationOptions(InternalRange.AllocationOptions.newBuilder().build())
            .addAllExcludeCidrRanges(new ArrayList<String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createInternalRangeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInternalRangeService.addResponse(resultOperation);

    String parent = "parent-995424086";
    InternalRange internalRange = InternalRange.newBuilder().build();
    String internalRangeId = "internalRangeId-392750661";

    InternalRange actualResponse =
        client.createInternalRangeAsync(parent, internalRange, internalRangeId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockInternalRangeService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateInternalRangeRequest actualRequest = ((CreateInternalRangeRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(internalRange, actualRequest.getInternalRange());
    Assert.assertEquals(internalRangeId, actualRequest.getInternalRangeId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createInternalRangeExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInternalRangeService.addException(exception);

    try {
      String parent = "parent-995424086";
      InternalRange internalRange = InternalRange.newBuilder().build();
      String internalRangeId = "internalRangeId-392750661";
      client.createInternalRangeAsync(parent, internalRange, internalRangeId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void updateInternalRangeTest() throws Exception {
    InternalRange expectedResponse =
        InternalRange.newBuilder()
            .setName(InternalRangeName.of("[PROJECT]", "[LOCATION]", "[INTERNAL_RANGE]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setIpCidrRange("ipCidrRange-866375486")
            .setNetwork("network1843485230")
            .setPrefixLength(-1157046989)
            .addAllTargetCidrRange(new ArrayList<String>())
            .addAllUsers(new ArrayList<String>())
            .addAllOverlaps(new ArrayList<InternalRange.Overlap>())
            .setMigration(InternalRange.Migration.newBuilder().build())
            .setImmutable(true)
            .setAllocationOptions(InternalRange.AllocationOptions.newBuilder().build())
            .addAllExcludeCidrRanges(new ArrayList<String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateInternalRangeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInternalRangeService.addResponse(resultOperation);

    InternalRange internalRange = InternalRange.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    InternalRange actualResponse = client.updateInternalRangeAsync(internalRange, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockInternalRangeService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateInternalRangeRequest actualRequest = ((UpdateInternalRangeRequest) actualRequests.get(0));

    Assert.assertEquals(internalRange, actualRequest.getInternalRange());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateInternalRangeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInternalRangeService.addException(exception);

    try {
      InternalRange internalRange = InternalRange.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateInternalRangeAsync(internalRange, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deleteInternalRangeTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteInternalRangeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInternalRangeService.addResponse(resultOperation);

    InternalRangeName name = InternalRangeName.of("[PROJECT]", "[LOCATION]", "[INTERNAL_RANGE]");

    client.deleteInternalRangeAsync(name).get();

    List<AbstractMessage> actualRequests = mockInternalRangeService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteInternalRangeRequest actualRequest = ((DeleteInternalRangeRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteInternalRangeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInternalRangeService.addException(exception);

    try {
      InternalRangeName name = InternalRangeName.of("[PROJECT]", "[LOCATION]", "[INTERNAL_RANGE]");
      client.deleteInternalRangeAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deleteInternalRangeTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteInternalRangeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInternalRangeService.addResponse(resultOperation);

    String name = "name3373707";

    client.deleteInternalRangeAsync(name).get();

    List<AbstractMessage> actualRequests = mockInternalRangeService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteInternalRangeRequest actualRequest = ((DeleteInternalRangeRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteInternalRangeExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInternalRangeService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteInternalRangeAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void listLocationsTest() throws Exception {
    Location responsesElement = Location.newBuilder().build();
    ListLocationsResponse expectedResponse =
        ListLocationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllLocations(Arrays.asList(responsesElement))
            .build();
    mockLocations.addResponse(expectedResponse);

    ListLocationsRequest request =
        ListLocationsRequest.newBuilder()
            .setName("name3373707")
            .setFilter("filter-1274492040")
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .build();

    ListLocationsPagedResponse pagedListResponse = client.listLocations(request);

    List<Location> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getLocationsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockLocations.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListLocationsRequest actualRequest = ((ListLocationsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertEquals(request.getFilter(), actualRequest.getFilter());
    Assert.assertEquals(request.getPageSize(), actualRequest.getPageSize());
    Assert.assertEquals(request.getPageToken(), actualRequest.getPageToken());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listLocationsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLocations.addException(exception);

    try {
      ListLocationsRequest request =
          ListLocationsRequest.newBuilder()
              .setName("name3373707")
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      client.listLocations(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getLocationTest() throws Exception {
    Location expectedResponse =
        Location.newBuilder()
            .setName("name3373707")
            .setLocationId("locationId1541836720")
            .setDisplayName("displayName1714148973")
            .putAllLabels(new HashMap<String, String>())
            .setMetadata(Any.newBuilder().build())
            .build();
    mockLocations.addResponse(expectedResponse);

    GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();

    Location actualResponse = client.getLocation(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLocations.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetLocationRequest actualRequest = ((GetLocationRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getLocationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLocations.addException(exception);

    try {
      GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
      client.getLocation(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void setIamPolicyTest() throws Exception {
    Policy expectedResponse =
        Policy.newBuilder()
            .setVersion(351608024)
            .addAllBindings(new ArrayList<Binding>())
            .addAllAuditConfigs(new ArrayList<AuditConfig>())
            .setEtag(ByteString.EMPTY)
            .build();
    mockIAMPolicy.addResponse(expectedResponse);

    SetIamPolicyRequest request =
        SetIamPolicyRequest.newBuilder()
            .setResource(GroupName.of("[PROJECT]", "[HUB]", "[GROUP]").toString())
            .setPolicy(Policy.newBuilder().build())
            .setUpdateMask(FieldMask.newBuilder().build())
            .build();

    Policy actualResponse = client.setIamPolicy(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIAMPolicy.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetIamPolicyRequest actualRequest = ((SetIamPolicyRequest) actualRequests.get(0));

    Assert.assertEquals(request.getResource(), actualRequest.getResource());
    Assert.assertEquals(request.getPolicy(), actualRequest.getPolicy());
    Assert.assertEquals(request.getUpdateMask(), actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void setIamPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIAMPolicy.addException(exception);

    try {
      SetIamPolicyRequest request =
          SetIamPolicyRequest.newBuilder()
              .setResource(GroupName.of("[PROJECT]", "[HUB]", "[GROUP]").toString())
              .setPolicy(Policy.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      client.setIamPolicy(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getIamPolicyTest() throws Exception {
    Policy expectedResponse =
        Policy.newBuilder()
            .setVersion(351608024)
            .addAllBindings(new ArrayList<Binding>())
            .addAllAuditConfigs(new ArrayList<AuditConfig>())
            .setEtag(ByteString.EMPTY)
            .build();
    mockIAMPolicy.addResponse(expectedResponse);

    GetIamPolicyRequest request =
        GetIamPolicyRequest.newBuilder()
            .setResource(GroupName.of("[PROJECT]", "[HUB]", "[GROUP]").toString())
            .setOptions(GetPolicyOptions.newBuilder().build())
            .build();

    Policy actualResponse = client.getIamPolicy(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIAMPolicy.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetIamPolicyRequest actualRequest = ((GetIamPolicyRequest) actualRequests.get(0));

    Assert.assertEquals(request.getResource(), actualRequest.getResource());
    Assert.assertEquals(request.getOptions(), actualRequest.getOptions());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getIamPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIAMPolicy.addException(exception);

    try {
      GetIamPolicyRequest request =
          GetIamPolicyRequest.newBuilder()
              .setResource(GroupName.of("[PROJECT]", "[HUB]", "[GROUP]").toString())
              .setOptions(GetPolicyOptions.newBuilder().build())
              .build();
      client.getIamPolicy(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void testIamPermissionsTest() throws Exception {
    TestIamPermissionsResponse expectedResponse =
        TestIamPermissionsResponse.newBuilder().addAllPermissions(new ArrayList<String>()).build();
    mockIAMPolicy.addResponse(expectedResponse);

    TestIamPermissionsRequest request =
        TestIamPermissionsRequest.newBuilder()
            .setResource(GroupName.of("[PROJECT]", "[HUB]", "[GROUP]").toString())
            .addAllPermissions(new ArrayList<String>())
            .build();

    TestIamPermissionsResponse actualResponse = client.testIamPermissions(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIAMPolicy.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    TestIamPermissionsRequest actualRequest = ((TestIamPermissionsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getResource(), actualRequest.getResource());
    Assert.assertEquals(request.getPermissionsList(), actualRequest.getPermissionsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void testIamPermissionsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIAMPolicy.addException(exception);

    try {
      TestIamPermissionsRequest request =
          TestIamPermissionsRequest.newBuilder()
              .setResource(GroupName.of("[PROJECT]", "[HUB]", "[GROUP]").toString())
              .addAllPermissions(new ArrayList<String>())
              .build();
      client.testIamPermissions(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
