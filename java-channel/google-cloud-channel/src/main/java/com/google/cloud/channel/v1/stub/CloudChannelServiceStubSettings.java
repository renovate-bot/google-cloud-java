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

package com.google.cloud.channel.v1.stub;

import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListChannelPartnerLinksPagedResponse;
import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListChannelPartnerRepricingConfigsPagedResponse;
import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListCustomerRepricingConfigsPagedResponse;
import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListCustomersPagedResponse;
import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListEntitlementChangesPagedResponse;
import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListEntitlementsPagedResponse;
import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListOffersPagedResponse;
import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListProductsPagedResponse;
import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListPurchasableOffersPagedResponse;
import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListPurchasableSkusPagedResponse;
import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListSkuGroupBillableSkusPagedResponse;
import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListSkuGroupsPagedResponse;
import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListSkusPagedResponse;
import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListSubscribersPagedResponse;
import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListTransferableOffersPagedResponse;
import static com.google.cloud.channel.v1.CloudChannelServiceClient.ListTransferableSkusPagedResponse;

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
import com.google.cloud.channel.v1.ActivateEntitlementRequest;
import com.google.cloud.channel.v1.BillableSku;
import com.google.cloud.channel.v1.CancelEntitlementRequest;
import com.google.cloud.channel.v1.ChangeOfferRequest;
import com.google.cloud.channel.v1.ChangeParametersRequest;
import com.google.cloud.channel.v1.ChangeRenewalSettingsRequest;
import com.google.cloud.channel.v1.ChannelPartnerLink;
import com.google.cloud.channel.v1.ChannelPartnerRepricingConfig;
import com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistRequest;
import com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse;
import com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest;
import com.google.cloud.channel.v1.CreateChannelPartnerRepricingConfigRequest;
import com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest;
import com.google.cloud.channel.v1.CreateCustomerRequest;
import com.google.cloud.channel.v1.CreateEntitlementRequest;
import com.google.cloud.channel.v1.Customer;
import com.google.cloud.channel.v1.CustomerRepricingConfig;
import com.google.cloud.channel.v1.DeleteChannelPartnerRepricingConfigRequest;
import com.google.cloud.channel.v1.DeleteCustomerRepricingConfigRequest;
import com.google.cloud.channel.v1.DeleteCustomerRequest;
import com.google.cloud.channel.v1.Entitlement;
import com.google.cloud.channel.v1.EntitlementChange;
import com.google.cloud.channel.v1.GetChannelPartnerLinkRequest;
import com.google.cloud.channel.v1.GetChannelPartnerRepricingConfigRequest;
import com.google.cloud.channel.v1.GetCustomerRepricingConfigRequest;
import com.google.cloud.channel.v1.GetCustomerRequest;
import com.google.cloud.channel.v1.GetEntitlementRequest;
import com.google.cloud.channel.v1.ImportCustomerRequest;
import com.google.cloud.channel.v1.ListChannelPartnerLinksRequest;
import com.google.cloud.channel.v1.ListChannelPartnerLinksResponse;
import com.google.cloud.channel.v1.ListChannelPartnerRepricingConfigsRequest;
import com.google.cloud.channel.v1.ListChannelPartnerRepricingConfigsResponse;
import com.google.cloud.channel.v1.ListCustomerRepricingConfigsRequest;
import com.google.cloud.channel.v1.ListCustomerRepricingConfigsResponse;
import com.google.cloud.channel.v1.ListCustomersRequest;
import com.google.cloud.channel.v1.ListCustomersResponse;
import com.google.cloud.channel.v1.ListEntitlementChangesRequest;
import com.google.cloud.channel.v1.ListEntitlementChangesResponse;
import com.google.cloud.channel.v1.ListEntitlementsRequest;
import com.google.cloud.channel.v1.ListEntitlementsResponse;
import com.google.cloud.channel.v1.ListOffersRequest;
import com.google.cloud.channel.v1.ListOffersResponse;
import com.google.cloud.channel.v1.ListProductsRequest;
import com.google.cloud.channel.v1.ListProductsResponse;
import com.google.cloud.channel.v1.ListPurchasableOffersRequest;
import com.google.cloud.channel.v1.ListPurchasableOffersResponse;
import com.google.cloud.channel.v1.ListPurchasableSkusRequest;
import com.google.cloud.channel.v1.ListPurchasableSkusResponse;
import com.google.cloud.channel.v1.ListSkuGroupBillableSkusRequest;
import com.google.cloud.channel.v1.ListSkuGroupBillableSkusResponse;
import com.google.cloud.channel.v1.ListSkuGroupsRequest;
import com.google.cloud.channel.v1.ListSkuGroupsResponse;
import com.google.cloud.channel.v1.ListSkusRequest;
import com.google.cloud.channel.v1.ListSkusResponse;
import com.google.cloud.channel.v1.ListSubscribersRequest;
import com.google.cloud.channel.v1.ListSubscribersResponse;
import com.google.cloud.channel.v1.ListTransferableOffersRequest;
import com.google.cloud.channel.v1.ListTransferableOffersResponse;
import com.google.cloud.channel.v1.ListTransferableSkusRequest;
import com.google.cloud.channel.v1.ListTransferableSkusResponse;
import com.google.cloud.channel.v1.LookupOfferRequest;
import com.google.cloud.channel.v1.Offer;
import com.google.cloud.channel.v1.OperationMetadata;
import com.google.cloud.channel.v1.Product;
import com.google.cloud.channel.v1.ProvisionCloudIdentityRequest;
import com.google.cloud.channel.v1.PurchasableOffer;
import com.google.cloud.channel.v1.PurchasableSku;
import com.google.cloud.channel.v1.QueryEligibleBillingAccountsRequest;
import com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse;
import com.google.cloud.channel.v1.RegisterSubscriberRequest;
import com.google.cloud.channel.v1.RegisterSubscriberResponse;
import com.google.cloud.channel.v1.Sku;
import com.google.cloud.channel.v1.SkuGroup;
import com.google.cloud.channel.v1.StartPaidServiceRequest;
import com.google.cloud.channel.v1.SuspendEntitlementRequest;
import com.google.cloud.channel.v1.TransferEntitlementsRequest;
import com.google.cloud.channel.v1.TransferEntitlementsResponse;
import com.google.cloud.channel.v1.TransferEntitlementsToGoogleRequest;
import com.google.cloud.channel.v1.TransferableOffer;
import com.google.cloud.channel.v1.TransferableSku;
import com.google.cloud.channel.v1.UnregisterSubscriberRequest;
import com.google.cloud.channel.v1.UnregisterSubscriberResponse;
import com.google.cloud.channel.v1.UpdateChannelPartnerLinkRequest;
import com.google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest;
import com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest;
import com.google.cloud.channel.v1.UpdateCustomerRequest;
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
 * Settings class to configure an instance of {@link CloudChannelServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (cloudchannel.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of getCustomer:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CloudChannelServiceStubSettings.Builder cloudChannelServiceSettingsBuilder =
 *     CloudChannelServiceStubSettings.newBuilder();
 * cloudChannelServiceSettingsBuilder
 *     .getCustomerSettings()
 *     .setRetrySettings(
 *         cloudChannelServiceSettingsBuilder
 *             .getCustomerSettings()
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
 * CloudChannelServiceStubSettings cloudChannelServiceSettings =
 *     cloudChannelServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for provisionCloudIdentity:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CloudChannelServiceStubSettings.Builder cloudChannelServiceSettingsBuilder =
 *     CloudChannelServiceStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * cloudChannelServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class CloudChannelServiceStubSettings extends StubSettings<CloudChannelServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/apps.order").build();

  private final PagedCallSettings<
          ListCustomersRequest, ListCustomersResponse, ListCustomersPagedResponse>
      listCustomersSettings;
  private final UnaryCallSettings<GetCustomerRequest, Customer> getCustomerSettings;
  private final UnaryCallSettings<
          CheckCloudIdentityAccountsExistRequest, CheckCloudIdentityAccountsExistResponse>
      checkCloudIdentityAccountsExistSettings;
  private final UnaryCallSettings<CreateCustomerRequest, Customer> createCustomerSettings;
  private final UnaryCallSettings<UpdateCustomerRequest, Customer> updateCustomerSettings;
  private final UnaryCallSettings<DeleteCustomerRequest, Empty> deleteCustomerSettings;
  private final UnaryCallSettings<ImportCustomerRequest, Customer> importCustomerSettings;
  private final UnaryCallSettings<ProvisionCloudIdentityRequest, Operation>
      provisionCloudIdentitySettings;
  private final OperationCallSettings<ProvisionCloudIdentityRequest, Customer, OperationMetadata>
      provisionCloudIdentityOperationSettings;
  private final PagedCallSettings<
          ListEntitlementsRequest, ListEntitlementsResponse, ListEntitlementsPagedResponse>
      listEntitlementsSettings;
  private final PagedCallSettings<
          ListTransferableSkusRequest,
          ListTransferableSkusResponse,
          ListTransferableSkusPagedResponse>
      listTransferableSkusSettings;
  private final PagedCallSettings<
          ListTransferableOffersRequest,
          ListTransferableOffersResponse,
          ListTransferableOffersPagedResponse>
      listTransferableOffersSettings;
  private final UnaryCallSettings<GetEntitlementRequest, Entitlement> getEntitlementSettings;
  private final UnaryCallSettings<CreateEntitlementRequest, Operation> createEntitlementSettings;
  private final OperationCallSettings<CreateEntitlementRequest, Entitlement, OperationMetadata>
      createEntitlementOperationSettings;
  private final UnaryCallSettings<ChangeParametersRequest, Operation> changeParametersSettings;
  private final OperationCallSettings<ChangeParametersRequest, Entitlement, OperationMetadata>
      changeParametersOperationSettings;
  private final UnaryCallSettings<ChangeRenewalSettingsRequest, Operation>
      changeRenewalSettingsSettings;
  private final OperationCallSettings<ChangeRenewalSettingsRequest, Entitlement, OperationMetadata>
      changeRenewalSettingsOperationSettings;
  private final UnaryCallSettings<ChangeOfferRequest, Operation> changeOfferSettings;
  private final OperationCallSettings<ChangeOfferRequest, Entitlement, OperationMetadata>
      changeOfferOperationSettings;
  private final UnaryCallSettings<StartPaidServiceRequest, Operation> startPaidServiceSettings;
  private final OperationCallSettings<StartPaidServiceRequest, Entitlement, OperationMetadata>
      startPaidServiceOperationSettings;
  private final UnaryCallSettings<SuspendEntitlementRequest, Operation> suspendEntitlementSettings;
  private final OperationCallSettings<SuspendEntitlementRequest, Entitlement, OperationMetadata>
      suspendEntitlementOperationSettings;
  private final UnaryCallSettings<CancelEntitlementRequest, Operation> cancelEntitlementSettings;
  private final OperationCallSettings<CancelEntitlementRequest, Empty, OperationMetadata>
      cancelEntitlementOperationSettings;
  private final UnaryCallSettings<ActivateEntitlementRequest, Operation>
      activateEntitlementSettings;
  private final OperationCallSettings<ActivateEntitlementRequest, Entitlement, OperationMetadata>
      activateEntitlementOperationSettings;
  private final UnaryCallSettings<TransferEntitlementsRequest, Operation>
      transferEntitlementsSettings;
  private final OperationCallSettings<
          TransferEntitlementsRequest, TransferEntitlementsResponse, OperationMetadata>
      transferEntitlementsOperationSettings;
  private final UnaryCallSettings<TransferEntitlementsToGoogleRequest, Operation>
      transferEntitlementsToGoogleSettings;
  private final OperationCallSettings<TransferEntitlementsToGoogleRequest, Empty, OperationMetadata>
      transferEntitlementsToGoogleOperationSettings;
  private final PagedCallSettings<
          ListChannelPartnerLinksRequest,
          ListChannelPartnerLinksResponse,
          ListChannelPartnerLinksPagedResponse>
      listChannelPartnerLinksSettings;
  private final UnaryCallSettings<GetChannelPartnerLinkRequest, ChannelPartnerLink>
      getChannelPartnerLinkSettings;
  private final UnaryCallSettings<CreateChannelPartnerLinkRequest, ChannelPartnerLink>
      createChannelPartnerLinkSettings;
  private final UnaryCallSettings<UpdateChannelPartnerLinkRequest, ChannelPartnerLink>
      updateChannelPartnerLinkSettings;
  private final UnaryCallSettings<GetCustomerRepricingConfigRequest, CustomerRepricingConfig>
      getCustomerRepricingConfigSettings;
  private final PagedCallSettings<
          ListCustomerRepricingConfigsRequest,
          ListCustomerRepricingConfigsResponse,
          ListCustomerRepricingConfigsPagedResponse>
      listCustomerRepricingConfigsSettings;
  private final UnaryCallSettings<CreateCustomerRepricingConfigRequest, CustomerRepricingConfig>
      createCustomerRepricingConfigSettings;
  private final UnaryCallSettings<UpdateCustomerRepricingConfigRequest, CustomerRepricingConfig>
      updateCustomerRepricingConfigSettings;
  private final UnaryCallSettings<DeleteCustomerRepricingConfigRequest, Empty>
      deleteCustomerRepricingConfigSettings;
  private final UnaryCallSettings<
          GetChannelPartnerRepricingConfigRequest, ChannelPartnerRepricingConfig>
      getChannelPartnerRepricingConfigSettings;
  private final PagedCallSettings<
          ListChannelPartnerRepricingConfigsRequest,
          ListChannelPartnerRepricingConfigsResponse,
          ListChannelPartnerRepricingConfigsPagedResponse>
      listChannelPartnerRepricingConfigsSettings;
  private final UnaryCallSettings<
          CreateChannelPartnerRepricingConfigRequest, ChannelPartnerRepricingConfig>
      createChannelPartnerRepricingConfigSettings;
  private final UnaryCallSettings<
          UpdateChannelPartnerRepricingConfigRequest, ChannelPartnerRepricingConfig>
      updateChannelPartnerRepricingConfigSettings;
  private final UnaryCallSettings<DeleteChannelPartnerRepricingConfigRequest, Empty>
      deleteChannelPartnerRepricingConfigSettings;
  private final PagedCallSettings<
          ListSkuGroupsRequest, ListSkuGroupsResponse, ListSkuGroupsPagedResponse>
      listSkuGroupsSettings;
  private final PagedCallSettings<
          ListSkuGroupBillableSkusRequest,
          ListSkuGroupBillableSkusResponse,
          ListSkuGroupBillableSkusPagedResponse>
      listSkuGroupBillableSkusSettings;
  private final UnaryCallSettings<LookupOfferRequest, Offer> lookupOfferSettings;
  private final PagedCallSettings<
          ListProductsRequest, ListProductsResponse, ListProductsPagedResponse>
      listProductsSettings;
  private final PagedCallSettings<ListSkusRequest, ListSkusResponse, ListSkusPagedResponse>
      listSkusSettings;
  private final PagedCallSettings<ListOffersRequest, ListOffersResponse, ListOffersPagedResponse>
      listOffersSettings;
  private final PagedCallSettings<
          ListPurchasableSkusRequest, ListPurchasableSkusResponse, ListPurchasableSkusPagedResponse>
      listPurchasableSkusSettings;
  private final PagedCallSettings<
          ListPurchasableOffersRequest,
          ListPurchasableOffersResponse,
          ListPurchasableOffersPagedResponse>
      listPurchasableOffersSettings;
  private final UnaryCallSettings<
          QueryEligibleBillingAccountsRequest, QueryEligibleBillingAccountsResponse>
      queryEligibleBillingAccountsSettings;
  private final UnaryCallSettings<RegisterSubscriberRequest, RegisterSubscriberResponse>
      registerSubscriberSettings;
  private final UnaryCallSettings<UnregisterSubscriberRequest, UnregisterSubscriberResponse>
      unregisterSubscriberSettings;
  private final PagedCallSettings<
          ListSubscribersRequest, ListSubscribersResponse, ListSubscribersPagedResponse>
      listSubscribersSettings;
  private final PagedCallSettings<
          ListEntitlementChangesRequest,
          ListEntitlementChangesResponse,
          ListEntitlementChangesPagedResponse>
      listEntitlementChangesSettings;

  private static final PagedListDescriptor<ListCustomersRequest, ListCustomersResponse, Customer>
      LIST_CUSTOMERS_PAGE_STR_DESC =
          new PagedListDescriptor<ListCustomersRequest, ListCustomersResponse, Customer>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListCustomersRequest injectToken(ListCustomersRequest payload, String token) {
              return ListCustomersRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListCustomersRequest injectPageSize(ListCustomersRequest payload, int pageSize) {
              return ListCustomersRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListCustomersRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListCustomersResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Customer> extractResources(ListCustomersResponse payload) {
              return payload.getCustomersList();
            }
          };

  private static final PagedListDescriptor<
          ListEntitlementsRequest, ListEntitlementsResponse, Entitlement>
      LIST_ENTITLEMENTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListEntitlementsRequest, ListEntitlementsResponse, Entitlement>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListEntitlementsRequest injectToken(
                ListEntitlementsRequest payload, String token) {
              return ListEntitlementsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListEntitlementsRequest injectPageSize(
                ListEntitlementsRequest payload, int pageSize) {
              return ListEntitlementsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListEntitlementsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListEntitlementsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Entitlement> extractResources(ListEntitlementsResponse payload) {
              return payload.getEntitlementsList();
            }
          };

  private static final PagedListDescriptor<
          ListTransferableSkusRequest, ListTransferableSkusResponse, TransferableSku>
      LIST_TRANSFERABLE_SKUS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListTransferableSkusRequest, ListTransferableSkusResponse, TransferableSku>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTransferableSkusRequest injectToken(
                ListTransferableSkusRequest payload, String token) {
              return ListTransferableSkusRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTransferableSkusRequest injectPageSize(
                ListTransferableSkusRequest payload, int pageSize) {
              return ListTransferableSkusRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListTransferableSkusRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTransferableSkusResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TransferableSku> extractResources(
                ListTransferableSkusResponse payload) {
              return payload.getTransferableSkusList();
            }
          };

  private static final PagedListDescriptor<
          ListTransferableOffersRequest, ListTransferableOffersResponse, TransferableOffer>
      LIST_TRANSFERABLE_OFFERS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListTransferableOffersRequest, ListTransferableOffersResponse, TransferableOffer>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTransferableOffersRequest injectToken(
                ListTransferableOffersRequest payload, String token) {
              return ListTransferableOffersRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTransferableOffersRequest injectPageSize(
                ListTransferableOffersRequest payload, int pageSize) {
              return ListTransferableOffersRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListTransferableOffersRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTransferableOffersResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TransferableOffer> extractResources(
                ListTransferableOffersResponse payload) {
              return payload.getTransferableOffersList();
            }
          };

  private static final PagedListDescriptor<
          ListChannelPartnerLinksRequest, ListChannelPartnerLinksResponse, ChannelPartnerLink>
      LIST_CHANNEL_PARTNER_LINKS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListChannelPartnerLinksRequest,
              ListChannelPartnerLinksResponse,
              ChannelPartnerLink>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListChannelPartnerLinksRequest injectToken(
                ListChannelPartnerLinksRequest payload, String token) {
              return ListChannelPartnerLinksRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListChannelPartnerLinksRequest injectPageSize(
                ListChannelPartnerLinksRequest payload, int pageSize) {
              return ListChannelPartnerLinksRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListChannelPartnerLinksRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListChannelPartnerLinksResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ChannelPartnerLink> extractResources(
                ListChannelPartnerLinksResponse payload) {
              return payload.getChannelPartnerLinksList();
            }
          };

  private static final PagedListDescriptor<
          ListCustomerRepricingConfigsRequest,
          ListCustomerRepricingConfigsResponse,
          CustomerRepricingConfig>
      LIST_CUSTOMER_REPRICING_CONFIGS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListCustomerRepricingConfigsRequest,
              ListCustomerRepricingConfigsResponse,
              CustomerRepricingConfig>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListCustomerRepricingConfigsRequest injectToken(
                ListCustomerRepricingConfigsRequest payload, String token) {
              return ListCustomerRepricingConfigsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListCustomerRepricingConfigsRequest injectPageSize(
                ListCustomerRepricingConfigsRequest payload, int pageSize) {
              return ListCustomerRepricingConfigsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListCustomerRepricingConfigsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListCustomerRepricingConfigsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<CustomerRepricingConfig> extractResources(
                ListCustomerRepricingConfigsResponse payload) {
              return payload.getCustomerRepricingConfigsList();
            }
          };

  private static final PagedListDescriptor<
          ListChannelPartnerRepricingConfigsRequest,
          ListChannelPartnerRepricingConfigsResponse,
          ChannelPartnerRepricingConfig>
      LIST_CHANNEL_PARTNER_REPRICING_CONFIGS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListChannelPartnerRepricingConfigsRequest,
              ListChannelPartnerRepricingConfigsResponse,
              ChannelPartnerRepricingConfig>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListChannelPartnerRepricingConfigsRequest injectToken(
                ListChannelPartnerRepricingConfigsRequest payload, String token) {
              return ListChannelPartnerRepricingConfigsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListChannelPartnerRepricingConfigsRequest injectPageSize(
                ListChannelPartnerRepricingConfigsRequest payload, int pageSize) {
              return ListChannelPartnerRepricingConfigsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListChannelPartnerRepricingConfigsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListChannelPartnerRepricingConfigsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ChannelPartnerRepricingConfig> extractResources(
                ListChannelPartnerRepricingConfigsResponse payload) {
              return payload.getChannelPartnerRepricingConfigsList();
            }
          };

  private static final PagedListDescriptor<ListSkuGroupsRequest, ListSkuGroupsResponse, SkuGroup>
      LIST_SKU_GROUPS_PAGE_STR_DESC =
          new PagedListDescriptor<ListSkuGroupsRequest, ListSkuGroupsResponse, SkuGroup>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListSkuGroupsRequest injectToken(ListSkuGroupsRequest payload, String token) {
              return ListSkuGroupsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListSkuGroupsRequest injectPageSize(ListSkuGroupsRequest payload, int pageSize) {
              return ListSkuGroupsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListSkuGroupsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListSkuGroupsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<SkuGroup> extractResources(ListSkuGroupsResponse payload) {
              return payload.getSkuGroupsList();
            }
          };

  private static final PagedListDescriptor<
          ListSkuGroupBillableSkusRequest, ListSkuGroupBillableSkusResponse, BillableSku>
      LIST_SKU_GROUP_BILLABLE_SKUS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListSkuGroupBillableSkusRequest, ListSkuGroupBillableSkusResponse, BillableSku>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListSkuGroupBillableSkusRequest injectToken(
                ListSkuGroupBillableSkusRequest payload, String token) {
              return ListSkuGroupBillableSkusRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListSkuGroupBillableSkusRequest injectPageSize(
                ListSkuGroupBillableSkusRequest payload, int pageSize) {
              return ListSkuGroupBillableSkusRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListSkuGroupBillableSkusRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListSkuGroupBillableSkusResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<BillableSku> extractResources(
                ListSkuGroupBillableSkusResponse payload) {
              return payload.getBillableSkusList();
            }
          };

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

  private static final PagedListDescriptor<ListSkusRequest, ListSkusResponse, Sku>
      LIST_SKUS_PAGE_STR_DESC =
          new PagedListDescriptor<ListSkusRequest, ListSkusResponse, Sku>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListSkusRequest injectToken(ListSkusRequest payload, String token) {
              return ListSkusRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListSkusRequest injectPageSize(ListSkusRequest payload, int pageSize) {
              return ListSkusRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListSkusRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListSkusResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Sku> extractResources(ListSkusResponse payload) {
              return payload.getSkusList();
            }
          };

  private static final PagedListDescriptor<ListOffersRequest, ListOffersResponse, Offer>
      LIST_OFFERS_PAGE_STR_DESC =
          new PagedListDescriptor<ListOffersRequest, ListOffersResponse, Offer>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListOffersRequest injectToken(ListOffersRequest payload, String token) {
              return ListOffersRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListOffersRequest injectPageSize(ListOffersRequest payload, int pageSize) {
              return ListOffersRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListOffersRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListOffersResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Offer> extractResources(ListOffersResponse payload) {
              return payload.getOffersList();
            }
          };

  private static final PagedListDescriptor<
          ListPurchasableSkusRequest, ListPurchasableSkusResponse, PurchasableSku>
      LIST_PURCHASABLE_SKUS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListPurchasableSkusRequest, ListPurchasableSkusResponse, PurchasableSku>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListPurchasableSkusRequest injectToken(
                ListPurchasableSkusRequest payload, String token) {
              return ListPurchasableSkusRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListPurchasableSkusRequest injectPageSize(
                ListPurchasableSkusRequest payload, int pageSize) {
              return ListPurchasableSkusRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListPurchasableSkusRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListPurchasableSkusResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<PurchasableSku> extractResources(ListPurchasableSkusResponse payload) {
              return payload.getPurchasableSkusList();
            }
          };

  private static final PagedListDescriptor<
          ListPurchasableOffersRequest, ListPurchasableOffersResponse, PurchasableOffer>
      LIST_PURCHASABLE_OFFERS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListPurchasableOffersRequest, ListPurchasableOffersResponse, PurchasableOffer>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListPurchasableOffersRequest injectToken(
                ListPurchasableOffersRequest payload, String token) {
              return ListPurchasableOffersRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListPurchasableOffersRequest injectPageSize(
                ListPurchasableOffersRequest payload, int pageSize) {
              return ListPurchasableOffersRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListPurchasableOffersRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListPurchasableOffersResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<PurchasableOffer> extractResources(
                ListPurchasableOffersResponse payload) {
              return payload.getPurchasableOffersList();
            }
          };

  private static final PagedListDescriptor<ListSubscribersRequest, ListSubscribersResponse, String>
      LIST_SUBSCRIBERS_PAGE_STR_DESC =
          new PagedListDescriptor<ListSubscribersRequest, ListSubscribersResponse, String>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListSubscribersRequest injectToken(
                ListSubscribersRequest payload, String token) {
              return ListSubscribersRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListSubscribersRequest injectPageSize(
                ListSubscribersRequest payload, int pageSize) {
              return ListSubscribersRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListSubscribersRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListSubscribersResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<String> extractResources(ListSubscribersResponse payload) {
              return payload.getServiceAccountsList();
            }
          };

  private static final PagedListDescriptor<
          ListEntitlementChangesRequest, ListEntitlementChangesResponse, EntitlementChange>
      LIST_ENTITLEMENT_CHANGES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListEntitlementChangesRequest, ListEntitlementChangesResponse, EntitlementChange>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListEntitlementChangesRequest injectToken(
                ListEntitlementChangesRequest payload, String token) {
              return ListEntitlementChangesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListEntitlementChangesRequest injectPageSize(
                ListEntitlementChangesRequest payload, int pageSize) {
              return ListEntitlementChangesRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListEntitlementChangesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListEntitlementChangesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<EntitlementChange> extractResources(
                ListEntitlementChangesResponse payload) {
              return payload.getEntitlementChangesList();
            }
          };

  private static final PagedListResponseFactory<
          ListCustomersRequest, ListCustomersResponse, ListCustomersPagedResponse>
      LIST_CUSTOMERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListCustomersRequest, ListCustomersResponse, ListCustomersPagedResponse>() {
            @Override
            public ApiFuture<ListCustomersPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListCustomersRequest, ListCustomersResponse> callable,
                ListCustomersRequest request,
                ApiCallContext context,
                ApiFuture<ListCustomersResponse> futureResponse) {
              PageContext<ListCustomersRequest, ListCustomersResponse, Customer> pageContext =
                  PageContext.create(callable, LIST_CUSTOMERS_PAGE_STR_DESC, request, context);
              return ListCustomersPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListEntitlementsRequest, ListEntitlementsResponse, ListEntitlementsPagedResponse>
      LIST_ENTITLEMENTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListEntitlementsRequest, ListEntitlementsResponse, ListEntitlementsPagedResponse>() {
            @Override
            public ApiFuture<ListEntitlementsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListEntitlementsRequest, ListEntitlementsResponse> callable,
                ListEntitlementsRequest request,
                ApiCallContext context,
                ApiFuture<ListEntitlementsResponse> futureResponse) {
              PageContext<ListEntitlementsRequest, ListEntitlementsResponse, Entitlement>
                  pageContext =
                      PageContext.create(
                          callable, LIST_ENTITLEMENTS_PAGE_STR_DESC, request, context);
              return ListEntitlementsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListTransferableSkusRequest,
          ListTransferableSkusResponse,
          ListTransferableSkusPagedResponse>
      LIST_TRANSFERABLE_SKUS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTransferableSkusRequest,
              ListTransferableSkusResponse,
              ListTransferableSkusPagedResponse>() {
            @Override
            public ApiFuture<ListTransferableSkusPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTransferableSkusRequest, ListTransferableSkusResponse> callable,
                ListTransferableSkusRequest request,
                ApiCallContext context,
                ApiFuture<ListTransferableSkusResponse> futureResponse) {
              PageContext<
                      ListTransferableSkusRequest, ListTransferableSkusResponse, TransferableSku>
                  pageContext =
                      PageContext.create(
                          callable, LIST_TRANSFERABLE_SKUS_PAGE_STR_DESC, request, context);
              return ListTransferableSkusPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListTransferableOffersRequest,
          ListTransferableOffersResponse,
          ListTransferableOffersPagedResponse>
      LIST_TRANSFERABLE_OFFERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTransferableOffersRequest,
              ListTransferableOffersResponse,
              ListTransferableOffersPagedResponse>() {
            @Override
            public ApiFuture<ListTransferableOffersPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTransferableOffersRequest, ListTransferableOffersResponse>
                    callable,
                ListTransferableOffersRequest request,
                ApiCallContext context,
                ApiFuture<ListTransferableOffersResponse> futureResponse) {
              PageContext<
                      ListTransferableOffersRequest,
                      ListTransferableOffersResponse,
                      TransferableOffer>
                  pageContext =
                      PageContext.create(
                          callable, LIST_TRANSFERABLE_OFFERS_PAGE_STR_DESC, request, context);
              return ListTransferableOffersPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListChannelPartnerLinksRequest,
          ListChannelPartnerLinksResponse,
          ListChannelPartnerLinksPagedResponse>
      LIST_CHANNEL_PARTNER_LINKS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListChannelPartnerLinksRequest,
              ListChannelPartnerLinksResponse,
              ListChannelPartnerLinksPagedResponse>() {
            @Override
            public ApiFuture<ListChannelPartnerLinksPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListChannelPartnerLinksRequest, ListChannelPartnerLinksResponse>
                    callable,
                ListChannelPartnerLinksRequest request,
                ApiCallContext context,
                ApiFuture<ListChannelPartnerLinksResponse> futureResponse) {
              PageContext<
                      ListChannelPartnerLinksRequest,
                      ListChannelPartnerLinksResponse,
                      ChannelPartnerLink>
                  pageContext =
                      PageContext.create(
                          callable, LIST_CHANNEL_PARTNER_LINKS_PAGE_STR_DESC, request, context);
              return ListChannelPartnerLinksPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListCustomerRepricingConfigsRequest,
          ListCustomerRepricingConfigsResponse,
          ListCustomerRepricingConfigsPagedResponse>
      LIST_CUSTOMER_REPRICING_CONFIGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListCustomerRepricingConfigsRequest,
              ListCustomerRepricingConfigsResponse,
              ListCustomerRepricingConfigsPagedResponse>() {
            @Override
            public ApiFuture<ListCustomerRepricingConfigsPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListCustomerRepricingConfigsRequest, ListCustomerRepricingConfigsResponse>
                    callable,
                ListCustomerRepricingConfigsRequest request,
                ApiCallContext context,
                ApiFuture<ListCustomerRepricingConfigsResponse> futureResponse) {
              PageContext<
                      ListCustomerRepricingConfigsRequest,
                      ListCustomerRepricingConfigsResponse,
                      CustomerRepricingConfig>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_CUSTOMER_REPRICING_CONFIGS_PAGE_STR_DESC,
                          request,
                          context);
              return ListCustomerRepricingConfigsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListChannelPartnerRepricingConfigsRequest,
          ListChannelPartnerRepricingConfigsResponse,
          ListChannelPartnerRepricingConfigsPagedResponse>
      LIST_CHANNEL_PARTNER_REPRICING_CONFIGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListChannelPartnerRepricingConfigsRequest,
              ListChannelPartnerRepricingConfigsResponse,
              ListChannelPartnerRepricingConfigsPagedResponse>() {
            @Override
            public ApiFuture<ListChannelPartnerRepricingConfigsPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            ListChannelPartnerRepricingConfigsRequest,
                            ListChannelPartnerRepricingConfigsResponse>
                        callable,
                    ListChannelPartnerRepricingConfigsRequest request,
                    ApiCallContext context,
                    ApiFuture<ListChannelPartnerRepricingConfigsResponse> futureResponse) {
              PageContext<
                      ListChannelPartnerRepricingConfigsRequest,
                      ListChannelPartnerRepricingConfigsResponse,
                      ChannelPartnerRepricingConfig>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_CHANNEL_PARTNER_REPRICING_CONFIGS_PAGE_STR_DESC,
                          request,
                          context);
              return ListChannelPartnerRepricingConfigsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListSkuGroupsRequest, ListSkuGroupsResponse, ListSkuGroupsPagedResponse>
      LIST_SKU_GROUPS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListSkuGroupsRequest, ListSkuGroupsResponse, ListSkuGroupsPagedResponse>() {
            @Override
            public ApiFuture<ListSkuGroupsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListSkuGroupsRequest, ListSkuGroupsResponse> callable,
                ListSkuGroupsRequest request,
                ApiCallContext context,
                ApiFuture<ListSkuGroupsResponse> futureResponse) {
              PageContext<ListSkuGroupsRequest, ListSkuGroupsResponse, SkuGroup> pageContext =
                  PageContext.create(callable, LIST_SKU_GROUPS_PAGE_STR_DESC, request, context);
              return ListSkuGroupsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListSkuGroupBillableSkusRequest,
          ListSkuGroupBillableSkusResponse,
          ListSkuGroupBillableSkusPagedResponse>
      LIST_SKU_GROUP_BILLABLE_SKUS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListSkuGroupBillableSkusRequest,
              ListSkuGroupBillableSkusResponse,
              ListSkuGroupBillableSkusPagedResponse>() {
            @Override
            public ApiFuture<ListSkuGroupBillableSkusPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListSkuGroupBillableSkusRequest, ListSkuGroupBillableSkusResponse>
                    callable,
                ListSkuGroupBillableSkusRequest request,
                ApiCallContext context,
                ApiFuture<ListSkuGroupBillableSkusResponse> futureResponse) {
              PageContext<
                      ListSkuGroupBillableSkusRequest,
                      ListSkuGroupBillableSkusResponse,
                      BillableSku>
                  pageContext =
                      PageContext.create(
                          callable, LIST_SKU_GROUP_BILLABLE_SKUS_PAGE_STR_DESC, request, context);
              return ListSkuGroupBillableSkusPagedResponse.createAsync(pageContext, futureResponse);
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

  private static final PagedListResponseFactory<
          ListSkusRequest, ListSkusResponse, ListSkusPagedResponse>
      LIST_SKUS_PAGE_STR_FACT =
          new PagedListResponseFactory<ListSkusRequest, ListSkusResponse, ListSkusPagedResponse>() {
            @Override
            public ApiFuture<ListSkusPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListSkusRequest, ListSkusResponse> callable,
                ListSkusRequest request,
                ApiCallContext context,
                ApiFuture<ListSkusResponse> futureResponse) {
              PageContext<ListSkusRequest, ListSkusResponse, Sku> pageContext =
                  PageContext.create(callable, LIST_SKUS_PAGE_STR_DESC, request, context);
              return ListSkusPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListOffersRequest, ListOffersResponse, ListOffersPagedResponse>
      LIST_OFFERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListOffersRequest, ListOffersResponse, ListOffersPagedResponse>() {
            @Override
            public ApiFuture<ListOffersPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListOffersRequest, ListOffersResponse> callable,
                ListOffersRequest request,
                ApiCallContext context,
                ApiFuture<ListOffersResponse> futureResponse) {
              PageContext<ListOffersRequest, ListOffersResponse, Offer> pageContext =
                  PageContext.create(callable, LIST_OFFERS_PAGE_STR_DESC, request, context);
              return ListOffersPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListPurchasableSkusRequest, ListPurchasableSkusResponse, ListPurchasableSkusPagedResponse>
      LIST_PURCHASABLE_SKUS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListPurchasableSkusRequest,
              ListPurchasableSkusResponse,
              ListPurchasableSkusPagedResponse>() {
            @Override
            public ApiFuture<ListPurchasableSkusPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListPurchasableSkusRequest, ListPurchasableSkusResponse> callable,
                ListPurchasableSkusRequest request,
                ApiCallContext context,
                ApiFuture<ListPurchasableSkusResponse> futureResponse) {
              PageContext<ListPurchasableSkusRequest, ListPurchasableSkusResponse, PurchasableSku>
                  pageContext =
                      PageContext.create(
                          callable, LIST_PURCHASABLE_SKUS_PAGE_STR_DESC, request, context);
              return ListPurchasableSkusPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListPurchasableOffersRequest,
          ListPurchasableOffersResponse,
          ListPurchasableOffersPagedResponse>
      LIST_PURCHASABLE_OFFERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListPurchasableOffersRequest,
              ListPurchasableOffersResponse,
              ListPurchasableOffersPagedResponse>() {
            @Override
            public ApiFuture<ListPurchasableOffersPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListPurchasableOffersRequest, ListPurchasableOffersResponse> callable,
                ListPurchasableOffersRequest request,
                ApiCallContext context,
                ApiFuture<ListPurchasableOffersResponse> futureResponse) {
              PageContext<
                      ListPurchasableOffersRequest, ListPurchasableOffersResponse, PurchasableOffer>
                  pageContext =
                      PageContext.create(
                          callable, LIST_PURCHASABLE_OFFERS_PAGE_STR_DESC, request, context);
              return ListPurchasableOffersPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListSubscribersRequest, ListSubscribersResponse, ListSubscribersPagedResponse>
      LIST_SUBSCRIBERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListSubscribersRequest, ListSubscribersResponse, ListSubscribersPagedResponse>() {
            @Override
            public ApiFuture<ListSubscribersPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListSubscribersRequest, ListSubscribersResponse> callable,
                ListSubscribersRequest request,
                ApiCallContext context,
                ApiFuture<ListSubscribersResponse> futureResponse) {
              PageContext<ListSubscribersRequest, ListSubscribersResponse, String> pageContext =
                  PageContext.create(callable, LIST_SUBSCRIBERS_PAGE_STR_DESC, request, context);
              return ListSubscribersPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListEntitlementChangesRequest,
          ListEntitlementChangesResponse,
          ListEntitlementChangesPagedResponse>
      LIST_ENTITLEMENT_CHANGES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListEntitlementChangesRequest,
              ListEntitlementChangesResponse,
              ListEntitlementChangesPagedResponse>() {
            @Override
            public ApiFuture<ListEntitlementChangesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListEntitlementChangesRequest, ListEntitlementChangesResponse>
                    callable,
                ListEntitlementChangesRequest request,
                ApiCallContext context,
                ApiFuture<ListEntitlementChangesResponse> futureResponse) {
              PageContext<
                      ListEntitlementChangesRequest,
                      ListEntitlementChangesResponse,
                      EntitlementChange>
                  pageContext =
                      PageContext.create(
                          callable, LIST_ENTITLEMENT_CHANGES_PAGE_STR_DESC, request, context);
              return ListEntitlementChangesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to listCustomers. */
  public PagedCallSettings<ListCustomersRequest, ListCustomersResponse, ListCustomersPagedResponse>
      listCustomersSettings() {
    return listCustomersSettings;
  }

  /** Returns the object with the settings used for calls to getCustomer. */
  public UnaryCallSettings<GetCustomerRequest, Customer> getCustomerSettings() {
    return getCustomerSettings;
  }

  /** Returns the object with the settings used for calls to checkCloudIdentityAccountsExist. */
  public UnaryCallSettings<
          CheckCloudIdentityAccountsExistRequest, CheckCloudIdentityAccountsExistResponse>
      checkCloudIdentityAccountsExistSettings() {
    return checkCloudIdentityAccountsExistSettings;
  }

  /** Returns the object with the settings used for calls to createCustomer. */
  public UnaryCallSettings<CreateCustomerRequest, Customer> createCustomerSettings() {
    return createCustomerSettings;
  }

  /** Returns the object with the settings used for calls to updateCustomer. */
  public UnaryCallSettings<UpdateCustomerRequest, Customer> updateCustomerSettings() {
    return updateCustomerSettings;
  }

  /** Returns the object with the settings used for calls to deleteCustomer. */
  public UnaryCallSettings<DeleteCustomerRequest, Empty> deleteCustomerSettings() {
    return deleteCustomerSettings;
  }

  /** Returns the object with the settings used for calls to importCustomer. */
  public UnaryCallSettings<ImportCustomerRequest, Customer> importCustomerSettings() {
    return importCustomerSettings;
  }

  /** Returns the object with the settings used for calls to provisionCloudIdentity. */
  public UnaryCallSettings<ProvisionCloudIdentityRequest, Operation>
      provisionCloudIdentitySettings() {
    return provisionCloudIdentitySettings;
  }

  /** Returns the object with the settings used for calls to provisionCloudIdentity. */
  public OperationCallSettings<ProvisionCloudIdentityRequest, Customer, OperationMetadata>
      provisionCloudIdentityOperationSettings() {
    return provisionCloudIdentityOperationSettings;
  }

  /** Returns the object with the settings used for calls to listEntitlements. */
  public PagedCallSettings<
          ListEntitlementsRequest, ListEntitlementsResponse, ListEntitlementsPagedResponse>
      listEntitlementsSettings() {
    return listEntitlementsSettings;
  }

  /** Returns the object with the settings used for calls to listTransferableSkus. */
  public PagedCallSettings<
          ListTransferableSkusRequest,
          ListTransferableSkusResponse,
          ListTransferableSkusPagedResponse>
      listTransferableSkusSettings() {
    return listTransferableSkusSettings;
  }

  /** Returns the object with the settings used for calls to listTransferableOffers. */
  public PagedCallSettings<
          ListTransferableOffersRequest,
          ListTransferableOffersResponse,
          ListTransferableOffersPagedResponse>
      listTransferableOffersSettings() {
    return listTransferableOffersSettings;
  }

  /** Returns the object with the settings used for calls to getEntitlement. */
  public UnaryCallSettings<GetEntitlementRequest, Entitlement> getEntitlementSettings() {
    return getEntitlementSettings;
  }

  /** Returns the object with the settings used for calls to createEntitlement. */
  public UnaryCallSettings<CreateEntitlementRequest, Operation> createEntitlementSettings() {
    return createEntitlementSettings;
  }

  /** Returns the object with the settings used for calls to createEntitlement. */
  public OperationCallSettings<CreateEntitlementRequest, Entitlement, OperationMetadata>
      createEntitlementOperationSettings() {
    return createEntitlementOperationSettings;
  }

  /** Returns the object with the settings used for calls to changeParameters. */
  public UnaryCallSettings<ChangeParametersRequest, Operation> changeParametersSettings() {
    return changeParametersSettings;
  }

  /** Returns the object with the settings used for calls to changeParameters. */
  public OperationCallSettings<ChangeParametersRequest, Entitlement, OperationMetadata>
      changeParametersOperationSettings() {
    return changeParametersOperationSettings;
  }

  /** Returns the object with the settings used for calls to changeRenewalSettings. */
  public UnaryCallSettings<ChangeRenewalSettingsRequest, Operation>
      changeRenewalSettingsSettings() {
    return changeRenewalSettingsSettings;
  }

  /** Returns the object with the settings used for calls to changeRenewalSettings. */
  public OperationCallSettings<ChangeRenewalSettingsRequest, Entitlement, OperationMetadata>
      changeRenewalSettingsOperationSettings() {
    return changeRenewalSettingsOperationSettings;
  }

  /** Returns the object with the settings used for calls to changeOffer. */
  public UnaryCallSettings<ChangeOfferRequest, Operation> changeOfferSettings() {
    return changeOfferSettings;
  }

  /** Returns the object with the settings used for calls to changeOffer. */
  public OperationCallSettings<ChangeOfferRequest, Entitlement, OperationMetadata>
      changeOfferOperationSettings() {
    return changeOfferOperationSettings;
  }

  /** Returns the object with the settings used for calls to startPaidService. */
  public UnaryCallSettings<StartPaidServiceRequest, Operation> startPaidServiceSettings() {
    return startPaidServiceSettings;
  }

  /** Returns the object with the settings used for calls to startPaidService. */
  public OperationCallSettings<StartPaidServiceRequest, Entitlement, OperationMetadata>
      startPaidServiceOperationSettings() {
    return startPaidServiceOperationSettings;
  }

  /** Returns the object with the settings used for calls to suspendEntitlement. */
  public UnaryCallSettings<SuspendEntitlementRequest, Operation> suspendEntitlementSettings() {
    return suspendEntitlementSettings;
  }

  /** Returns the object with the settings used for calls to suspendEntitlement. */
  public OperationCallSettings<SuspendEntitlementRequest, Entitlement, OperationMetadata>
      suspendEntitlementOperationSettings() {
    return suspendEntitlementOperationSettings;
  }

  /** Returns the object with the settings used for calls to cancelEntitlement. */
  public UnaryCallSettings<CancelEntitlementRequest, Operation> cancelEntitlementSettings() {
    return cancelEntitlementSettings;
  }

  /** Returns the object with the settings used for calls to cancelEntitlement. */
  public OperationCallSettings<CancelEntitlementRequest, Empty, OperationMetadata>
      cancelEntitlementOperationSettings() {
    return cancelEntitlementOperationSettings;
  }

  /** Returns the object with the settings used for calls to activateEntitlement. */
  public UnaryCallSettings<ActivateEntitlementRequest, Operation> activateEntitlementSettings() {
    return activateEntitlementSettings;
  }

  /** Returns the object with the settings used for calls to activateEntitlement. */
  public OperationCallSettings<ActivateEntitlementRequest, Entitlement, OperationMetadata>
      activateEntitlementOperationSettings() {
    return activateEntitlementOperationSettings;
  }

  /** Returns the object with the settings used for calls to transferEntitlements. */
  public UnaryCallSettings<TransferEntitlementsRequest, Operation> transferEntitlementsSettings() {
    return transferEntitlementsSettings;
  }

  /** Returns the object with the settings used for calls to transferEntitlements. */
  public OperationCallSettings<
          TransferEntitlementsRequest, TransferEntitlementsResponse, OperationMetadata>
      transferEntitlementsOperationSettings() {
    return transferEntitlementsOperationSettings;
  }

  /** Returns the object with the settings used for calls to transferEntitlementsToGoogle. */
  public UnaryCallSettings<TransferEntitlementsToGoogleRequest, Operation>
      transferEntitlementsToGoogleSettings() {
    return transferEntitlementsToGoogleSettings;
  }

  /** Returns the object with the settings used for calls to transferEntitlementsToGoogle. */
  public OperationCallSettings<TransferEntitlementsToGoogleRequest, Empty, OperationMetadata>
      transferEntitlementsToGoogleOperationSettings() {
    return transferEntitlementsToGoogleOperationSettings;
  }

  /** Returns the object with the settings used for calls to listChannelPartnerLinks. */
  public PagedCallSettings<
          ListChannelPartnerLinksRequest,
          ListChannelPartnerLinksResponse,
          ListChannelPartnerLinksPagedResponse>
      listChannelPartnerLinksSettings() {
    return listChannelPartnerLinksSettings;
  }

  /** Returns the object with the settings used for calls to getChannelPartnerLink. */
  public UnaryCallSettings<GetChannelPartnerLinkRequest, ChannelPartnerLink>
      getChannelPartnerLinkSettings() {
    return getChannelPartnerLinkSettings;
  }

  /** Returns the object with the settings used for calls to createChannelPartnerLink. */
  public UnaryCallSettings<CreateChannelPartnerLinkRequest, ChannelPartnerLink>
      createChannelPartnerLinkSettings() {
    return createChannelPartnerLinkSettings;
  }

  /** Returns the object with the settings used for calls to updateChannelPartnerLink. */
  public UnaryCallSettings<UpdateChannelPartnerLinkRequest, ChannelPartnerLink>
      updateChannelPartnerLinkSettings() {
    return updateChannelPartnerLinkSettings;
  }

  /** Returns the object with the settings used for calls to getCustomerRepricingConfig. */
  public UnaryCallSettings<GetCustomerRepricingConfigRequest, CustomerRepricingConfig>
      getCustomerRepricingConfigSettings() {
    return getCustomerRepricingConfigSettings;
  }

  /** Returns the object with the settings used for calls to listCustomerRepricingConfigs. */
  public PagedCallSettings<
          ListCustomerRepricingConfigsRequest,
          ListCustomerRepricingConfigsResponse,
          ListCustomerRepricingConfigsPagedResponse>
      listCustomerRepricingConfigsSettings() {
    return listCustomerRepricingConfigsSettings;
  }

  /** Returns the object with the settings used for calls to createCustomerRepricingConfig. */
  public UnaryCallSettings<CreateCustomerRepricingConfigRequest, CustomerRepricingConfig>
      createCustomerRepricingConfigSettings() {
    return createCustomerRepricingConfigSettings;
  }

  /** Returns the object with the settings used for calls to updateCustomerRepricingConfig. */
  public UnaryCallSettings<UpdateCustomerRepricingConfigRequest, CustomerRepricingConfig>
      updateCustomerRepricingConfigSettings() {
    return updateCustomerRepricingConfigSettings;
  }

  /** Returns the object with the settings used for calls to deleteCustomerRepricingConfig. */
  public UnaryCallSettings<DeleteCustomerRepricingConfigRequest, Empty>
      deleteCustomerRepricingConfigSettings() {
    return deleteCustomerRepricingConfigSettings;
  }

  /** Returns the object with the settings used for calls to getChannelPartnerRepricingConfig. */
  public UnaryCallSettings<GetChannelPartnerRepricingConfigRequest, ChannelPartnerRepricingConfig>
      getChannelPartnerRepricingConfigSettings() {
    return getChannelPartnerRepricingConfigSettings;
  }

  /** Returns the object with the settings used for calls to listChannelPartnerRepricingConfigs. */
  public PagedCallSettings<
          ListChannelPartnerRepricingConfigsRequest,
          ListChannelPartnerRepricingConfigsResponse,
          ListChannelPartnerRepricingConfigsPagedResponse>
      listChannelPartnerRepricingConfigsSettings() {
    return listChannelPartnerRepricingConfigsSettings;
  }

  /** Returns the object with the settings used for calls to createChannelPartnerRepricingConfig. */
  public UnaryCallSettings<
          CreateChannelPartnerRepricingConfigRequest, ChannelPartnerRepricingConfig>
      createChannelPartnerRepricingConfigSettings() {
    return createChannelPartnerRepricingConfigSettings;
  }

  /** Returns the object with the settings used for calls to updateChannelPartnerRepricingConfig. */
  public UnaryCallSettings<
          UpdateChannelPartnerRepricingConfigRequest, ChannelPartnerRepricingConfig>
      updateChannelPartnerRepricingConfigSettings() {
    return updateChannelPartnerRepricingConfigSettings;
  }

  /** Returns the object with the settings used for calls to deleteChannelPartnerRepricingConfig. */
  public UnaryCallSettings<DeleteChannelPartnerRepricingConfigRequest, Empty>
      deleteChannelPartnerRepricingConfigSettings() {
    return deleteChannelPartnerRepricingConfigSettings;
  }

  /** Returns the object with the settings used for calls to listSkuGroups. */
  public PagedCallSettings<ListSkuGroupsRequest, ListSkuGroupsResponse, ListSkuGroupsPagedResponse>
      listSkuGroupsSettings() {
    return listSkuGroupsSettings;
  }

  /** Returns the object with the settings used for calls to listSkuGroupBillableSkus. */
  public PagedCallSettings<
          ListSkuGroupBillableSkusRequest,
          ListSkuGroupBillableSkusResponse,
          ListSkuGroupBillableSkusPagedResponse>
      listSkuGroupBillableSkusSettings() {
    return listSkuGroupBillableSkusSettings;
  }

  /** Returns the object with the settings used for calls to lookupOffer. */
  public UnaryCallSettings<LookupOfferRequest, Offer> lookupOfferSettings() {
    return lookupOfferSettings;
  }

  /** Returns the object with the settings used for calls to listProducts. */
  public PagedCallSettings<ListProductsRequest, ListProductsResponse, ListProductsPagedResponse>
      listProductsSettings() {
    return listProductsSettings;
  }

  /** Returns the object with the settings used for calls to listSkus. */
  public PagedCallSettings<ListSkusRequest, ListSkusResponse, ListSkusPagedResponse>
      listSkusSettings() {
    return listSkusSettings;
  }

  /** Returns the object with the settings used for calls to listOffers. */
  public PagedCallSettings<ListOffersRequest, ListOffersResponse, ListOffersPagedResponse>
      listOffersSettings() {
    return listOffersSettings;
  }

  /** Returns the object with the settings used for calls to listPurchasableSkus. */
  public PagedCallSettings<
          ListPurchasableSkusRequest, ListPurchasableSkusResponse, ListPurchasableSkusPagedResponse>
      listPurchasableSkusSettings() {
    return listPurchasableSkusSettings;
  }

  /** Returns the object with the settings used for calls to listPurchasableOffers. */
  public PagedCallSettings<
          ListPurchasableOffersRequest,
          ListPurchasableOffersResponse,
          ListPurchasableOffersPagedResponse>
      listPurchasableOffersSettings() {
    return listPurchasableOffersSettings;
  }

  /** Returns the object with the settings used for calls to queryEligibleBillingAccounts. */
  public UnaryCallSettings<
          QueryEligibleBillingAccountsRequest, QueryEligibleBillingAccountsResponse>
      queryEligibleBillingAccountsSettings() {
    return queryEligibleBillingAccountsSettings;
  }

  /** Returns the object with the settings used for calls to registerSubscriber. */
  public UnaryCallSettings<RegisterSubscriberRequest, RegisterSubscriberResponse>
      registerSubscriberSettings() {
    return registerSubscriberSettings;
  }

  /** Returns the object with the settings used for calls to unregisterSubscriber. */
  public UnaryCallSettings<UnregisterSubscriberRequest, UnregisterSubscriberResponse>
      unregisterSubscriberSettings() {
    return unregisterSubscriberSettings;
  }

  /** Returns the object with the settings used for calls to listSubscribers. */
  public PagedCallSettings<
          ListSubscribersRequest, ListSubscribersResponse, ListSubscribersPagedResponse>
      listSubscribersSettings() {
    return listSubscribersSettings;
  }

  /** Returns the object with the settings used for calls to listEntitlementChanges. */
  public PagedCallSettings<
          ListEntitlementChangesRequest,
          ListEntitlementChangesResponse,
          ListEntitlementChangesPagedResponse>
      listEntitlementChangesSettings() {
    return listEntitlementChangesSettings;
  }

  public CloudChannelServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcCloudChannelServiceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonCloudChannelServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "cloudchannel";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "cloudchannel.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "cloudchannel.mtls.googleapis.com:443";
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
            "gapic", GaxProperties.getLibraryVersion(CloudChannelServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(CloudChannelServiceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return CloudChannelServiceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected CloudChannelServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listCustomersSettings = settingsBuilder.listCustomersSettings().build();
    getCustomerSettings = settingsBuilder.getCustomerSettings().build();
    checkCloudIdentityAccountsExistSettings =
        settingsBuilder.checkCloudIdentityAccountsExistSettings().build();
    createCustomerSettings = settingsBuilder.createCustomerSettings().build();
    updateCustomerSettings = settingsBuilder.updateCustomerSettings().build();
    deleteCustomerSettings = settingsBuilder.deleteCustomerSettings().build();
    importCustomerSettings = settingsBuilder.importCustomerSettings().build();
    provisionCloudIdentitySettings = settingsBuilder.provisionCloudIdentitySettings().build();
    provisionCloudIdentityOperationSettings =
        settingsBuilder.provisionCloudIdentityOperationSettings().build();
    listEntitlementsSettings = settingsBuilder.listEntitlementsSettings().build();
    listTransferableSkusSettings = settingsBuilder.listTransferableSkusSettings().build();
    listTransferableOffersSettings = settingsBuilder.listTransferableOffersSettings().build();
    getEntitlementSettings = settingsBuilder.getEntitlementSettings().build();
    createEntitlementSettings = settingsBuilder.createEntitlementSettings().build();
    createEntitlementOperationSettings =
        settingsBuilder.createEntitlementOperationSettings().build();
    changeParametersSettings = settingsBuilder.changeParametersSettings().build();
    changeParametersOperationSettings = settingsBuilder.changeParametersOperationSettings().build();
    changeRenewalSettingsSettings = settingsBuilder.changeRenewalSettingsSettings().build();
    changeRenewalSettingsOperationSettings =
        settingsBuilder.changeRenewalSettingsOperationSettings().build();
    changeOfferSettings = settingsBuilder.changeOfferSettings().build();
    changeOfferOperationSettings = settingsBuilder.changeOfferOperationSettings().build();
    startPaidServiceSettings = settingsBuilder.startPaidServiceSettings().build();
    startPaidServiceOperationSettings = settingsBuilder.startPaidServiceOperationSettings().build();
    suspendEntitlementSettings = settingsBuilder.suspendEntitlementSettings().build();
    suspendEntitlementOperationSettings =
        settingsBuilder.suspendEntitlementOperationSettings().build();
    cancelEntitlementSettings = settingsBuilder.cancelEntitlementSettings().build();
    cancelEntitlementOperationSettings =
        settingsBuilder.cancelEntitlementOperationSettings().build();
    activateEntitlementSettings = settingsBuilder.activateEntitlementSettings().build();
    activateEntitlementOperationSettings =
        settingsBuilder.activateEntitlementOperationSettings().build();
    transferEntitlementsSettings = settingsBuilder.transferEntitlementsSettings().build();
    transferEntitlementsOperationSettings =
        settingsBuilder.transferEntitlementsOperationSettings().build();
    transferEntitlementsToGoogleSettings =
        settingsBuilder.transferEntitlementsToGoogleSettings().build();
    transferEntitlementsToGoogleOperationSettings =
        settingsBuilder.transferEntitlementsToGoogleOperationSettings().build();
    listChannelPartnerLinksSettings = settingsBuilder.listChannelPartnerLinksSettings().build();
    getChannelPartnerLinkSettings = settingsBuilder.getChannelPartnerLinkSettings().build();
    createChannelPartnerLinkSettings = settingsBuilder.createChannelPartnerLinkSettings().build();
    updateChannelPartnerLinkSettings = settingsBuilder.updateChannelPartnerLinkSettings().build();
    getCustomerRepricingConfigSettings =
        settingsBuilder.getCustomerRepricingConfigSettings().build();
    listCustomerRepricingConfigsSettings =
        settingsBuilder.listCustomerRepricingConfigsSettings().build();
    createCustomerRepricingConfigSettings =
        settingsBuilder.createCustomerRepricingConfigSettings().build();
    updateCustomerRepricingConfigSettings =
        settingsBuilder.updateCustomerRepricingConfigSettings().build();
    deleteCustomerRepricingConfigSettings =
        settingsBuilder.deleteCustomerRepricingConfigSettings().build();
    getChannelPartnerRepricingConfigSettings =
        settingsBuilder.getChannelPartnerRepricingConfigSettings().build();
    listChannelPartnerRepricingConfigsSettings =
        settingsBuilder.listChannelPartnerRepricingConfigsSettings().build();
    createChannelPartnerRepricingConfigSettings =
        settingsBuilder.createChannelPartnerRepricingConfigSettings().build();
    updateChannelPartnerRepricingConfigSettings =
        settingsBuilder.updateChannelPartnerRepricingConfigSettings().build();
    deleteChannelPartnerRepricingConfigSettings =
        settingsBuilder.deleteChannelPartnerRepricingConfigSettings().build();
    listSkuGroupsSettings = settingsBuilder.listSkuGroupsSettings().build();
    listSkuGroupBillableSkusSettings = settingsBuilder.listSkuGroupBillableSkusSettings().build();
    lookupOfferSettings = settingsBuilder.lookupOfferSettings().build();
    listProductsSettings = settingsBuilder.listProductsSettings().build();
    listSkusSettings = settingsBuilder.listSkusSettings().build();
    listOffersSettings = settingsBuilder.listOffersSettings().build();
    listPurchasableSkusSettings = settingsBuilder.listPurchasableSkusSettings().build();
    listPurchasableOffersSettings = settingsBuilder.listPurchasableOffersSettings().build();
    queryEligibleBillingAccountsSettings =
        settingsBuilder.queryEligibleBillingAccountsSettings().build();
    registerSubscriberSettings = settingsBuilder.registerSubscriberSettings().build();
    unregisterSubscriberSettings = settingsBuilder.unregisterSubscriberSettings().build();
    listSubscribersSettings = settingsBuilder.listSubscribersSettings().build();
    listEntitlementChangesSettings = settingsBuilder.listEntitlementChangesSettings().build();
  }

  /** Builder for CloudChannelServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<CloudChannelServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListCustomersRequest, ListCustomersResponse, ListCustomersPagedResponse>
        listCustomersSettings;
    private final UnaryCallSettings.Builder<GetCustomerRequest, Customer> getCustomerSettings;
    private final UnaryCallSettings.Builder<
            CheckCloudIdentityAccountsExistRequest, CheckCloudIdentityAccountsExistResponse>
        checkCloudIdentityAccountsExistSettings;
    private final UnaryCallSettings.Builder<CreateCustomerRequest, Customer> createCustomerSettings;
    private final UnaryCallSettings.Builder<UpdateCustomerRequest, Customer> updateCustomerSettings;
    private final UnaryCallSettings.Builder<DeleteCustomerRequest, Empty> deleteCustomerSettings;
    private final UnaryCallSettings.Builder<ImportCustomerRequest, Customer> importCustomerSettings;
    private final UnaryCallSettings.Builder<ProvisionCloudIdentityRequest, Operation>
        provisionCloudIdentitySettings;
    private final OperationCallSettings.Builder<
            ProvisionCloudIdentityRequest, Customer, OperationMetadata>
        provisionCloudIdentityOperationSettings;
    private final PagedCallSettings.Builder<
            ListEntitlementsRequest, ListEntitlementsResponse, ListEntitlementsPagedResponse>
        listEntitlementsSettings;
    private final PagedCallSettings.Builder<
            ListTransferableSkusRequest,
            ListTransferableSkusResponse,
            ListTransferableSkusPagedResponse>
        listTransferableSkusSettings;
    private final PagedCallSettings.Builder<
            ListTransferableOffersRequest,
            ListTransferableOffersResponse,
            ListTransferableOffersPagedResponse>
        listTransferableOffersSettings;
    private final UnaryCallSettings.Builder<GetEntitlementRequest, Entitlement>
        getEntitlementSettings;
    private final UnaryCallSettings.Builder<CreateEntitlementRequest, Operation>
        createEntitlementSettings;
    private final OperationCallSettings.Builder<
            CreateEntitlementRequest, Entitlement, OperationMetadata>
        createEntitlementOperationSettings;
    private final UnaryCallSettings.Builder<ChangeParametersRequest, Operation>
        changeParametersSettings;
    private final OperationCallSettings.Builder<
            ChangeParametersRequest, Entitlement, OperationMetadata>
        changeParametersOperationSettings;
    private final UnaryCallSettings.Builder<ChangeRenewalSettingsRequest, Operation>
        changeRenewalSettingsSettings;
    private final OperationCallSettings.Builder<
            ChangeRenewalSettingsRequest, Entitlement, OperationMetadata>
        changeRenewalSettingsOperationSettings;
    private final UnaryCallSettings.Builder<ChangeOfferRequest, Operation> changeOfferSettings;
    private final OperationCallSettings.Builder<ChangeOfferRequest, Entitlement, OperationMetadata>
        changeOfferOperationSettings;
    private final UnaryCallSettings.Builder<StartPaidServiceRequest, Operation>
        startPaidServiceSettings;
    private final OperationCallSettings.Builder<
            StartPaidServiceRequest, Entitlement, OperationMetadata>
        startPaidServiceOperationSettings;
    private final UnaryCallSettings.Builder<SuspendEntitlementRequest, Operation>
        suspendEntitlementSettings;
    private final OperationCallSettings.Builder<
            SuspendEntitlementRequest, Entitlement, OperationMetadata>
        suspendEntitlementOperationSettings;
    private final UnaryCallSettings.Builder<CancelEntitlementRequest, Operation>
        cancelEntitlementSettings;
    private final OperationCallSettings.Builder<CancelEntitlementRequest, Empty, OperationMetadata>
        cancelEntitlementOperationSettings;
    private final UnaryCallSettings.Builder<ActivateEntitlementRequest, Operation>
        activateEntitlementSettings;
    private final OperationCallSettings.Builder<
            ActivateEntitlementRequest, Entitlement, OperationMetadata>
        activateEntitlementOperationSettings;
    private final UnaryCallSettings.Builder<TransferEntitlementsRequest, Operation>
        transferEntitlementsSettings;
    private final OperationCallSettings.Builder<
            TransferEntitlementsRequest, TransferEntitlementsResponse, OperationMetadata>
        transferEntitlementsOperationSettings;
    private final UnaryCallSettings.Builder<TransferEntitlementsToGoogleRequest, Operation>
        transferEntitlementsToGoogleSettings;
    private final OperationCallSettings.Builder<
            TransferEntitlementsToGoogleRequest, Empty, OperationMetadata>
        transferEntitlementsToGoogleOperationSettings;
    private final PagedCallSettings.Builder<
            ListChannelPartnerLinksRequest,
            ListChannelPartnerLinksResponse,
            ListChannelPartnerLinksPagedResponse>
        listChannelPartnerLinksSettings;
    private final UnaryCallSettings.Builder<GetChannelPartnerLinkRequest, ChannelPartnerLink>
        getChannelPartnerLinkSettings;
    private final UnaryCallSettings.Builder<CreateChannelPartnerLinkRequest, ChannelPartnerLink>
        createChannelPartnerLinkSettings;
    private final UnaryCallSettings.Builder<UpdateChannelPartnerLinkRequest, ChannelPartnerLink>
        updateChannelPartnerLinkSettings;
    private final UnaryCallSettings.Builder<
            GetCustomerRepricingConfigRequest, CustomerRepricingConfig>
        getCustomerRepricingConfigSettings;
    private final PagedCallSettings.Builder<
            ListCustomerRepricingConfigsRequest,
            ListCustomerRepricingConfigsResponse,
            ListCustomerRepricingConfigsPagedResponse>
        listCustomerRepricingConfigsSettings;
    private final UnaryCallSettings.Builder<
            CreateCustomerRepricingConfigRequest, CustomerRepricingConfig>
        createCustomerRepricingConfigSettings;
    private final UnaryCallSettings.Builder<
            UpdateCustomerRepricingConfigRequest, CustomerRepricingConfig>
        updateCustomerRepricingConfigSettings;
    private final UnaryCallSettings.Builder<DeleteCustomerRepricingConfigRequest, Empty>
        deleteCustomerRepricingConfigSettings;
    private final UnaryCallSettings.Builder<
            GetChannelPartnerRepricingConfigRequest, ChannelPartnerRepricingConfig>
        getChannelPartnerRepricingConfigSettings;
    private final PagedCallSettings.Builder<
            ListChannelPartnerRepricingConfigsRequest,
            ListChannelPartnerRepricingConfigsResponse,
            ListChannelPartnerRepricingConfigsPagedResponse>
        listChannelPartnerRepricingConfigsSettings;
    private final UnaryCallSettings.Builder<
            CreateChannelPartnerRepricingConfigRequest, ChannelPartnerRepricingConfig>
        createChannelPartnerRepricingConfigSettings;
    private final UnaryCallSettings.Builder<
            UpdateChannelPartnerRepricingConfigRequest, ChannelPartnerRepricingConfig>
        updateChannelPartnerRepricingConfigSettings;
    private final UnaryCallSettings.Builder<DeleteChannelPartnerRepricingConfigRequest, Empty>
        deleteChannelPartnerRepricingConfigSettings;
    private final PagedCallSettings.Builder<
            ListSkuGroupsRequest, ListSkuGroupsResponse, ListSkuGroupsPagedResponse>
        listSkuGroupsSettings;
    private final PagedCallSettings.Builder<
            ListSkuGroupBillableSkusRequest,
            ListSkuGroupBillableSkusResponse,
            ListSkuGroupBillableSkusPagedResponse>
        listSkuGroupBillableSkusSettings;
    private final UnaryCallSettings.Builder<LookupOfferRequest, Offer> lookupOfferSettings;
    private final PagedCallSettings.Builder<
            ListProductsRequest, ListProductsResponse, ListProductsPagedResponse>
        listProductsSettings;
    private final PagedCallSettings.Builder<
            ListSkusRequest, ListSkusResponse, ListSkusPagedResponse>
        listSkusSettings;
    private final PagedCallSettings.Builder<
            ListOffersRequest, ListOffersResponse, ListOffersPagedResponse>
        listOffersSettings;
    private final PagedCallSettings.Builder<
            ListPurchasableSkusRequest,
            ListPurchasableSkusResponse,
            ListPurchasableSkusPagedResponse>
        listPurchasableSkusSettings;
    private final PagedCallSettings.Builder<
            ListPurchasableOffersRequest,
            ListPurchasableOffersResponse,
            ListPurchasableOffersPagedResponse>
        listPurchasableOffersSettings;
    private final UnaryCallSettings.Builder<
            QueryEligibleBillingAccountsRequest, QueryEligibleBillingAccountsResponse>
        queryEligibleBillingAccountsSettings;
    private final UnaryCallSettings.Builder<RegisterSubscriberRequest, RegisterSubscriberResponse>
        registerSubscriberSettings;
    private final UnaryCallSettings.Builder<
            UnregisterSubscriberRequest, UnregisterSubscriberResponse>
        unregisterSubscriberSettings;
    private final PagedCallSettings.Builder<
            ListSubscribersRequest, ListSubscribersResponse, ListSubscribersPagedResponse>
        listSubscribersSettings;
    private final PagedCallSettings.Builder<
            ListEntitlementChangesRequest,
            ListEntitlementChangesResponse,
            ListEntitlementChangesPagedResponse>
        listEntitlementChangesSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(10000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setTotalTimeoutDuration(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setTotalTimeoutDuration(Duration.ofMillis(60000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listCustomersSettings = PagedCallSettings.newBuilder(LIST_CUSTOMERS_PAGE_STR_FACT);
      getCustomerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      checkCloudIdentityAccountsExistSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createCustomerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateCustomerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteCustomerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      importCustomerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      provisionCloudIdentitySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      provisionCloudIdentityOperationSettings = OperationCallSettings.newBuilder();
      listEntitlementsSettings = PagedCallSettings.newBuilder(LIST_ENTITLEMENTS_PAGE_STR_FACT);
      listTransferableSkusSettings =
          PagedCallSettings.newBuilder(LIST_TRANSFERABLE_SKUS_PAGE_STR_FACT);
      listTransferableOffersSettings =
          PagedCallSettings.newBuilder(LIST_TRANSFERABLE_OFFERS_PAGE_STR_FACT);
      getEntitlementSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createEntitlementSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createEntitlementOperationSettings = OperationCallSettings.newBuilder();
      changeParametersSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      changeParametersOperationSettings = OperationCallSettings.newBuilder();
      changeRenewalSettingsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      changeRenewalSettingsOperationSettings = OperationCallSettings.newBuilder();
      changeOfferSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      changeOfferOperationSettings = OperationCallSettings.newBuilder();
      startPaidServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      startPaidServiceOperationSettings = OperationCallSettings.newBuilder();
      suspendEntitlementSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      suspendEntitlementOperationSettings = OperationCallSettings.newBuilder();
      cancelEntitlementSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      cancelEntitlementOperationSettings = OperationCallSettings.newBuilder();
      activateEntitlementSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      activateEntitlementOperationSettings = OperationCallSettings.newBuilder();
      transferEntitlementsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      transferEntitlementsOperationSettings = OperationCallSettings.newBuilder();
      transferEntitlementsToGoogleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      transferEntitlementsToGoogleOperationSettings = OperationCallSettings.newBuilder();
      listChannelPartnerLinksSettings =
          PagedCallSettings.newBuilder(LIST_CHANNEL_PARTNER_LINKS_PAGE_STR_FACT);
      getChannelPartnerLinkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createChannelPartnerLinkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateChannelPartnerLinkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getCustomerRepricingConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listCustomerRepricingConfigsSettings =
          PagedCallSettings.newBuilder(LIST_CUSTOMER_REPRICING_CONFIGS_PAGE_STR_FACT);
      createCustomerRepricingConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateCustomerRepricingConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteCustomerRepricingConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getChannelPartnerRepricingConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listChannelPartnerRepricingConfigsSettings =
          PagedCallSettings.newBuilder(LIST_CHANNEL_PARTNER_REPRICING_CONFIGS_PAGE_STR_FACT);
      createChannelPartnerRepricingConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateChannelPartnerRepricingConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteChannelPartnerRepricingConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listSkuGroupsSettings = PagedCallSettings.newBuilder(LIST_SKU_GROUPS_PAGE_STR_FACT);
      listSkuGroupBillableSkusSettings =
          PagedCallSettings.newBuilder(LIST_SKU_GROUP_BILLABLE_SKUS_PAGE_STR_FACT);
      lookupOfferSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listProductsSettings = PagedCallSettings.newBuilder(LIST_PRODUCTS_PAGE_STR_FACT);
      listSkusSettings = PagedCallSettings.newBuilder(LIST_SKUS_PAGE_STR_FACT);
      listOffersSettings = PagedCallSettings.newBuilder(LIST_OFFERS_PAGE_STR_FACT);
      listPurchasableSkusSettings =
          PagedCallSettings.newBuilder(LIST_PURCHASABLE_SKUS_PAGE_STR_FACT);
      listPurchasableOffersSettings =
          PagedCallSettings.newBuilder(LIST_PURCHASABLE_OFFERS_PAGE_STR_FACT);
      queryEligibleBillingAccountsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      registerSubscriberSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      unregisterSubscriberSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listSubscribersSettings = PagedCallSettings.newBuilder(LIST_SUBSCRIBERS_PAGE_STR_FACT);
      listEntitlementChangesSettings =
          PagedCallSettings.newBuilder(LIST_ENTITLEMENT_CHANGES_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listCustomersSettings,
              getCustomerSettings,
              checkCloudIdentityAccountsExistSettings,
              createCustomerSettings,
              updateCustomerSettings,
              deleteCustomerSettings,
              importCustomerSettings,
              provisionCloudIdentitySettings,
              listEntitlementsSettings,
              listTransferableSkusSettings,
              listTransferableOffersSettings,
              getEntitlementSettings,
              createEntitlementSettings,
              changeParametersSettings,
              changeRenewalSettingsSettings,
              changeOfferSettings,
              startPaidServiceSettings,
              suspendEntitlementSettings,
              cancelEntitlementSettings,
              activateEntitlementSettings,
              transferEntitlementsSettings,
              transferEntitlementsToGoogleSettings,
              listChannelPartnerLinksSettings,
              getChannelPartnerLinkSettings,
              createChannelPartnerLinkSettings,
              updateChannelPartnerLinkSettings,
              getCustomerRepricingConfigSettings,
              listCustomerRepricingConfigsSettings,
              createCustomerRepricingConfigSettings,
              updateCustomerRepricingConfigSettings,
              deleteCustomerRepricingConfigSettings,
              getChannelPartnerRepricingConfigSettings,
              listChannelPartnerRepricingConfigsSettings,
              createChannelPartnerRepricingConfigSettings,
              updateChannelPartnerRepricingConfigSettings,
              deleteChannelPartnerRepricingConfigSettings,
              listSkuGroupsSettings,
              listSkuGroupBillableSkusSettings,
              lookupOfferSettings,
              listProductsSettings,
              listSkusSettings,
              listOffersSettings,
              listPurchasableSkusSettings,
              listPurchasableOffersSettings,
              queryEligibleBillingAccountsSettings,
              registerSubscriberSettings,
              unregisterSubscriberSettings,
              listSubscribersSettings,
              listEntitlementChangesSettings);
      initDefaults(this);
    }

    protected Builder(CloudChannelServiceStubSettings settings) {
      super(settings);

      listCustomersSettings = settings.listCustomersSettings.toBuilder();
      getCustomerSettings = settings.getCustomerSettings.toBuilder();
      checkCloudIdentityAccountsExistSettings =
          settings.checkCloudIdentityAccountsExistSettings.toBuilder();
      createCustomerSettings = settings.createCustomerSettings.toBuilder();
      updateCustomerSettings = settings.updateCustomerSettings.toBuilder();
      deleteCustomerSettings = settings.deleteCustomerSettings.toBuilder();
      importCustomerSettings = settings.importCustomerSettings.toBuilder();
      provisionCloudIdentitySettings = settings.provisionCloudIdentitySettings.toBuilder();
      provisionCloudIdentityOperationSettings =
          settings.provisionCloudIdentityOperationSettings.toBuilder();
      listEntitlementsSettings = settings.listEntitlementsSettings.toBuilder();
      listTransferableSkusSettings = settings.listTransferableSkusSettings.toBuilder();
      listTransferableOffersSettings = settings.listTransferableOffersSettings.toBuilder();
      getEntitlementSettings = settings.getEntitlementSettings.toBuilder();
      createEntitlementSettings = settings.createEntitlementSettings.toBuilder();
      createEntitlementOperationSettings = settings.createEntitlementOperationSettings.toBuilder();
      changeParametersSettings = settings.changeParametersSettings.toBuilder();
      changeParametersOperationSettings = settings.changeParametersOperationSettings.toBuilder();
      changeRenewalSettingsSettings = settings.changeRenewalSettingsSettings.toBuilder();
      changeRenewalSettingsOperationSettings =
          settings.changeRenewalSettingsOperationSettings.toBuilder();
      changeOfferSettings = settings.changeOfferSettings.toBuilder();
      changeOfferOperationSettings = settings.changeOfferOperationSettings.toBuilder();
      startPaidServiceSettings = settings.startPaidServiceSettings.toBuilder();
      startPaidServiceOperationSettings = settings.startPaidServiceOperationSettings.toBuilder();
      suspendEntitlementSettings = settings.suspendEntitlementSettings.toBuilder();
      suspendEntitlementOperationSettings =
          settings.suspendEntitlementOperationSettings.toBuilder();
      cancelEntitlementSettings = settings.cancelEntitlementSettings.toBuilder();
      cancelEntitlementOperationSettings = settings.cancelEntitlementOperationSettings.toBuilder();
      activateEntitlementSettings = settings.activateEntitlementSettings.toBuilder();
      activateEntitlementOperationSettings =
          settings.activateEntitlementOperationSettings.toBuilder();
      transferEntitlementsSettings = settings.transferEntitlementsSettings.toBuilder();
      transferEntitlementsOperationSettings =
          settings.transferEntitlementsOperationSettings.toBuilder();
      transferEntitlementsToGoogleSettings =
          settings.transferEntitlementsToGoogleSettings.toBuilder();
      transferEntitlementsToGoogleOperationSettings =
          settings.transferEntitlementsToGoogleOperationSettings.toBuilder();
      listChannelPartnerLinksSettings = settings.listChannelPartnerLinksSettings.toBuilder();
      getChannelPartnerLinkSettings = settings.getChannelPartnerLinkSettings.toBuilder();
      createChannelPartnerLinkSettings = settings.createChannelPartnerLinkSettings.toBuilder();
      updateChannelPartnerLinkSettings = settings.updateChannelPartnerLinkSettings.toBuilder();
      getCustomerRepricingConfigSettings = settings.getCustomerRepricingConfigSettings.toBuilder();
      listCustomerRepricingConfigsSettings =
          settings.listCustomerRepricingConfigsSettings.toBuilder();
      createCustomerRepricingConfigSettings =
          settings.createCustomerRepricingConfigSettings.toBuilder();
      updateCustomerRepricingConfigSettings =
          settings.updateCustomerRepricingConfigSettings.toBuilder();
      deleteCustomerRepricingConfigSettings =
          settings.deleteCustomerRepricingConfigSettings.toBuilder();
      getChannelPartnerRepricingConfigSettings =
          settings.getChannelPartnerRepricingConfigSettings.toBuilder();
      listChannelPartnerRepricingConfigsSettings =
          settings.listChannelPartnerRepricingConfigsSettings.toBuilder();
      createChannelPartnerRepricingConfigSettings =
          settings.createChannelPartnerRepricingConfigSettings.toBuilder();
      updateChannelPartnerRepricingConfigSettings =
          settings.updateChannelPartnerRepricingConfigSettings.toBuilder();
      deleteChannelPartnerRepricingConfigSettings =
          settings.deleteChannelPartnerRepricingConfigSettings.toBuilder();
      listSkuGroupsSettings = settings.listSkuGroupsSettings.toBuilder();
      listSkuGroupBillableSkusSettings = settings.listSkuGroupBillableSkusSettings.toBuilder();
      lookupOfferSettings = settings.lookupOfferSettings.toBuilder();
      listProductsSettings = settings.listProductsSettings.toBuilder();
      listSkusSettings = settings.listSkusSettings.toBuilder();
      listOffersSettings = settings.listOffersSettings.toBuilder();
      listPurchasableSkusSettings = settings.listPurchasableSkusSettings.toBuilder();
      listPurchasableOffersSettings = settings.listPurchasableOffersSettings.toBuilder();
      queryEligibleBillingAccountsSettings =
          settings.queryEligibleBillingAccountsSettings.toBuilder();
      registerSubscriberSettings = settings.registerSubscriberSettings.toBuilder();
      unregisterSubscriberSettings = settings.unregisterSubscriberSettings.toBuilder();
      listSubscribersSettings = settings.listSubscribersSettings.toBuilder();
      listEntitlementChangesSettings = settings.listEntitlementChangesSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listCustomersSettings,
              getCustomerSettings,
              checkCloudIdentityAccountsExistSettings,
              createCustomerSettings,
              updateCustomerSettings,
              deleteCustomerSettings,
              importCustomerSettings,
              provisionCloudIdentitySettings,
              listEntitlementsSettings,
              listTransferableSkusSettings,
              listTransferableOffersSettings,
              getEntitlementSettings,
              createEntitlementSettings,
              changeParametersSettings,
              changeRenewalSettingsSettings,
              changeOfferSettings,
              startPaidServiceSettings,
              suspendEntitlementSettings,
              cancelEntitlementSettings,
              activateEntitlementSettings,
              transferEntitlementsSettings,
              transferEntitlementsToGoogleSettings,
              listChannelPartnerLinksSettings,
              getChannelPartnerLinkSettings,
              createChannelPartnerLinkSettings,
              updateChannelPartnerLinkSettings,
              getCustomerRepricingConfigSettings,
              listCustomerRepricingConfigsSettings,
              createCustomerRepricingConfigSettings,
              updateCustomerRepricingConfigSettings,
              deleteCustomerRepricingConfigSettings,
              getChannelPartnerRepricingConfigSettings,
              listChannelPartnerRepricingConfigsSettings,
              createChannelPartnerRepricingConfigSettings,
              updateChannelPartnerRepricingConfigSettings,
              deleteChannelPartnerRepricingConfigSettings,
              listSkuGroupsSettings,
              listSkuGroupBillableSkusSettings,
              lookupOfferSettings,
              listProductsSettings,
              listSkusSettings,
              listOffersSettings,
              listPurchasableSkusSettings,
              listPurchasableOffersSettings,
              queryEligibleBillingAccountsSettings,
              registerSubscriberSettings,
              unregisterSubscriberSettings,
              listSubscribersSettings,
              listEntitlementChangesSettings);
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
          .listCustomersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getCustomerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .checkCloudIdentityAccountsExistSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createCustomerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateCustomerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteCustomerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .importCustomerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .provisionCloudIdentitySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listEntitlementsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listTransferableSkusSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listTransferableOffersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getEntitlementSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createEntitlementSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .changeParametersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .changeRenewalSettingsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .changeOfferSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .startPaidServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .suspendEntitlementSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .cancelEntitlementSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .activateEntitlementSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .transferEntitlementsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .transferEntitlementsToGoogleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listChannelPartnerLinksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getChannelPartnerLinkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createChannelPartnerLinkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateChannelPartnerLinkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getCustomerRepricingConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listCustomerRepricingConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createCustomerRepricingConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateCustomerRepricingConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteCustomerRepricingConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getChannelPartnerRepricingConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listChannelPartnerRepricingConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createChannelPartnerRepricingConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateChannelPartnerRepricingConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteChannelPartnerRepricingConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listSkuGroupsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listSkuGroupBillableSkusSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .lookupOfferSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listProductsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listSkusSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listOffersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listPurchasableSkusSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listPurchasableOffersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .queryEligibleBillingAccountsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .registerSubscriberSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .unregisterSubscriberSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listSubscribersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listEntitlementChangesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .provisionCloudIdentityOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ProvisionCloudIdentityRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Customer.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .createEntitlementOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateEntitlementRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Entitlement.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .changeParametersOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ChangeParametersRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Entitlement.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .changeRenewalSettingsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ChangeRenewalSettingsRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Entitlement.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .changeOfferOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<ChangeOfferRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Entitlement.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .startPaidServiceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<StartPaidServiceRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Entitlement.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .suspendEntitlementOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SuspendEntitlementRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Entitlement.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .cancelEntitlementOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CancelEntitlementRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .activateEntitlementOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ActivateEntitlementRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Entitlement.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .transferEntitlementsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<TransferEntitlementsRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  TransferEntitlementsResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .transferEntitlementsToGoogleOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<TransferEntitlementsToGoogleRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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

    /** Returns the builder for the settings used for calls to listCustomers. */
    public PagedCallSettings.Builder<
            ListCustomersRequest, ListCustomersResponse, ListCustomersPagedResponse>
        listCustomersSettings() {
      return listCustomersSettings;
    }

    /** Returns the builder for the settings used for calls to getCustomer. */
    public UnaryCallSettings.Builder<GetCustomerRequest, Customer> getCustomerSettings() {
      return getCustomerSettings;
    }

    /** Returns the builder for the settings used for calls to checkCloudIdentityAccountsExist. */
    public UnaryCallSettings.Builder<
            CheckCloudIdentityAccountsExistRequest, CheckCloudIdentityAccountsExistResponse>
        checkCloudIdentityAccountsExistSettings() {
      return checkCloudIdentityAccountsExistSettings;
    }

    /** Returns the builder for the settings used for calls to createCustomer. */
    public UnaryCallSettings.Builder<CreateCustomerRequest, Customer> createCustomerSettings() {
      return createCustomerSettings;
    }

    /** Returns the builder for the settings used for calls to updateCustomer. */
    public UnaryCallSettings.Builder<UpdateCustomerRequest, Customer> updateCustomerSettings() {
      return updateCustomerSettings;
    }

    /** Returns the builder for the settings used for calls to deleteCustomer. */
    public UnaryCallSettings.Builder<DeleteCustomerRequest, Empty> deleteCustomerSettings() {
      return deleteCustomerSettings;
    }

    /** Returns the builder for the settings used for calls to importCustomer. */
    public UnaryCallSettings.Builder<ImportCustomerRequest, Customer> importCustomerSettings() {
      return importCustomerSettings;
    }

    /** Returns the builder for the settings used for calls to provisionCloudIdentity. */
    public UnaryCallSettings.Builder<ProvisionCloudIdentityRequest, Operation>
        provisionCloudIdentitySettings() {
      return provisionCloudIdentitySettings;
    }

    /** Returns the builder for the settings used for calls to provisionCloudIdentity. */
    public OperationCallSettings.Builder<ProvisionCloudIdentityRequest, Customer, OperationMetadata>
        provisionCloudIdentityOperationSettings() {
      return provisionCloudIdentityOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listEntitlements. */
    public PagedCallSettings.Builder<
            ListEntitlementsRequest, ListEntitlementsResponse, ListEntitlementsPagedResponse>
        listEntitlementsSettings() {
      return listEntitlementsSettings;
    }

    /** Returns the builder for the settings used for calls to listTransferableSkus. */
    public PagedCallSettings.Builder<
            ListTransferableSkusRequest,
            ListTransferableSkusResponse,
            ListTransferableSkusPagedResponse>
        listTransferableSkusSettings() {
      return listTransferableSkusSettings;
    }

    /** Returns the builder for the settings used for calls to listTransferableOffers. */
    public PagedCallSettings.Builder<
            ListTransferableOffersRequest,
            ListTransferableOffersResponse,
            ListTransferableOffersPagedResponse>
        listTransferableOffersSettings() {
      return listTransferableOffersSettings;
    }

    /** Returns the builder for the settings used for calls to getEntitlement. */
    public UnaryCallSettings.Builder<GetEntitlementRequest, Entitlement> getEntitlementSettings() {
      return getEntitlementSettings;
    }

    /** Returns the builder for the settings used for calls to createEntitlement. */
    public UnaryCallSettings.Builder<CreateEntitlementRequest, Operation>
        createEntitlementSettings() {
      return createEntitlementSettings;
    }

    /** Returns the builder for the settings used for calls to createEntitlement. */
    public OperationCallSettings.Builder<CreateEntitlementRequest, Entitlement, OperationMetadata>
        createEntitlementOperationSettings() {
      return createEntitlementOperationSettings;
    }

    /** Returns the builder for the settings used for calls to changeParameters. */
    public UnaryCallSettings.Builder<ChangeParametersRequest, Operation>
        changeParametersSettings() {
      return changeParametersSettings;
    }

    /** Returns the builder for the settings used for calls to changeParameters. */
    public OperationCallSettings.Builder<ChangeParametersRequest, Entitlement, OperationMetadata>
        changeParametersOperationSettings() {
      return changeParametersOperationSettings;
    }

    /** Returns the builder for the settings used for calls to changeRenewalSettings. */
    public UnaryCallSettings.Builder<ChangeRenewalSettingsRequest, Operation>
        changeRenewalSettingsSettings() {
      return changeRenewalSettingsSettings;
    }

    /** Returns the builder for the settings used for calls to changeRenewalSettings. */
    public OperationCallSettings.Builder<
            ChangeRenewalSettingsRequest, Entitlement, OperationMetadata>
        changeRenewalSettingsOperationSettings() {
      return changeRenewalSettingsOperationSettings;
    }

    /** Returns the builder for the settings used for calls to changeOffer. */
    public UnaryCallSettings.Builder<ChangeOfferRequest, Operation> changeOfferSettings() {
      return changeOfferSettings;
    }

    /** Returns the builder for the settings used for calls to changeOffer. */
    public OperationCallSettings.Builder<ChangeOfferRequest, Entitlement, OperationMetadata>
        changeOfferOperationSettings() {
      return changeOfferOperationSettings;
    }

    /** Returns the builder for the settings used for calls to startPaidService. */
    public UnaryCallSettings.Builder<StartPaidServiceRequest, Operation>
        startPaidServiceSettings() {
      return startPaidServiceSettings;
    }

    /** Returns the builder for the settings used for calls to startPaidService. */
    public OperationCallSettings.Builder<StartPaidServiceRequest, Entitlement, OperationMetadata>
        startPaidServiceOperationSettings() {
      return startPaidServiceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to suspendEntitlement. */
    public UnaryCallSettings.Builder<SuspendEntitlementRequest, Operation>
        suspendEntitlementSettings() {
      return suspendEntitlementSettings;
    }

    /** Returns the builder for the settings used for calls to suspendEntitlement. */
    public OperationCallSettings.Builder<SuspendEntitlementRequest, Entitlement, OperationMetadata>
        suspendEntitlementOperationSettings() {
      return suspendEntitlementOperationSettings;
    }

    /** Returns the builder for the settings used for calls to cancelEntitlement. */
    public UnaryCallSettings.Builder<CancelEntitlementRequest, Operation>
        cancelEntitlementSettings() {
      return cancelEntitlementSettings;
    }

    /** Returns the builder for the settings used for calls to cancelEntitlement. */
    public OperationCallSettings.Builder<CancelEntitlementRequest, Empty, OperationMetadata>
        cancelEntitlementOperationSettings() {
      return cancelEntitlementOperationSettings;
    }

    /** Returns the builder for the settings used for calls to activateEntitlement. */
    public UnaryCallSettings.Builder<ActivateEntitlementRequest, Operation>
        activateEntitlementSettings() {
      return activateEntitlementSettings;
    }

    /** Returns the builder for the settings used for calls to activateEntitlement. */
    public OperationCallSettings.Builder<ActivateEntitlementRequest, Entitlement, OperationMetadata>
        activateEntitlementOperationSettings() {
      return activateEntitlementOperationSettings;
    }

    /** Returns the builder for the settings used for calls to transferEntitlements. */
    public UnaryCallSettings.Builder<TransferEntitlementsRequest, Operation>
        transferEntitlementsSettings() {
      return transferEntitlementsSettings;
    }

    /** Returns the builder for the settings used for calls to transferEntitlements. */
    public OperationCallSettings.Builder<
            TransferEntitlementsRequest, TransferEntitlementsResponse, OperationMetadata>
        transferEntitlementsOperationSettings() {
      return transferEntitlementsOperationSettings;
    }

    /** Returns the builder for the settings used for calls to transferEntitlementsToGoogle. */
    public UnaryCallSettings.Builder<TransferEntitlementsToGoogleRequest, Operation>
        transferEntitlementsToGoogleSettings() {
      return transferEntitlementsToGoogleSettings;
    }

    /** Returns the builder for the settings used for calls to transferEntitlementsToGoogle. */
    public OperationCallSettings.Builder<
            TransferEntitlementsToGoogleRequest, Empty, OperationMetadata>
        transferEntitlementsToGoogleOperationSettings() {
      return transferEntitlementsToGoogleOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listChannelPartnerLinks. */
    public PagedCallSettings.Builder<
            ListChannelPartnerLinksRequest,
            ListChannelPartnerLinksResponse,
            ListChannelPartnerLinksPagedResponse>
        listChannelPartnerLinksSettings() {
      return listChannelPartnerLinksSettings;
    }

    /** Returns the builder for the settings used for calls to getChannelPartnerLink. */
    public UnaryCallSettings.Builder<GetChannelPartnerLinkRequest, ChannelPartnerLink>
        getChannelPartnerLinkSettings() {
      return getChannelPartnerLinkSettings;
    }

    /** Returns the builder for the settings used for calls to createChannelPartnerLink. */
    public UnaryCallSettings.Builder<CreateChannelPartnerLinkRequest, ChannelPartnerLink>
        createChannelPartnerLinkSettings() {
      return createChannelPartnerLinkSettings;
    }

    /** Returns the builder for the settings used for calls to updateChannelPartnerLink. */
    public UnaryCallSettings.Builder<UpdateChannelPartnerLinkRequest, ChannelPartnerLink>
        updateChannelPartnerLinkSettings() {
      return updateChannelPartnerLinkSettings;
    }

    /** Returns the builder for the settings used for calls to getCustomerRepricingConfig. */
    public UnaryCallSettings.Builder<GetCustomerRepricingConfigRequest, CustomerRepricingConfig>
        getCustomerRepricingConfigSettings() {
      return getCustomerRepricingConfigSettings;
    }

    /** Returns the builder for the settings used for calls to listCustomerRepricingConfigs. */
    public PagedCallSettings.Builder<
            ListCustomerRepricingConfigsRequest,
            ListCustomerRepricingConfigsResponse,
            ListCustomerRepricingConfigsPagedResponse>
        listCustomerRepricingConfigsSettings() {
      return listCustomerRepricingConfigsSettings;
    }

    /** Returns the builder for the settings used for calls to createCustomerRepricingConfig. */
    public UnaryCallSettings.Builder<CreateCustomerRepricingConfigRequest, CustomerRepricingConfig>
        createCustomerRepricingConfigSettings() {
      return createCustomerRepricingConfigSettings;
    }

    /** Returns the builder for the settings used for calls to updateCustomerRepricingConfig. */
    public UnaryCallSettings.Builder<UpdateCustomerRepricingConfigRequest, CustomerRepricingConfig>
        updateCustomerRepricingConfigSettings() {
      return updateCustomerRepricingConfigSettings;
    }

    /** Returns the builder for the settings used for calls to deleteCustomerRepricingConfig. */
    public UnaryCallSettings.Builder<DeleteCustomerRepricingConfigRequest, Empty>
        deleteCustomerRepricingConfigSettings() {
      return deleteCustomerRepricingConfigSettings;
    }

    /** Returns the builder for the settings used for calls to getChannelPartnerRepricingConfig. */
    public UnaryCallSettings.Builder<
            GetChannelPartnerRepricingConfigRequest, ChannelPartnerRepricingConfig>
        getChannelPartnerRepricingConfigSettings() {
      return getChannelPartnerRepricingConfigSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listChannelPartnerRepricingConfigs.
     */
    public PagedCallSettings.Builder<
            ListChannelPartnerRepricingConfigsRequest,
            ListChannelPartnerRepricingConfigsResponse,
            ListChannelPartnerRepricingConfigsPagedResponse>
        listChannelPartnerRepricingConfigsSettings() {
      return listChannelPartnerRepricingConfigsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to createChannelPartnerRepricingConfig.
     */
    public UnaryCallSettings.Builder<
            CreateChannelPartnerRepricingConfigRequest, ChannelPartnerRepricingConfig>
        createChannelPartnerRepricingConfigSettings() {
      return createChannelPartnerRepricingConfigSettings;
    }

    /**
     * Returns the builder for the settings used for calls to updateChannelPartnerRepricingConfig.
     */
    public UnaryCallSettings.Builder<
            UpdateChannelPartnerRepricingConfigRequest, ChannelPartnerRepricingConfig>
        updateChannelPartnerRepricingConfigSettings() {
      return updateChannelPartnerRepricingConfigSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteChannelPartnerRepricingConfig.
     */
    public UnaryCallSettings.Builder<DeleteChannelPartnerRepricingConfigRequest, Empty>
        deleteChannelPartnerRepricingConfigSettings() {
      return deleteChannelPartnerRepricingConfigSettings;
    }

    /** Returns the builder for the settings used for calls to listSkuGroups. */
    public PagedCallSettings.Builder<
            ListSkuGroupsRequest, ListSkuGroupsResponse, ListSkuGroupsPagedResponse>
        listSkuGroupsSettings() {
      return listSkuGroupsSettings;
    }

    /** Returns the builder for the settings used for calls to listSkuGroupBillableSkus. */
    public PagedCallSettings.Builder<
            ListSkuGroupBillableSkusRequest,
            ListSkuGroupBillableSkusResponse,
            ListSkuGroupBillableSkusPagedResponse>
        listSkuGroupBillableSkusSettings() {
      return listSkuGroupBillableSkusSettings;
    }

    /** Returns the builder for the settings used for calls to lookupOffer. */
    public UnaryCallSettings.Builder<LookupOfferRequest, Offer> lookupOfferSettings() {
      return lookupOfferSettings;
    }

    /** Returns the builder for the settings used for calls to listProducts. */
    public PagedCallSettings.Builder<
            ListProductsRequest, ListProductsResponse, ListProductsPagedResponse>
        listProductsSettings() {
      return listProductsSettings;
    }

    /** Returns the builder for the settings used for calls to listSkus. */
    public PagedCallSettings.Builder<ListSkusRequest, ListSkusResponse, ListSkusPagedResponse>
        listSkusSettings() {
      return listSkusSettings;
    }

    /** Returns the builder for the settings used for calls to listOffers. */
    public PagedCallSettings.Builder<ListOffersRequest, ListOffersResponse, ListOffersPagedResponse>
        listOffersSettings() {
      return listOffersSettings;
    }

    /** Returns the builder for the settings used for calls to listPurchasableSkus. */
    public PagedCallSettings.Builder<
            ListPurchasableSkusRequest,
            ListPurchasableSkusResponse,
            ListPurchasableSkusPagedResponse>
        listPurchasableSkusSettings() {
      return listPurchasableSkusSettings;
    }

    /** Returns the builder for the settings used for calls to listPurchasableOffers. */
    public PagedCallSettings.Builder<
            ListPurchasableOffersRequest,
            ListPurchasableOffersResponse,
            ListPurchasableOffersPagedResponse>
        listPurchasableOffersSettings() {
      return listPurchasableOffersSettings;
    }

    /** Returns the builder for the settings used for calls to queryEligibleBillingAccounts. */
    public UnaryCallSettings.Builder<
            QueryEligibleBillingAccountsRequest, QueryEligibleBillingAccountsResponse>
        queryEligibleBillingAccountsSettings() {
      return queryEligibleBillingAccountsSettings;
    }

    /** Returns the builder for the settings used for calls to registerSubscriber. */
    public UnaryCallSettings.Builder<RegisterSubscriberRequest, RegisterSubscriberResponse>
        registerSubscriberSettings() {
      return registerSubscriberSettings;
    }

    /** Returns the builder for the settings used for calls to unregisterSubscriber. */
    public UnaryCallSettings.Builder<UnregisterSubscriberRequest, UnregisterSubscriberResponse>
        unregisterSubscriberSettings() {
      return unregisterSubscriberSettings;
    }

    /** Returns the builder for the settings used for calls to listSubscribers. */
    public PagedCallSettings.Builder<
            ListSubscribersRequest, ListSubscribersResponse, ListSubscribersPagedResponse>
        listSubscribersSettings() {
      return listSubscribersSettings;
    }

    /** Returns the builder for the settings used for calls to listEntitlementChanges. */
    public PagedCallSettings.Builder<
            ListEntitlementChangesRequest,
            ListEntitlementChangesResponse,
            ListEntitlementChangesPagedResponse>
        listEntitlementChangesSettings() {
      return listEntitlementChangesSettings;
    }

    @Override
    public CloudChannelServiceStubSettings build() throws IOException {
      return new CloudChannelServiceStubSettings(this);
    }
  }
}
