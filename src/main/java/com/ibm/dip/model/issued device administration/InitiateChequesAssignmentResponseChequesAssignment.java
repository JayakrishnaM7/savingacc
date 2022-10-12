package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateChequesAssignmentResponseChequesAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class InitiateChequesAssignmentResponseChequesAssignment   {
  @JsonProperty("SequenceNumber")
  private String sequenceNumber;

  public InitiateChequesAssignmentResponseChequesAssignment sequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  /**
   * Get sequenceNumber
   * @return sequenceNumber
  */
  @ApiModelProperty(value = "")


  public String getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateChequesAssignmentResponseChequesAssignment initiateChequesAssignmentResponseChequesAssignment = (InitiateChequesAssignmentResponseChequesAssignment) o;
    return Objects.equals(this.sequenceNumber, initiateChequesAssignmentResponseChequesAssignment.sequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateChequesAssignmentResponseChequesAssignment {\n");
    
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
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

