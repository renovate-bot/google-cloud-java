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

package com.google.cloud.certificatemanager.v1;

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
public class DnsAuthorizationName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_DNS_AUTHORIZATION =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/dnsAuthorizations/{dns_authorization}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String dnsAuthorization;

  @Deprecated
  protected DnsAuthorizationName() {
    project = null;
    location = null;
    dnsAuthorization = null;
  }

  private DnsAuthorizationName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    dnsAuthorization = Preconditions.checkNotNull(builder.getDnsAuthorization());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getDnsAuthorization() {
    return dnsAuthorization;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static DnsAuthorizationName of(String project, String location, String dnsAuthorization) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setDnsAuthorization(dnsAuthorization)
        .build();
  }

  public static String format(String project, String location, String dnsAuthorization) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setDnsAuthorization(dnsAuthorization)
        .build()
        .toString();
  }

  public static DnsAuthorizationName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_DNS_AUTHORIZATION.validatedMatch(
            formattedString, "DnsAuthorizationName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("location"), matchMap.get("dns_authorization"));
  }

  public static List<DnsAuthorizationName> parseList(List<String> formattedStrings) {
    List<DnsAuthorizationName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DnsAuthorizationName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (DnsAuthorizationName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_DNS_AUTHORIZATION.matches(formattedString);
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
          if (dnsAuthorization != null) {
            fieldMapBuilder.put("dns_authorization", dnsAuthorization);
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
    return PROJECT_LOCATION_DNS_AUTHORIZATION.instantiate(
        "project", project, "location", location, "dns_authorization", dnsAuthorization);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      DnsAuthorizationName that = ((DnsAuthorizationName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.dnsAuthorization, that.dnsAuthorization);
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
    h ^= Objects.hashCode(dnsAuthorization);
    return h;
  }

  /** Builder for projects/{project}/locations/{location}/dnsAuthorizations/{dns_authorization}. */
  public static class Builder {
    private String project;
    private String location;
    private String dnsAuthorization;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getDnsAuthorization() {
      return dnsAuthorization;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setDnsAuthorization(String dnsAuthorization) {
      this.dnsAuthorization = dnsAuthorization;
      return this;
    }

    private Builder(DnsAuthorizationName dnsAuthorizationName) {
      this.project = dnsAuthorizationName.project;
      this.location = dnsAuthorizationName.location;
      this.dnsAuthorization = dnsAuthorizationName.dnsAuthorization;
    }

    public DnsAuthorizationName build() {
      return new DnsAuthorizationName(this);
    }
  }
}
