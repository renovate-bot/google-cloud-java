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

package com.google.ads.admanager.v1;

import com.google.ads.admanager.v1.stub.HttpJsonUserServiceStub;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class UserServiceClientTest {
  private static MockHttpService mockService;
  private static UserServiceClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonUserServiceStub.getMethodDescriptors(),
            UserServiceSettings.getDefaultEndpoint());
    UserServiceSettings settings =
        UserServiceSettings.newBuilder()
            .setTransportChannelProvider(
                UserServiceSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = UserServiceClient.create(settings);
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
  public void getUserTest() throws Exception {
    User expectedResponse =
        User.newBuilder()
            .setName(UserName.of("[NETWORK_CODE]", "[USER]").toString())
            .setUserId(-147132913)
            .setDisplayName("displayName1714148973")
            .setEmail("email96619420")
            .setRole(RoleName.of("[NETWORK_CODE]", "[ROLE]").toString())
            .setActive(true)
            .setExternalId("externalId-1699764666")
            .setServiceAccount(true)
            .setOrdersUiLocalTimeZone("ordersUiLocalTimeZone-1734777653")
            .build();
    mockService.addResponse(expectedResponse);

    UserName name = UserName.of("[NETWORK_CODE]", "[USER]");

    User actualResponse = client.getUser(name);
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
  public void getUserExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      UserName name = UserName.of("[NETWORK_CODE]", "[USER]");
      client.getUser(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getUserTest2() throws Exception {
    User expectedResponse =
        User.newBuilder()
            .setName(UserName.of("[NETWORK_CODE]", "[USER]").toString())
            .setUserId(-147132913)
            .setDisplayName("displayName1714148973")
            .setEmail("email96619420")
            .setRole(RoleName.of("[NETWORK_CODE]", "[ROLE]").toString())
            .setActive(true)
            .setExternalId("externalId-1699764666")
            .setServiceAccount(true)
            .setOrdersUiLocalTimeZone("ordersUiLocalTimeZone-1734777653")
            .build();
    mockService.addResponse(expectedResponse);

    String name = "networks/network-3631/users/user-3631";

    User actualResponse = client.getUser(name);
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
  public void getUserExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "networks/network-3631/users/user-3631";
      client.getUser(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
