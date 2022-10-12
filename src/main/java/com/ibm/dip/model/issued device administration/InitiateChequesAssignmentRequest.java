package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issued device administration.InitiateChequesAssignmentRequestChequesAssignment;
import com.ibm.dip.model.issued device administration.InitiatePasswordAssignmentRequestIssuedDeviceAllocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateChequesAssignmentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class InitiateChequesAssignmentRequest   {
  @JsonProperty("IssuedDeviceAllocation")
  private InitiatePasswordAssignmentRequestIssuedDeviceAllocation issuedDeviceAllocation;

  @JsonProperty("ChequesAssignment")
  private InitiateChequesAssignmentRequestChequesAssignment chequesAssignment;

  public InitiateChequesAssignmentRequest issuedDeviceAllocation(InitiatePasswordAssignmentRequestIssuedDeviceAllocation issuedDeviceAllocation) {
    this.issuedDeviceAllocation = issuedDeviceAllocation;
    return this;
  }

  /**
   * Get issuedDeviceAllocation
   * @return issuedDeviceAllocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePasswordAssignmentRequestIssuedDeviceAllocation getIssuedDeviceAllocation() {
    return issuedDeviceAllocation;
  }

  public void setIssuedDeviceAllocation(InitiatePasswordAssignmentRequestIssuedDeviceAllocation issuedDeviceAllocation) {
    this.issuedDeviceAllocation = issuedDeviceAllocation;
  }

  public InitiateChequesAssignmentRequest chequesAssignment(InitiateChequesAssignmentRequestChequesAssignment chequesAssignment) {
    this.chequesAssignment = chequesAssignment;
    return this;
  }

  /**
   * Get chequesAssignment
   * @return chequesAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateChequesAssignmentRequestChequesAssignment getChequesAssignment() {
    return chequesAssignment;
  }

  public void setChequesAssignment(InitiateChequesAssignmentRequestChequesAssignment chequesAssignment) {
    this.chequesAssignment = chequesAssignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateChequesAssignmentRequest initiateChequesAssignmentRequest = (InitiateChequesAssignmentRequest) o;
    return Objects.equals(this.issuedDeviceAllocation, initiateChequesAssignmentRequest.issuedDeviceAllocation) &&
        Objects.equals(this.chequesAssignment, initiateChequesAssignmentRequest.chequesAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceAllocation, chequesAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateChequesAssignmentRequest {\n");
    
    sb.append("    issuedDeviceAllocation: ").append(toIndentedString(issuedDeviceAllocation)).append("\n");
    sb.append("    chequesAssignment: ").append(toIndentedString(chequesAssignment)).append("\n");
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

