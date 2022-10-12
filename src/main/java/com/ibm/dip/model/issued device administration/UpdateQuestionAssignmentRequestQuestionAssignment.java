package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateQuestionAssignmentRequestQuestionAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class UpdateQuestionAssignmentRequestQuestionAssignment   {
  @JsonProperty("RequestText")
  private String requestText;

  @JsonProperty("UsageLog")
  private String usageLog;

  public UpdateQuestionAssignmentRequestQuestionAssignment requestText(String requestText) {
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

  public UpdateQuestionAssignmentRequestQuestionAssignment usageLog(String usageLog) {
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
    UpdateQuestionAssignmentRequestQuestionAssignment updateQuestionAssignmentRequestQuestionAssignment = (UpdateQuestionAssignmentRequestQuestionAssignment) o;
    return Objects.equals(this.requestText, updateQuestionAssignmentRequestQuestionAssignment.requestText) &&
        Objects.equals(this.usageLog, updateQuestionAssignmentRequestQuestionAssignment.usageLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestText, usageLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateQuestionAssignmentRequestQuestionAssignment {\n");
    
    sb.append("    requestText: ").append(toIndentedString(requestText)).append("\n");
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

