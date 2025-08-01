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

package com.google.cloud.configdelivery.v1;

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
public class ReleaseName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_RESOURCE_BUNDLE_RELEASE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/resourceBundles/{resource_bundle}/releases/{release}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String resourceBundle;
  private final String release;

  @Deprecated
  protected ReleaseName() {
    project = null;
    location = null;
    resourceBundle = null;
    release = null;
  }

  private ReleaseName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    resourceBundle = Preconditions.checkNotNull(builder.getResourceBundle());
    release = Preconditions.checkNotNull(builder.getRelease());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getResourceBundle() {
    return resourceBundle;
  }

  public String getRelease() {
    return release;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ReleaseName of(
      String project, String location, String resourceBundle, String release) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setResourceBundle(resourceBundle)
        .setRelease(release)
        .build();
  }

  public static String format(
      String project, String location, String resourceBundle, String release) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setResourceBundle(resourceBundle)
        .setRelease(release)
        .build()
        .toString();
  }

  public static ReleaseName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_RESOURCE_BUNDLE_RELEASE.validatedMatch(
            formattedString, "ReleaseName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("resource_bundle"),
        matchMap.get("release"));
  }

  public static List<ReleaseName> parseList(List<String> formattedStrings) {
    List<ReleaseName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ReleaseName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ReleaseName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_RESOURCE_BUNDLE_RELEASE.matches(formattedString);
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
          if (resourceBundle != null) {
            fieldMapBuilder.put("resource_bundle", resourceBundle);
          }
          if (release != null) {
            fieldMapBuilder.put("release", release);
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
    return PROJECT_LOCATION_RESOURCE_BUNDLE_RELEASE.instantiate(
        "project",
        project,
        "location",
        location,
        "resource_bundle",
        resourceBundle,
        "release",
        release);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      ReleaseName that = ((ReleaseName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.resourceBundle, that.resourceBundle)
          && Objects.equals(this.release, that.release);
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
    h ^= Objects.hashCode(resourceBundle);
    h *= 1000003;
    h ^= Objects.hashCode(release);
    return h;
  }

  /**
   * Builder for
   * projects/{project}/locations/{location}/resourceBundles/{resource_bundle}/releases/{release}.
   */
  public static class Builder {
    private String project;
    private String location;
    private String resourceBundle;
    private String release;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getResourceBundle() {
      return resourceBundle;
    }

    public String getRelease() {
      return release;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setResourceBundle(String resourceBundle) {
      this.resourceBundle = resourceBundle;
      return this;
    }

    public Builder setRelease(String release) {
      this.release = release;
      return this;
    }

    private Builder(ReleaseName releaseName) {
      this.project = releaseName.project;
      this.location = releaseName.location;
      this.resourceBundle = releaseName.resourceBundle;
      this.release = releaseName.release;
    }

    public ReleaseName build() {
      return new ReleaseName(this);
    }
  }
}
