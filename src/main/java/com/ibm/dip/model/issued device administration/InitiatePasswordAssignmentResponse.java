package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issued device administration.InitiatePasswordAssignmentResponseIssuedDeviceAllocation;
import com.ibm.dip.model.issued device administration.InitiatePasswordAssignmentResponsePasswordAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePasswordAssignmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class InitiatePasswordAssignmentResponse   {
  @JsonProperty("IssuedDeviceAllocation")
  private InitiatePasswordAssignmentResponseIssuedDeviceAllocation issuedDeviceAllocation;

  @JsonProperty("PasswordAssignment")
  private InitiatePasswordAssignmentResponsePasswordAssignment passwordAssignment;

  public InitiatePasswordAssignmentResponse issuedDeviceAllocation(InitiatePasswordAssignmentResponseIssuedDeviceAllocation issuedDeviceAllocation) {
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

  public InitiatePasswordAssignmentResponse passwordAssignment(InitiatePasswordAssignmentResponsePasswordAssignment passwordAssignment) {
    this.passwordAssignment = passwordAssignment;
    return this;
  }

  /**
   * Get passwordAssignment
   * @return passwordAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePasswordAssignmentResponsePasswordAssignment getPasswordAssignment() {
    return passwordAssignment;
  }

  public void setPasswordAssignment(InitiatePasswordAssignmentResponsePasswordAssignment passwordAssignment) {
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
    InitiatePasswordAssignmentResponse initiatePasswordAssignmentResponse = (InitiatePasswordAssignmentResponse) o;
    return Objects.equals(this.issuedDeviceAllocation, initiatePasswordAssignmentResponse.issuedDeviceAllocation) &&
        Objects.equals(this.passwordAssignment, initiatePasswordAssignmentResponse.passwordAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceAllocation, passwordAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePasswordAssignmentResponse {\n");
    
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

