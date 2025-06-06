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
// source: google/cloud/video/livestream/v1/outputs.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.video.livestream.v1;

public interface PreprocessingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.PreprocessingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Audio preprocessing configuration.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.PreprocessingConfig.Audio audio = 1;</code>
   *
   * @return Whether the audio field is set.
   */
  boolean hasAudio();

  /**
   *
   *
   * <pre>
   * Audio preprocessing configuration.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.PreprocessingConfig.Audio audio = 1;</code>
   *
   * @return The audio.
   */
  com.google.cloud.video.livestream.v1.PreprocessingConfig.Audio getAudio();

  /**
   *
   *
   * <pre>
   * Audio preprocessing configuration.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.PreprocessingConfig.Audio audio = 1;</code>
   */
  com.google.cloud.video.livestream.v1.PreprocessingConfig.AudioOrBuilder getAudioOrBuilder();

  /**
   *
   *
   * <pre>
   * Specify the video cropping configuration.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.PreprocessingConfig.Crop crop = 2;</code>
   *
   * @return Whether the crop field is set.
   */
  boolean hasCrop();

  /**
   *
   *
   * <pre>
   * Specify the video cropping configuration.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.PreprocessingConfig.Crop crop = 2;</code>
   *
   * @return The crop.
   */
  com.google.cloud.video.livestream.v1.PreprocessingConfig.Crop getCrop();

  /**
   *
   *
   * <pre>
   * Specify the video cropping configuration.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.PreprocessingConfig.Crop crop = 2;</code>
   */
  com.google.cloud.video.livestream.v1.PreprocessingConfig.CropOrBuilder getCropOrBuilder();

  /**
   *
   *
   * <pre>
   * Specify the video pad filter configuration.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.PreprocessingConfig.Pad pad = 3;</code>
   *
   * @return Whether the pad field is set.
   */
  boolean hasPad();

  /**
   *
   *
   * <pre>
   * Specify the video pad filter configuration.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.PreprocessingConfig.Pad pad = 3;</code>
   *
   * @return The pad.
   */
  com.google.cloud.video.livestream.v1.PreprocessingConfig.Pad getPad();

  /**
   *
   *
   * <pre>
   * Specify the video pad filter configuration.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.PreprocessingConfig.Pad pad = 3;</code>
   */
  com.google.cloud.video.livestream.v1.PreprocessingConfig.PadOrBuilder getPadOrBuilder();
}
