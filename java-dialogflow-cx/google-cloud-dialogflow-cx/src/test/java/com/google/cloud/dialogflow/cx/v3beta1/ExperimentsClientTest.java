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

package com.google.cloud.dialogflow.cx.v3beta1;

import static com.google.cloud.dialogflow.cx.v3beta1.ExperimentsClient.ListExperimentsPagedResponse;
import static com.google.cloud.dialogflow.cx.v3beta1.ExperimentsClient.ListLocationsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.Lists;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.Duration;
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
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class ExperimentsClientTest {
  private static MockExperiments mockExperiments;
  private static MockLocations mockLocations;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ExperimentsClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockExperiments = new MockExperiments();
    mockLocations = new MockLocations();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockExperiments, mockLocations));
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
    ExperimentsSettings settings =
        ExperimentsSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ExperimentsClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void listExperimentsTest() throws Exception {
    Experiment responsesElement = Experiment.newBuilder().build();
    ListExperimentsResponse expectedResponse =
        ListExperimentsResponse.newBuilder()
            .setNextPageToken("")
            .addAllExperiments(Arrays.asList(responsesElement))
            .build();
    mockExperiments.addResponse(expectedResponse);

    EnvironmentName parent =
        EnvironmentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]");

    ListExperimentsPagedResponse pagedListResponse = client.listExperiments(parent);

    List<Experiment> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getExperimentsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockExperiments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListExperimentsRequest actualRequest = ((ListExperimentsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listExperimentsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperiments.addException(exception);

    try {
      EnvironmentName parent =
          EnvironmentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]");
      client.listExperiments(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listExperimentsTest2() throws Exception {
    Experiment responsesElement = Experiment.newBuilder().build();
    ListExperimentsResponse expectedResponse =
        ListExperimentsResponse.newBuilder()
            .setNextPageToken("")
            .addAllExperiments(Arrays.asList(responsesElement))
            .build();
    mockExperiments.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListExperimentsPagedResponse pagedListResponse = client.listExperiments(parent);

    List<Experiment> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getExperimentsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockExperiments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListExperimentsRequest actualRequest = ((ListExperimentsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listExperimentsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperiments.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listExperiments(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getExperimentTest() throws Exception {
    Experiment expectedResponse =
        Experiment.newBuilder()
            .setName(
                ExperimentName.of(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setDefinition(Experiment.Definition.newBuilder().build())
            .setRolloutConfig(RolloutConfig.newBuilder().build())
            .setRolloutState(RolloutState.newBuilder().build())
            .setRolloutFailureReason("rolloutFailureReason958797373")
            .setResult(Experiment.Result.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setLastUpdateTime(Timestamp.newBuilder().build())
            .setExperimentLength(Duration.newBuilder().build())
            .addAllVariantsHistory(new ArrayList<VariantsHistory>())
            .build();
    mockExperiments.addResponse(expectedResponse);

    ExperimentName name =
        ExperimentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]");

    Experiment actualResponse = client.getExperiment(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockExperiments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetExperimentRequest actualRequest = ((GetExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperiments.addException(exception);

    try {
      ExperimentName name =
          ExperimentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]");
      client.getExperiment(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getExperimentTest2() throws Exception {
    Experiment expectedResponse =
        Experiment.newBuilder()
            .setName(
                ExperimentName.of(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setDefinition(Experiment.Definition.newBuilder().build())
            .setRolloutConfig(RolloutConfig.newBuilder().build())
            .setRolloutState(RolloutState.newBuilder().build())
            .setRolloutFailureReason("rolloutFailureReason958797373")
            .setResult(Experiment.Result.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setLastUpdateTime(Timestamp.newBuilder().build())
            .setExperimentLength(Duration.newBuilder().build())
            .addAllVariantsHistory(new ArrayList<VariantsHistory>())
            .build();
    mockExperiments.addResponse(expectedResponse);

    String name = "name3373707";

    Experiment actualResponse = client.getExperiment(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockExperiments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetExperimentRequest actualRequest = ((GetExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getExperimentExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperiments.addException(exception);

    try {
      String name = "name3373707";
      client.getExperiment(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createExperimentTest() throws Exception {
    Experiment expectedResponse =
        Experiment.newBuilder()
            .setName(
                ExperimentName.of(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setDefinition(Experiment.Definition.newBuilder().build())
            .setRolloutConfig(RolloutConfig.newBuilder().build())
            .setRolloutState(RolloutState.newBuilder().build())
            .setRolloutFailureReason("rolloutFailureReason958797373")
            .setResult(Experiment.Result.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setLastUpdateTime(Timestamp.newBuilder().build())
            .setExperimentLength(Duration.newBuilder().build())
            .addAllVariantsHistory(new ArrayList<VariantsHistory>())
            .build();
    mockExperiments.addResponse(expectedResponse);

    EnvironmentName parent =
        EnvironmentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]");
    Experiment experiment = Experiment.newBuilder().build();

    Experiment actualResponse = client.createExperiment(parent, experiment);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockExperiments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateExperimentRequest actualRequest = ((CreateExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(experiment, actualRequest.getExperiment());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperiments.addException(exception);

    try {
      EnvironmentName parent =
          EnvironmentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]");
      Experiment experiment = Experiment.newBuilder().build();
      client.createExperiment(parent, experiment);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createExperimentTest2() throws Exception {
    Experiment expectedResponse =
        Experiment.newBuilder()
            .setName(
                ExperimentName.of(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setDefinition(Experiment.Definition.newBuilder().build())
            .setRolloutConfig(RolloutConfig.newBuilder().build())
            .setRolloutState(RolloutState.newBuilder().build())
            .setRolloutFailureReason("rolloutFailureReason958797373")
            .setResult(Experiment.Result.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setLastUpdateTime(Timestamp.newBuilder().build())
            .setExperimentLength(Duration.newBuilder().build())
            .addAllVariantsHistory(new ArrayList<VariantsHistory>())
            .build();
    mockExperiments.addResponse(expectedResponse);

    String parent = "parent-995424086";
    Experiment experiment = Experiment.newBuilder().build();

    Experiment actualResponse = client.createExperiment(parent, experiment);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockExperiments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateExperimentRequest actualRequest = ((CreateExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(experiment, actualRequest.getExperiment());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createExperimentExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperiments.addException(exception);

    try {
      String parent = "parent-995424086";
      Experiment experiment = Experiment.newBuilder().build();
      client.createExperiment(parent, experiment);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateExperimentTest() throws Exception {
    Experiment expectedResponse =
        Experiment.newBuilder()
            .setName(
                ExperimentName.of(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setDefinition(Experiment.Definition.newBuilder().build())
            .setRolloutConfig(RolloutConfig.newBuilder().build())
            .setRolloutState(RolloutState.newBuilder().build())
            .setRolloutFailureReason("rolloutFailureReason958797373")
            .setResult(Experiment.Result.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setLastUpdateTime(Timestamp.newBuilder().build())
            .setExperimentLength(Duration.newBuilder().build())
            .addAllVariantsHistory(new ArrayList<VariantsHistory>())
            .build();
    mockExperiments.addResponse(expectedResponse);

    Experiment experiment = Experiment.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Experiment actualResponse = client.updateExperiment(experiment, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockExperiments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateExperimentRequest actualRequest = ((UpdateExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(experiment, actualRequest.getExperiment());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperiments.addException(exception);

    try {
      Experiment experiment = Experiment.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateExperiment(experiment, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteExperimentTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockExperiments.addResponse(expectedResponse);

    ExperimentName name =
        ExperimentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]");

    client.deleteExperiment(name);

    List<AbstractMessage> actualRequests = mockExperiments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteExperimentRequest actualRequest = ((DeleteExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperiments.addException(exception);

    try {
      ExperimentName name =
          ExperimentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]");
      client.deleteExperiment(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteExperimentTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockExperiments.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteExperiment(name);

    List<AbstractMessage> actualRequests = mockExperiments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteExperimentRequest actualRequest = ((DeleteExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteExperimentExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperiments.addException(exception);

    try {
      String name = "name3373707";
      client.deleteExperiment(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void startExperimentTest() throws Exception {
    Experiment expectedResponse =
        Experiment.newBuilder()
            .setName(
                ExperimentName.of(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setDefinition(Experiment.Definition.newBuilder().build())
            .setRolloutConfig(RolloutConfig.newBuilder().build())
            .setRolloutState(RolloutState.newBuilder().build())
            .setRolloutFailureReason("rolloutFailureReason958797373")
            .setResult(Experiment.Result.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setLastUpdateTime(Timestamp.newBuilder().build())
            .setExperimentLength(Duration.newBuilder().build())
            .addAllVariantsHistory(new ArrayList<VariantsHistory>())
            .build();
    mockExperiments.addResponse(expectedResponse);

    ExperimentName name =
        ExperimentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]");

    Experiment actualResponse = client.startExperiment(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockExperiments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    StartExperimentRequest actualRequest = ((StartExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void startExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperiments.addException(exception);

    try {
      ExperimentName name =
          ExperimentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]");
      client.startExperiment(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void startExperimentTest2() throws Exception {
    Experiment expectedResponse =
        Experiment.newBuilder()
            .setName(
                ExperimentName.of(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setDefinition(Experiment.Definition.newBuilder().build())
            .setRolloutConfig(RolloutConfig.newBuilder().build())
            .setRolloutState(RolloutState.newBuilder().build())
            .setRolloutFailureReason("rolloutFailureReason958797373")
            .setResult(Experiment.Result.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setLastUpdateTime(Timestamp.newBuilder().build())
            .setExperimentLength(Duration.newBuilder().build())
            .addAllVariantsHistory(new ArrayList<VariantsHistory>())
            .build();
    mockExperiments.addResponse(expectedResponse);

    String name = "name3373707";

    Experiment actualResponse = client.startExperiment(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockExperiments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    StartExperimentRequest actualRequest = ((StartExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void startExperimentExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperiments.addException(exception);

    try {
      String name = "name3373707";
      client.startExperiment(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void stopExperimentTest() throws Exception {
    Experiment expectedResponse =
        Experiment.newBuilder()
            .setName(
                ExperimentName.of(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setDefinition(Experiment.Definition.newBuilder().build())
            .setRolloutConfig(RolloutConfig.newBuilder().build())
            .setRolloutState(RolloutState.newBuilder().build())
            .setRolloutFailureReason("rolloutFailureReason958797373")
            .setResult(Experiment.Result.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setLastUpdateTime(Timestamp.newBuilder().build())
            .setExperimentLength(Duration.newBuilder().build())
            .addAllVariantsHistory(new ArrayList<VariantsHistory>())
            .build();
    mockExperiments.addResponse(expectedResponse);

    ExperimentName name =
        ExperimentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]");

    Experiment actualResponse = client.stopExperiment(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockExperiments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    StopExperimentRequest actualRequest = ((StopExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void stopExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperiments.addException(exception);

    try {
      ExperimentName name =
          ExperimentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]");
      client.stopExperiment(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void stopExperimentTest2() throws Exception {
    Experiment expectedResponse =
        Experiment.newBuilder()
            .setName(
                ExperimentName.of(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]", "[EXPERIMENT]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setDefinition(Experiment.Definition.newBuilder().build())
            .setRolloutConfig(RolloutConfig.newBuilder().build())
            .setRolloutState(RolloutState.newBuilder().build())
            .setRolloutFailureReason("rolloutFailureReason958797373")
            .setResult(Experiment.Result.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setLastUpdateTime(Timestamp.newBuilder().build())
            .setExperimentLength(Duration.newBuilder().build())
            .addAllVariantsHistory(new ArrayList<VariantsHistory>())
            .build();
    mockExperiments.addResponse(expectedResponse);

    String name = "name3373707";

    Experiment actualResponse = client.stopExperiment(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockExperiments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    StopExperimentRequest actualRequest = ((StopExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void stopExperimentExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperiments.addException(exception);

    try {
      String name = "name3373707";
      client.stopExperiment(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
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
}
