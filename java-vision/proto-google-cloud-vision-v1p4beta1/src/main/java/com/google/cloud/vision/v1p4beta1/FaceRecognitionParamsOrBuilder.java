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
// source: google/cloud/vision/v1p4beta1/face.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.vision.v1p4beta1;

public interface FaceRecognitionParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.FaceRecognitionParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource names for one or more
   * [CelebritySet][google.cloud.vision.v1p4beta1.CelebritySet]s. A celebrity
   * set is preloaded and can be specified as "builtin/default". If this is
   * specified, the algorithm will try to match the faces detected in the input
   * image to the Celebrities in the CelebritySets.
   * </pre>
   *
   * <code>repeated string celebrity_set = 1;</code>
   *
   * @return A list containing the celebritySet.
   */
  java.util.List<java.lang.String> getCelebritySetList();

  /**
   *
   *
   * <pre>
   * The resource names for one or more
   * [CelebritySet][google.cloud.vision.v1p4beta1.CelebritySet]s. A celebrity
   * set is preloaded and can be specified as "builtin/default". If this is
   * specified, the algorithm will try to match the faces detected in the input
   * image to the Celebrities in the CelebritySets.
   * </pre>
   *
   * <code>repeated string celebrity_set = 1;</code>
   *
   * @return The count of celebritySet.
   */
  int getCelebritySetCount();

  /**
   *
   *
   * <pre>
   * The resource names for one or more
   * [CelebritySet][google.cloud.vision.v1p4beta1.CelebritySet]s. A celebrity
   * set is preloaded and can be specified as "builtin/default". If this is
   * specified, the algorithm will try to match the faces detected in the input
   * image to the Celebrities in the CelebritySets.
   * </pre>
   *
   * <code>repeated string celebrity_set = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The celebritySet at the given index.
   */
  java.lang.String getCelebritySet(int index);

  /**
   *
   *
   * <pre>
   * The resource names for one or more
   * [CelebritySet][google.cloud.vision.v1p4beta1.CelebritySet]s. A celebrity
   * set is preloaded and can be specified as "builtin/default". If this is
   * specified, the algorithm will try to match the faces detected in the input
   * image to the Celebrities in the CelebritySets.
   * </pre>
   *
   * <code>repeated string celebrity_set = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the celebritySet at the given index.
   */
  com.google.protobuf.ByteString getCelebritySetBytes(int index);
}
