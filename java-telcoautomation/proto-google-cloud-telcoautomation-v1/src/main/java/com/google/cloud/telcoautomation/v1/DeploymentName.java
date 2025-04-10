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

package com.google.cloud.telcoautomation.v1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class DeploymentName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_ORCHESTRATION_CLUSTER_DEPLOYMENT =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/orchestrationClusters/{orchestration_cluster}/deployments/{deployment}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String orchestrationCluster;
  private final String deployment;

  @Deprecated
  protected DeploymentName() {
    project = null;
    location = null;
    orchestrationCluster = null;
    deployment = null;
  }

  private DeploymentName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    orchestrationCluster = Preconditions.checkNotNull(builder.getOrchestrationCluster());
    deployment = Preconditions.checkNotNull(builder.getDeployment());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getOrchestrationCluster() {
    return orchestrationCluster;
  }

  public String getDeployment() {
    return deployment;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static DeploymentName of(
      String project, String location, String orchestrationCluster, String deployment) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setOrchestrationCluster(orchestrationCluster)
        .setDeployment(deployment)
        .build();
  }

  public static String format(
      String project, String location, String orchestrationCluster, String deployment) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setOrchestrationCluster(orchestrationCluster)
        .setDeployment(deployment)
        .build()
        .toString();
  }

  public static DeploymentName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_ORCHESTRATION_CLUSTER_DEPLOYMENT.validatedMatch(
            formattedString, "DeploymentName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("orchestration_cluster"),
        matchMap.get("deployment"));
  }

  public static List<DeploymentName> parseList(List<String> formattedStrings) {
    List<DeploymentName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DeploymentName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (DeploymentName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_ORCHESTRATION_CLUSTER_DEPLOYMENT.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (orchestrationCluster != null) {
            fieldMapBuilder.put("orchestration_cluster", orchestrationCluster);
          }
          if (deployment != null) {
            fieldMapBuilder.put("deployment", deployment);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROJECT_LOCATION_ORCHESTRATION_CLUSTER_DEPLOYMENT.instantiate(
        "project",
        project,
        "location",
        location,
        "orchestration_cluster",
        orchestrationCluster,
        "deployment",
        deployment);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      DeploymentName that = ((DeploymentName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.orchestrationCluster, that.orchestrationCluster)
          && Objects.equals(this.deployment, that.deployment);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(orchestrationCluster);
    h *= 1000003;
    h ^= Objects.hashCode(deployment);
    return h;
  }

  /**
   * Builder for
   * projects/{project}/locations/{location}/orchestrationClusters/{orchestration_cluster}/deployments/{deployment}.
   */
  public static class Builder {
    private String project;
    private String location;
    private String orchestrationCluster;
    private String deployment;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getOrchestrationCluster() {
      return orchestrationCluster;
    }

    public String getDeployment() {
      return deployment;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setOrchestrationCluster(String orchestrationCluster) {
      this.orchestrationCluster = orchestrationCluster;
      return this;
    }

    public Builder setDeployment(String deployment) {
      this.deployment = deployment;
      return this;
    }

    private Builder(DeploymentName deploymentName) {
      this.project = deploymentName.project;
      this.location = deploymentName.location;
      this.orchestrationCluster = deploymentName.orchestrationCluster;
      this.deployment = deploymentName.deployment;
    }

    public DeploymentName build() {
      return new DeploymentName(this);
    }
  }
}
