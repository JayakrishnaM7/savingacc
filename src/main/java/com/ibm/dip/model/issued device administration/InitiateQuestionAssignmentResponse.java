package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issued device administration.InitiatePasswordAssignmentResponseIssuedDeviceAllocation;
import com.ibm.dip.model.issued device administration.InitiateQuestionAssignmentResponseQuestionAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateQuestionAssignmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class InitiateQuestionAssignmentResponse   {
  @JsonProperty("IssuedDeviceAllocation")
  private InitiatePasswordAssignmentResponseIssuedDeviceAllocation issuedDeviceAllocation;

  @JsonProperty("QuestionAssignment")
  private InitiateQuestionAssignmentResponseQuestionAssignment questionAssignment;

  public InitiateQuestionAssignmentResponse issuedDeviceAllocation(InitiatePasswordAssignmentResponseIssuedDeviceAllocation issuedDeviceAllocation) {
    this.issuedDeviceAllocation = issuedDeviceAllocation;
    return this;
  }

  /**
   * Get issuedDeviceAllocation
   * @return issuedDeviceAllocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePasswordAssignmentResponseIssuedDeviceAllocation getIssuedDeviceAllocation() {
    return issuedDeviceAllocation;
  }

  public void setIssuedDeviceAllocation(InitiatePasswordAssignmentResponseIssuedDeviceAllocation issuedDeviceAllocation) {
    this.issuedDeviceAllocation = issuedDeviceAllocation;
  }

  public InitiateQuestionAssignmentResponse questionAssignment(InitiateQuestionAssignmentResponseQuestionAssignment questionAssignment) {
    this.questionAssignment = questionAssignment;
    return this;
  }

  /**
   * Get questionAssignment
   * @return questionAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateQuestionAssignmentResponseQuestionAssignment getQuestionAssignment() {
    return questionAssignment;
  }

  public void setQuestionAssignment(InitiateQuestionAssignmentResponseQuestionAssignment questionAssignment) {
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
    InitiateQuestionAssignmentResponse initiateQuestionAssignmentResponse = (InitiateQuestionAssignmentResponse) o;
    return Objects.equals(this.issuedDeviceAllocation, initiateQuestionAssignmentResponse.issuedDeviceAllocation) &&
        Objects.equals(this.questionAssignment, initiateQuestionAssignmentResponse.questionAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceAllocation, questionAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateQuestionAssignmentResponse {\n");
    
    sb.append("    issuedDeviceAllocation: ").append(toIndentedString(issuedDeviceAllocation)).append("\n");
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

