package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateBiometricAssignmentResponseBiometricAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class InitiateBiometricAssignmentResponseBiometricAssignment   {
  @JsonProperty("BiometricType")
  private String biometricType;

  public InitiateBiometricAssignmentResponseBiometricAssignment biometricType(String biometricType) {
    this.biometricType = biometricType;
    return this;
  }

  /**
   * Get biometricType
   * @return biometricType
  */
  @ApiModelProperty(value = "")


  public String getBiometricType() {
    return biometricType;
  }

  public void setBiometricType(String biometricType) {
    this.biometricType = biometricType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateBiometricAssignmentResponseBiometricAssignment initiateBiometricAssignmentResponseBiometricAssignment = (InitiateBiometricAssignmentResponseBiometricAssignment) o;
    return Objects.equals(this.biometricType, initiateBiometricAssignmentResponseBiometricAssignment.biometricType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biometricType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateBiometricAssignmentResponseBiometricAssignment {\n");
    
    sb.append("    biometricType: ").append(toIndentedString(biometricType)).append("\n");
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

