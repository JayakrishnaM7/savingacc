package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issued device administration.InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation;
import com.ibm.dip.model.issued device administration.RetrieveQuestionAssignmentResponseQuestionAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveQuestionAssignmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class RetrieveQuestionAssignmentResponse   {
  @JsonProperty("IssuedDeviceAllocation")
  private InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation issuedDeviceAllocation;

  @JsonProperty("QuestionAssignment")
  private RetrieveQuestionAssignmentResponseQuestionAssignment questionAssignment;

  public RetrieveQuestionAssignmentResponse issuedDeviceAllocation(InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation issuedDeviceAllocation) {
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

  public RetrieveQuestionAssignmentResponse questionAssignment(RetrieveQuestionAssignmentResponseQuestionAssignment questionAssignment) {
    this.questionAssignment = questionAssignment;
    return this;
  }

  /**
   * Get questionAssignment
   * @return questionAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveQuestionAssignmentResponseQuestionAssignment getQuestionAssignment() {
    return questionAssignment;
  }

  public void setQuestionAssignment(RetrieveQuestionAssignmentResponseQuestionAssignment questionAssignment) {
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
    RetrieveQuestionAssignmentResponse retrieveQuestionAssignmentResponse = (RetrieveQuestionAssignmentResponse) o;
    return Objects.equals(this.issuedDeviceAllocation, retrieveQuestionAssignmentResponse.issuedDeviceAllocation) &&
        Objects.equals(this.questionAssignment, retrieveQuestionAssignmentResponse.questionAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceAllocation, questionAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveQuestionAssignmentResponse {\n");
    
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

