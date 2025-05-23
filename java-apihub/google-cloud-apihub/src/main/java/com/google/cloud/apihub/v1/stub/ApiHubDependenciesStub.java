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

package com.google.cloud.apihub.v1.stub;

import static com.google.cloud.apihub.v1.ApiHubDependenciesClient.ListDependenciesPagedResponse;
import static com.google.cloud.apihub.v1.ApiHubDependenciesClient.ListLocationsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.apihub.v1.CreateDependencyRequest;
import com.google.cloud.apihub.v1.DeleteDependencyRequest;
import com.google.cloud.apihub.v1.Dependency;
import com.google.cloud.apihub.v1.GetDependencyRequest;
import com.google.cloud.apihub.v1.ListDependenciesRequest;
import com.google.cloud.apihub.v1.ListDependenciesResponse;
import com.google.cloud.apihub.v1.UpdateDependencyRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the ApiHubDependencies service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class ApiHubDependenciesStub implements BackgroundResource {

  public UnaryCallable<CreateDependencyRequest, Dependency> createDependencyCallable() {
    throw new UnsupportedOperationException("Not implemented: createDependencyCallable()");
  }

  public UnaryCallable<GetDependencyRequest, Dependency> getDependencyCallable() {
    throw new UnsupportedOperationException("Not implemented: getDependencyCallable()");
  }

  public UnaryCallable<UpdateDependencyRequest, Dependency> updateDependencyCallable() {
    throw new UnsupportedOperationException("Not implemented: updateDependencyCallable()");
  }

  public UnaryCallable<DeleteDependencyRequest, Empty> deleteDependencyCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteDependencyCallable()");
  }

  public UnaryCallable<ListDependenciesRequest, ListDependenciesPagedResponse>
      listDependenciesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listDependenciesPagedCallable()");
  }

  public UnaryCallable<ListDependenciesRequest, ListDependenciesResponse>
      listDependenciesCallable() {
    throw new UnsupportedOperationException("Not implemented: listDependenciesCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsPagedCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsCallable()");
  }

  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    throw new UnsupportedOperationException("Not implemented: getLocationCallable()");
  }

  @Override
  public abstract void close();
}
