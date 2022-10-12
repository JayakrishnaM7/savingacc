package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateBiometricAssignmentRequestBiometricAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class UpdateBiometricAssignmentRequestBiometricAssignment   {
  @JsonProperty("BiometricType")
  private String biometricType;

  @JsonProperty("BiometricRegisteredDetail")
  private String biometricRegisteredDetail;

  public UpdateBiometricAssignmentRequestBiometricAssignment biometricType(String biometricType) {
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

  public UpdateBiometricAssignmentRequestBiometricAssignment biometricRegisteredDetail(String biometricRegisteredDetail) {
    this.biometricRegisteredDetail = biometricRegisteredDetail;
    return this;
  }

  /**
   * Get biometricRegisteredDetail
   * @return biometricRegisteredDetail
  */
  @ApiModelProperty(value = "")


  public String getBiometricRegisteredDetail() {
    return biometricRegisteredDetail;
  }

  public void setBiometricRegisteredDetail(String biometricRegisteredDetail) {
    this.biometricRegisteredDetail = biometricRegisteredDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBiometricAssignmentRequestBiometricAssignment updateBiometricAssignmentRequestBiometricAssignment = (UpdateBiometricAssignmentRequestBiometricAssignment) o;
    return Objects.equals(this.biometricType, updateBiometricAssignmentRequestBiometricAssignment.biometricType) &&
        Objects.equals(this.biometricRegisteredDetail, updateBiometricAssignmentRequestBiometricAssignment.biometricRegisteredDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biometricType, biometricRegisteredDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBiometricAssignmentRequestBiometricAssignment {\n");
    
    sb.append("    biometricType: ").append(toIndentedString(biometricType)).append("\n");
    sb.append("    biometricRegisteredDetail: ").append(toIndentedString(biometricRegisteredDetail)).append("\n");
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

