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

package com.google.cloud.dataplex.v1;

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
public class EntityName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_LAKE_ZONE_ENTITY =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/lakes/{lake}/zones/{zone}/entities/{entity}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String lake;
  private final String zone;
  private final String entity;

  @Deprecated
  protected EntityName() {
    project = null;
    location = null;
    lake = null;
    zone = null;
    entity = null;
  }

  private EntityName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    lake = Preconditions.checkNotNull(builder.getLake());
    zone = Preconditions.checkNotNull(builder.getZone());
    entity = Preconditions.checkNotNull(builder.getEntity());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getLake() {
    return lake;
  }

  public String getZone() {
    return zone;
  }

  public String getEntity() {
    return entity;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static EntityName of(
      String project, String location, String lake, String zone, String entity) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setLake(lake)
        .setZone(zone)
        .setEntity(entity)
        .build();
  }

  public static String format(
      String project, String location, String lake, String zone, String entity) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setLake(lake)
        .setZone(zone)
        .setEntity(entity)
        .build()
        .toString();
  }

  public static EntityName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_LAKE_ZONE_ENTITY.validatedMatch(
            formattedString, "EntityName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("lake"),
        matchMap.get("zone"),
        matchMap.get("entity"));
  }

  public static List<EntityName> parseList(List<String> formattedStrings) {
    List<EntityName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<EntityName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (EntityName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_LAKE_ZONE_ENTITY.matches(formattedString);
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
          if (lake != null) {
            fieldMapBuilder.put("lake", lake);
          }
          if (zone != null) {
            fieldMapBuilder.put("zone", zone);
          }
          if (entity != null) {
            fieldMapBuilder.put("entity", entity);
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
    return PROJECT_LOCATION_LAKE_ZONE_ENTITY.instantiate(
        "project", project, "location", location, "lake", lake, "zone", zone, "entity", entity);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      EntityName that = ((EntityName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.lake, that.lake)
          && Objects.equals(this.zone, that.zone)
          && Objects.equals(this.entity, that.entity);
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
    h ^= Objects.hashCode(lake);
    h *= 1000003;
    h ^= Objects.hashCode(zone);
    h *= 1000003;
    h ^= Objects.hashCode(entity);
    return h;
  }

  /**
   * Builder for
   * projects/{project}/locations/{location}/lakes/{lake}/zones/{zone}/entities/{entity}.
   */
  public static class Builder {
    private String project;
    private String location;
    private String lake;
    private String zone;
    private String entity;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getLake() {
      return lake;
    }

    public String getZone() {
      return zone;
    }

    public String getEntity() {
      return entity;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setLake(String lake) {
      this.lake = lake;
      return this;
    }

    public Builder setZone(String zone) {
      this.zone = zone;
      return this;
    }

    public Builder setEntity(String entity) {
      this.entity = entity;
      return this;
    }

    private Builder(EntityName entityName) {
      this.project = entityName.project;
      this.location = entityName.location;
      this.lake = entityName.lake;
      this.zone = entityName.zone;
      this.entity = entityName.entity;
    }

    public EntityName build() {
      return new EntityName(this);
    }
  }
}
