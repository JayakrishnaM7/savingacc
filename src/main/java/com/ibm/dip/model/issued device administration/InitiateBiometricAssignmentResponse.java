package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issued device administration.InitiateBiometricAssignmentResponseBiometricAssignment;
import com.ibm.dip.model.issued device administration.InitiatePasswordAssignmentResponseIssuedDeviceAllocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateBiometricAssignmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class InitiateBiometricAssignmentResponse   {
  @JsonProperty("IssuedDeviceAllocation")
  private InitiatePasswordAssignmentResponseIssuedDeviceAllocation issuedDeviceAllocation;

  @JsonProperty("BiometricAssignment")
  private InitiateBiometricAssignmentResponseBiometricAssignment biometricAssignment;

  public InitiateBiometricAssignmentResponse issuedDeviceAllocation(InitiatePasswordAssignmentResponseIssuedDeviceAllocation issuedDeviceAllocation) {
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

  public InitiateBiometricAssignmentResponse biometricAssignment(InitiateBiometricAssignmentResponseBiometricAssignment biometricAssignment) {
    this.biometricAssignment = biometricAssignment;
    return this;
  }

  /**
   * Get biometricAssignment
   * @return biometricAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateBiometricAssignmentResponseBiometricAssignment getBiometricAssignment() {
    return biometricAssignment;
  }

  public void setBiometricAssignment(InitiateBiometricAssignmentResponseBiometricAssignment biometricAssignment) {
    this.biometricAssignment = biometricAssignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateBiometricAssignmentResponse initiateBiometricAssignmentResponse = (InitiateBiometricAssignmentResponse) o;
    return Objects.equals(this.issuedDeviceAllocation, initiateBiometricAssignmentResponse.issuedDeviceAllocation) &&
        Objects.equals(this.biometricAssignment, initiateBiometricAssignmentResponse.biometricAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceAllocation, biometricAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateBiometricAssignmentResponse {\n");
    
    sb.append("    issuedDeviceAllocation: ").append(toIndentedString(issuedDeviceAllocation)).append("\n");
    sb.append("    biometricAssignment: ").append(toIndentedString(biometricAssignment)).append("\n");
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

