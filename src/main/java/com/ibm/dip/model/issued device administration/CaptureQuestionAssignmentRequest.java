package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issued device administration.CapturePasswordAssignmentRequestPasswordAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaptureQuestionAssignmentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class CaptureQuestionAssignmentRequest   {
  @JsonProperty("QuestionAssignment")
  private CapturePasswordAssignmentRequestPasswordAssignment questionAssignment;

  public CaptureQuestionAssignmentRequest questionAssignment(CapturePasswordAssignmentRequestPasswordAssignment questionAssignment) {
    this.questionAssignment = questionAssignment;
    return this;
  }

  /**
   * Get questionAssignment
   * @return questionAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public CapturePasswordAssignmentRequestPasswordAssignment getQuestionAssignment() {
    return questionAssignment;
  }

  public void setQuestionAssignment(CapturePasswordAssignmentRequestPasswordAssignment questionAssignment) {
    this.questionAssignment = questionAssignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptureQuestionAssignmentRequest captureQuestionAssignmentRequest = (CaptureQuestionAssignmentRequest) o;
    return Objects.equals(this.questionAssignment, captureQuestionAssignmentRequest.questionAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptureQuestionAssignmentRequest {\n");
    
    sb.append("    questionAssignment: ").append(toIndentedString(questionAssignment)).append("\n");
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

