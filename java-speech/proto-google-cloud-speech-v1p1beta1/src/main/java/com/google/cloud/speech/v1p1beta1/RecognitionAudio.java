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
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.speech.v1p1beta1;

/**
 *
 *
 * <pre>
 * Contains audio data in the encoding specified in the `RecognitionConfig`.
 * Either `content` or `uri` must be supplied. Supplying both or neither
 * returns [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT].
 * See [content limits](https://cloud.google.com/speech-to-text/quotas#content).
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1p1beta1.RecognitionAudio}
 */
public final class RecognitionAudio extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1p1beta1.RecognitionAudio)
    RecognitionAudioOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RecognitionAudio.newBuilder() to construct.
  private RecognitionAudio(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RecognitionAudio() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RecognitionAudio();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.speech.v1p1beta1.SpeechProto
        .internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1p1beta1.SpeechProto
        .internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1p1beta1.RecognitionAudio.class,
            com.google.cloud.speech.v1p1beta1.RecognitionAudio.Builder.class);
  }

  private int audioSourceCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object audioSource_;

  public enum AudioSourceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CONTENT(1),
    URI(2),
    AUDIOSOURCE_NOT_SET(0);
    private final int value;

    private AudioSourceCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AudioSourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static AudioSourceCase forNumber(int value) {
      switch (value) {
        case 1:
          return CONTENT;
        case 2:
          return URI;
        case 0:
          return AUDIOSOURCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public AudioSourceCase getAudioSourceCase() {
    return AudioSourceCase.forNumber(audioSourceCase_);
  }

  public static final int CONTENT_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * The audio data bytes encoded as specified in
   * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
   * pure binary representation, whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   *
   * @return Whether the content field is set.
   */
  @java.lang.Override
  public boolean hasContent() {
    return audioSourceCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * The audio data bytes encoded as specified in
   * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
   * pure binary representation, whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   *
   * @return The content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContent() {
    if (audioSourceCase_ == 1) {
      return (com.google.protobuf.ByteString) audioSource_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int URI_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * URI that points to a file that contains audio data bytes as specified in
   * `RecognitionConfig`. The file must not be compressed (for example, gzip).
   * Currently, only Google Cloud Storage URIs are
   * supported, which must be specified in the following format:
   * `gs://bucket_name/object_name` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]).
   * For more information, see [Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris).
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return Whether the uri field is set.
   */
  public boolean hasUri() {
    return audioSourceCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * URI that points to a file that contains audio data bytes as specified in
   * `RecognitionConfig`. The file must not be compressed (for example, gzip).
   * Currently, only Google Cloud Storage URIs are
   * supported, which must be specified in the following format:
   * `gs://bucket_name/object_name` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]).
   * For more information, see [Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris).
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The uri.
   */
  public java.lang.String getUri() {
    java.lang.Object ref = "";
    if (audioSourceCase_ == 2) {
      ref = audioSource_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (audioSourceCase_ == 2) {
        audioSource_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * URI that points to a file that contains audio data bytes as specified in
   * `RecognitionConfig`. The file must not be compressed (for example, gzip).
   * Currently, only Google Cloud Storage URIs are
   * supported, which must be specified in the following format:
   * `gs://bucket_name/object_name` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]).
   * For more information, see [Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris).
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The bytes for uri.
   */
  public com.google.protobuf.ByteString getUriBytes() {
    java.lang.Object ref = "";
    if (audioSourceCase_ == 2) {
      ref = audioSource_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (audioSourceCase_ == 2) {
        audioSource_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (audioSourceCase_ == 1) {
      output.writeBytes(1, (com.google.protobuf.ByteString) audioSource_);
    }
    if (audioSourceCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, audioSource_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (audioSourceCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              1, (com.google.protobuf.ByteString) audioSource_);
    }
    if (audioSourceCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, audioSource_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.speech.v1p1beta1.RecognitionAudio)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1p1beta1.RecognitionAudio other =
        (com.google.cloud.speech.v1p1beta1.RecognitionAudio) obj;

    if (!getAudioSourceCase().equals(other.getAudioSourceCase())) return false;
    switch (audioSourceCase_) {
      case 1:
        if (!getContent().equals(other.getContent())) return false;
        break;
      case 2:
        if (!getUri().equals(other.getUri())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (audioSourceCase_) {
      case 1:
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContent().hashCode();
        break;
      case 2:
        hash = (37 * hash) + URI_FIELD_NUMBER;
        hash = (53 * hash) + getUri().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1p1beta1.RecognitionAudio parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1p1beta1.RecognitionAudio parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.RecognitionAudio parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1p1beta1.RecognitionAudio parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.RecognitionAudio parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1p1beta1.RecognitionAudio parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.RecognitionAudio parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1p1beta1.RecognitionAudio parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.RecognitionAudio parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1p1beta1.RecognitionAudio parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.RecognitionAudio parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1p1beta1.RecognitionAudio parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.speech.v1p1beta1.RecognitionAudio prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   *
   *
   * <pre>
   * Contains audio data in the encoding specified in the `RecognitionConfig`.
   * Either `content` or `uri` must be supplied. Supplying both or neither
   * returns [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT].
   * See [content limits](https://cloud.google.com/speech-to-text/quotas#content).
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1p1beta1.RecognitionAudio}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1p1beta1.RecognitionAudio)
      com.google.cloud.speech.v1p1beta1.RecognitionAudioOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v1p1beta1.SpeechProto
          .internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1p1beta1.SpeechProto
          .internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1p1beta1.RecognitionAudio.class,
              com.google.cloud.speech.v1p1beta1.RecognitionAudio.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1p1beta1.RecognitionAudio.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      audioSourceCase_ = 0;
      audioSource_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v1p1beta1.SpeechProto
          .internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.RecognitionAudio getDefaultInstanceForType() {
      return com.google.cloud.speech.v1p1beta1.RecognitionAudio.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.RecognitionAudio build() {
      com.google.cloud.speech.v1p1beta1.RecognitionAudio result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.RecognitionAudio buildPartial() {
      com.google.cloud.speech.v1p1beta1.RecognitionAudio result =
          new com.google.cloud.speech.v1p1beta1.RecognitionAudio(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.speech.v1p1beta1.RecognitionAudio result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.speech.v1p1beta1.RecognitionAudio result) {
      result.audioSourceCase_ = audioSourceCase_;
      result.audioSource_ = this.audioSource_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.speech.v1p1beta1.RecognitionAudio) {
        return mergeFrom((com.google.cloud.speech.v1p1beta1.RecognitionAudio) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1p1beta1.RecognitionAudio other) {
      if (other == com.google.cloud.speech.v1p1beta1.RecognitionAudio.getDefaultInstance())
        return this;
      switch (other.getAudioSourceCase()) {
        case CONTENT:
          {
            setContent(other.getContent());
            break;
          }
        case URI:
          {
            audioSourceCase_ = 2;
            audioSource_ = other.audioSource_;
            onChanged();
            break;
          }
        case AUDIOSOURCE_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                audioSource_ = input.readBytes();
                audioSourceCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                audioSourceCase_ = 2;
                audioSource_ = s;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int audioSourceCase_ = 0;
    private java.lang.Object audioSource_;

    public AudioSourceCase getAudioSourceCase() {
      return AudioSourceCase.forNumber(audioSourceCase_);
    }

    public Builder clearAudioSource() {
      audioSourceCase_ = 0;
      audioSource_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * The audio data bytes encoded as specified in
     * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
     * pure binary representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     *
     * @return Whether the content field is set.
     */
    public boolean hasContent() {
      return audioSourceCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * The audio data bytes encoded as specified in
     * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
     * pure binary representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     *
     * @return The content.
     */
    public com.google.protobuf.ByteString getContent() {
      if (audioSourceCase_ == 1) {
        return (com.google.protobuf.ByteString) audioSource_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }

    /**
     *
     *
     * <pre>
     * The audio data bytes encoded as specified in
     * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
     * pure binary representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     *
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      audioSourceCase_ = 1;
      audioSource_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The audio data bytes encoded as specified in
     * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
     * pure binary representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      if (audioSourceCase_ == 1) {
        audioSourceCase_ = 0;
        audioSource_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * URI that points to a file that contains audio data bytes as specified in
     * `RecognitionConfig`. The file must not be compressed (for example, gzip).
     * Currently, only Google Cloud Storage URIs are
     * supported, which must be specified in the following format:
     * `gs://bucket_name/object_name` (other URI formats return
     * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]).
     * For more information, see [Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris).
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @return Whether the uri field is set.
     */
    @java.lang.Override
    public boolean hasUri() {
      return audioSourceCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * URI that points to a file that contains audio data bytes as specified in
     * `RecognitionConfig`. The file must not be compressed (for example, gzip).
     * Currently, only Google Cloud Storage URIs are
     * supported, which must be specified in the following format:
     * `gs://bucket_name/object_name` (other URI formats return
     * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]).
     * For more information, see [Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris).
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @return The uri.
     */
    @java.lang.Override
    public java.lang.String getUri() {
      java.lang.Object ref = "";
      if (audioSourceCase_ == 2) {
        ref = audioSource_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (audioSourceCase_ == 2) {
          audioSource_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * URI that points to a file that contains audio data bytes as specified in
     * `RecognitionConfig`. The file must not be compressed (for example, gzip).
     * Currently, only Google Cloud Storage URIs are
     * supported, which must be specified in the following format:
     * `gs://bucket_name/object_name` (other URI formats return
     * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]).
     * For more information, see [Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris).
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @return The bytes for uri.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getUriBytes() {
      java.lang.Object ref = "";
      if (audioSourceCase_ == 2) {
        ref = audioSource_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (audioSourceCase_ == 2) {
          audioSource_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * URI that points to a file that contains audio data bytes as specified in
     * `RecognitionConfig`. The file must not be compressed (for example, gzip).
     * Currently, only Google Cloud Storage URIs are
     * supported, which must be specified in the following format:
     * `gs://bucket_name/object_name` (other URI formats return
     * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]).
     * For more information, see [Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris).
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      audioSourceCase_ = 2;
      audioSource_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * URI that points to a file that contains audio data bytes as specified in
     * `RecognitionConfig`. The file must not be compressed (for example, gzip).
     * Currently, only Google Cloud Storage URIs are
     * supported, which must be specified in the following format:
     * `gs://bucket_name/object_name` (other URI formats return
     * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]).
     * For more information, see [Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris).
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      if (audioSourceCase_ == 2) {
        audioSourceCase_ = 0;
        audioSource_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * URI that points to a file that contains audio data bytes as specified in
     * `RecognitionConfig`. The file must not be compressed (for example, gzip).
     * Currently, only Google Cloud Storage URIs are
     * supported, which must be specified in the following format:
     * `gs://bucket_name/object_name` (other URI formats return
     * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]).
     * For more information, see [Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris).
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      audioSourceCase_ = 2;
      audioSource_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1p1beta1.RecognitionAudio)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1p1beta1.RecognitionAudio)
  private static final com.google.cloud.speech.v1p1beta1.RecognitionAudio DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1p1beta1.RecognitionAudio();
  }

  public static com.google.cloud.speech.v1p1beta1.RecognitionAudio getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecognitionAudio> PARSER =
      new com.google.protobuf.AbstractParser<RecognitionAudio>() {
        @java.lang.Override
        public RecognitionAudio parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<RecognitionAudio> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecognitionAudio> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v1p1beta1.RecognitionAudio getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
