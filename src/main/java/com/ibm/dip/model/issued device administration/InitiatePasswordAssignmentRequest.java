package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issued device administration.InitiatePasswordAssignmentRequestIssuedDeviceAllocation;
import com.ibm.dip.model.issued device administration.InitiatePasswordAssignmentRequestPasswordAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePasswordAssignmentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class InitiatePasswordAssignmentRequest   {
  @JsonProperty("IssuedDeviceAllocation")
  private InitiatePasswordAssignmentRequestIssuedDeviceAllocation issuedDeviceAllocation;

  @JsonProperty("PasswordAssignment")
  private InitiatePasswordAssignmentRequestPasswordAssignment passwordAssignment;

  public InitiatePasswordAssignmentRequest issuedDeviceAllocation(InitiatePasswordAssignmentRequestIssuedDeviceAllocation issuedDeviceAllocation) {
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

  public InitiatePasswordAssignmentRequest passwordAssignment(InitiatePasswordAssignmentRequestPasswordAssignment passwordAssignment) {
    this.passwordAssignment = passwordAssignment;
    return this;
  }

  /**
   * Get passwordAssignment
   * @return passwordAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePasswordAssignmentRequestPasswordAssignment getPasswordAssignment() {
    return passwordAssignment;
  }

  public void setPasswordAssignment(InitiatePasswordAssignmentRequestPasswordAssignment passwordAssignment) {
    this.passwordAssignment = passwordAssignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePasswordAssignmentRequest initiatePasswordAssignmentRequest = (InitiatePasswordAssignmentRequest) o;
    return Objects.equals(this.issuedDeviceAllocation, initiatePasswordAssignmentRequest.issuedDeviceAllocation) &&
        Objects.equals(this.passwordAssignment, initiatePasswordAssignmentRequest.passwordAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceAllocation, passwordAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePasswordAssignmentRequest {\n");
    
    sb.append("    issuedDeviceAllocation: ").append(toIndentedString(issuedDeviceAllocation)).append("\n");
    sb.append("    passwordAssignment: ").append(toIndentedString(passwordAssignment)).append("\n");
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

