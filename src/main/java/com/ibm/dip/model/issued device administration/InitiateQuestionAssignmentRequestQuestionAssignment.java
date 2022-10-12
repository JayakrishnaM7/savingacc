package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateQuestionAssignmentRequestQuestionAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class InitiateQuestionAssignmentRequestQuestionAssignment   {
  @JsonProperty("ResponseText")
  private String responseText;

  public InitiateQuestionAssignmentRequestQuestionAssignment responseText(String responseText) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateQuestionAssignmentRequestQuestionAssignment initiateQuestionAssignmentRequestQuestionAssignment = (InitiateQuestionAssignmentRequestQuestionAssignment) o;
    return Objects.equals(this.responseText, initiateQuestionAssignmentRequestQuestionAssignment.responseText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateQuestionAssignmentRequestQuestionAssignment {\n");
    
    sb.append("    responseText: ").append(toIndentedString(responseText)).append("\n");
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

