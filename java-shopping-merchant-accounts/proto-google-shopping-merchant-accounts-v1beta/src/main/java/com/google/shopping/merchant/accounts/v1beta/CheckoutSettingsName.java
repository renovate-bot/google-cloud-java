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

package com.google.shopping.merchant.accounts.v1beta;

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
public class CheckoutSettingsName implements ResourceName {
  private static final PathTemplate ACCOUNT_PROGRAM =
      PathTemplate.createWithoutUrlEncoding(
          "accounts/{account}/programs/{program}/checkoutSettings");
  private volatile Map<String, String> fieldValuesMap;
  private final String account;
  private final String program;

  @Deprecated
  protected CheckoutSettingsName() {
    account = null;
    program = null;
  }

  private CheckoutSettingsName(Builder builder) {
    account = Preconditions.checkNotNull(builder.getAccount());
    program = Preconditions.checkNotNull(builder.getProgram());
  }

  public String getAccount() {
    return account;
  }

  public String getProgram() {
    return program;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CheckoutSettingsName of(String account, String program) {
    return newBuilder().setAccount(account).setProgram(program).build();
  }

  public static String format(String account, String program) {
    return newBuilder().setAccount(account).setProgram(program).build().toString();
  }

  public static CheckoutSettingsName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        ACCOUNT_PROGRAM.validatedMatch(
            formattedString, "CheckoutSettingsName.parse: formattedString not in valid format");
    return of(matchMap.get("account"), matchMap.get("program"));
  }

  public static List<CheckoutSettingsName> parseList(List<String> formattedStrings) {
    List<CheckoutSettingsName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CheckoutSettingsName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CheckoutSettingsName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return ACCOUNT_PROGRAM.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (account != null) {
            fieldMapBuilder.put("account", account);
          }
          if (program != null) {
            fieldMapBuilder.put("program", program);
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
    return ACCOUNT_PROGRAM.instantiate("account", account, "program", program);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      CheckoutSettingsName that = ((CheckoutSettingsName) o);
      return Objects.equals(this.account, that.account)
          && Objects.equals(this.program, that.program);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(account);
    h *= 1000003;
    h ^= Objects.hashCode(program);
    return h;
  }

  /** Builder for accounts/{account}/programs/{program}/checkoutSettings. */
  public static class Builder {
    private String account;
    private String program;

    protected Builder() {}

    public String getAccount() {
      return account;
    }

    public String getProgram() {
      return program;
    }

    public Builder setAccount(String account) {
      this.account = account;
      return this;
    }

    public Builder setProgram(String program) {
      this.program = program;
      return this;
    }

    private Builder(CheckoutSettingsName checkoutSettingsName) {
      this.account = checkoutSettingsName.account;
      this.program = checkoutSettingsName.program;
    }

    public CheckoutSettingsName build() {
      return new CheckoutSettingsName(this);
    }
  }
}
