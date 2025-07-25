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
// source: google/cloud/networkservices/v1/network_services.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.networkservices.v1;

public final class NetworkServicesOuterClass {
  private NetworkServicesOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/networkservices/v1/networ"
          + "k_services.proto\022\037google.cloud.networkse"
          + "rvices.v1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032,google/cloud/n"
          + "etworkservices/v1/common.proto\0325google/c"
          + "loud/networkservices/v1/endpoint_policy."
          + "proto\0323google/cloud/networkservices/v1/e"
          + "xtensibility.proto\032-google/cloud/network"
          + "services/v1/gateway.proto\0320google/cloud/"
          + "networkservices/v1/grpc_route.proto\0320goo"
          + "gle/cloud/networkservices/v1/http_route."
          + "proto\032*google/cloud/networkservices/v1/m"
          + "esh.proto\0320google/cloud/networkservices/"
          + "v1/route_view.proto\0325google/cloud/networ"
          + "kservices/v1/service_binding.proto\0327goog"
          + "le/cloud/networkservices/v1/service_lb_p"
          + "olicy.proto\032/google/cloud/networkservice"
          + "s/v1/tcp_route.proto\032/google/cloud/netwo"
          + "rkservices/v1/tls_route.proto\032#google/lo"
          + "ngrunning/operations.proto\032\033google/proto"
          + "buf/empty.proto2\302m\n\017NetworkServices\022\332\001\n\024"
          + "ListEndpointPolicies\022<.google.cloud.netw"
          + "orkservices.v1.ListEndpointPoliciesReque"
          + "st\032=.google.cloud.networkservices.v1.Lis"
          + "tEndpointPoliciesResponse\"E\332A\006parent\202\323\344\223"
          + "\0026\0224/v1/{parent=projects/*/locations/*}/"
          + "endpointPolicies\022\304\001\n\021GetEndpointPolicy\0229"
          + ".google.cloud.networkservices.v1.GetEndp"
          + "ointPolicyRequest\032/.google.cloud.network"
          + "services.v1.EndpointPolicy\"C\332A\004name\202\323\344\223\002"
          + "6\0224/v1/{name=projects/*/locations/*/endp"
          + "ointPolicies/*}\022\265\002\n\024CreateEndpointPolicy"
          + "\022<.google.cloud.networkservices.v1.Creat"
          + "eEndpointPolicyRequest\032\035.google.longrunn"
          + "ing.Operation\"\277\001\312AC\n\016EndpointPolicy\0221goo"
          + "gle.cloud.networkservices.v1.OperationMe"
          + "tadata\332A)parent,endpoint_policy,endpoint"
          + "_policy_id\202\323\344\223\002G\"4/v1/{parent=projects/*"
          + "/locations/*}/endpointPolicies:\017endpoint"
          + "_policy\022\267\002\n\024UpdateEndpointPolicy\022<.googl"
          + "e.cloud.networkservices.v1.UpdateEndpoin"
          + "tPolicyRequest\032\035.google.longrunning.Oper"
          + "ation\"\301\001\312AC\n\016EndpointPolicy\0221google.clou"
          + "d.networkservices.v1.OperationMetadata\332A"
          + "\033endpoint_policy,update_mask\202\323\344\223\002W2D/v1/"
          + "{endpoint_policy.name=projects/*/locatio"
          + "ns/*/endpointPolicies/*}:\017endpoint_polic"
          + "y\022\206\002\n\024DeleteEndpointPolicy\022<.google.clou"
          + "d.networkservices.v1.DeleteEndpointPolic"
          + "yRequest\032\035.google.longrunning.Operation\""
          + "\220\001\312AJ\n\025google.protobuf.Empty\0221google.clo"
          + "ud.networkservices.v1.OperationMetadata\332"
          + "A\004name\202\323\344\223\0026*4/v1/{name=projects/*/locat"
          + "ions/*/endpointPolicies/*}\022\346\001\n\026ListWasmP"
          + "luginVersions\022>.google.cloud.networkserv"
          + "ices.v1.ListWasmPluginVersionsRequest\032?."
          + "google.cloud.networkservices.v1.ListWasm"
          + "PluginVersionsResponse\"K\332A\006parent\202\323\344\223\002<\022"
          + ":/v1/{parent=projects/*/locations/*/wasm"
          + "Plugins/*}/versions\022\323\001\n\024GetWasmPluginVer"
          + "sion\022<.google.cloud.networkservices.v1.G"
          + "etWasmPluginVersionRequest\0322.google.clou"
          + "d.networkservices.v1.WasmPluginVersion\"I"
          + "\332A\004name\202\323\344\223\002<\022:/v1/{name=projects/*/loca"
          + "tions/*/wasmPlugins/*/versions/*}\022\320\002\n\027Cr"
          + "eateWasmPluginVersion\022?.google.cloud.net"
          + "workservices.v1.CreateWasmPluginVersionR"
          + "equest\032\035.google.longrunning.Operation\"\324\001"
          + "\312AF\n\021WasmPluginVersion\0221google.cloud.net"
          + "workservices.v1.OperationMetadata\332A1pare"
          + "nt,wasm_plugin_version,wasm_plugin_versi"
          + "on_id\202\323\344\223\002Q\":/v1/{parent=projects/*/loca"
          + "tions/*/wasmPlugins/*}/versions:\023wasm_pl"
          + "ugin_version\022\222\002\n\027DeleteWasmPluginVersion"
          + "\022?.google.cloud.networkservices.v1.Delet"
          + "eWasmPluginVersionRequest\032\035.google.longr"
          + "unning.Operation\"\226\001\312AJ\n\025google.protobuf."
          + "Empty\0221google.cloud.networkservices.v1.O"
          + "perationMetadata\332A\004name\202\323\344\223\002<*:/v1/{name"
          + "=projects/*/locations/*/wasmPlugins/*/ve"
          + "rsions/*}\022\306\001\n\017ListWasmPlugins\0227.google.c"
          + "loud.networkservices.v1.ListWasmPluginsR"
          + "equest\0328.google.cloud.networkservices.v1"
          + ".ListWasmPluginsResponse\"@\332A\006parent\202\323\344\223\002"
          + "1\022//v1/{parent=projects/*/locations/*}/w"
          + "asmPlugins\022\263\001\n\rGetWasmPlugin\0225.google.cl"
          + "oud.networkservices.v1.GetWasmPluginRequ"
          + "est\032+.google.cloud.networkservices.v1.Wa"
          + "smPlugin\">\332A\004name\202\323\344\223\0021\022//v1/{name=proje"
          + "cts/*/locations/*/wasmPlugins/*}\022\230\002\n\020Cre"
          + "ateWasmPlugin\0228.google.cloud.networkserv"
          + "ices.v1.CreateWasmPluginRequest\032\035.google"
          + ".longrunning.Operation\"\252\001\312A?\n\nWasmPlugin"
          + "\0221google.cloud.networkservices.v1.Operat"
          + "ionMetadata\332A!parent,wasm_plugin,wasm_pl"
          + "ugin_id\202\323\344\223\002>\"//v1/{parent=projects/*/lo"
          + "cations/*}/wasmPlugins:\013wasm_plugin\022\232\002\n\020"
          + "UpdateWasmPlugin\0228.google.cloud.networks"
          + "ervices.v1.UpdateWasmPluginRequest\032\035.goo"
          + "gle.longrunning.Operation\"\254\001\312A?\n\nWasmPlu"
          + "gin\0221google.cloud.networkservices.v1.Ope"
          + "rationMetadata\332A\027wasm_plugin,update_mask"
          + "\202\323\344\223\002J2;/v1/{wasm_plugin.name=projects/*"
          + "/locations/*/wasmPlugins/*}:\013wasm_plugin"
          + "\022\371\001\n\020DeleteWasmPlugin\0228.google.cloud.net"
          + "workservices.v1.DeleteWasmPluginRequest\032"
          + "\035.google.longrunning.Operation\"\213\001\312AJ\n\025go"
          + "ogle.protobuf.Empty\0221google.cloud.networ"
          + "kservices.v1.OperationMetadata\332A\004name\202\323\344"
          + "\223\0021*//v1/{name=projects/*/locations/*/wa"
          + "smPlugins/*}\022\272\001\n\014ListGateways\0224.google.c"
          + "loud.networkservices.v1.ListGatewaysRequ"
          + "est\0325.google.cloud.networkservices.v1.Li"
          + "stGatewaysResponse\"=\332A\006parent\202\323\344\223\002.\022,/v1"
          + "/{parent=projects/*/locations/*}/gateway"
          + "s\022\247\001\n\nGetGateway\0222.google.cloud.networks"
          + "ervices.v1.GetGatewayRequest\032(.google.cl"
          + "oud.networkservices.v1.Gateway\";\332A\004name\202"
          + "\323\344\223\002.\022,/v1/{name=projects/*/locations/*/"
          + "gateways/*}\022\200\002\n\rCreateGateway\0225.google.c"
          + "loud.networkservices.v1.CreateGatewayReq"
          + "uest\032\035.google.longrunning.Operation\"\230\001\312A"
          + "<\n\007Gateway\0221google.cloud.networkservices"
          + ".v1.OperationMetadata\332A\031parent,gateway,g"
          + "ateway_id\202\323\344\223\0027\",/v1/{parent=projects/*/"
          + "locations/*}/gateways:\007gateway\022\202\002\n\rUpdat"
          + "eGateway\0225.google.cloud.networkservices."
          + "v1.UpdateGatewayRequest\032\035.google.longrun"
          + "ning.Operation\"\232\001\312A<\n\007Gateway\0221google.cl"
          + "oud.networkservices.v1.OperationMetadata"
          + "\332A\023gateway,update_mask\202\323\344\223\002?24/v1/{gatew"
          + "ay.name=projects/*/locations/*/gateways/"
          + "*}:\007gateway\022\360\001\n\rDeleteGateway\0225.google.c"
          + "loud.networkservices.v1.DeleteGatewayReq"
          + "uest\032\035.google.longrunning.Operation\"\210\001\312A"
          + "J\n\025google.protobuf.Empty\0221google.cloud.n"
          + "etworkservices.v1.OperationMetadata\332A\004na"
          + "me\202\323\344\223\002.*,/v1/{name=projects/*/locations"
          + "/*/gateways/*}\022\302\001\n\016ListGrpcRoutes\0226.goog"
          + "le.cloud.networkservices.v1.ListGrpcRout"
          + "esRequest\0327.google.cloud.networkservices"
          + ".v1.ListGrpcRoutesResponse\"?\332A\006parent\202\323\344"
          + "\223\0020\022./v1/{parent=projects/*/locations/*}"
          + "/grpcRoutes\022\257\001\n\014GetGrpcRoute\0224.google.cl"
          + "oud.networkservices.v1.GetGrpcRouteReque"
          + "st\032*.google.cloud.networkservices.v1.Grp"
          + "cRoute\"=\332A\004name\202\323\344\223\0020\022./v1/{name=project"
          + "s/*/locations/*/grpcRoutes/*}\022\221\002\n\017Create"
          + "GrpcRoute\0227.google.cloud.networkservices"
          + ".v1.CreateGrpcRouteRequest\032\035.google.long"
          + "running.Operation\"\245\001\312A>\n\tGrpcRoute\0221goog"
          + "le.cloud.networkservices.v1.OperationMet"
          + "adata\332A\037parent,grpc_route,grpc_route_id\202"
          + "\323\344\223\002<\"./v1/{parent=projects/*/locations/"
          + "*}/grpcRoutes:\ngrpc_route\022\223\002\n\017UpdateGrpc"
          + "Route\0227.google.cloud.networkservices.v1."
          + "UpdateGrpcRouteRequest\032\035.google.longrunn"
          + "ing.Operation\"\247\001\312A>\n\tGrpcRoute\0221google.c"
          + "loud.networkservices.v1.OperationMetadat"
          + "a\332A\026grpc_route,update_mask\202\323\344\223\002G29/v1/{g"
          + "rpc_route.name=projects/*/locations/*/gr"
          + "pcRoutes/*}:\ngrpc_route\022\366\001\n\017DeleteGrpcRo"
          + "ute\0227.google.cloud.networkservices.v1.De"
          + "leteGrpcRouteRequest\032\035.google.longrunnin"
          + "g.Operation\"\212\001\312AJ\n\025google.protobuf.Empty"
          + "\0221google.cloud.networkservices.v1.Operat"
          + "ionMetadata\332A\004name\202\323\344\223\0020*./v1/{name=proj"
          + "ects/*/locations/*/grpcRoutes/*}\022\302\001\n\016Lis"
          + "tHttpRoutes\0226.google.cloud.networkservic"
          + "es.v1.ListHttpRoutesRequest\0327.google.clo"
          + "ud.networkservices.v1.ListHttpRoutesResp"
          + "onse\"?\332A\006parent\202\323\344\223\0020\022./v1/{parent=proje"
          + "cts/*/locations/*}/httpRoutes\022\257\001\n\014GetHtt"
          + "pRoute\0224.google.cloud.networkservices.v1"
          + ".GetHttpRouteRequest\032*.google.cloud.netw"
          + "orkservices.v1.HttpRoute\"=\332A\004name\202\323\344\223\0020\022"
          + "./v1/{name=projects/*/locations/*/httpRo"
          + "utes/*}\022\221\002\n\017CreateHttpRoute\0227.google.clo"
          + "ud.networkservices.v1.CreateHttpRouteReq"
          + "uest\032\035.google.longrunning.Operation\"\245\001\312A"
          + ">\n\tHttpRoute\0221google.cloud.networkservic"
          + "es.v1.OperationMetadata\332A\037parent,http_ro"
          + "ute,http_route_id\202\323\344\223\002<\"./v1/{parent=pro"
          + "jects/*/locations/*}/httpRoutes:\nhttp_ro"
          + "ute\022\223\002\n\017UpdateHttpRoute\0227.google.cloud.n"
          + "etworkservices.v1.UpdateHttpRouteRequest"
          + "\032\035.google.longrunning.Operation\"\247\001\312A>\n\tH"
          + "ttpRoute\0221google.cloud.networkservices.v"
          + "1.OperationMetadata\332A\026http_route,update_"
          + "mask\202\323\344\223\002G29/v1/{http_route.name=project"
          + "s/*/locations/*/httpRoutes/*}:\nhttp_rout"
          + "e\022\366\001\n\017DeleteHttpRoute\0227.google.cloud.net"
          + "workservices.v1.DeleteHttpRouteRequest\032\035"
          + ".google.longrunning.Operation\"\212\001\312AJ\n\025goo"
          + "gle.protobuf.Empty\0221google.cloud.network"
          + "services.v1.OperationMetadata\332A\004name\202\323\344\223"
          + "\0020*./v1/{name=projects/*/locations/*/htt"
          + "pRoutes/*}\022\276\001\n\rListTcpRoutes\0225.google.cl"
          + "oud.networkservices.v1.ListTcpRoutesRequ"
          + "est\0326.google.cloud.networkservices.v1.Li"
          + "stTcpRoutesResponse\">\332A\006parent\202\323\344\223\002/\022-/v"
          + "1/{parent=projects/*/locations/*}/tcpRou"
          + "tes\022\253\001\n\013GetTcpRoute\0223.google.cloud.netwo"
          + "rkservices.v1.GetTcpRouteRequest\032).googl"
          + "e.cloud.networkservices.v1.TcpRoute\"<\332A\004"
          + "name\202\323\344\223\002/\022-/v1/{name=projects/*/locatio"
          + "ns/*/tcpRoutes/*}\022\212\002\n\016CreateTcpRoute\0226.g"
          + "oogle.cloud.networkservices.v1.CreateTcp"
          + "RouteRequest\032\035.google.longrunning.Operat"
          + "ion\"\240\001\312A=\n\010TcpRoute\0221google.cloud.networ"
          + "kservices.v1.OperationMetadata\332A\035parent,"
          + "tcp_route,tcp_route_id\202\323\344\223\002:\"-/v1/{paren"
          + "t=projects/*/locations/*}/tcpRoutes:\ttcp"
          + "_route\022\214\002\n\016UpdateTcpRoute\0226.google.cloud"
          + ".networkservices.v1.UpdateTcpRouteReques"
          + "t\032\035.google.longrunning.Operation\"\242\001\312A=\n\010"
          + "TcpRoute\0221google.cloud.networkservices.v"
          + "1.OperationMetadata\332A\025tcp_route,update_m"
          + "ask\202\323\344\223\002D27/v1/{tcp_route.name=projects/"
          + "*/locations/*/tcpRoutes/*}:\ttcp_route\022\363\001"
          + "\n\016DeleteTcpRoute\0226.google.cloud.networks"
          + "ervices.v1.DeleteTcpRouteRequest\032\035.googl"
          + "e.longrunning.Operation\"\211\001\312AJ\n\025google.pr"
          + "otobuf.Empty\0221google.cloud.networkservic"
          + "es.v1.OperationMetadata\332A\004name\202\323\344\223\002/*-/v"
          + "1/{name=projects/*/locations/*/tcpRoutes"
          + "/*}\022\276\001\n\rListTlsRoutes\0225.google.cloud.net"
          + "workservices.v1.ListTlsRoutesRequest\0326.g"
          + "oogle.cloud.networkservices.v1.ListTlsRo"
          + "utesResponse\">\332A\006parent\202\323\344\223\002/\022-/v1/{pare"
          + "nt=projects/*/locations/*}/tlsRoutes\022\253\001\n"
          + "\013GetTlsRoute\0223.google.cloud.networkservi"
          + "ces.v1.GetTlsRouteRequest\032).google.cloud"
          + ".networkservices.v1.TlsRoute\"<\332A\004name\202\323\344"
          + "\223\002/\022-/v1/{name=projects/*/locations/*/tl"
          + "sRoutes/*}\022\212\002\n\016CreateTlsRoute\0226.google.c"
          + "loud.networkservices.v1.CreateTlsRouteRe"
          + "quest\032\035.google.longrunning.Operation\"\240\001\312"
          + "A=\n\010TlsRoute\0221google.cloud.networkservic"
          + "es.v1.OperationMetadata\332A\035parent,tls_rou"
          + "te,tls_route_id\202\323\344\223\002:\"-/v1/{parent=proje"
          + "cts/*/locations/*}/tlsRoutes:\ttls_route\022"
          + "\214\002\n\016UpdateTlsRoute\0226.google.cloud.networ"
          + "kservices.v1.UpdateTlsRouteRequest\032\035.goo"
          + "gle.longrunning.Operation\"\242\001\312A=\n\010TlsRout"
          + "e\0221google.cloud.networkservices.v1.Opera"
          + "tionMetadata\332A\025tls_route,update_mask\202\323\344\223"
          + "\002D27/v1/{tls_route.name=projects/*/locat"
          + "ions/*/tlsRoutes/*}:\ttls_route\022\363\001\n\016Delet"
          + "eTlsRoute\0226.google.cloud.networkservices"
          + ".v1.DeleteTlsRouteRequest\032\035.google.longr"
          + "unning.Operation\"\211\001\312AJ\n\025google.protobuf."
          + "Empty\0221google.cloud.networkservices.v1.O"
          + "perationMetadata\332A\004name\202\323\344\223\002/*-/v1/{name"
          + "=projects/*/locations/*/tlsRoutes/*}\022\326\001\n"
          + "\023ListServiceBindings\022;.google.cloud.netw"
          + "orkservices.v1.ListServiceBindingsReques"
          + "t\032<.google.cloud.networkservices.v1.List"
          + "ServiceBindingsResponse\"D\332A\006parent\202\323\344\223\0025"
          + "\0223/v1/{parent=projects/*/locations/*}/se"
          + "rviceBindings\022\303\001\n\021GetServiceBinding\0229.go"
          + "ogle.cloud.networkservices.v1.GetService"
          + "BindingRequest\032/.google.cloud.networkser"
          + "vices.v1.ServiceBinding\"B\332A\004name\202\323\344\223\0025\0223"
          + "/v1/{name=projects/*/locations/*/service"
          + "Bindings/*}\022\264\002\n\024CreateServiceBinding\022<.g"
          + "oogle.cloud.networkservices.v1.CreateSer"
          + "viceBindingRequest\032\035.google.longrunning."
          + "Operation\"\276\001\312AC\n\016ServiceBinding\0221google."
          + "cloud.networkservices.v1.OperationMetada"
          + "ta\332A)parent,service_binding,service_bind"
          + "ing_id\202\323\344\223\002F\"3/v1/{parent=projects/*/loc"
          + "ations/*}/serviceBindings:\017service_bindi"
          + "ng\022\266\002\n\024UpdateServiceBinding\022<.google.clo"
          + "ud.networkservices.v1.UpdateServiceBindi"
          + "ngRequest\032\035.google.longrunning.Operation"
          + "\"\300\001\312AC\n\016ServiceBinding\0221google.cloud.net"
          + "workservices.v1.OperationMetadata\332A\033serv"
          + "ice_binding,update_mask\202\323\344\223\002V2C/v1/{serv"
          + "ice_binding.name=projects/*/locations/*/"
          + "serviceBindings/*}:\017service_binding\022\205\002\n\024"
          + "DeleteServiceBinding\022<.google.cloud.netw"
          + "orkservices.v1.DeleteServiceBindingReque"
          + "st\032\035.google.longrunning.Operation\"\217\001\312AJ\n"
          + "\025google.protobuf.Empty\0221google.cloud.net"
          + "workservices.v1.OperationMetadata\332A\004name"
          + "\202\323\344\223\0025*3/v1/{name=projects/*/locations/*"
          + "/serviceBindings/*}\022\262\001\n\nListMeshes\0222.goo"
          + "gle.cloud.networkservices.v1.ListMeshesR"
          + "equest\0323.google.cloud.networkservices.v1"
          + ".ListMeshesResponse\";\332A\006parent\202\323\344\223\002,\022*/v"
          + "1/{parent=projects/*/locations/*}/meshes"
          + "\022\234\001\n\007GetMesh\022/.google.cloud.networkservi"
          + "ces.v1.GetMeshRequest\032%.google.cloud.net"
          + "workservices.v1.Mesh\"9\332A\004name\202\323\344\223\002,\022*/v1"
          + "/{name=projects/*/locations/*/meshes/*}\022"
          + "\354\001\n\nCreateMesh\0222.google.cloud.networkser"
          + "vices.v1.CreateMeshRequest\032\035.google.long"
          + "running.Operation\"\212\001\312A9\n\004Mesh\0221google.cl"
          + "oud.networkservices.v1.OperationMetadata"
          + "\332A\023parent,mesh,mesh_id\202\323\344\223\0022\"*/v1/{paren"
          + "t=projects/*/locations/*}/meshes:\004mesh\022\356"
          + "\001\n\nUpdateMesh\0222.google.cloud.networkserv"
          + "ices.v1.UpdateMeshRequest\032\035.google.longr"
          + "unning.Operation\"\214\001\312A9\n\004Mesh\0221google.clo"
          + "ud.networkservices.v1.OperationMetadata\332"
          + "A\020mesh,update_mask\202\323\344\223\00272//v1/{mesh.name"
          + "=projects/*/locations/*/meshes/*}:\004mesh\022"
          + "\350\001\n\nDeleteMesh\0222.google.cloud.networkser"
          + "vices.v1.DeleteMeshRequest\032\035.google.long"
          + "running.Operation\"\206\001\312AJ\n\025google.protobuf"
          + ".Empty\0221google.cloud.networkservices.v1."
          + "OperationMetadata\332A\004name\202\323\344\223\002,**/v1/{nam"
          + "e=projects/*/locations/*/meshes/*}\022\336\001\n\025L"
          + "istServiceLbPolicies\022=.google.cloud.netw"
          + "orkservices.v1.ListServiceLbPoliciesRequ"
          + "est\032>.google.cloud.networkservices.v1.Li"
          + "stServiceLbPoliciesResponse\"F\332A\006parent\202\323"
          + "\344\223\0027\0225/v1/{parent=projects/*/locations/*"
          + "}/serviceLbPolicies\022\310\001\n\022GetServiceLbPoli"
          + "cy\022:.google.cloud.networkservices.v1.Get"
          + "ServiceLbPolicyRequest\0320.google.cloud.ne"
          + "tworkservices.v1.ServiceLbPolicy\"D\332A\004nam"
          + "e\202\323\344\223\0027\0225/v1/{name=projects/*/locations/"
          + "*/serviceLbPolicies/*}\022\277\002\n\025CreateService"
          + "LbPolicy\022=.google.cloud.networkservices."
          + "v1.CreateServiceLbPolicyRequest\032\035.google"
          + ".longrunning.Operation\"\307\001\312AD\n\017ServiceLbP"
          + "olicy\0221google.cloud.networkservices.v1.O"
          + "perationMetadata\332A-parent,service_lb_pol"
          + "icy,service_lb_policy_id\202\323\344\223\002J\"5/v1/{par"
          + "ent=projects/*/locations/*}/serviceLbPol"
          + "icies:\021service_lb_policy\022\301\002\n\025UpdateServi"
          + "ceLbPolicy\022=.google.cloud.networkservice"
          + "s.v1.UpdateServiceLbPolicyRequest\032\035.goog"
          + "le.longrunning.Operation\"\311\001\312AD\n\017ServiceL"
          + "bPolicy\0221google.cloud.networkservices.v1"
          + ".OperationMetadata\332A\035service_lb_policy,u"
          + "pdate_mask\202\323\344\223\002\\2G/v1/{service_lb_policy"
          + ".name=projects/*/locations/*/serviceLbPo"
          + "licies/*}:\021service_lb_policy\022\211\002\n\025DeleteS"
          + "erviceLbPolicy\022=.google.cloud.networkser"
          + "vices.v1.DeleteServiceLbPolicyRequest\032\035."
          + "google.longrunning.Operation\"\221\001\312AJ\n\025goog"
          + "le.protobuf.Empty\0221google.cloud.networks"
          + "ervices.v1.OperationMetadata\332A\004name\202\323\344\223\002"
          + "7*5/v1/{name=projects/*/locations/*/serv"
          + "iceLbPolicies/*}\022\317\001\n\023GetGatewayRouteView"
          + "\022;.google.cloud.networkservices.v1.GetGa"
          + "tewayRouteViewRequest\0321.google.cloud.net"
          + "workservices.v1.GatewayRouteView\"H\332A\004nam"
          + "e\202\323\344\223\002;\0229/v1/{name=projects/*/locations/"
          + "*/gateways/*/routeViews/*}\022\304\001\n\020GetMeshRo"
          + "uteView\0228.google.cloud.networkservices.v"
          + "1.GetMeshRouteViewRequest\032..google.cloud"
          + ".networkservices.v1.MeshRouteView\"F\332A\004na"
          + "me\202\323\344\223\0029\0227/v1/{name=projects/*/locations"
          + "/*/meshes/*/routeViews/*}\022\342\001\n\025ListGatewa"
          + "yRouteViews\022=.google.cloud.networkservic"
          + "es.v1.ListGatewayRouteViewsRequest\032>.goo"
          + "gle.cloud.networkservices.v1.ListGateway"
          + "RouteViewsResponse\"J\332A\006parent\202\323\344\223\002;\0229/v1"
          + "/{parent=projects/*/locations/*/gateways"
          + "/*}/routeViews\022\327\001\n\022ListMeshRouteViews\022:."
          + "google.cloud.networkservices.v1.ListMesh"
          + "RouteViewsRequest\032;.google.cloud.network"
          + "services.v1.ListMeshRouteViewsResponse\"H"
          + "\332A\006parent\202\323\344\223\0029\0227/v1/{parent=projects/*/"
          + "locations/*/meshes/*}/routeViews\032R\312A\036net"
          + "workservices.googleapis.com\322A.https://ww"
          + "w.googleapis.com/auth/cloud-platformB\337\001\n"
          + "#com.google.cloud.networkservices.v1P\001ZM"
          + "cloud.google.com/go/networkservices/apiv"
          + "1/networkservicespb;networkservicespb\252\002\037"
          + "Google.Cloud.NetworkServices.V1\312\002\037Google"
          + "\\Cloud\\NetworkServices\\V1\352\002\"Google::Clou"
          + "d::NetworkServices::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.cloud.networkservices.v1.CommonProto.getDescriptor(),
              com.google.cloud.networkservices.v1.EndpointPolicyProto.getDescriptor(),
              com.google.cloud.networkservices.v1.ExtensibilityProto.getDescriptor(),
              com.google.cloud.networkservices.v1.GatewayProto.getDescriptor(),
              com.google.cloud.networkservices.v1.GrpcRouteProto.getDescriptor(),
              com.google.cloud.networkservices.v1.HttpRouteProto.getDescriptor(),
              com.google.cloud.networkservices.v1.MeshProto.getDescriptor(),
              com.google.cloud.networkservices.v1.RouteViewProto.getDescriptor(),
              com.google.cloud.networkservices.v1.ServiceBindingProto.getDescriptor(),
              com.google.cloud.networkservices.v1.ServiceLbPolicyProto.getDescriptor(),
              com.google.cloud.networkservices.v1.TcpRouteProto.getDescriptor(),
              com.google.cloud.networkservices.v1.TlsRouteProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.cloud.networkservices.v1.CommonProto.getDescriptor();
    com.google.cloud.networkservices.v1.EndpointPolicyProto.getDescriptor();
    com.google.cloud.networkservices.v1.ExtensibilityProto.getDescriptor();
    com.google.cloud.networkservices.v1.GatewayProto.getDescriptor();
    com.google.cloud.networkservices.v1.GrpcRouteProto.getDescriptor();
    com.google.cloud.networkservices.v1.HttpRouteProto.getDescriptor();
    com.google.cloud.networkservices.v1.MeshProto.getDescriptor();
    com.google.cloud.networkservices.v1.RouteViewProto.getDescriptor();
    com.google.cloud.networkservices.v1.ServiceBindingProto.getDescriptor();
    com.google.cloud.networkservices.v1.ServiceLbPolicyProto.getDescriptor();
    com.google.cloud.networkservices.v1.TcpRouteProto.getDescriptor();
    com.google.cloud.networkservices.v1.TlsRouteProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
