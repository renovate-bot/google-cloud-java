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

package com.google.cloud.bigquery.analyticshub.v1;

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
public class ListingName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_DATA_EXCHANGE_LISTING =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/dataExchanges/{data_exchange}/listings/{listing}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String dataExchange;
  private final String listing;

  @Deprecated
  protected ListingName() {
    project = null;
    location = null;
    dataExchange = null;
    listing = null;
  }

  private ListingName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    dataExchange = Preconditions.checkNotNull(builder.getDataExchange());
    listing = Preconditions.checkNotNull(builder.getListing());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getDataExchange() {
    return dataExchange;
  }

  public String getListing() {
    return listing;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ListingName of(
      String project, String location, String dataExchange, String listing) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setDataExchange(dataExchange)
        .setListing(listing)
        .build();
  }

  public static String format(
      String project, String location, String dataExchange, String listing) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setDataExchange(dataExchange)
        .setListing(listing)
        .build()
        .toString();
  }

  public static ListingName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_DATA_EXCHANGE_LISTING.validatedMatch(
            formattedString, "ListingName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("data_exchange"),
        matchMap.get("listing"));
  }

  public static List<ListingName> parseList(List<String> formattedStrings) {
    List<ListingName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ListingName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ListingName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_DATA_EXCHANGE_LISTING.matches(formattedString);
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
          if (dataExchange != null) {
            fieldMapBuilder.put("data_exchange", dataExchange);
          }
          if (listing != null) {
            fieldMapBuilder.put("listing", listing);
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
    return PROJECT_LOCATION_DATA_EXCHANGE_LISTING.instantiate(
        "project",
        project,
        "location",
        location,
        "data_exchange",
        dataExchange,
        "listing",
        listing);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      ListingName that = ((ListingName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.dataExchange, that.dataExchange)
          && Objects.equals(this.listing, that.listing);
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
    h ^= Objects.hashCode(dataExchange);
    h *= 1000003;
    h ^= Objects.hashCode(listing);
    return h;
  }

  /**
   * Builder for
   * projects/{project}/locations/{location}/dataExchanges/{data_exchange}/listings/{listing}.
   */
  public static class Builder {
    private String project;
    private String location;
    private String dataExchange;
    private String listing;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getDataExchange() {
      return dataExchange;
    }

    public String getListing() {
      return listing;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setDataExchange(String dataExchange) {
      this.dataExchange = dataExchange;
      return this;
    }

    public Builder setListing(String listing) {
      this.listing = listing;
      return this;
    }

    private Builder(ListingName listingName) {
      this.project = listingName.project;
      this.location = listingName.location;
      this.dataExchange = listingName.dataExchange;
      this.listing = listingName.listing;
    }

    public ListingName build() {
      return new ListingName(this);
    }
  }
}
