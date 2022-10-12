package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issued device administration.InitiateChequesAssignmentResponseChequesAssignment;
import com.ibm.dip.model.issued device administration.InitiatePasswordAssignmentResponseIssuedDeviceAllocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateChequesAssignmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class InitiateChequesAssignmentResponse   {
  @JsonProperty("IssuedDeviceAllocation")
  private InitiatePasswordAssignmentResponseIssuedDeviceAllocation issuedDeviceAllocation;

  @JsonProperty("ChequesAssignment")
  private InitiateChequesAssignmentResponseChequesAssignment chequesAssignment;

  public InitiateChequesAssignmentResponse issuedDeviceAllocation(InitiatePasswordAssignmentResponseIssuedDeviceAllocation issuedDeviceAllocation) {
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

  public InitiateChequesAssignmentResponse chequesAssignment(InitiateChequesAssignmentResponseChequesAssignment chequesAssignment) {
    this.chequesAssignment = chequesAssignment;
    return this;
  }

  /**
   * Get chequesAssignment
   * @return chequesAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateChequesAssignmentResponseChequesAssignment getChequesAssignment() {
    return chequesAssignment;
  }

  public void setChequesAssignment(InitiateChequesAssignmentResponseChequesAssignment chequesAssignment) {
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
    InitiateChequesAssignmentResponse initiateChequesAssignmentResponse = (InitiateChequesAssignmentResponse) o;
    return Objects.equals(this.issuedDeviceAllocation, initiateChequesAssignmentResponse.issuedDeviceAllocation) &&
        Objects.equals(this.chequesAssignment, initiateChequesAssignmentResponse.chequesAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceAllocation, chequesAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateChequesAssignmentResponse {\n");
    
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

