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

package com.google.cloud.networkconnectivity.v1.stub;

import static com.google.cloud.networkconnectivity.v1.InternalRangeServiceClient.ListInternalRangesPagedResponse;
import static com.google.cloud.networkconnectivity.v1.InternalRangeServiceClient.ListLocationsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.networkconnectivity.v1.CreateInternalRangeRequest;
import com.google.cloud.networkconnectivity.v1.DeleteInternalRangeRequest;
import com.google.cloud.networkconnectivity.v1.GetInternalRangeRequest;
import com.google.cloud.networkconnectivity.v1.InternalRange;
import com.google.cloud.networkconnectivity.v1.ListInternalRangesRequest;
import com.google.cloud.networkconnectivity.v1.ListInternalRangesResponse;
import com.google.cloud.networkconnectivity.v1.OperationMetadata;
import com.google.cloud.networkconnectivity.v1.UpdateInternalRangeRequest;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the InternalRangeService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class InternalRangeServiceStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<ListInternalRangesRequest, ListInternalRangesPagedResponse>
      listInternalRangesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listInternalRangesPagedCallable()");
  }

  public UnaryCallable<ListInternalRangesRequest, ListInternalRangesResponse>
      listInternalRangesCallable() {
    throw new UnsupportedOperationException("Not implemented: listInternalRangesCallable()");
  }

  public UnaryCallable<GetInternalRangeRequest, InternalRange> getInternalRangeCallable() {
    throw new UnsupportedOperationException("Not implemented: getInternalRangeCallable()");
  }

  public OperationCallable<CreateInternalRangeRequest, InternalRange, OperationMetadata>
      createInternalRangeOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createInternalRangeOperationCallable()");
  }

  public UnaryCallable<CreateInternalRangeRequest, Operation> createInternalRangeCallable() {
    throw new UnsupportedOperationException("Not implemented: createInternalRangeCallable()");
  }

  public OperationCallable<UpdateInternalRangeRequest, InternalRange, OperationMetadata>
      updateInternalRangeOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateInternalRangeOperationCallable()");
  }

  public UnaryCallable<UpdateInternalRangeRequest, Operation> updateInternalRangeCallable() {
    throw new UnsupportedOperationException("Not implemented: updateInternalRangeCallable()");
  }

  public OperationCallable<DeleteInternalRangeRequest, Empty, OperationMetadata>
      deleteInternalRangeOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteInternalRangeOperationCallable()");
  }

  public UnaryCallable<DeleteInternalRangeRequest, Operation> deleteInternalRangeCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteInternalRangeCallable()");
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

  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: setIamPolicyCallable()");
  }

  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: getIamPolicyCallable()");
  }

  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    throw new UnsupportedOperationException("Not implemented: testIamPermissionsCallable()");
  }

  @Override
  public abstract void close();
}
