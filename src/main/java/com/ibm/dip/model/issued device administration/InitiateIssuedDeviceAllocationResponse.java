package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issued device administration.InitiateIssuedDeviceAllocationResponseIssuedDeviceAllocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateIssuedDeviceAllocationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class InitiateIssuedDeviceAllocationResponse   {
  @JsonProperty("IssuedDeviceAllocation")
  private InitiateIssuedDeviceAllocationResponseIssuedDeviceAllocation issuedDeviceAllocation;

  public InitiateIssuedDeviceAllocationResponse issuedDeviceAllocation(InitiateIssuedDeviceAllocationResponseIssuedDeviceAllocation issuedDeviceAllocation) {
    this.issuedDeviceAllocation = issuedDeviceAllocation;
    return this;
  }

  /**
   * Get issuedDeviceAllocation
   * @return issuedDeviceAllocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateIssuedDeviceAllocationResponseIssuedDeviceAllocation getIssuedDeviceAllocation() {
    return issuedDeviceAllocation;
  }

  public void setIssuedDeviceAllocation(InitiateIssuedDeviceAllocationResponseIssuedDeviceAllocation issuedDeviceAllocation) {
    this.issuedDeviceAllocation = issuedDeviceAllocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateIssuedDeviceAllocationResponse initiateIssuedDeviceAllocationResponse = (InitiateIssuedDeviceAllocationResponse) o;
    return Objects.equals(this.issuedDeviceAllocation, initiateIssuedDeviceAllocationResponse.issuedDeviceAllocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceAllocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateIssuedDeviceAllocationResponse {\n");
    
    sb.append("    issuedDeviceAllocation: ").append(toIndentedString(issuedDeviceAllocation)).append("\n");
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

