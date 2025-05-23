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

package com.google.cloud.commerce.consumer.procurement.v1.stub;

import static com.google.cloud.commerce.consumer.procurement.v1.ConsumerProcurementServiceClient.ListOrdersPagedResponse;

import com.google.api.HttpRule;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonOperationSnapshot;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.httpjson.longrunning.stub.HttpJsonOperationsStub;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.commerce.consumer.procurement.v1.CancelOrderMetadata;
import com.google.cloud.commerce.consumer.procurement.v1.CancelOrderRequest;
import com.google.cloud.commerce.consumer.procurement.v1.GetOrderRequest;
import com.google.cloud.commerce.consumer.procurement.v1.ListOrdersRequest;
import com.google.cloud.commerce.consumer.procurement.v1.ListOrdersResponse;
import com.google.cloud.commerce.consumer.procurement.v1.ModifyOrderMetadata;
import com.google.cloud.commerce.consumer.procurement.v1.ModifyOrderRequest;
import com.google.cloud.commerce.consumer.procurement.v1.Order;
import com.google.cloud.commerce.consumer.procurement.v1.PlaceOrderMetadata;
import com.google.cloud.commerce.consumer.procurement.v1.PlaceOrderRequest;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.Operation;
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
 * REST stub implementation for the ConsumerProcurementService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class HttpJsonConsumerProcurementServiceStub extends ConsumerProcurementServiceStub {
  private static final TypeRegistry typeRegistry =
      TypeRegistry.newBuilder()
          .add(Order.getDescriptor())
          .add(CancelOrderMetadata.getDescriptor())
          .add(PlaceOrderMetadata.getDescriptor())
          .add(ModifyOrderMetadata.getDescriptor())
          .build();

  private static final ApiMethodDescriptor<PlaceOrderRequest, Operation>
      placeOrderMethodDescriptor =
          ApiMethodDescriptor.<PlaceOrderRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.commerce.consumer.procurement.v1.ConsumerProcurementService/PlaceOrder")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<PlaceOrderRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=billingAccounts/*}/orders:place",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<PlaceOrderRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<PlaceOrderRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearParent().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (PlaceOrderRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<GetOrderRequest, Order> getOrderMethodDescriptor =
      ApiMethodDescriptor.<GetOrderRequest, Order>newBuilder()
          .setFullMethodName(
              "google.cloud.commerce.consumer.procurement.v1.ConsumerProcurementService/GetOrder")
          .setHttpMethod("GET")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<GetOrderRequest>newBuilder()
                  .setPath(
                      "/v1/{name=billingAccounts/*/orders/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<GetOrderRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "name", request.getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<GetOrderRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(request -> null)
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Order>newBuilder()
                  .setDefaultInstance(Order.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<ListOrdersRequest, ListOrdersResponse>
      listOrdersMethodDescriptor =
          ApiMethodDescriptor.<ListOrdersRequest, ListOrdersResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.commerce.consumer.procurement.v1.ConsumerProcurementService/ListOrders")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListOrdersRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=billingAccounts/*}/orders",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListOrdersRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListOrdersRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListOrdersResponse>newBuilder()
                      .setDefaultInstance(ListOrdersResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ModifyOrderRequest, Operation>
      modifyOrderMethodDescriptor =
          ApiMethodDescriptor.<ModifyOrderRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.commerce.consumer.procurement.v1.ConsumerProcurementService/ModifyOrder")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ModifyOrderRequest>newBuilder()
                      .setPath(
                          "/v1/{name=billingAccounts/*/orders/*}:modify",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ModifyOrderRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ModifyOrderRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (ModifyOrderRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<CancelOrderRequest, Operation>
      cancelOrderMethodDescriptor =
          ApiMethodDescriptor.<CancelOrderRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.commerce.consumer.procurement.v1.ConsumerProcurementService/CancelOrder")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CancelOrderRequest>newBuilder()
                      .setPath(
                          "/v1/{name=billingAccounts/*/orders/*}:cancel",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CancelOrderRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CancelOrderRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (CancelOrderRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private final UnaryCallable<PlaceOrderRequest, Operation> placeOrderCallable;
  private final OperationCallable<PlaceOrderRequest, Order, PlaceOrderMetadata>
      placeOrderOperationCallable;
  private final UnaryCallable<GetOrderRequest, Order> getOrderCallable;
  private final UnaryCallable<ListOrdersRequest, ListOrdersResponse> listOrdersCallable;
  private final UnaryCallable<ListOrdersRequest, ListOrdersPagedResponse> listOrdersPagedCallable;
  private final UnaryCallable<ModifyOrderRequest, Operation> modifyOrderCallable;
  private final OperationCallable<ModifyOrderRequest, Order, ModifyOrderMetadata>
      modifyOrderOperationCallable;
  private final UnaryCallable<CancelOrderRequest, Operation> cancelOrderCallable;
  private final OperationCallable<CancelOrderRequest, Order, CancelOrderMetadata>
      cancelOrderOperationCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonOperationsStub httpJsonOperationsStub;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonConsumerProcurementServiceStub create(
      ConsumerProcurementServiceStubSettings settings) throws IOException {
    return new HttpJsonConsumerProcurementServiceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonConsumerProcurementServiceStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonConsumerProcurementServiceStub(
        ConsumerProcurementServiceStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonConsumerProcurementServiceStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonConsumerProcurementServiceStub(
        ConsumerProcurementServiceStubSettings.newHttpJsonBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonConsumerProcurementServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected HttpJsonConsumerProcurementServiceStub(
      ConsumerProcurementServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonConsumerProcurementServiceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonConsumerProcurementServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected HttpJsonConsumerProcurementServiceStub(
      ConsumerProcurementServiceStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.httpJsonOperationsStub =
        HttpJsonOperationsStub.create(
            clientContext,
            callableFactory,
            typeRegistry,
            ImmutableMap.<String, HttpRule>builder()
                .put(
                    "google.longrunning.Operations.GetOperation",
                    HttpRule.newBuilder()
                        .setGet("/v1/{name=billingAccounts/*/orders/*/operations/*}")
                        .build())
                .build());

    HttpJsonCallSettings<PlaceOrderRequest, Operation> placeOrderTransportSettings =
        HttpJsonCallSettings.<PlaceOrderRequest, Operation>newBuilder()
            .setMethodDescriptor(placeOrderMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<GetOrderRequest, Order> getOrderTransportSettings =
        HttpJsonCallSettings.<GetOrderRequest, Order>newBuilder()
            .setMethodDescriptor(getOrderMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListOrdersRequest, ListOrdersResponse> listOrdersTransportSettings =
        HttpJsonCallSettings.<ListOrdersRequest, ListOrdersResponse>newBuilder()
            .setMethodDescriptor(listOrdersMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ModifyOrderRequest, Operation> modifyOrderTransportSettings =
        HttpJsonCallSettings.<ModifyOrderRequest, Operation>newBuilder()
            .setMethodDescriptor(modifyOrderMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<CancelOrderRequest, Operation> cancelOrderTransportSettings =
        HttpJsonCallSettings.<CancelOrderRequest, Operation>newBuilder()
            .setMethodDescriptor(cancelOrderMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();

    this.placeOrderCallable =
        callableFactory.createUnaryCallable(
            placeOrderTransportSettings, settings.placeOrderSettings(), clientContext);
    this.placeOrderOperationCallable =
        callableFactory.createOperationCallable(
            placeOrderTransportSettings,
            settings.placeOrderOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.getOrderCallable =
        callableFactory.createUnaryCallable(
            getOrderTransportSettings, settings.getOrderSettings(), clientContext);
    this.listOrdersCallable =
        callableFactory.createUnaryCallable(
            listOrdersTransportSettings, settings.listOrdersSettings(), clientContext);
    this.listOrdersPagedCallable =
        callableFactory.createPagedCallable(
            listOrdersTransportSettings, settings.listOrdersSettings(), clientContext);
    this.modifyOrderCallable =
        callableFactory.createUnaryCallable(
            modifyOrderTransportSettings, settings.modifyOrderSettings(), clientContext);
    this.modifyOrderOperationCallable =
        callableFactory.createOperationCallable(
            modifyOrderTransportSettings,
            settings.modifyOrderOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.cancelOrderCallable =
        callableFactory.createUnaryCallable(
            cancelOrderTransportSettings, settings.cancelOrderSettings(), clientContext);
    this.cancelOrderOperationCallable =
        callableFactory.createOperationCallable(
            cancelOrderTransportSettings,
            settings.cancelOrderOperationSettings(),
            clientContext,
            httpJsonOperationsStub);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(placeOrderMethodDescriptor);
    methodDescriptors.add(getOrderMethodDescriptor);
    methodDescriptors.add(listOrdersMethodDescriptor);
    methodDescriptors.add(modifyOrderMethodDescriptor);
    methodDescriptors.add(cancelOrderMethodDescriptor);
    return methodDescriptors;
  }

  public HttpJsonOperationsStub getHttpJsonOperationsStub() {
    return httpJsonOperationsStub;
  }

  @Override
  public UnaryCallable<PlaceOrderRequest, Operation> placeOrderCallable() {
    return placeOrderCallable;
  }

  @Override
  public OperationCallable<PlaceOrderRequest, Order, PlaceOrderMetadata>
      placeOrderOperationCallable() {
    return placeOrderOperationCallable;
  }

  @Override
  public UnaryCallable<GetOrderRequest, Order> getOrderCallable() {
    return getOrderCallable;
  }

  @Override
  public UnaryCallable<ListOrdersRequest, ListOrdersResponse> listOrdersCallable() {
    return listOrdersCallable;
  }

  @Override
  public UnaryCallable<ListOrdersRequest, ListOrdersPagedResponse> listOrdersPagedCallable() {
    return listOrdersPagedCallable;
  }

  @Override
  public UnaryCallable<ModifyOrderRequest, Operation> modifyOrderCallable() {
    return modifyOrderCallable;
  }

  @Override
  public OperationCallable<ModifyOrderRequest, Order, ModifyOrderMetadata>
      modifyOrderOperationCallable() {
    return modifyOrderOperationCallable;
  }

  @Override
  public UnaryCallable<CancelOrderRequest, Operation> cancelOrderCallable() {
    return cancelOrderCallable;
  }

  @Override
  public OperationCallable<CancelOrderRequest, Order, CancelOrderMetadata>
      cancelOrderOperationCallable() {
    return cancelOrderOperationCallable;
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
