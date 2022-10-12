package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issued device administration.InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation;
import com.ibm.dip.model.issued device administration.UpdateQuestionAssignmentRequestQuestionAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateQuestionAssignmentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class UpdateQuestionAssignmentRequest   {
  @JsonProperty("IssuedDeviceAllocation")
  private InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation issuedDeviceAllocation;

  @JsonProperty("QuestionAssignment")
  private UpdateQuestionAssignmentRequestQuestionAssignment questionAssignment;

  public UpdateQuestionAssignmentRequest issuedDeviceAllocation(InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation issuedDeviceAllocation) {
    this.issuedDeviceAllocation = issuedDeviceAllocation;
    return this;
  }

  /**
   * Get issuedDeviceAllocation
   * @return issuedDeviceAllocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation getIssuedDeviceAllocation() {
    return issuedDeviceAllocation;
  }

  public void setIssuedDeviceAllocation(InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation issuedDeviceAllocation) {
    this.issuedDeviceAllocation = issuedDeviceAllocation;
  }

  public UpdateQuestionAssignmentRequest questionAssignment(UpdateQuestionAssignmentRequestQuestionAssignment questionAssignment) {
    this.questionAssignment = questionAssignment;
    return this;
  }

  /**
   * Get questionAssignment
   * @return questionAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateQuestionAssignmentRequestQuestionAssignment getQuestionAssignment() {
    return questionAssignment;
  }

  public void setQuestionAssignment(UpdateQuestionAssignmentRequestQuestionAssignment questionAssignment) {
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
    UpdateQuestionAssignmentRequest updateQuestionAssignmentRequest = (UpdateQuestionAssignmentRequest) o;
    return Objects.equals(this.issuedDeviceAllocation, updateQuestionAssignmentRequest.issuedDeviceAllocation) &&
        Objects.equals(this.questionAssignment, updateQuestionAssignmentRequest.questionAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceAllocation, questionAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateQuestionAssignmentRequest {\n");
    
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

