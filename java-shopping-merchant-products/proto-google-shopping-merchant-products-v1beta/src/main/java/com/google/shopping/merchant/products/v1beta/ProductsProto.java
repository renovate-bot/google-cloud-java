/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/shopping/merchant/products/v1beta/products.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.products.v1beta;

public final class ProductsProto {
  private ProductsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_products_v1beta_Product_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_products_v1beta_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_products_v1beta_GetProductRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_products_v1beta_GetProductRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_products_v1beta_ListProductsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_products_v1beta_ListProductsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_products_v1beta_ListProductsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_products_v1beta_ListProductsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "7google/shopping/merchant/products/v1beta/products.proto\022(google.shopping.merch"
          + "ant.products.v1beta\032\034google/api/annotati"
          + "ons.proto\032\027google/api/client.proto\032\037goog"
          + "le/api/field_behavior.proto\032\031google/api/"
          + "resource.proto\032>google/shopping/merchant/products/v1beta/products_common.proto\032"
          + " google/shopping/type/types.proto\"\222\005\n"
          + "\007Product\022\014\n"
          + "\004name\030\001 \001(\t\022?\n"
          + "\007channel\030\002 \001(\0162).go"
          + "ogle.shopping.type.Channel.ChannelEnumB\003\340A\003\022\025\n"
          + "\010offer_id\030\003 \001(\tB\003\340A\003\022\035\n"
          + "\020content_language\030\004 \001(\tB\003\340A\003\022\027\n\n"
          + "feed_label\030\005 \001(\tB\003\340A\003\022\030\n"
          + "\013data_source\030\006 \001(\tB\003\340A\003\022 \n"
          + "\016version_number\030\007 \001(\003B\003\340A\003H\000\210\001\001\022M\n\n"
          + "attributes\030\010 \001"
          + "(\01324.google.shopping.merchant.products.v1beta.AttributesB\003\340A\003\022E\n"
          + "\021custom_attributes\030\t"
          + " \003(\0132%.google.shopping.type.CustomAttributeB\003\340A\003\022T\n"
          + "\016product_status\030\n"
          + " \001(\01327.g"
          + "oogle.shopping.merchant.products.v1beta.ProductStatusB\003\340A\003\022^\n"
          + "\023automated_discounts\030\014"
          + " \001(\0132<.google.shopping.merchant.products.v1beta.AutomatedDiscountsB\003\340A\003:N\352AK\n"
          + "\"merchantapi.googleapis.com/Product\022%accounts/{account}/products/{product}B\021\n"
          + "\017_version_number\"M\n"
          + "\021GetProductRequest\0228\n"
          + "\004name\030\001 \001(\tB*\340A\002\372A$\n"
          + "\"merchantapi.googleapis.com/Product\"x\n"
          + "\023ListProductsRequest\022:\n"
          + "\006parent\030\001 \001("
          + "\tB*\340A\002\372A$\022\"merchantapi.googleapis.com/Product\022\021\n"
          + "\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\"t\n"
          + "\024ListProductsResponse\022C\n"
          + "\010products\030\001"
          + " \003(\01321.google.shopping.merchant.products.v1beta.Product\022\027\n"
          + "\017next_page_token\030\002 \001(\t2\347\003\n"
          + "\017ProductsService\022\272\001\n\n"
          + "GetProduct\022;.google.shopping.merchant.produ"
          + "cts.v1beta.GetProductRequest\0321.google.shopping.merchant.products.v1beta.Product\""
          + "<\332A\004name\202\323\344\223\002/\022-/products/v1beta/{name=accounts/*/products/*}\022\315\001\n"
          + "\014ListProducts\022=.google.shopping.merchant.products.v1bet"
          + "a.ListProductsRequest\032>.google.shopping.merchant.products.v1beta.ListProductsRes"
          + "ponse\">\332A\006parent\202\323\344\223\002/\022-/products/v1beta"
          + "/{parent=accounts/*}/products\032G\312A\032mercha"
          + "ntapi.googleapis.com\322A\'https://www.googleapis.com/auth/contentB\312\001\n"
          + ",com.google.shopping.merchant.products.v1betaB\r"
          + "ProductsProtoP\001ZNcloud.google.com/go/shopping/m"
          + "erchant/products/apiv1beta/productspb;productspb\352A8\n"
          + "\"merchantapi.googleapis.com/Account\022\022accounts/{account}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.shopping.merchant.products.v1beta.ProductsCommonProto.getDescriptor(),
              com.google.shopping.type.TypesProto.getDescriptor(),
            });
    internal_static_google_shopping_merchant_products_v1beta_Product_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_shopping_merchant_products_v1beta_Product_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_products_v1beta_Product_descriptor,
            new java.lang.String[] {
              "Name",
              "Channel",
              "OfferId",
              "ContentLanguage",
              "FeedLabel",
              "DataSource",
              "VersionNumber",
              "Attributes",
              "CustomAttributes",
              "ProductStatus",
              "AutomatedDiscounts",
            });
    internal_static_google_shopping_merchant_products_v1beta_GetProductRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_shopping_merchant_products_v1beta_GetProductRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_products_v1beta_GetProductRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_shopping_merchant_products_v1beta_ListProductsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_shopping_merchant_products_v1beta_ListProductsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_products_v1beta_ListProductsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_shopping_merchant_products_v1beta_ListProductsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_shopping_merchant_products_v1beta_ListProductsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_products_v1beta_ListProductsResponse_descriptor,
            new java.lang.String[] {
              "Products", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.shopping.merchant.products.v1beta.ProductsCommonProto.getDescriptor();
    com.google.shopping.type.TypesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
