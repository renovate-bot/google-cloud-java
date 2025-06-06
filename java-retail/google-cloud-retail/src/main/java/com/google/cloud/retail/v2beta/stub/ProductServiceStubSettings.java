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

package com.google.cloud.retail.v2beta.stub;

import static com.google.cloud.retail.v2beta.ProductServiceClient.ListProductsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.core.ObsoleteApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.retail.v2beta.AddFulfillmentPlacesMetadata;
import com.google.cloud.retail.v2beta.AddFulfillmentPlacesRequest;
import com.google.cloud.retail.v2beta.AddFulfillmentPlacesResponse;
import com.google.cloud.retail.v2beta.AddLocalInventoriesMetadata;
import com.google.cloud.retail.v2beta.AddLocalInventoriesRequest;
import com.google.cloud.retail.v2beta.AddLocalInventoriesResponse;
import com.google.cloud.retail.v2beta.CreateProductRequest;
import com.google.cloud.retail.v2beta.DeleteProductRequest;
import com.google.cloud.retail.v2beta.ExportMetadata;
import com.google.cloud.retail.v2beta.ExportProductsRequest;
import com.google.cloud.retail.v2beta.ExportProductsResponse;
import com.google.cloud.retail.v2beta.GetProductRequest;
import com.google.cloud.retail.v2beta.ImportMetadata;
import com.google.cloud.retail.v2beta.ImportProductsRequest;
import com.google.cloud.retail.v2beta.ImportProductsResponse;
import com.google.cloud.retail.v2beta.ListProductsRequest;
import com.google.cloud.retail.v2beta.ListProductsResponse;
import com.google.cloud.retail.v2beta.Product;
import com.google.cloud.retail.v2beta.PurgeProductsMetadata;
import com.google.cloud.retail.v2beta.PurgeProductsRequest;
import com.google.cloud.retail.v2beta.PurgeProductsResponse;
import com.google.cloud.retail.v2beta.RemoveFulfillmentPlacesMetadata;
import com.google.cloud.retail.v2beta.RemoveFulfillmentPlacesRequest;
import com.google.cloud.retail.v2beta.RemoveFulfillmentPlacesResponse;
import com.google.cloud.retail.v2beta.RemoveLocalInventoriesMetadata;
import com.google.cloud.retail.v2beta.RemoveLocalInventoriesRequest;
import com.google.cloud.retail.v2beta.RemoveLocalInventoriesResponse;
import com.google.cloud.retail.v2beta.SetInventoryMetadata;
import com.google.cloud.retail.v2beta.SetInventoryRequest;
import com.google.cloud.retail.v2beta.SetInventoryResponse;
import com.google.cloud.retail.v2beta.UpdateProductRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ProductServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (retail.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of createProduct:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ProductServiceStubSettings.Builder productServiceSettingsBuilder =
 *     ProductServiceStubSettings.newBuilder();
 * productServiceSettingsBuilder
 *     .createProductSettings()
 *     .setRetrySettings(
 *         productServiceSettingsBuilder
 *             .createProductSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofSeconds(1))
 *             .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
 *             .setMaxAttempts(5)
 *             .setMaxRetryDelayDuration(Duration.ofSeconds(30))
 *             .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
 *             .setRetryDelayMultiplier(1.3)
 *             .setRpcTimeoutMultiplier(1.5)
 *             .setTotalTimeoutDuration(Duration.ofSeconds(300))
 *             .build());
 * ProductServiceStubSettings productServiceSettings = productServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for purgeProducts:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ProductServiceStubSettings.Builder productServiceSettingsBuilder =
 *     ProductServiceStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * productServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class ProductServiceStubSettings extends StubSettings<ProductServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateProductRequest, Product> createProductSettings;
  private final UnaryCallSettings<GetProductRequest, Product> getProductSettings;
  private final PagedCallSettings<
          ListProductsRequest, ListProductsResponse, ListProductsPagedResponse>
      listProductsSettings;
  private final UnaryCallSettings<UpdateProductRequest, Product> updateProductSettings;
  private final UnaryCallSettings<DeleteProductRequest, Empty> deleteProductSettings;
  private final UnaryCallSettings<PurgeProductsRequest, Operation> purgeProductsSettings;
  private final OperationCallSettings<
          PurgeProductsRequest, PurgeProductsResponse, PurgeProductsMetadata>
      purgeProductsOperationSettings;
  private final UnaryCallSettings<ImportProductsRequest, Operation> importProductsSettings;
  private final OperationCallSettings<ImportProductsRequest, ImportProductsResponse, ImportMetadata>
      importProductsOperationSettings;
  private final UnaryCallSettings<ExportProductsRequest, Operation> exportProductsSettings;
  private final OperationCallSettings<ExportProductsRequest, ExportProductsResponse, ExportMetadata>
      exportProductsOperationSettings;
  private final UnaryCallSettings<SetInventoryRequest, Operation> setInventorySettings;
  private final OperationCallSettings<
          SetInventoryRequest, SetInventoryResponse, SetInventoryMetadata>
      setInventoryOperationSettings;
  private final UnaryCallSettings<AddFulfillmentPlacesRequest, Operation>
      addFulfillmentPlacesSettings;
  private final OperationCallSettings<
          AddFulfillmentPlacesRequest, AddFulfillmentPlacesResponse, AddFulfillmentPlacesMetadata>
      addFulfillmentPlacesOperationSettings;
  private final UnaryCallSettings<RemoveFulfillmentPlacesRequest, Operation>
      removeFulfillmentPlacesSettings;
  private final OperationCallSettings<
          RemoveFulfillmentPlacesRequest,
          RemoveFulfillmentPlacesResponse,
          RemoveFulfillmentPlacesMetadata>
      removeFulfillmentPlacesOperationSettings;
  private final UnaryCallSettings<AddLocalInventoriesRequest, Operation>
      addLocalInventoriesSettings;
  private final OperationCallSettings<
          AddLocalInventoriesRequest, AddLocalInventoriesResponse, AddLocalInventoriesMetadata>
      addLocalInventoriesOperationSettings;
  private final UnaryCallSettings<RemoveLocalInventoriesRequest, Operation>
      removeLocalInventoriesSettings;
  private final OperationCallSettings<
          RemoveLocalInventoriesRequest,
          RemoveLocalInventoriesResponse,
          RemoveLocalInventoriesMetadata>
      removeLocalInventoriesOperationSettings;

  private static final PagedListDescriptor<ListProductsRequest, ListProductsResponse, Product>
      LIST_PRODUCTS_PAGE_STR_DESC =
          new PagedListDescriptor<ListProductsRequest, ListProductsResponse, Product>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListProductsRequest injectToken(ListProductsRequest payload, String token) {
              return ListProductsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListProductsRequest injectPageSize(ListProductsRequest payload, int pageSize) {
              return ListProductsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListProductsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListProductsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Product> extractResources(ListProductsResponse payload) {
              return payload.getProductsList();
            }
          };

  private static final PagedListResponseFactory<
          ListProductsRequest, ListProductsResponse, ListProductsPagedResponse>
      LIST_PRODUCTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListProductsRequest, ListProductsResponse, ListProductsPagedResponse>() {
            @Override
            public ApiFuture<ListProductsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListProductsRequest, ListProductsResponse> callable,
                ListProductsRequest request,
                ApiCallContext context,
                ApiFuture<ListProductsResponse> futureResponse) {
              PageContext<ListProductsRequest, ListProductsResponse, Product> pageContext =
                  PageContext.create(callable, LIST_PRODUCTS_PAGE_STR_DESC, request, context);
              return ListProductsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createProduct. */
  public UnaryCallSettings<CreateProductRequest, Product> createProductSettings() {
    return createProductSettings;
  }

  /** Returns the object with the settings used for calls to getProduct. */
  public UnaryCallSettings<GetProductRequest, Product> getProductSettings() {
    return getProductSettings;
  }

  /** Returns the object with the settings used for calls to listProducts. */
  public PagedCallSettings<ListProductsRequest, ListProductsResponse, ListProductsPagedResponse>
      listProductsSettings() {
    return listProductsSettings;
  }

  /** Returns the object with the settings used for calls to updateProduct. */
  public UnaryCallSettings<UpdateProductRequest, Product> updateProductSettings() {
    return updateProductSettings;
  }

  /** Returns the object with the settings used for calls to deleteProduct. */
  public UnaryCallSettings<DeleteProductRequest, Empty> deleteProductSettings() {
    return deleteProductSettings;
  }

  /** Returns the object with the settings used for calls to purgeProducts. */
  public UnaryCallSettings<PurgeProductsRequest, Operation> purgeProductsSettings() {
    return purgeProductsSettings;
  }

  /** Returns the object with the settings used for calls to purgeProducts. */
  public OperationCallSettings<PurgeProductsRequest, PurgeProductsResponse, PurgeProductsMetadata>
      purgeProductsOperationSettings() {
    return purgeProductsOperationSettings;
  }

  /** Returns the object with the settings used for calls to importProducts. */
  public UnaryCallSettings<ImportProductsRequest, Operation> importProductsSettings() {
    return importProductsSettings;
  }

  /** Returns the object with the settings used for calls to importProducts. */
  public OperationCallSettings<ImportProductsRequest, ImportProductsResponse, ImportMetadata>
      importProductsOperationSettings() {
    return importProductsOperationSettings;
  }

  /** Returns the object with the settings used for calls to exportProducts. */
  public UnaryCallSettings<ExportProductsRequest, Operation> exportProductsSettings() {
    return exportProductsSettings;
  }

  /** Returns the object with the settings used for calls to exportProducts. */
  public OperationCallSettings<ExportProductsRequest, ExportProductsResponse, ExportMetadata>
      exportProductsOperationSettings() {
    return exportProductsOperationSettings;
  }

  /** Returns the object with the settings used for calls to setInventory. */
  public UnaryCallSettings<SetInventoryRequest, Operation> setInventorySettings() {
    return setInventorySettings;
  }

  /** Returns the object with the settings used for calls to setInventory. */
  public OperationCallSettings<SetInventoryRequest, SetInventoryResponse, SetInventoryMetadata>
      setInventoryOperationSettings() {
    return setInventoryOperationSettings;
  }

  /** Returns the object with the settings used for calls to addFulfillmentPlaces. */
  public UnaryCallSettings<AddFulfillmentPlacesRequest, Operation> addFulfillmentPlacesSettings() {
    return addFulfillmentPlacesSettings;
  }

  /** Returns the object with the settings used for calls to addFulfillmentPlaces. */
  public OperationCallSettings<
          AddFulfillmentPlacesRequest, AddFulfillmentPlacesResponse, AddFulfillmentPlacesMetadata>
      addFulfillmentPlacesOperationSettings() {
    return addFulfillmentPlacesOperationSettings;
  }

  /** Returns the object with the settings used for calls to removeFulfillmentPlaces. */
  public UnaryCallSettings<RemoveFulfillmentPlacesRequest, Operation>
      removeFulfillmentPlacesSettings() {
    return removeFulfillmentPlacesSettings;
  }

  /** Returns the object with the settings used for calls to removeFulfillmentPlaces. */
  public OperationCallSettings<
          RemoveFulfillmentPlacesRequest,
          RemoveFulfillmentPlacesResponse,
          RemoveFulfillmentPlacesMetadata>
      removeFulfillmentPlacesOperationSettings() {
    return removeFulfillmentPlacesOperationSettings;
  }

  /** Returns the object with the settings used for calls to addLocalInventories. */
  public UnaryCallSettings<AddLocalInventoriesRequest, Operation> addLocalInventoriesSettings() {
    return addLocalInventoriesSettings;
  }

  /** Returns the object with the settings used for calls to addLocalInventories. */
  public OperationCallSettings<
          AddLocalInventoriesRequest, AddLocalInventoriesResponse, AddLocalInventoriesMetadata>
      addLocalInventoriesOperationSettings() {
    return addLocalInventoriesOperationSettings;
  }

  /** Returns the object with the settings used for calls to removeLocalInventories. */
  public UnaryCallSettings<RemoveLocalInventoriesRequest, Operation>
      removeLocalInventoriesSettings() {
    return removeLocalInventoriesSettings;
  }

  /** Returns the object with the settings used for calls to removeLocalInventories. */
  public OperationCallSettings<
          RemoveLocalInventoriesRequest,
          RemoveLocalInventoriesResponse,
          RemoveLocalInventoriesMetadata>
      removeLocalInventoriesOperationSettings() {
    return removeLocalInventoriesOperationSettings;
  }

  public ProductServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcProductServiceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonProductServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "retail";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "retail.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "retail.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultGrpcApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ProductServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ProductServiceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ProductServiceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected ProductServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createProductSettings = settingsBuilder.createProductSettings().build();
    getProductSettings = settingsBuilder.getProductSettings().build();
    listProductsSettings = settingsBuilder.listProductsSettings().build();
    updateProductSettings = settingsBuilder.updateProductSettings().build();
    deleteProductSettings = settingsBuilder.deleteProductSettings().build();
    purgeProductsSettings = settingsBuilder.purgeProductsSettings().build();
    purgeProductsOperationSettings = settingsBuilder.purgeProductsOperationSettings().build();
    importProductsSettings = settingsBuilder.importProductsSettings().build();
    importProductsOperationSettings = settingsBuilder.importProductsOperationSettings().build();
    exportProductsSettings = settingsBuilder.exportProductsSettings().build();
    exportProductsOperationSettings = settingsBuilder.exportProductsOperationSettings().build();
    setInventorySettings = settingsBuilder.setInventorySettings().build();
    setInventoryOperationSettings = settingsBuilder.setInventoryOperationSettings().build();
    addFulfillmentPlacesSettings = settingsBuilder.addFulfillmentPlacesSettings().build();
    addFulfillmentPlacesOperationSettings =
        settingsBuilder.addFulfillmentPlacesOperationSettings().build();
    removeFulfillmentPlacesSettings = settingsBuilder.removeFulfillmentPlacesSettings().build();
    removeFulfillmentPlacesOperationSettings =
        settingsBuilder.removeFulfillmentPlacesOperationSettings().build();
    addLocalInventoriesSettings = settingsBuilder.addLocalInventoriesSettings().build();
    addLocalInventoriesOperationSettings =
        settingsBuilder.addLocalInventoriesOperationSettings().build();
    removeLocalInventoriesSettings = settingsBuilder.removeLocalInventoriesSettings().build();
    removeLocalInventoriesOperationSettings =
        settingsBuilder.removeLocalInventoriesOperationSettings().build();
  }

  /** Builder for ProductServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<ProductServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateProductRequest, Product> createProductSettings;
    private final UnaryCallSettings.Builder<GetProductRequest, Product> getProductSettings;
    private final PagedCallSettings.Builder<
            ListProductsRequest, ListProductsResponse, ListProductsPagedResponse>
        listProductsSettings;
    private final UnaryCallSettings.Builder<UpdateProductRequest, Product> updateProductSettings;
    private final UnaryCallSettings.Builder<DeleteProductRequest, Empty> deleteProductSettings;
    private final UnaryCallSettings.Builder<PurgeProductsRequest, Operation> purgeProductsSettings;
    private final OperationCallSettings.Builder<
            PurgeProductsRequest, PurgeProductsResponse, PurgeProductsMetadata>
        purgeProductsOperationSettings;
    private final UnaryCallSettings.Builder<ImportProductsRequest, Operation>
        importProductsSettings;
    private final OperationCallSettings.Builder<
            ImportProductsRequest, ImportProductsResponse, ImportMetadata>
        importProductsOperationSettings;
    private final UnaryCallSettings.Builder<ExportProductsRequest, Operation>
        exportProductsSettings;
    private final OperationCallSettings.Builder<
            ExportProductsRequest, ExportProductsResponse, ExportMetadata>
        exportProductsOperationSettings;
    private final UnaryCallSettings.Builder<SetInventoryRequest, Operation> setInventorySettings;
    private final OperationCallSettings.Builder<
            SetInventoryRequest, SetInventoryResponse, SetInventoryMetadata>
        setInventoryOperationSettings;
    private final UnaryCallSettings.Builder<AddFulfillmentPlacesRequest, Operation>
        addFulfillmentPlacesSettings;
    private final OperationCallSettings.Builder<
            AddFulfillmentPlacesRequest, AddFulfillmentPlacesResponse, AddFulfillmentPlacesMetadata>
        addFulfillmentPlacesOperationSettings;
    private final UnaryCallSettings.Builder<RemoveFulfillmentPlacesRequest, Operation>
        removeFulfillmentPlacesSettings;
    private final OperationCallSettings.Builder<
            RemoveFulfillmentPlacesRequest,
            RemoveFulfillmentPlacesResponse,
            RemoveFulfillmentPlacesMetadata>
        removeFulfillmentPlacesOperationSettings;
    private final UnaryCallSettings.Builder<AddLocalInventoriesRequest, Operation>
        addLocalInventoriesSettings;
    private final OperationCallSettings.Builder<
            AddLocalInventoriesRequest, AddLocalInventoriesResponse, AddLocalInventoriesMetadata>
        addLocalInventoriesOperationSettings;
    private final UnaryCallSettings.Builder<RemoveLocalInventoriesRequest, Operation>
        removeLocalInventoriesSettings;
    private final OperationCallSettings.Builder<
            RemoveLocalInventoriesRequest,
            RemoveLocalInventoriesResponse,
            RemoveLocalInventoriesMetadata>
        removeLocalInventoriesOperationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_2_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.DEADLINE_EXCEEDED)));
      definitions.put(
          "retry_policy_4_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.DEADLINE_EXCEEDED)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(30000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(30000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(30000L))
              .setTotalTimeoutDuration(Duration.ofMillis(30000L))
              .build();
      definitions.put("retry_policy_2_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(300000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(300000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(300000L))
              .setTotalTimeoutDuration(Duration.ofMillis(300000L))
              .build();
      definitions.put("retry_policy_4_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createProductSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getProductSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listProductsSettings = PagedCallSettings.newBuilder(LIST_PRODUCTS_PAGE_STR_FACT);
      updateProductSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteProductSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      purgeProductsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      purgeProductsOperationSettings = OperationCallSettings.newBuilder();
      importProductsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      importProductsOperationSettings = OperationCallSettings.newBuilder();
      exportProductsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      exportProductsOperationSettings = OperationCallSettings.newBuilder();
      setInventorySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setInventoryOperationSettings = OperationCallSettings.newBuilder();
      addFulfillmentPlacesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      addFulfillmentPlacesOperationSettings = OperationCallSettings.newBuilder();
      removeFulfillmentPlacesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      removeFulfillmentPlacesOperationSettings = OperationCallSettings.newBuilder();
      addLocalInventoriesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      addLocalInventoriesOperationSettings = OperationCallSettings.newBuilder();
      removeLocalInventoriesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      removeLocalInventoriesOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createProductSettings,
              getProductSettings,
              listProductsSettings,
              updateProductSettings,
              deleteProductSettings,
              purgeProductsSettings,
              importProductsSettings,
              exportProductsSettings,
              setInventorySettings,
              addFulfillmentPlacesSettings,
              removeFulfillmentPlacesSettings,
              addLocalInventoriesSettings,
              removeLocalInventoriesSettings);
      initDefaults(this);
    }

    protected Builder(ProductServiceStubSettings settings) {
      super(settings);

      createProductSettings = settings.createProductSettings.toBuilder();
      getProductSettings = settings.getProductSettings.toBuilder();
      listProductsSettings = settings.listProductsSettings.toBuilder();
      updateProductSettings = settings.updateProductSettings.toBuilder();
      deleteProductSettings = settings.deleteProductSettings.toBuilder();
      purgeProductsSettings = settings.purgeProductsSettings.toBuilder();
      purgeProductsOperationSettings = settings.purgeProductsOperationSettings.toBuilder();
      importProductsSettings = settings.importProductsSettings.toBuilder();
      importProductsOperationSettings = settings.importProductsOperationSettings.toBuilder();
      exportProductsSettings = settings.exportProductsSettings.toBuilder();
      exportProductsOperationSettings = settings.exportProductsOperationSettings.toBuilder();
      setInventorySettings = settings.setInventorySettings.toBuilder();
      setInventoryOperationSettings = settings.setInventoryOperationSettings.toBuilder();
      addFulfillmentPlacesSettings = settings.addFulfillmentPlacesSettings.toBuilder();
      addFulfillmentPlacesOperationSettings =
          settings.addFulfillmentPlacesOperationSettings.toBuilder();
      removeFulfillmentPlacesSettings = settings.removeFulfillmentPlacesSettings.toBuilder();
      removeFulfillmentPlacesOperationSettings =
          settings.removeFulfillmentPlacesOperationSettings.toBuilder();
      addLocalInventoriesSettings = settings.addLocalInventoriesSettings.toBuilder();
      addLocalInventoriesOperationSettings =
          settings.addLocalInventoriesOperationSettings.toBuilder();
      removeLocalInventoriesSettings = settings.removeLocalInventoriesSettings.toBuilder();
      removeLocalInventoriesOperationSettings =
          settings.removeLocalInventoriesOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createProductSettings,
              getProductSettings,
              listProductsSettings,
              updateProductSettings,
              deleteProductSettings,
              purgeProductsSettings,
              importProductsSettings,
              exportProductsSettings,
              setInventorySettings,
              addFulfillmentPlacesSettings,
              removeFulfillmentPlacesSettings,
              addLocalInventoriesSettings,
              removeLocalInventoriesSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder createHttpJsonDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultHttpJsonTransportProviderBuilder().build());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultHttpJsonApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .createProductSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .getProductSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .listProductsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .updateProductSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .deleteProductSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .purgeProductsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .importProductsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_4_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_4_params"));

      builder
          .exportProductsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .setInventorySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .addFulfillmentPlacesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .removeFulfillmentPlacesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .addLocalInventoriesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .removeLocalInventoriesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .purgeProductsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<PurgeProductsRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(PurgeProductsResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(PurgeProductsMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .importProductsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ImportProductsRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_4_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_4_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(ImportProductsResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(ImportMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .exportProductsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ExportProductsRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(ExportProductsResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(ExportMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .setInventoryOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetInventoryRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(SetInventoryResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(SetInventoryMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .addFulfillmentPlacesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<AddFulfillmentPlacesRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  AddFulfillmentPlacesResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  AddFulfillmentPlacesMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .removeFulfillmentPlacesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<RemoveFulfillmentPlacesRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  RemoveFulfillmentPlacesResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  RemoveFulfillmentPlacesMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .addLocalInventoriesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<AddLocalInventoriesRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  AddLocalInventoriesResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  AddLocalInventoriesMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .removeLocalInventoriesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<RemoveLocalInventoriesRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  RemoveLocalInventoriesResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  RemoveLocalInventoriesMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to createProduct. */
    public UnaryCallSettings.Builder<CreateProductRequest, Product> createProductSettings() {
      return createProductSettings;
    }

    /** Returns the builder for the settings used for calls to getProduct. */
    public UnaryCallSettings.Builder<GetProductRequest, Product> getProductSettings() {
      return getProductSettings;
    }

    /** Returns the builder for the settings used for calls to listProducts. */
    public PagedCallSettings.Builder<
            ListProductsRequest, ListProductsResponse, ListProductsPagedResponse>
        listProductsSettings() {
      return listProductsSettings;
    }

    /** Returns the builder for the settings used for calls to updateProduct. */
    public UnaryCallSettings.Builder<UpdateProductRequest, Product> updateProductSettings() {
      return updateProductSettings;
    }

    /** Returns the builder for the settings used for calls to deleteProduct. */
    public UnaryCallSettings.Builder<DeleteProductRequest, Empty> deleteProductSettings() {
      return deleteProductSettings;
    }

    /** Returns the builder for the settings used for calls to purgeProducts. */
    public UnaryCallSettings.Builder<PurgeProductsRequest, Operation> purgeProductsSettings() {
      return purgeProductsSettings;
    }

    /** Returns the builder for the settings used for calls to purgeProducts. */
    public OperationCallSettings.Builder<
            PurgeProductsRequest, PurgeProductsResponse, PurgeProductsMetadata>
        purgeProductsOperationSettings() {
      return purgeProductsOperationSettings;
    }

    /** Returns the builder for the settings used for calls to importProducts. */
    public UnaryCallSettings.Builder<ImportProductsRequest, Operation> importProductsSettings() {
      return importProductsSettings;
    }

    /** Returns the builder for the settings used for calls to importProducts. */
    public OperationCallSettings.Builder<
            ImportProductsRequest, ImportProductsResponse, ImportMetadata>
        importProductsOperationSettings() {
      return importProductsOperationSettings;
    }

    /** Returns the builder for the settings used for calls to exportProducts. */
    public UnaryCallSettings.Builder<ExportProductsRequest, Operation> exportProductsSettings() {
      return exportProductsSettings;
    }

    /** Returns the builder for the settings used for calls to exportProducts. */
    public OperationCallSettings.Builder<
            ExportProductsRequest, ExportProductsResponse, ExportMetadata>
        exportProductsOperationSettings() {
      return exportProductsOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setInventory. */
    public UnaryCallSettings.Builder<SetInventoryRequest, Operation> setInventorySettings() {
      return setInventorySettings;
    }

    /** Returns the builder for the settings used for calls to setInventory. */
    public OperationCallSettings.Builder<
            SetInventoryRequest, SetInventoryResponse, SetInventoryMetadata>
        setInventoryOperationSettings() {
      return setInventoryOperationSettings;
    }

    /** Returns the builder for the settings used for calls to addFulfillmentPlaces. */
    public UnaryCallSettings.Builder<AddFulfillmentPlacesRequest, Operation>
        addFulfillmentPlacesSettings() {
      return addFulfillmentPlacesSettings;
    }

    /** Returns the builder for the settings used for calls to addFulfillmentPlaces. */
    public OperationCallSettings.Builder<
            AddFulfillmentPlacesRequest, AddFulfillmentPlacesResponse, AddFulfillmentPlacesMetadata>
        addFulfillmentPlacesOperationSettings() {
      return addFulfillmentPlacesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to removeFulfillmentPlaces. */
    public UnaryCallSettings.Builder<RemoveFulfillmentPlacesRequest, Operation>
        removeFulfillmentPlacesSettings() {
      return removeFulfillmentPlacesSettings;
    }

    /** Returns the builder for the settings used for calls to removeFulfillmentPlaces. */
    public OperationCallSettings.Builder<
            RemoveFulfillmentPlacesRequest,
            RemoveFulfillmentPlacesResponse,
            RemoveFulfillmentPlacesMetadata>
        removeFulfillmentPlacesOperationSettings() {
      return removeFulfillmentPlacesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to addLocalInventories. */
    public UnaryCallSettings.Builder<AddLocalInventoriesRequest, Operation>
        addLocalInventoriesSettings() {
      return addLocalInventoriesSettings;
    }

    /** Returns the builder for the settings used for calls to addLocalInventories. */
    public OperationCallSettings.Builder<
            AddLocalInventoriesRequest, AddLocalInventoriesResponse, AddLocalInventoriesMetadata>
        addLocalInventoriesOperationSettings() {
      return addLocalInventoriesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to removeLocalInventories. */
    public UnaryCallSettings.Builder<RemoveLocalInventoriesRequest, Operation>
        removeLocalInventoriesSettings() {
      return removeLocalInventoriesSettings;
    }

    /** Returns the builder for the settings used for calls to removeLocalInventories. */
    public OperationCallSettings.Builder<
            RemoveLocalInventoriesRequest,
            RemoveLocalInventoriesResponse,
            RemoveLocalInventoriesMetadata>
        removeLocalInventoriesOperationSettings() {
      return removeLocalInventoriesOperationSettings;
    }

    @Override
    public ProductServiceStubSettings build() throws IOException {
      return new ProductServiceStubSettings(this);
    }
  }
}
