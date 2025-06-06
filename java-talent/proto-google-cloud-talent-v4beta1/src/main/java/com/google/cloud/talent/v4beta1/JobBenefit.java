/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * An enum that represents employee benefits included with the job.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.talent.v4beta1.JobBenefit}
 */
public enum JobBenefit implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value if the type isn't specified.
   * </pre>
   *
   * <code>JOB_BENEFIT_UNSPECIFIED = 0;</code>
   */
  JOB_BENEFIT_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The job includes access to programs that support child care, such
   * as daycare.
   * </pre>
   *
   * <code>CHILD_CARE = 1;</code>
   */
  CHILD_CARE(1),
  /**
   *
   *
   * <pre>
   * The job includes dental services covered by a dental
   * insurance plan.
   * </pre>
   *
   * <code>DENTAL = 2;</code>
   */
  DENTAL(2),
  /**
   *
   *
   * <pre>
   * The job offers specific benefits to domestic partners.
   * </pre>
   *
   * <code>DOMESTIC_PARTNER = 3;</code>
   */
  DOMESTIC_PARTNER(3),
  /**
   *
   *
   * <pre>
   * The job allows for a flexible work schedule.
   * </pre>
   *
   * <code>FLEXIBLE_HOURS = 4;</code>
   */
  FLEXIBLE_HOURS(4),
  /**
   *
   *
   * <pre>
   * The job includes health services covered by a medical insurance plan.
   * </pre>
   *
   * <code>MEDICAL = 5;</code>
   */
  MEDICAL(5),
  /**
   *
   *
   * <pre>
   * The job includes a life insurance plan provided by the employer or
   * available for purchase by the employee.
   * </pre>
   *
   * <code>LIFE_INSURANCE = 6;</code>
   */
  LIFE_INSURANCE(6),
  /**
   *
   *
   * <pre>
   * The job allows for a leave of absence to a parent to care for a newborn
   * child.
   * </pre>
   *
   * <code>PARENTAL_LEAVE = 7;</code>
   */
  PARENTAL_LEAVE(7),
  /**
   *
   *
   * <pre>
   * The job includes a workplace retirement plan provided by the
   * employer or available for purchase by the employee.
   * </pre>
   *
   * <code>RETIREMENT_PLAN = 8;</code>
   */
  RETIREMENT_PLAN(8),
  /**
   *
   *
   * <pre>
   * The job allows for paid time off due to illness.
   * </pre>
   *
   * <code>SICK_DAYS = 9;</code>
   */
  SICK_DAYS(9),
  /**
   *
   *
   * <pre>
   * The job includes paid time off for vacation.
   * </pre>
   *
   * <code>VACATION = 10;</code>
   */
  VACATION(10),
  /**
   *
   *
   * <pre>
   * The job includes vision services covered by a vision
   * insurance plan.
   * </pre>
   *
   * <code>VISION = 11;</code>
   */
  VISION(11),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value if the type isn't specified.
   * </pre>
   *
   * <code>JOB_BENEFIT_UNSPECIFIED = 0;</code>
   */
  public static final int JOB_BENEFIT_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * The job includes access to programs that support child care, such
   * as daycare.
   * </pre>
   *
   * <code>CHILD_CARE = 1;</code>
   */
  public static final int CHILD_CARE_VALUE = 1;

  /**
   *
   *
   * <pre>
   * The job includes dental services covered by a dental
   * insurance plan.
   * </pre>
   *
   * <code>DENTAL = 2;</code>
   */
  public static final int DENTAL_VALUE = 2;

  /**
   *
   *
   * <pre>
   * The job offers specific benefits to domestic partners.
   * </pre>
   *
   * <code>DOMESTIC_PARTNER = 3;</code>
   */
  public static final int DOMESTIC_PARTNER_VALUE = 3;

  /**
   *
   *
   * <pre>
   * The job allows for a flexible work schedule.
   * </pre>
   *
   * <code>FLEXIBLE_HOURS = 4;</code>
   */
  public static final int FLEXIBLE_HOURS_VALUE = 4;

  /**
   *
   *
   * <pre>
   * The job includes health services covered by a medical insurance plan.
   * </pre>
   *
   * <code>MEDICAL = 5;</code>
   */
  public static final int MEDICAL_VALUE = 5;

  /**
   *
   *
   * <pre>
   * The job includes a life insurance plan provided by the employer or
   * available for purchase by the employee.
   * </pre>
   *
   * <code>LIFE_INSURANCE = 6;</code>
   */
  public static final int LIFE_INSURANCE_VALUE = 6;

  /**
   *
   *
   * <pre>
   * The job allows for a leave of absence to a parent to care for a newborn
   * child.
   * </pre>
   *
   * <code>PARENTAL_LEAVE = 7;</code>
   */
  public static final int PARENTAL_LEAVE_VALUE = 7;

  /**
   *
   *
   * <pre>
   * The job includes a workplace retirement plan provided by the
   * employer or available for purchase by the employee.
   * </pre>
   *
   * <code>RETIREMENT_PLAN = 8;</code>
   */
  public static final int RETIREMENT_PLAN_VALUE = 8;

  /**
   *
   *
   * <pre>
   * The job allows for paid time off due to illness.
   * </pre>
   *
   * <code>SICK_DAYS = 9;</code>
   */
  public static final int SICK_DAYS_VALUE = 9;

  /**
   *
   *
   * <pre>
   * The job includes paid time off for vacation.
   * </pre>
   *
   * <code>VACATION = 10;</code>
   */
  public static final int VACATION_VALUE = 10;

  /**
   *
   *
   * <pre>
   * The job includes vision services covered by a vision
   * insurance plan.
   * </pre>
   *
   * <code>VISION = 11;</code>
   */
  public static final int VISION_VALUE = 11;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static JobBenefit valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static JobBenefit forNumber(int value) {
    switch (value) {
      case 0:
        return JOB_BENEFIT_UNSPECIFIED;
      case 1:
        return CHILD_CARE;
      case 2:
        return DENTAL;
      case 3:
        return DOMESTIC_PARTNER;
      case 4:
        return FLEXIBLE_HOURS;
      case 5:
        return MEDICAL;
      case 6:
        return LIFE_INSURANCE;
      case 7:
        return PARENTAL_LEAVE;
      case 8:
        return RETIREMENT_PLAN;
      case 9:
        return SICK_DAYS;
      case 10:
        return VACATION;
      case 11:
        return VISION;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JobBenefit> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<JobBenefit> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<JobBenefit>() {
        public JobBenefit findValueByNumber(int number) {
          return JobBenefit.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.CommonProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final JobBenefit[] VALUES = values();

  public static JobBenefit valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private JobBenefit(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.talent.v4beta1.JobBenefit)
}
