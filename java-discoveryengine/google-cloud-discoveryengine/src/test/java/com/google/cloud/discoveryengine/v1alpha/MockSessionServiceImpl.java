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

package com.google.cloud.discoveryengine.v1alpha;

import com.google.api.core.BetaApi;
import com.google.cloud.discoveryengine.v1alpha.SessionServiceGrpc.SessionServiceImplBase;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockSessionServiceImpl extends SessionServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockSessionServiceImpl() {
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
  public void createSession(
      CreateSessionRequest request, StreamObserver<Session> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Session) {
      requests.add(request);
      responseObserver.onNext(((Session) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CreateSession, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Session.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void deleteSession(DeleteSessionRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method DeleteSession, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void updateSession(
      UpdateSessionRequest request, StreamObserver<Session> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Session) {
      requests.add(request);
      responseObserver.onNext(((Session) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method UpdateSession, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Session.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void getSession(GetSessionRequest request, StreamObserver<Session> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Session) {
      requests.add(request);
      responseObserver.onNext(((Session) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetSession, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Session.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listSessions(
      ListSessionsRequest request, StreamObserver<ListSessionsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListSessionsResponse) {
      requests.add(request);
      responseObserver.onNext(((ListSessionsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListSessions, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListSessionsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listFiles(
      ListFilesRequest request, StreamObserver<ListFilesResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListFilesResponse) {
      requests.add(request);
      responseObserver.onNext(((ListFilesResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListFiles, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListFilesResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
