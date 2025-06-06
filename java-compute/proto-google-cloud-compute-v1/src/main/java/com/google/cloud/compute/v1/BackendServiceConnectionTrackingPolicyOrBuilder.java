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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

public interface BackendServiceConnectionTrackingPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.BackendServiceConnectionTrackingPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies connection persistence when backends are unhealthy. The default value is DEFAULT_FOR_PROTOCOL. If set to DEFAULT_FOR_PROTOCOL, the existing connections persist on unhealthy backends only for connection-oriented protocols (TCP and SCTP) and only if the Tracking Mode is PER_CONNECTION (default tracking mode) or the Session Affinity is configured for 5-tuple. They do not persist for UDP. If set to NEVER_PERSIST, after a backend becomes unhealthy, the existing connections on the unhealthy backend are never persisted on the unhealthy backend. They are always diverted to newly selected healthy backends (unless all backends are unhealthy). If set to ALWAYS_PERSIST, existing connections always persist on unhealthy backends regardless of protocol and session affinity. It is generally not recommended to use this mode overriding the default. For more details, see [Connection Persistence for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#connection-persistence) and [Connection Persistence for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#connection-persistence).
   * Check the ConnectionPersistenceOnUnhealthyBackends enum for the list of possible values.
   * </pre>
   *
   * <code>optional string connection_persistence_on_unhealthy_backends = 152439033;</code>
   *
   * @return Whether the connectionPersistenceOnUnhealthyBackends field is set.
   */
  boolean hasConnectionPersistenceOnUnhealthyBackends();

  /**
   *
   *
   * <pre>
   * Specifies connection persistence when backends are unhealthy. The default value is DEFAULT_FOR_PROTOCOL. If set to DEFAULT_FOR_PROTOCOL, the existing connections persist on unhealthy backends only for connection-oriented protocols (TCP and SCTP) and only if the Tracking Mode is PER_CONNECTION (default tracking mode) or the Session Affinity is configured for 5-tuple. They do not persist for UDP. If set to NEVER_PERSIST, after a backend becomes unhealthy, the existing connections on the unhealthy backend are never persisted on the unhealthy backend. They are always diverted to newly selected healthy backends (unless all backends are unhealthy). If set to ALWAYS_PERSIST, existing connections always persist on unhealthy backends regardless of protocol and session affinity. It is generally not recommended to use this mode overriding the default. For more details, see [Connection Persistence for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#connection-persistence) and [Connection Persistence for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#connection-persistence).
   * Check the ConnectionPersistenceOnUnhealthyBackends enum for the list of possible values.
   * </pre>
   *
   * <code>optional string connection_persistence_on_unhealthy_backends = 152439033;</code>
   *
   * @return The connectionPersistenceOnUnhealthyBackends.
   */
  java.lang.String getConnectionPersistenceOnUnhealthyBackends();

  /**
   *
   *
   * <pre>
   * Specifies connection persistence when backends are unhealthy. The default value is DEFAULT_FOR_PROTOCOL. If set to DEFAULT_FOR_PROTOCOL, the existing connections persist on unhealthy backends only for connection-oriented protocols (TCP and SCTP) and only if the Tracking Mode is PER_CONNECTION (default tracking mode) or the Session Affinity is configured for 5-tuple. They do not persist for UDP. If set to NEVER_PERSIST, after a backend becomes unhealthy, the existing connections on the unhealthy backend are never persisted on the unhealthy backend. They are always diverted to newly selected healthy backends (unless all backends are unhealthy). If set to ALWAYS_PERSIST, existing connections always persist on unhealthy backends regardless of protocol and session affinity. It is generally not recommended to use this mode overriding the default. For more details, see [Connection Persistence for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#connection-persistence) and [Connection Persistence for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#connection-persistence).
   * Check the ConnectionPersistenceOnUnhealthyBackends enum for the list of possible values.
   * </pre>
   *
   * <code>optional string connection_persistence_on_unhealthy_backends = 152439033;</code>
   *
   * @return The bytes for connectionPersistenceOnUnhealthyBackends.
   */
  com.google.protobuf.ByteString getConnectionPersistenceOnUnhealthyBackendsBytes();

  /**
   *
   *
   * <pre>
   * Enable Strong Session Affinity for external passthrough Network Load Balancers. This option is not available publicly.
   * </pre>
   *
   * <code>optional bool enable_strong_affinity = 24539924;</code>
   *
   * @return Whether the enableStrongAffinity field is set.
   */
  boolean hasEnableStrongAffinity();

  /**
   *
   *
   * <pre>
   * Enable Strong Session Affinity for external passthrough Network Load Balancers. This option is not available publicly.
   * </pre>
   *
   * <code>optional bool enable_strong_affinity = 24539924;</code>
   *
   * @return The enableStrongAffinity.
   */
  boolean getEnableStrongAffinity();

  /**
   *
   *
   * <pre>
   * Specifies how long to keep a Connection Tracking entry while there is no matching traffic (in seconds). For internal passthrough Network Load Balancers: - The minimum (default) is 10 minutes and the maximum is 16 hours. - It can be set only if Connection Tracking is less than 5-tuple (i.e. Session Affinity is CLIENT_IP_NO_DESTINATION, CLIENT_IP or CLIENT_IP_PROTO, and Tracking Mode is PER_SESSION). For external passthrough Network Load Balancers the default is 60 seconds. This option is not available publicly.
   * </pre>
   *
   * <code>optional int32 idle_timeout_sec = 24977544;</code>
   *
   * @return Whether the idleTimeoutSec field is set.
   */
  boolean hasIdleTimeoutSec();

  /**
   *
   *
   * <pre>
   * Specifies how long to keep a Connection Tracking entry while there is no matching traffic (in seconds). For internal passthrough Network Load Balancers: - The minimum (default) is 10 minutes and the maximum is 16 hours. - It can be set only if Connection Tracking is less than 5-tuple (i.e. Session Affinity is CLIENT_IP_NO_DESTINATION, CLIENT_IP or CLIENT_IP_PROTO, and Tracking Mode is PER_SESSION). For external passthrough Network Load Balancers the default is 60 seconds. This option is not available publicly.
   * </pre>
   *
   * <code>optional int32 idle_timeout_sec = 24977544;</code>
   *
   * @return The idleTimeoutSec.
   */
  int getIdleTimeoutSec();

  /**
   *
   *
   * <pre>
   * Specifies the key used for connection tracking. There are two options: - PER_CONNECTION: This is the default mode. The Connection Tracking is performed as per the Connection Key (default Hash Method) for the specific protocol. - PER_SESSION: The Connection Tracking is performed as per the configured Session Affinity. It matches the configured Session Affinity. For more details, see [Tracking Mode for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#tracking-mode) and [Tracking Mode for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#tracking-mode).
   * Check the TrackingMode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string tracking_mode = 127757867;</code>
   *
   * @return Whether the trackingMode field is set.
   */
  boolean hasTrackingMode();

  /**
   *
   *
   * <pre>
   * Specifies the key used for connection tracking. There are two options: - PER_CONNECTION: This is the default mode. The Connection Tracking is performed as per the Connection Key (default Hash Method) for the specific protocol. - PER_SESSION: The Connection Tracking is performed as per the configured Session Affinity. It matches the configured Session Affinity. For more details, see [Tracking Mode for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#tracking-mode) and [Tracking Mode for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#tracking-mode).
   * Check the TrackingMode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string tracking_mode = 127757867;</code>
   *
   * @return The trackingMode.
   */
  java.lang.String getTrackingMode();

  /**
   *
   *
   * <pre>
   * Specifies the key used for connection tracking. There are two options: - PER_CONNECTION: This is the default mode. The Connection Tracking is performed as per the Connection Key (default Hash Method) for the specific protocol. - PER_SESSION: The Connection Tracking is performed as per the configured Session Affinity. It matches the configured Session Affinity. For more details, see [Tracking Mode for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#tracking-mode) and [Tracking Mode for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#tracking-mode).
   * Check the TrackingMode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string tracking_mode = 127757867;</code>
   *
   * @return The bytes for trackingMode.
   */
  com.google.protobuf.ByteString getTrackingModeBytes();
}
