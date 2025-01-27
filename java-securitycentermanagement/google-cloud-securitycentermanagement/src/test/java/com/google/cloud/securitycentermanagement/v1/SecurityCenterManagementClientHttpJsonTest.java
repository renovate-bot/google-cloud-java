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

package com.google.cloud.securitycentermanagement.v1;

import static com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementClient.ListDescendantEventThreatDetectionCustomModulesPagedResponse;
import static com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementClient.ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse;
import static com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementClient.ListEffectiveEventThreatDetectionCustomModulesPagedResponse;
import static com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementClient.ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse;
import static com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementClient.ListEventThreatDetectionCustomModulesPagedResponse;
import static com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementClient.ListLocationsPagedResponse;
import static com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementClient.ListSecurityCenterServicesPagedResponse;
import static com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementClient.ListSecurityHealthAnalyticsCustomModulesPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.securitycentermanagement.v1.stub.HttpJsonSecurityCenterManagementStub;
import com.google.common.collect.Lists;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class SecurityCenterManagementClientHttpJsonTest {
  private static MockHttpService mockService;
  private static SecurityCenterManagementClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonSecurityCenterManagementStub.getMethodDescriptors(),
            SecurityCenterManagementSettings.getDefaultEndpoint());
    SecurityCenterManagementSettings settings =
        SecurityCenterManagementSettings.newHttpJsonBuilder()
            .setTransportChannelProvider(
                SecurityCenterManagementSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = SecurityCenterManagementClient.create(settings);
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
  public void listEffectiveSecurityHealthAnalyticsCustomModulesTest() throws Exception {
    EffectiveSecurityHealthAnalyticsCustomModule responsesElement =
        EffectiveSecurityHealthAnalyticsCustomModule.newBuilder().build();
    ListEffectiveSecurityHealthAnalyticsCustomModulesResponse expectedResponse =
        ListEffectiveSecurityHealthAnalyticsCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEffectiveSecurityHealthAnalyticsCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");

    ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse pagedListResponse =
        client.listEffectiveSecurityHealthAnalyticsCustomModules(parent);

    List<EffectiveSecurityHealthAnalyticsCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEffectiveSecurityHealthAnalyticsCustomModulesList().get(0),
        resources.get(0));

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
  public void listEffectiveSecurityHealthAnalyticsCustomModulesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");
      client.listEffectiveSecurityHealthAnalyticsCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEffectiveSecurityHealthAnalyticsCustomModulesTest2() throws Exception {
    EffectiveSecurityHealthAnalyticsCustomModule responsesElement =
        EffectiveSecurityHealthAnalyticsCustomModule.newBuilder().build();
    ListEffectiveSecurityHealthAnalyticsCustomModulesResponse expectedResponse =
        ListEffectiveSecurityHealthAnalyticsCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEffectiveSecurityHealthAnalyticsCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse pagedListResponse =
        client.listEffectiveSecurityHealthAnalyticsCustomModules(parent);

    List<EffectiveSecurityHealthAnalyticsCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEffectiveSecurityHealthAnalyticsCustomModulesList().get(0),
        resources.get(0));

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
  public void listEffectiveSecurityHealthAnalyticsCustomModulesExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listEffectiveSecurityHealthAnalyticsCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEffectiveSecurityHealthAnalyticsCustomModulesTest3() throws Exception {
    EffectiveSecurityHealthAnalyticsCustomModule responsesElement =
        EffectiveSecurityHealthAnalyticsCustomModule.newBuilder().build();
    ListEffectiveSecurityHealthAnalyticsCustomModulesResponse expectedResponse =
        ListEffectiveSecurityHealthAnalyticsCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEffectiveSecurityHealthAnalyticsCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");

    ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse pagedListResponse =
        client.listEffectiveSecurityHealthAnalyticsCustomModules(parent);

    List<EffectiveSecurityHealthAnalyticsCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEffectiveSecurityHealthAnalyticsCustomModulesList().get(0),
        resources.get(0));

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
  public void listEffectiveSecurityHealthAnalyticsCustomModulesExceptionTest3() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");
      client.listEffectiveSecurityHealthAnalyticsCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEffectiveSecurityHealthAnalyticsCustomModulesTest4() throws Exception {
    EffectiveSecurityHealthAnalyticsCustomModule responsesElement =
        EffectiveSecurityHealthAnalyticsCustomModule.newBuilder().build();
    ListEffectiveSecurityHealthAnalyticsCustomModulesResponse expectedResponse =
        ListEffectiveSecurityHealthAnalyticsCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEffectiveSecurityHealthAnalyticsCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse pagedListResponse =
        client.listEffectiveSecurityHealthAnalyticsCustomModules(parent);

    List<EffectiveSecurityHealthAnalyticsCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEffectiveSecurityHealthAnalyticsCustomModulesList().get(0),
        resources.get(0));

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
  public void listEffectiveSecurityHealthAnalyticsCustomModulesExceptionTest4() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listEffectiveSecurityHealthAnalyticsCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEffectiveSecurityHealthAnalyticsCustomModuleTest() throws Exception {
    EffectiveSecurityHealthAnalyticsCustomModule expectedResponse =
        EffectiveSecurityHealthAnalyticsCustomModule.newBuilder()
            .setName(
                EffectiveSecurityHealthAnalyticsCustomModuleName
                    .ofProjectLocationEffectiveSecurityHealthAnalyticsCustomModuleName(
                        "[PROJECT]",
                        "[LOCATION]",
                        "[EFFECTIVE_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setCustomConfig(CustomConfig.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .build();
    mockService.addResponse(expectedResponse);

    EffectiveSecurityHealthAnalyticsCustomModuleName name =
        EffectiveSecurityHealthAnalyticsCustomModuleName
            .ofProjectLocationEffectiveSecurityHealthAnalyticsCustomModuleName(
                "[PROJECT]", "[LOCATION]", "[EFFECTIVE_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]");

    EffectiveSecurityHealthAnalyticsCustomModule actualResponse =
        client.getEffectiveSecurityHealthAnalyticsCustomModule(name);
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
  public void getEffectiveSecurityHealthAnalyticsCustomModuleExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      EffectiveSecurityHealthAnalyticsCustomModuleName name =
          EffectiveSecurityHealthAnalyticsCustomModuleName
              .ofProjectLocationEffectiveSecurityHealthAnalyticsCustomModuleName(
                  "[PROJECT]", "[LOCATION]", "[EFFECTIVE_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]");
      client.getEffectiveSecurityHealthAnalyticsCustomModule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEffectiveSecurityHealthAnalyticsCustomModuleTest2() throws Exception {
    EffectiveSecurityHealthAnalyticsCustomModule expectedResponse =
        EffectiveSecurityHealthAnalyticsCustomModule.newBuilder()
            .setName(
                EffectiveSecurityHealthAnalyticsCustomModuleName
                    .ofProjectLocationEffectiveSecurityHealthAnalyticsCustomModuleName(
                        "[PROJECT]",
                        "[LOCATION]",
                        "[EFFECTIVE_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setCustomConfig(CustomConfig.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-7865/locations/location-7865/effectiveSecurityHealthAnalyticsCustomModules/effectiveSecurityHealthAnalyticsCustomModule-7865";

    EffectiveSecurityHealthAnalyticsCustomModule actualResponse =
        client.getEffectiveSecurityHealthAnalyticsCustomModule(name);
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
  public void getEffectiveSecurityHealthAnalyticsCustomModuleExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-7865/locations/location-7865/effectiveSecurityHealthAnalyticsCustomModules/effectiveSecurityHealthAnalyticsCustomModule-7865";
      client.getEffectiveSecurityHealthAnalyticsCustomModule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSecurityHealthAnalyticsCustomModulesTest() throws Exception {
    SecurityHealthAnalyticsCustomModule responsesElement =
        SecurityHealthAnalyticsCustomModule.newBuilder().build();
    ListSecurityHealthAnalyticsCustomModulesResponse expectedResponse =
        ListSecurityHealthAnalyticsCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllSecurityHealthAnalyticsCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");

    ListSecurityHealthAnalyticsCustomModulesPagedResponse pagedListResponse =
        client.listSecurityHealthAnalyticsCustomModules(parent);

    List<SecurityHealthAnalyticsCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getSecurityHealthAnalyticsCustomModulesList().get(0), resources.get(0));

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
  public void listSecurityHealthAnalyticsCustomModulesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");
      client.listSecurityHealthAnalyticsCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSecurityHealthAnalyticsCustomModulesTest2() throws Exception {
    SecurityHealthAnalyticsCustomModule responsesElement =
        SecurityHealthAnalyticsCustomModule.newBuilder().build();
    ListSecurityHealthAnalyticsCustomModulesResponse expectedResponse =
        ListSecurityHealthAnalyticsCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllSecurityHealthAnalyticsCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListSecurityHealthAnalyticsCustomModulesPagedResponse pagedListResponse =
        client.listSecurityHealthAnalyticsCustomModules(parent);

    List<SecurityHealthAnalyticsCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getSecurityHealthAnalyticsCustomModulesList().get(0), resources.get(0));

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
  public void listSecurityHealthAnalyticsCustomModulesExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listSecurityHealthAnalyticsCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSecurityHealthAnalyticsCustomModulesTest3() throws Exception {
    SecurityHealthAnalyticsCustomModule responsesElement =
        SecurityHealthAnalyticsCustomModule.newBuilder().build();
    ListSecurityHealthAnalyticsCustomModulesResponse expectedResponse =
        ListSecurityHealthAnalyticsCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllSecurityHealthAnalyticsCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");

    ListSecurityHealthAnalyticsCustomModulesPagedResponse pagedListResponse =
        client.listSecurityHealthAnalyticsCustomModules(parent);

    List<SecurityHealthAnalyticsCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getSecurityHealthAnalyticsCustomModulesList().get(0), resources.get(0));

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
  public void listSecurityHealthAnalyticsCustomModulesExceptionTest3() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");
      client.listSecurityHealthAnalyticsCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSecurityHealthAnalyticsCustomModulesTest4() throws Exception {
    SecurityHealthAnalyticsCustomModule responsesElement =
        SecurityHealthAnalyticsCustomModule.newBuilder().build();
    ListSecurityHealthAnalyticsCustomModulesResponse expectedResponse =
        ListSecurityHealthAnalyticsCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllSecurityHealthAnalyticsCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListSecurityHealthAnalyticsCustomModulesPagedResponse pagedListResponse =
        client.listSecurityHealthAnalyticsCustomModules(parent);

    List<SecurityHealthAnalyticsCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getSecurityHealthAnalyticsCustomModulesList().get(0), resources.get(0));

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
  public void listSecurityHealthAnalyticsCustomModulesExceptionTest4() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listSecurityHealthAnalyticsCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDescendantSecurityHealthAnalyticsCustomModulesTest() throws Exception {
    SecurityHealthAnalyticsCustomModule responsesElement =
        SecurityHealthAnalyticsCustomModule.newBuilder().build();
    ListDescendantSecurityHealthAnalyticsCustomModulesResponse expectedResponse =
        ListDescendantSecurityHealthAnalyticsCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllSecurityHealthAnalyticsCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");

    ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse pagedListResponse =
        client.listDescendantSecurityHealthAnalyticsCustomModules(parent);

    List<SecurityHealthAnalyticsCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getSecurityHealthAnalyticsCustomModulesList().get(0), resources.get(0));

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
  public void listDescendantSecurityHealthAnalyticsCustomModulesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");
      client.listDescendantSecurityHealthAnalyticsCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDescendantSecurityHealthAnalyticsCustomModulesTest2() throws Exception {
    SecurityHealthAnalyticsCustomModule responsesElement =
        SecurityHealthAnalyticsCustomModule.newBuilder().build();
    ListDescendantSecurityHealthAnalyticsCustomModulesResponse expectedResponse =
        ListDescendantSecurityHealthAnalyticsCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllSecurityHealthAnalyticsCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse pagedListResponse =
        client.listDescendantSecurityHealthAnalyticsCustomModules(parent);

    List<SecurityHealthAnalyticsCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getSecurityHealthAnalyticsCustomModulesList().get(0), resources.get(0));

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
  public void listDescendantSecurityHealthAnalyticsCustomModulesExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listDescendantSecurityHealthAnalyticsCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDescendantSecurityHealthAnalyticsCustomModulesTest3() throws Exception {
    SecurityHealthAnalyticsCustomModule responsesElement =
        SecurityHealthAnalyticsCustomModule.newBuilder().build();
    ListDescendantSecurityHealthAnalyticsCustomModulesResponse expectedResponse =
        ListDescendantSecurityHealthAnalyticsCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllSecurityHealthAnalyticsCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");

    ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse pagedListResponse =
        client.listDescendantSecurityHealthAnalyticsCustomModules(parent);

    List<SecurityHealthAnalyticsCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getSecurityHealthAnalyticsCustomModulesList().get(0), resources.get(0));

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
  public void listDescendantSecurityHealthAnalyticsCustomModulesExceptionTest3() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");
      client.listDescendantSecurityHealthAnalyticsCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDescendantSecurityHealthAnalyticsCustomModulesTest4() throws Exception {
    SecurityHealthAnalyticsCustomModule responsesElement =
        SecurityHealthAnalyticsCustomModule.newBuilder().build();
    ListDescendantSecurityHealthAnalyticsCustomModulesResponse expectedResponse =
        ListDescendantSecurityHealthAnalyticsCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllSecurityHealthAnalyticsCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse pagedListResponse =
        client.listDescendantSecurityHealthAnalyticsCustomModules(parent);

    List<SecurityHealthAnalyticsCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getSecurityHealthAnalyticsCustomModulesList().get(0), resources.get(0));

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
  public void listDescendantSecurityHealthAnalyticsCustomModulesExceptionTest4() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listDescendantSecurityHealthAnalyticsCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSecurityHealthAnalyticsCustomModuleTest() throws Exception {
    SecurityHealthAnalyticsCustomModule expectedResponse =
        SecurityHealthAnalyticsCustomModule.newBuilder()
            .setName(
                SecurityHealthAnalyticsCustomModuleName
                    .ofProjectLocationSecurityHealthAnalyticsCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .setAncestorModule(
                SecurityHealthAnalyticsCustomModuleName
                    .ofProjectLocationSecurityHealthAnalyticsCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setCustomConfig(CustomConfig.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    SecurityHealthAnalyticsCustomModuleName name =
        SecurityHealthAnalyticsCustomModuleName
            .ofProjectLocationSecurityHealthAnalyticsCustomModuleName(
                "[PROJECT]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]");

    SecurityHealthAnalyticsCustomModule actualResponse =
        client.getSecurityHealthAnalyticsCustomModule(name);
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
  public void getSecurityHealthAnalyticsCustomModuleExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      SecurityHealthAnalyticsCustomModuleName name =
          SecurityHealthAnalyticsCustomModuleName
              .ofProjectLocationSecurityHealthAnalyticsCustomModuleName(
                  "[PROJECT]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]");
      client.getSecurityHealthAnalyticsCustomModule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSecurityHealthAnalyticsCustomModuleTest2() throws Exception {
    SecurityHealthAnalyticsCustomModule expectedResponse =
        SecurityHealthAnalyticsCustomModule.newBuilder()
            .setName(
                SecurityHealthAnalyticsCustomModuleName
                    .ofProjectLocationSecurityHealthAnalyticsCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .setAncestorModule(
                SecurityHealthAnalyticsCustomModuleName
                    .ofProjectLocationSecurityHealthAnalyticsCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setCustomConfig(CustomConfig.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-4964/locations/location-4964/securityHealthAnalyticsCustomModules/securityHealthAnalyticsCustomModule-4964";

    SecurityHealthAnalyticsCustomModule actualResponse =
        client.getSecurityHealthAnalyticsCustomModule(name);
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
  public void getSecurityHealthAnalyticsCustomModuleExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-4964/locations/location-4964/securityHealthAnalyticsCustomModules/securityHealthAnalyticsCustomModule-4964";
      client.getSecurityHealthAnalyticsCustomModule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createSecurityHealthAnalyticsCustomModuleTest() throws Exception {
    SecurityHealthAnalyticsCustomModule expectedResponse =
        SecurityHealthAnalyticsCustomModule.newBuilder()
            .setName(
                SecurityHealthAnalyticsCustomModuleName
                    .ofOrganizationLocationSecurityHealthAnalyticsCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .setAncestorModule(
                SecurityHealthAnalyticsCustomModuleName
                    .ofOrganizationLocationSecurityHealthAnalyticsCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setCustomConfig(CustomConfig.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");
    SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule =
        SecurityHealthAnalyticsCustomModule.newBuilder().build();

    SecurityHealthAnalyticsCustomModule actualResponse =
        client.createSecurityHealthAnalyticsCustomModule(
            parent, securityHealthAnalyticsCustomModule);
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
  public void createSecurityHealthAnalyticsCustomModuleExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");
      SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule =
          SecurityHealthAnalyticsCustomModule.newBuilder().build();
      client.createSecurityHealthAnalyticsCustomModule(parent, securityHealthAnalyticsCustomModule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createSecurityHealthAnalyticsCustomModuleTest2() throws Exception {
    SecurityHealthAnalyticsCustomModule expectedResponse =
        SecurityHealthAnalyticsCustomModule.newBuilder()
            .setName(
                SecurityHealthAnalyticsCustomModuleName
                    .ofOrganizationLocationSecurityHealthAnalyticsCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .setAncestorModule(
                SecurityHealthAnalyticsCustomModuleName
                    .ofOrganizationLocationSecurityHealthAnalyticsCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setCustomConfig(CustomConfig.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule =
        SecurityHealthAnalyticsCustomModule.newBuilder().build();

    SecurityHealthAnalyticsCustomModule actualResponse =
        client.createSecurityHealthAnalyticsCustomModule(
            parent, securityHealthAnalyticsCustomModule);
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
  public void createSecurityHealthAnalyticsCustomModuleExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule =
          SecurityHealthAnalyticsCustomModule.newBuilder().build();
      client.createSecurityHealthAnalyticsCustomModule(parent, securityHealthAnalyticsCustomModule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createSecurityHealthAnalyticsCustomModuleTest3() throws Exception {
    SecurityHealthAnalyticsCustomModule expectedResponse =
        SecurityHealthAnalyticsCustomModule.newBuilder()
            .setName(
                SecurityHealthAnalyticsCustomModuleName
                    .ofOrganizationLocationSecurityHealthAnalyticsCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .setAncestorModule(
                SecurityHealthAnalyticsCustomModuleName
                    .ofOrganizationLocationSecurityHealthAnalyticsCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setCustomConfig(CustomConfig.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");
    SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule =
        SecurityHealthAnalyticsCustomModule.newBuilder().build();

    SecurityHealthAnalyticsCustomModule actualResponse =
        client.createSecurityHealthAnalyticsCustomModule(
            parent, securityHealthAnalyticsCustomModule);
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
  public void createSecurityHealthAnalyticsCustomModuleExceptionTest3() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");
      SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule =
          SecurityHealthAnalyticsCustomModule.newBuilder().build();
      client.createSecurityHealthAnalyticsCustomModule(parent, securityHealthAnalyticsCustomModule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createSecurityHealthAnalyticsCustomModuleTest4() throws Exception {
    SecurityHealthAnalyticsCustomModule expectedResponse =
        SecurityHealthAnalyticsCustomModule.newBuilder()
            .setName(
                SecurityHealthAnalyticsCustomModuleName
                    .ofOrganizationLocationSecurityHealthAnalyticsCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .setAncestorModule(
                SecurityHealthAnalyticsCustomModuleName
                    .ofOrganizationLocationSecurityHealthAnalyticsCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setCustomConfig(CustomConfig.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";
    SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule =
        SecurityHealthAnalyticsCustomModule.newBuilder().build();

    SecurityHealthAnalyticsCustomModule actualResponse =
        client.createSecurityHealthAnalyticsCustomModule(
            parent, securityHealthAnalyticsCustomModule);
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
  public void createSecurityHealthAnalyticsCustomModuleExceptionTest4() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule =
          SecurityHealthAnalyticsCustomModule.newBuilder().build();
      client.createSecurityHealthAnalyticsCustomModule(parent, securityHealthAnalyticsCustomModule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateSecurityHealthAnalyticsCustomModuleTest() throws Exception {
    SecurityHealthAnalyticsCustomModule expectedResponse =
        SecurityHealthAnalyticsCustomModule.newBuilder()
            .setName(
                SecurityHealthAnalyticsCustomModuleName
                    .ofProjectLocationSecurityHealthAnalyticsCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .setAncestorModule(
                SecurityHealthAnalyticsCustomModuleName
                    .ofProjectLocationSecurityHealthAnalyticsCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setCustomConfig(CustomConfig.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule =
        SecurityHealthAnalyticsCustomModule.newBuilder()
            .setName(
                SecurityHealthAnalyticsCustomModuleName
                    .ofProjectLocationSecurityHealthAnalyticsCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .setAncestorModule(
                SecurityHealthAnalyticsCustomModuleName
                    .ofProjectLocationSecurityHealthAnalyticsCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                    .toString())
            .setCustomConfig(CustomConfig.newBuilder().build())
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    SecurityHealthAnalyticsCustomModule actualResponse =
        client.updateSecurityHealthAnalyticsCustomModule(
            securityHealthAnalyticsCustomModule, updateMask);
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
  public void updateSecurityHealthAnalyticsCustomModuleExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule =
          SecurityHealthAnalyticsCustomModule.newBuilder()
              .setName(
                  SecurityHealthAnalyticsCustomModuleName
                      .ofProjectLocationSecurityHealthAnalyticsCustomModuleName(
                          "[PROJECT]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                      .toString())
              .setDisplayName("displayName1714148973")
              .setUpdateTime(Timestamp.newBuilder().build())
              .setLastEditor("lastEditor1523898275")
              .setAncestorModule(
                  SecurityHealthAnalyticsCustomModuleName
                      .ofProjectLocationSecurityHealthAnalyticsCustomModuleName(
                          "[PROJECT]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]")
                      .toString())
              .setCustomConfig(CustomConfig.newBuilder().build())
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateSecurityHealthAnalyticsCustomModule(
          securityHealthAnalyticsCustomModule, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteSecurityHealthAnalyticsCustomModuleTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockService.addResponse(expectedResponse);

    SecurityHealthAnalyticsCustomModuleName name =
        SecurityHealthAnalyticsCustomModuleName
            .ofProjectLocationSecurityHealthAnalyticsCustomModuleName(
                "[PROJECT]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]");

    client.deleteSecurityHealthAnalyticsCustomModule(name);

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
  public void deleteSecurityHealthAnalyticsCustomModuleExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      SecurityHealthAnalyticsCustomModuleName name =
          SecurityHealthAnalyticsCustomModuleName
              .ofProjectLocationSecurityHealthAnalyticsCustomModuleName(
                  "[PROJECT]", "[LOCATION]", "[SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE]");
      client.deleteSecurityHealthAnalyticsCustomModule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteSecurityHealthAnalyticsCustomModuleTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-4964/locations/location-4964/securityHealthAnalyticsCustomModules/securityHealthAnalyticsCustomModule-4964";

    client.deleteSecurityHealthAnalyticsCustomModule(name);

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
  public void deleteSecurityHealthAnalyticsCustomModuleExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-4964/locations/location-4964/securityHealthAnalyticsCustomModules/securityHealthAnalyticsCustomModule-4964";
      client.deleteSecurityHealthAnalyticsCustomModule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void simulateSecurityHealthAnalyticsCustomModuleTest() throws Exception {
    SimulateSecurityHealthAnalyticsCustomModuleResponse expectedResponse =
        SimulateSecurityHealthAnalyticsCustomModuleResponse.newBuilder()
            .setResult(
                SimulateSecurityHealthAnalyticsCustomModuleResponse.SimulatedResult.newBuilder()
                    .build())
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";
    CustomConfig customConfig = CustomConfig.newBuilder().build();
    SimulateSecurityHealthAnalyticsCustomModuleRequest.SimulatedResource resource =
        SimulateSecurityHealthAnalyticsCustomModuleRequest.SimulatedResource.newBuilder().build();

    SimulateSecurityHealthAnalyticsCustomModuleResponse actualResponse =
        client.simulateSecurityHealthAnalyticsCustomModule(parent, customConfig, resource);
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
  public void simulateSecurityHealthAnalyticsCustomModuleExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      CustomConfig customConfig = CustomConfig.newBuilder().build();
      SimulateSecurityHealthAnalyticsCustomModuleRequest.SimulatedResource resource =
          SimulateSecurityHealthAnalyticsCustomModuleRequest.SimulatedResource.newBuilder().build();
      client.simulateSecurityHealthAnalyticsCustomModule(parent, customConfig, resource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEffectiveEventThreatDetectionCustomModulesTest() throws Exception {
    EffectiveEventThreatDetectionCustomModule responsesElement =
        EffectiveEventThreatDetectionCustomModule.newBuilder().build();
    ListEffectiveEventThreatDetectionCustomModulesResponse expectedResponse =
        ListEffectiveEventThreatDetectionCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEffectiveEventThreatDetectionCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");

    ListEffectiveEventThreatDetectionCustomModulesPagedResponse pagedListResponse =
        client.listEffectiveEventThreatDetectionCustomModules(parent);

    List<EffectiveEventThreatDetectionCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEffectiveEventThreatDetectionCustomModulesList().get(0),
        resources.get(0));

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
  public void listEffectiveEventThreatDetectionCustomModulesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");
      client.listEffectiveEventThreatDetectionCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEffectiveEventThreatDetectionCustomModulesTest2() throws Exception {
    EffectiveEventThreatDetectionCustomModule responsesElement =
        EffectiveEventThreatDetectionCustomModule.newBuilder().build();
    ListEffectiveEventThreatDetectionCustomModulesResponse expectedResponse =
        ListEffectiveEventThreatDetectionCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEffectiveEventThreatDetectionCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListEffectiveEventThreatDetectionCustomModulesPagedResponse pagedListResponse =
        client.listEffectiveEventThreatDetectionCustomModules(parent);

    List<EffectiveEventThreatDetectionCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEffectiveEventThreatDetectionCustomModulesList().get(0),
        resources.get(0));

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
  public void listEffectiveEventThreatDetectionCustomModulesExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listEffectiveEventThreatDetectionCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEffectiveEventThreatDetectionCustomModulesTest3() throws Exception {
    EffectiveEventThreatDetectionCustomModule responsesElement =
        EffectiveEventThreatDetectionCustomModule.newBuilder().build();
    ListEffectiveEventThreatDetectionCustomModulesResponse expectedResponse =
        ListEffectiveEventThreatDetectionCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEffectiveEventThreatDetectionCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");

    ListEffectiveEventThreatDetectionCustomModulesPagedResponse pagedListResponse =
        client.listEffectiveEventThreatDetectionCustomModules(parent);

    List<EffectiveEventThreatDetectionCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEffectiveEventThreatDetectionCustomModulesList().get(0),
        resources.get(0));

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
  public void listEffectiveEventThreatDetectionCustomModulesExceptionTest3() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");
      client.listEffectiveEventThreatDetectionCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEffectiveEventThreatDetectionCustomModulesTest4() throws Exception {
    EffectiveEventThreatDetectionCustomModule responsesElement =
        EffectiveEventThreatDetectionCustomModule.newBuilder().build();
    ListEffectiveEventThreatDetectionCustomModulesResponse expectedResponse =
        ListEffectiveEventThreatDetectionCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEffectiveEventThreatDetectionCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListEffectiveEventThreatDetectionCustomModulesPagedResponse pagedListResponse =
        client.listEffectiveEventThreatDetectionCustomModules(parent);

    List<EffectiveEventThreatDetectionCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEffectiveEventThreatDetectionCustomModulesList().get(0),
        resources.get(0));

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
  public void listEffectiveEventThreatDetectionCustomModulesExceptionTest4() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listEffectiveEventThreatDetectionCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEffectiveEventThreatDetectionCustomModuleTest() throws Exception {
    EffectiveEventThreatDetectionCustomModule expectedResponse =
        EffectiveEventThreatDetectionCustomModule.newBuilder()
            .setName(
                EffectiveEventThreatDetectionCustomModuleName
                    .ofProjectLocationEffectiveEventThreatDetectionCustomModuleName(
                        "[PROJECT]",
                        "[LOCATION]",
                        "[EFFECTIVE_EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setConfig(Struct.newBuilder().build())
            .setType("type3575610")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .build();
    mockService.addResponse(expectedResponse);

    EffectiveEventThreatDetectionCustomModuleName name =
        EffectiveEventThreatDetectionCustomModuleName
            .ofProjectLocationEffectiveEventThreatDetectionCustomModuleName(
                "[PROJECT]", "[LOCATION]", "[EFFECTIVE_EVENT_THREAT_DETECTION_CUSTOM_MODULE]");

    EffectiveEventThreatDetectionCustomModule actualResponse =
        client.getEffectiveEventThreatDetectionCustomModule(name);
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
  public void getEffectiveEventThreatDetectionCustomModuleExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      EffectiveEventThreatDetectionCustomModuleName name =
          EffectiveEventThreatDetectionCustomModuleName
              .ofProjectLocationEffectiveEventThreatDetectionCustomModuleName(
                  "[PROJECT]", "[LOCATION]", "[EFFECTIVE_EVENT_THREAT_DETECTION_CUSTOM_MODULE]");
      client.getEffectiveEventThreatDetectionCustomModule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEffectiveEventThreatDetectionCustomModuleTest2() throws Exception {
    EffectiveEventThreatDetectionCustomModule expectedResponse =
        EffectiveEventThreatDetectionCustomModule.newBuilder()
            .setName(
                EffectiveEventThreatDetectionCustomModuleName
                    .ofProjectLocationEffectiveEventThreatDetectionCustomModuleName(
                        "[PROJECT]",
                        "[LOCATION]",
                        "[EFFECTIVE_EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setConfig(Struct.newBuilder().build())
            .setType("type3575610")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-1518/locations/location-1518/effectiveEventThreatDetectionCustomModules/effectiveEventThreatDetectionCustomModule-1518";

    EffectiveEventThreatDetectionCustomModule actualResponse =
        client.getEffectiveEventThreatDetectionCustomModule(name);
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
  public void getEffectiveEventThreatDetectionCustomModuleExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-1518/locations/location-1518/effectiveEventThreatDetectionCustomModules/effectiveEventThreatDetectionCustomModule-1518";
      client.getEffectiveEventThreatDetectionCustomModule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEventThreatDetectionCustomModulesTest() throws Exception {
    EventThreatDetectionCustomModule responsesElement =
        EventThreatDetectionCustomModule.newBuilder().build();
    ListEventThreatDetectionCustomModulesResponse expectedResponse =
        ListEventThreatDetectionCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEventThreatDetectionCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");

    ListEventThreatDetectionCustomModulesPagedResponse pagedListResponse =
        client.listEventThreatDetectionCustomModules(parent);

    List<EventThreatDetectionCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEventThreatDetectionCustomModulesList().get(0), resources.get(0));

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
  public void listEventThreatDetectionCustomModulesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");
      client.listEventThreatDetectionCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEventThreatDetectionCustomModulesTest2() throws Exception {
    EventThreatDetectionCustomModule responsesElement =
        EventThreatDetectionCustomModule.newBuilder().build();
    ListEventThreatDetectionCustomModulesResponse expectedResponse =
        ListEventThreatDetectionCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEventThreatDetectionCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListEventThreatDetectionCustomModulesPagedResponse pagedListResponse =
        client.listEventThreatDetectionCustomModules(parent);

    List<EventThreatDetectionCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEventThreatDetectionCustomModulesList().get(0), resources.get(0));

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
  public void listEventThreatDetectionCustomModulesExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listEventThreatDetectionCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEventThreatDetectionCustomModulesTest3() throws Exception {
    EventThreatDetectionCustomModule responsesElement =
        EventThreatDetectionCustomModule.newBuilder().build();
    ListEventThreatDetectionCustomModulesResponse expectedResponse =
        ListEventThreatDetectionCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEventThreatDetectionCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");

    ListEventThreatDetectionCustomModulesPagedResponse pagedListResponse =
        client.listEventThreatDetectionCustomModules(parent);

    List<EventThreatDetectionCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEventThreatDetectionCustomModulesList().get(0), resources.get(0));

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
  public void listEventThreatDetectionCustomModulesExceptionTest3() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");
      client.listEventThreatDetectionCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEventThreatDetectionCustomModulesTest4() throws Exception {
    EventThreatDetectionCustomModule responsesElement =
        EventThreatDetectionCustomModule.newBuilder().build();
    ListEventThreatDetectionCustomModulesResponse expectedResponse =
        ListEventThreatDetectionCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEventThreatDetectionCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListEventThreatDetectionCustomModulesPagedResponse pagedListResponse =
        client.listEventThreatDetectionCustomModules(parent);

    List<EventThreatDetectionCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEventThreatDetectionCustomModulesList().get(0), resources.get(0));

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
  public void listEventThreatDetectionCustomModulesExceptionTest4() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listEventThreatDetectionCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDescendantEventThreatDetectionCustomModulesTest() throws Exception {
    EventThreatDetectionCustomModule responsesElement =
        EventThreatDetectionCustomModule.newBuilder().build();
    ListDescendantEventThreatDetectionCustomModulesResponse expectedResponse =
        ListDescendantEventThreatDetectionCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEventThreatDetectionCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");

    ListDescendantEventThreatDetectionCustomModulesPagedResponse pagedListResponse =
        client.listDescendantEventThreatDetectionCustomModules(parent);

    List<EventThreatDetectionCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEventThreatDetectionCustomModulesList().get(0), resources.get(0));

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
  public void listDescendantEventThreatDetectionCustomModulesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");
      client.listDescendantEventThreatDetectionCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDescendantEventThreatDetectionCustomModulesTest2() throws Exception {
    EventThreatDetectionCustomModule responsesElement =
        EventThreatDetectionCustomModule.newBuilder().build();
    ListDescendantEventThreatDetectionCustomModulesResponse expectedResponse =
        ListDescendantEventThreatDetectionCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEventThreatDetectionCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListDescendantEventThreatDetectionCustomModulesPagedResponse pagedListResponse =
        client.listDescendantEventThreatDetectionCustomModules(parent);

    List<EventThreatDetectionCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEventThreatDetectionCustomModulesList().get(0), resources.get(0));

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
  public void listDescendantEventThreatDetectionCustomModulesExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listDescendantEventThreatDetectionCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDescendantEventThreatDetectionCustomModulesTest3() throws Exception {
    EventThreatDetectionCustomModule responsesElement =
        EventThreatDetectionCustomModule.newBuilder().build();
    ListDescendantEventThreatDetectionCustomModulesResponse expectedResponse =
        ListDescendantEventThreatDetectionCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEventThreatDetectionCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");

    ListDescendantEventThreatDetectionCustomModulesPagedResponse pagedListResponse =
        client.listDescendantEventThreatDetectionCustomModules(parent);

    List<EventThreatDetectionCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEventThreatDetectionCustomModulesList().get(0), resources.get(0));

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
  public void listDescendantEventThreatDetectionCustomModulesExceptionTest3() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");
      client.listDescendantEventThreatDetectionCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDescendantEventThreatDetectionCustomModulesTest4() throws Exception {
    EventThreatDetectionCustomModule responsesElement =
        EventThreatDetectionCustomModule.newBuilder().build();
    ListDescendantEventThreatDetectionCustomModulesResponse expectedResponse =
        ListDescendantEventThreatDetectionCustomModulesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEventThreatDetectionCustomModules(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListDescendantEventThreatDetectionCustomModulesPagedResponse pagedListResponse =
        client.listDescendantEventThreatDetectionCustomModules(parent);

    List<EventThreatDetectionCustomModule> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getEventThreatDetectionCustomModulesList().get(0), resources.get(0));

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
  public void listDescendantEventThreatDetectionCustomModulesExceptionTest4() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listDescendantEventThreatDetectionCustomModules(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEventThreatDetectionCustomModuleTest() throws Exception {
    EventThreatDetectionCustomModule expectedResponse =
        EventThreatDetectionCustomModule.newBuilder()
            .setName(
                EventThreatDetectionCustomModuleName
                    .ofProjectLocationEventThreatDetectionCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setConfig(Struct.newBuilder().build())
            .setAncestorModule(
                EventThreatDetectionCustomModuleName
                    .ofProjectLocationEventThreatDetectionCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setType("type3575610")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .build();
    mockService.addResponse(expectedResponse);

    EventThreatDetectionCustomModuleName name =
        EventThreatDetectionCustomModuleName.ofProjectLocationEventThreatDetectionCustomModuleName(
            "[PROJECT]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]");

    EventThreatDetectionCustomModule actualResponse =
        client.getEventThreatDetectionCustomModule(name);
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
  public void getEventThreatDetectionCustomModuleExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      EventThreatDetectionCustomModuleName name =
          EventThreatDetectionCustomModuleName
              .ofProjectLocationEventThreatDetectionCustomModuleName(
                  "[PROJECT]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]");
      client.getEventThreatDetectionCustomModule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEventThreatDetectionCustomModuleTest2() throws Exception {
    EventThreatDetectionCustomModule expectedResponse =
        EventThreatDetectionCustomModule.newBuilder()
            .setName(
                EventThreatDetectionCustomModuleName
                    .ofProjectLocationEventThreatDetectionCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setConfig(Struct.newBuilder().build())
            .setAncestorModule(
                EventThreatDetectionCustomModuleName
                    .ofProjectLocationEventThreatDetectionCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setType("type3575610")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-3643/locations/location-3643/eventThreatDetectionCustomModules/eventThreatDetectionCustomModule-3643";

    EventThreatDetectionCustomModule actualResponse =
        client.getEventThreatDetectionCustomModule(name);
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
  public void getEventThreatDetectionCustomModuleExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-3643/locations/location-3643/eventThreatDetectionCustomModules/eventThreatDetectionCustomModule-3643";
      client.getEventThreatDetectionCustomModule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createEventThreatDetectionCustomModuleTest() throws Exception {
    EventThreatDetectionCustomModule expectedResponse =
        EventThreatDetectionCustomModule.newBuilder()
            .setName(
                EventThreatDetectionCustomModuleName
                    .ofOrganizationLocationEventThreatDetectionCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setConfig(Struct.newBuilder().build())
            .setAncestorModule(
                EventThreatDetectionCustomModuleName
                    .ofOrganizationLocationEventThreatDetectionCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setType("type3575610")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .build();
    mockService.addResponse(expectedResponse);

    FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");
    EventThreatDetectionCustomModule eventThreatDetectionCustomModule =
        EventThreatDetectionCustomModule.newBuilder().build();

    EventThreatDetectionCustomModule actualResponse =
        client.createEventThreatDetectionCustomModule(parent, eventThreatDetectionCustomModule);
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
  public void createEventThreatDetectionCustomModuleExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");
      EventThreatDetectionCustomModule eventThreatDetectionCustomModule =
          EventThreatDetectionCustomModule.newBuilder().build();
      client.createEventThreatDetectionCustomModule(parent, eventThreatDetectionCustomModule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createEventThreatDetectionCustomModuleTest2() throws Exception {
    EventThreatDetectionCustomModule expectedResponse =
        EventThreatDetectionCustomModule.newBuilder()
            .setName(
                EventThreatDetectionCustomModuleName
                    .ofOrganizationLocationEventThreatDetectionCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setConfig(Struct.newBuilder().build())
            .setAncestorModule(
                EventThreatDetectionCustomModuleName
                    .ofOrganizationLocationEventThreatDetectionCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setType("type3575610")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    EventThreatDetectionCustomModule eventThreatDetectionCustomModule =
        EventThreatDetectionCustomModule.newBuilder().build();

    EventThreatDetectionCustomModule actualResponse =
        client.createEventThreatDetectionCustomModule(parent, eventThreatDetectionCustomModule);
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
  public void createEventThreatDetectionCustomModuleExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      EventThreatDetectionCustomModule eventThreatDetectionCustomModule =
          EventThreatDetectionCustomModule.newBuilder().build();
      client.createEventThreatDetectionCustomModule(parent, eventThreatDetectionCustomModule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createEventThreatDetectionCustomModuleTest3() throws Exception {
    EventThreatDetectionCustomModule expectedResponse =
        EventThreatDetectionCustomModule.newBuilder()
            .setName(
                EventThreatDetectionCustomModuleName
                    .ofOrganizationLocationEventThreatDetectionCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setConfig(Struct.newBuilder().build())
            .setAncestorModule(
                EventThreatDetectionCustomModuleName
                    .ofOrganizationLocationEventThreatDetectionCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setType("type3575610")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .build();
    mockService.addResponse(expectedResponse);

    OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");
    EventThreatDetectionCustomModule eventThreatDetectionCustomModule =
        EventThreatDetectionCustomModule.newBuilder().build();

    EventThreatDetectionCustomModule actualResponse =
        client.createEventThreatDetectionCustomModule(parent, eventThreatDetectionCustomModule);
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
  public void createEventThreatDetectionCustomModuleExceptionTest3() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");
      EventThreatDetectionCustomModule eventThreatDetectionCustomModule =
          EventThreatDetectionCustomModule.newBuilder().build();
      client.createEventThreatDetectionCustomModule(parent, eventThreatDetectionCustomModule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createEventThreatDetectionCustomModuleTest4() throws Exception {
    EventThreatDetectionCustomModule expectedResponse =
        EventThreatDetectionCustomModule.newBuilder()
            .setName(
                EventThreatDetectionCustomModuleName
                    .ofOrganizationLocationEventThreatDetectionCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setConfig(Struct.newBuilder().build())
            .setAncestorModule(
                EventThreatDetectionCustomModuleName
                    .ofOrganizationLocationEventThreatDetectionCustomModuleName(
                        "[ORGANIZATION]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setType("type3575610")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";
    EventThreatDetectionCustomModule eventThreatDetectionCustomModule =
        EventThreatDetectionCustomModule.newBuilder().build();

    EventThreatDetectionCustomModule actualResponse =
        client.createEventThreatDetectionCustomModule(parent, eventThreatDetectionCustomModule);
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
  public void createEventThreatDetectionCustomModuleExceptionTest4() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      EventThreatDetectionCustomModule eventThreatDetectionCustomModule =
          EventThreatDetectionCustomModule.newBuilder().build();
      client.createEventThreatDetectionCustomModule(parent, eventThreatDetectionCustomModule);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateEventThreatDetectionCustomModuleTest() throws Exception {
    EventThreatDetectionCustomModule expectedResponse =
        EventThreatDetectionCustomModule.newBuilder()
            .setName(
                EventThreatDetectionCustomModuleName
                    .ofProjectLocationEventThreatDetectionCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setConfig(Struct.newBuilder().build())
            .setAncestorModule(
                EventThreatDetectionCustomModuleName
                    .ofProjectLocationEventThreatDetectionCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setType("type3575610")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .build();
    mockService.addResponse(expectedResponse);

    EventThreatDetectionCustomModule eventThreatDetectionCustomModule =
        EventThreatDetectionCustomModule.newBuilder()
            .setName(
                EventThreatDetectionCustomModuleName
                    .ofProjectLocationEventThreatDetectionCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setConfig(Struct.newBuilder().build())
            .setAncestorModule(
                EventThreatDetectionCustomModuleName
                    .ofProjectLocationEventThreatDetectionCustomModuleName(
                        "[PROJECT]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                    .toString())
            .setType("type3575610")
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLastEditor("lastEditor1523898275")
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    EventThreatDetectionCustomModule actualResponse =
        client.updateEventThreatDetectionCustomModule(eventThreatDetectionCustomModule, updateMask);
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
  public void updateEventThreatDetectionCustomModuleExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      EventThreatDetectionCustomModule eventThreatDetectionCustomModule =
          EventThreatDetectionCustomModule.newBuilder()
              .setName(
                  EventThreatDetectionCustomModuleName
                      .ofProjectLocationEventThreatDetectionCustomModuleName(
                          "[PROJECT]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                      .toString())
              .setConfig(Struct.newBuilder().build())
              .setAncestorModule(
                  EventThreatDetectionCustomModuleName
                      .ofProjectLocationEventThreatDetectionCustomModuleName(
                          "[PROJECT]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]")
                      .toString())
              .setType("type3575610")
              .setDisplayName("displayName1714148973")
              .setDescription("description-1724546052")
              .setUpdateTime(Timestamp.newBuilder().build())
              .setLastEditor("lastEditor1523898275")
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateEventThreatDetectionCustomModule(eventThreatDetectionCustomModule, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteEventThreatDetectionCustomModuleTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockService.addResponse(expectedResponse);

    EventThreatDetectionCustomModuleName name =
        EventThreatDetectionCustomModuleName.ofProjectLocationEventThreatDetectionCustomModuleName(
            "[PROJECT]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]");

    client.deleteEventThreatDetectionCustomModule(name);

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
  public void deleteEventThreatDetectionCustomModuleExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      EventThreatDetectionCustomModuleName name =
          EventThreatDetectionCustomModuleName
              .ofProjectLocationEventThreatDetectionCustomModuleName(
                  "[PROJECT]", "[LOCATION]", "[EVENT_THREAT_DETECTION_CUSTOM_MODULE]");
      client.deleteEventThreatDetectionCustomModule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteEventThreatDetectionCustomModuleTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-3643/locations/location-3643/eventThreatDetectionCustomModules/eventThreatDetectionCustomModule-3643";

    client.deleteEventThreatDetectionCustomModule(name);

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
  public void deleteEventThreatDetectionCustomModuleExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-3643/locations/location-3643/eventThreatDetectionCustomModules/eventThreatDetectionCustomModule-3643";
      client.deleteEventThreatDetectionCustomModule(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void validateEventThreatDetectionCustomModuleTest() throws Exception {
    ValidateEventThreatDetectionCustomModuleResponse expectedResponse =
        ValidateEventThreatDetectionCustomModuleResponse.newBuilder()
            .addAllErrors(
                new ArrayList<
                    ValidateEventThreatDetectionCustomModuleResponse.CustomModuleValidationError>())
            .build();
    mockService.addResponse(expectedResponse);

    ValidateEventThreatDetectionCustomModuleRequest request =
        ValidateEventThreatDetectionCustomModuleRequest.newBuilder()
            .setParent(OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]").toString())
            .setRawText("rawText985734517")
            .setType("type3575610")
            .build();

    ValidateEventThreatDetectionCustomModuleResponse actualResponse =
        client.validateEventThreatDetectionCustomModule(request);
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
  public void validateEventThreatDetectionCustomModuleExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ValidateEventThreatDetectionCustomModuleRequest request =
          ValidateEventThreatDetectionCustomModuleRequest.newBuilder()
              .setParent(OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]").toString())
              .setRawText("rawText985734517")
              .setType("type3575610")
              .build();
      client.validateEventThreatDetectionCustomModule(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSecurityCenterServiceTest() throws Exception {
    SecurityCenterService expectedResponse =
        SecurityCenterService.newBuilder()
            .setName(
                SecurityCenterServiceName.ofProjectLocationServiceName(
                        "[PROJECT]", "[LOCATION]", "[SERVICE]")
                    .toString())
            .putAllModules(new HashMap<String, SecurityCenterService.ModuleSettings>())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setServiceConfig(Struct.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    SecurityCenterServiceName name =
        SecurityCenterServiceName.ofProjectLocationServiceName(
            "[PROJECT]", "[LOCATION]", "[SERVICE]");

    SecurityCenterService actualResponse = client.getSecurityCenterService(name);
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
  public void getSecurityCenterServiceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      SecurityCenterServiceName name =
          SecurityCenterServiceName.ofProjectLocationServiceName(
              "[PROJECT]", "[LOCATION]", "[SERVICE]");
      client.getSecurityCenterService(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSecurityCenterServiceTest2() throws Exception {
    SecurityCenterService expectedResponse =
        SecurityCenterService.newBuilder()
            .setName(
                SecurityCenterServiceName.ofProjectLocationServiceName(
                        "[PROJECT]", "[LOCATION]", "[SERVICE]")
                    .toString())
            .putAllModules(new HashMap<String, SecurityCenterService.ModuleSettings>())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setServiceConfig(Struct.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-9363/locations/location-9363/securityCenterServices/securityCenterService-9363";

    SecurityCenterService actualResponse = client.getSecurityCenterService(name);
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
  public void getSecurityCenterServiceExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-9363/locations/location-9363/securityCenterServices/securityCenterService-9363";
      client.getSecurityCenterService(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSecurityCenterServicesTest() throws Exception {
    SecurityCenterService responsesElement = SecurityCenterService.newBuilder().build();
    ListSecurityCenterServicesResponse expectedResponse =
        ListSecurityCenterServicesResponse.newBuilder()
            .setNextPageToken("")
            .addAllSecurityCenterServices(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");

    ListSecurityCenterServicesPagedResponse pagedListResponse =
        client.listSecurityCenterServices(parent);

    List<SecurityCenterService> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSecurityCenterServicesList().get(0), resources.get(0));

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
  public void listSecurityCenterServicesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      FolderLocationName parent = FolderLocationName.of("[FOLDER]", "[LOCATION]");
      client.listSecurityCenterServices(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSecurityCenterServicesTest2() throws Exception {
    SecurityCenterService responsesElement = SecurityCenterService.newBuilder().build();
    ListSecurityCenterServicesResponse expectedResponse =
        ListSecurityCenterServicesResponse.newBuilder()
            .setNextPageToken("")
            .addAllSecurityCenterServices(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListSecurityCenterServicesPagedResponse pagedListResponse =
        client.listSecurityCenterServices(parent);

    List<SecurityCenterService> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSecurityCenterServicesList().get(0), resources.get(0));

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
  public void listSecurityCenterServicesExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listSecurityCenterServices(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSecurityCenterServicesTest3() throws Exception {
    SecurityCenterService responsesElement = SecurityCenterService.newBuilder().build();
    ListSecurityCenterServicesResponse expectedResponse =
        ListSecurityCenterServicesResponse.newBuilder()
            .setNextPageToken("")
            .addAllSecurityCenterServices(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");

    ListSecurityCenterServicesPagedResponse pagedListResponse =
        client.listSecurityCenterServices(parent);

    List<SecurityCenterService> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSecurityCenterServicesList().get(0), resources.get(0));

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
  public void listSecurityCenterServicesExceptionTest3() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");
      client.listSecurityCenterServices(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSecurityCenterServicesTest4() throws Exception {
    SecurityCenterService responsesElement = SecurityCenterService.newBuilder().build();
    ListSecurityCenterServicesResponse expectedResponse =
        ListSecurityCenterServicesResponse.newBuilder()
            .setNextPageToken("")
            .addAllSecurityCenterServices(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListSecurityCenterServicesPagedResponse pagedListResponse =
        client.listSecurityCenterServices(parent);

    List<SecurityCenterService> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSecurityCenterServicesList().get(0), resources.get(0));

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
  public void listSecurityCenterServicesExceptionTest4() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listSecurityCenterServices(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateSecurityCenterServiceTest() throws Exception {
    SecurityCenterService expectedResponse =
        SecurityCenterService.newBuilder()
            .setName(
                SecurityCenterServiceName.ofProjectLocationServiceName(
                        "[PROJECT]", "[LOCATION]", "[SERVICE]")
                    .toString())
            .putAllModules(new HashMap<String, SecurityCenterService.ModuleSettings>())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setServiceConfig(Struct.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    SecurityCenterService securityCenterService =
        SecurityCenterService.newBuilder()
            .setName(
                SecurityCenterServiceName.ofProjectLocationServiceName(
                        "[PROJECT]", "[LOCATION]", "[SERVICE]")
                    .toString())
            .putAllModules(new HashMap<String, SecurityCenterService.ModuleSettings>())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setServiceConfig(Struct.newBuilder().build())
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    SecurityCenterService actualResponse =
        client.updateSecurityCenterService(securityCenterService, updateMask);
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
  public void updateSecurityCenterServiceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      SecurityCenterService securityCenterService =
          SecurityCenterService.newBuilder()
              .setName(
                  SecurityCenterServiceName.ofProjectLocationServiceName(
                          "[PROJECT]", "[LOCATION]", "[SERVICE]")
                      .toString())
              .putAllModules(new HashMap<String, SecurityCenterService.ModuleSettings>())
              .setUpdateTime(Timestamp.newBuilder().build())
              .setServiceConfig(Struct.newBuilder().build())
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateSecurityCenterService(securityCenterService, updateMask);
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
    mockService.addResponse(expectedResponse);

    ListLocationsRequest request =
        ListLocationsRequest.newBuilder()
            .setName("projects/project-3664")
            .setFilter("filter-1274492040")
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .build();

    ListLocationsPagedResponse pagedListResponse = client.listLocations(request);

    List<Location> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getLocationsList().get(0), resources.get(0));

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
  public void listLocationsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ListLocationsRequest request =
          ListLocationsRequest.newBuilder()
              .setName("projects/project-3664")
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
    mockService.addResponse(expectedResponse);

    GetLocationRequest request =
        GetLocationRequest.newBuilder()
            .setName("projects/project-9062/locations/location-9062")
            .build();

    Location actualResponse = client.getLocation(request);
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
  public void getLocationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      GetLocationRequest request =
          GetLocationRequest.newBuilder()
              .setName("projects/project-9062/locations/location-9062")
              .build();
      client.getLocation(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
