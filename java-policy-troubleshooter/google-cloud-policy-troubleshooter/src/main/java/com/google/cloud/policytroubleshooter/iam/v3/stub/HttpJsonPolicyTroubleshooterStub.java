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

package com.google.cloud.policytroubleshooter.iam.v3.stub;

import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyRequest;
import com.google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse;
import com.google.protobuf.TypeRegistry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the PolicyTroubleshooter service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class HttpJsonPolicyTroubleshooterStub extends PolicyTroubleshooterStub {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<
          TroubleshootIamPolicyRequest, TroubleshootIamPolicyResponse>
      troubleshootIamPolicyMethodDescriptor =
          ApiMethodDescriptor
              .<TroubleshootIamPolicyRequest, TroubleshootIamPolicyResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.policytroubleshooter.iam.v3.PolicyTroubleshooter/TroubleshootIamPolicy")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<TroubleshootIamPolicyRequest>newBuilder()
                      .setPath(
                          "/v3/iam:troubleshoot",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<TroubleshootIamPolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<TroubleshootIamPolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<TroubleshootIamPolicyResponse>newBuilder()
                      .setDefaultInstance(TroubleshootIamPolicyResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<TroubleshootIamPolicyRequest, TroubleshootIamPolicyResponse>
      troubleshootIamPolicyCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonPolicyTroubleshooterStub create(
      PolicyTroubleshooterStubSettings settings) throws IOException {
    return new HttpJsonPolicyTroubleshooterStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonPolicyTroubleshooterStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonPolicyTroubleshooterStub(
        PolicyTroubleshooterStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonPolicyTroubleshooterStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonPolicyTroubleshooterStub(
        PolicyTroubleshooterStubSettings.newHttpJsonBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonPolicyTroubleshooterStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonPolicyTroubleshooterStub(
      PolicyTroubleshooterStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonPolicyTroubleshooterCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonPolicyTroubleshooterStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonPolicyTroubleshooterStub(
      PolicyTroubleshooterStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<TroubleshootIamPolicyRequest, TroubleshootIamPolicyResponse>
        troubleshootIamPolicyTransportSettings =
            HttpJsonCallSettings
                .<TroubleshootIamPolicyRequest, TroubleshootIamPolicyResponse>newBuilder()
                .setMethodDescriptor(troubleshootIamPolicyMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();

    this.troubleshootIamPolicyCallable =
        callableFactory.createUnaryCallable(
            troubleshootIamPolicyTransportSettings,
            settings.troubleshootIamPolicySettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(troubleshootIamPolicyMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<TroubleshootIamPolicyRequest, TroubleshootIamPolicyResponse>
      troubleshootIamPolicyCallable() {
    return troubleshootIamPolicyCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
