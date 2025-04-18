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

package com.google.cloud.documentai.v1;

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
public class ProcessorVersionName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_PROCESSOR_PROCESSOR_VERSION =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processor_version}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String processor;
  private final String processorVersion;

  @Deprecated
  protected ProcessorVersionName() {
    project = null;
    location = null;
    processor = null;
    processorVersion = null;
  }

  private ProcessorVersionName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    processor = Preconditions.checkNotNull(builder.getProcessor());
    processorVersion = Preconditions.checkNotNull(builder.getProcessorVersion());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getProcessor() {
    return processor;
  }

  public String getProcessorVersion() {
    return processorVersion;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ProcessorVersionName of(
      String project, String location, String processor, String processorVersion) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setProcessor(processor)
        .setProcessorVersion(processorVersion)
        .build();
  }

  public static String format(
      String project, String location, String processor, String processorVersion) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setProcessor(processor)
        .setProcessorVersion(processorVersion)
        .build()
        .toString();
  }

  public static ProcessorVersionName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_PROCESSOR_PROCESSOR_VERSION.validatedMatch(
            formattedString, "ProcessorVersionName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("processor"),
        matchMap.get("processor_version"));
  }

  public static List<ProcessorVersionName> parseList(List<String> formattedStrings) {
    List<ProcessorVersionName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ProcessorVersionName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ProcessorVersionName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_PROCESSOR_PROCESSOR_VERSION.matches(formattedString);
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
          if (processor != null) {
            fieldMapBuilder.put("processor", processor);
          }
          if (processorVersion != null) {
            fieldMapBuilder.put("processor_version", processorVersion);
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
    return PROJECT_LOCATION_PROCESSOR_PROCESSOR_VERSION.instantiate(
        "project",
        project,
        "location",
        location,
        "processor",
        processor,
        "processor_version",
        processorVersion);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      ProcessorVersionName that = ((ProcessorVersionName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.processor, that.processor)
          && Objects.equals(this.processorVersion, that.processorVersion);
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
    h ^= Objects.hashCode(processor);
    h *= 1000003;
    h ^= Objects.hashCode(processorVersion);
    return h;
  }

  /**
   * Builder for
   * projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processor_version}.
   */
  public static class Builder {
    private String project;
    private String location;
    private String processor;
    private String processorVersion;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getProcessor() {
      return processor;
    }

    public String getProcessorVersion() {
      return processorVersion;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setProcessor(String processor) {
      this.processor = processor;
      return this;
    }

    public Builder setProcessorVersion(String processorVersion) {
      this.processorVersion = processorVersion;
      return this;
    }

    private Builder(ProcessorVersionName processorVersionName) {
      this.project = processorVersionName.project;
      this.location = processorVersionName.location;
      this.processor = processorVersionName.processor;
      this.processorVersion = processorVersionName.processorVersion;
    }

    public ProcessorVersionName build() {
      return new ProcessorVersionName(this);
    }
  }
}
