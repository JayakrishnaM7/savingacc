package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePasswordAssignmentResponsePasswordAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class InitiatePasswordAssignmentResponsePasswordAssignment   {
  @JsonProperty("FormatRules")
  private String formatRules;

  @JsonProperty("RecentValues")
  private String recentValues;

  public InitiatePasswordAssignmentResponsePasswordAssignment formatRules(String formatRules) {
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

  public InitiatePasswordAssignmentResponsePasswordAssignment recentValues(String recentValues) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePasswordAssignmentResponsePasswordAssignment initiatePasswordAssignmentResponsePasswordAssignment = (InitiatePasswordAssignmentResponsePasswordAssignment) o;
    return Objects.equals(this.formatRules, initiatePasswordAssignmentResponsePasswordAssignment.formatRules) &&
        Objects.equals(this.recentValues, initiatePasswordAssignmentResponsePasswordAssignment.recentValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatRules, recentValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePasswordAssignmentResponsePasswordAssignment {\n");
    
    sb.append("    formatRules: ").append(toIndentedString(formatRules)).append("\n");
    sb.append("    recentValues: ").append(toIndentedString(recentValues)).append("\n");
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

