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

package com.google.cloud.aiplatform.v1beta1;

import com.google.api.core.BetaApi;
import com.google.cloud.aiplatform.v1beta1.VertexRagServiceGrpc.VertexRagServiceImplBase;
import com.google.protobuf.AbstractMessage;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockVertexRagServiceImpl extends VertexRagServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockVertexRagServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void retrieveContexts(
      RetrieveContextsRequest request, StreamObserver<RetrieveContextsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof RetrieveContextsResponse) {
      requests.add(request);
      responseObserver.onNext(((RetrieveContextsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method RetrieveContexts, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  RetrieveContextsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void augmentPrompt(
      AugmentPromptRequest request, StreamObserver<AugmentPromptResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof AugmentPromptResponse) {
      requests.add(request);
      responseObserver.onNext(((AugmentPromptResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method AugmentPrompt, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  AugmentPromptResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void corroborateContent(
      CorroborateContentRequest request,
      StreamObserver<CorroborateContentResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof CorroborateContentResponse) {
      requests.add(request);
      responseObserver.onNext(((CorroborateContentResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CorroborateContent, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  CorroborateContentResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
