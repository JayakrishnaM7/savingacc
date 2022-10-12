package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QuestionAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class QuestionAssignment   {
  @JsonProperty("FormatRules")
  private String formatRules;

  @JsonProperty("RecentValues")
  private String recentValues;

  @JsonProperty("RequestText")
  private String requestText;

  @JsonProperty("ResponseText")
  private String responseText;

  @JsonProperty("UsageLog")
  private String usageLog;

  public QuestionAssignment formatRules(String formatRules) {
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

  public QuestionAssignment recentValues(String recentValues) {
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

  public QuestionAssignment requestText(String requestText) {
    this.requestText = requestText;
    return this;
  }

  /**
   * Get requestText
   * @return requestText
  */
  @ApiModelProperty(value = "")


  public String getRequestText() {
    return requestText;
  }

  public void setRequestText(String requestText) {
    this.requestText = requestText;
  }

  public QuestionAssignment responseText(String responseText) {
    this.responseText = responseText;
    return this;
  }

  /**
   * Get responseText
   * @return responseText
  */
  @ApiModelProperty(value = "")


  public String getResponseText() {
    return responseText;
  }

  public void setResponseText(String responseText) {
    this.responseText = responseText;
  }

  public QuestionAssignment usageLog(String usageLog) {
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
    QuestionAssignment questionAssignment = (QuestionAssignment) o;
    return Objects.equals(this.formatRules, questionAssignment.formatRules) &&
        Objects.equals(this.recentValues, questionAssignment.recentValues) &&
        Objects.equals(this.requestText, questionAssignment.requestText) &&
        Objects.equals(this.responseText, questionAssignment.responseText) &&
        Objects.equals(this.usageLog, questionAssignment.usageLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatRules, recentValues, requestText, responseText, usageLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionAssignment {\n");
    
    sb.append("    formatRules: ").append(toIndentedString(formatRules)).append("\n");
    sb.append("    recentValues: ").append(toIndentedString(recentValues)).append("\n");
    sb.append("    requestText: ").append(toIndentedString(requestText)).append("\n");
    sb.append("    responseText: ").append(toIndentedString(responseText)).append("\n");
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

