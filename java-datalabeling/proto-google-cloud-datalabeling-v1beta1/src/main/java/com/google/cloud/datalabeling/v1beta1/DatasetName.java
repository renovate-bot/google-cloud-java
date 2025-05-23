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

package com.google.cloud.datalabeling.v1beta1;

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
public class DatasetName implements ResourceName {
  private static final PathTemplate PROJECT_DATASET =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/datasets/{dataset}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String dataset;

  @Deprecated
  protected DatasetName() {
    project = null;
    dataset = null;
  }

  private DatasetName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    dataset = Preconditions.checkNotNull(builder.getDataset());
  }

  public String getProject() {
    return project;
  }

  public String getDataset() {
    return dataset;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static DatasetName of(String project, String dataset) {
    return newBuilder().setProject(project).setDataset(dataset).build();
  }

  public static String format(String project, String dataset) {
    return newBuilder().setProject(project).setDataset(dataset).build().toString();
  }

  public static DatasetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_DATASET.validatedMatch(
            formattedString, "DatasetName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("dataset"));
  }

  public static List<DatasetName> parseList(List<String> formattedStrings) {
    List<DatasetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DatasetName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (DatasetName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_DATASET.matches(formattedString);
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
          if (dataset != null) {
            fieldMapBuilder.put("dataset", dataset);
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
    return PROJECT_DATASET.instantiate("project", project, "dataset", dataset);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      DatasetName that = ((DatasetName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.dataset, that.dataset);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(dataset);
    return h;
  }

  /** Builder for projects/{project}/datasets/{dataset}. */
  public static class Builder {
    private String project;
    private String dataset;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getDataset() {
      return dataset;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setDataset(String dataset) {
      this.dataset = dataset;
      return this;
    }

    private Builder(DatasetName datasetName) {
      this.project = datasetName.project;
      this.dataset = datasetName.dataset;
    }

    public DatasetName build() {
      return new DatasetName(this);
    }
  }
}
