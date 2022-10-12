package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PasswordAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class PasswordAssignment   {
  @JsonProperty("FormatRules")
  private String formatRules;

  @JsonProperty("RecentValues")
  private String recentValues;

  @JsonProperty("PasswordValue")
  private String passwordValue;

  @JsonProperty("UsageLog")
  private String usageLog;

  public PasswordAssignment formatRules(String formatRules) {
    this.formatRules = formatRules;
    return this;
  }

  /**
   * Get formatRules
   * @return formatRules
  */
  @ApiModelProperty(value = "")


  public String getFormatRules() {
    return formatRules;
  }

  public void setFormatRules(String formatRules) {
    this.formatRules = formatRules;
  }

  public PasswordAssignment recentValues(String recentValues) {
    this.recentValues = recentValues;
    return this;
  }

  /**
   * Get recentValues
   * @return recentValues
  */
  @ApiModelProperty(value = "")


  public String getRecentValues() {
    return recentValues;
  }

  public void setRecentValues(String recentValues) {
    this.recentValues = recentValues;
  }

  public PasswordAssignment passwordValue(String passwordValue) {
    this.passwordValue = passwordValue;
    return this;
  }

  /**
   * Get passwordValue
   * @return passwordValue
  */
  @ApiModelProperty(value = "")


  public String getPasswordValue() {
    return passwordValue;
  }

  public void setPasswordValue(String passwordValue) {
    this.passwordValue = passwordValue;
  }

  public PasswordAssignment usageLog(String usageLog) {
    this.usageLog = usageLog;
    return this;
  }

  /**
   * Get usageLog
   * @return usageLog
  */
  @ApiModelProperty(value = "")


  public String getUsageLog() {
    return usageLog;
  }

  public void setUsageLog(String usageLog) {
    this.usageLog = usageLog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordAssignment passwordAssignment = (PasswordAssignment) o;
    return Objects.equals(this.formatRules, passwordAssignment.formatRules) &&
        Objects.equals(this.recentValues, passwordAssignment.recentValues) &&
        Objects.equals(this.passwordValue, passwordAssignment.passwordValue) &&
        Objects.equals(this.usageLog, passwordAssignment.usageLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatRules, recentValues, passwordValue, usageLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordAssignment {\n");
    
    sb.append("    formatRules: ").append(toIndentedString(formatRules)).append("\n");
    sb.append("    recentValues: ").append(toIndentedString(recentValues)).append("\n");
    sb.append("    passwordValue: ").append(toIndentedString(passwordValue)).append("\n");
    sb.append("    usageLog: ").append(toIndentedString(usageLog)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

