package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issued device administration.InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation;
import com.ibm.dip.model.issued device administration.UpdateDeviceAssignmentRequestDeviceAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveDeviceAssignmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class RetrieveDeviceAssignmentResponse   {
  @JsonProperty("IssuedDeviceAllocation")
  private InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation issuedDeviceAllocation;

  @JsonProperty("DeviceAssignment")
  private UpdateDeviceAssignmentRequestDeviceAssignment deviceAssignment;

  public RetrieveDeviceAssignmentResponse issuedDeviceAllocation(InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation issuedDeviceAllocation) {
    this.issuedDeviceAllocation = issuedDeviceAllocation;
    return this;
  }

  /**
   * Get issuedDeviceAllocation
   * @return issuedDeviceAllocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation getIssuedDeviceAllocation() {
    return issuedDeviceAllocation;
  }

  public void setIssuedDeviceAllocation(InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation issuedDeviceAllocation) {
    this.issuedDeviceAllocation = issuedDeviceAllocation;
  }

  public RetrieveDeviceAssignmentResponse deviceAssignment(UpdateDeviceAssignmentRequestDeviceAssignment deviceAssignment) {
    this.deviceAssignment = deviceAssignment;
    return this;
  }

  /**
   * Get deviceAssignment
   * @return deviceAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateDeviceAssignmentRequestDeviceAssignment getDeviceAssignment() {
    return deviceAssignment;
  }

  public void setDeviceAssignment(UpdateDeviceAssignmentRequestDeviceAssignment deviceAssignment) {
    this.deviceAssignment = deviceAssignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveDeviceAssignmentResponse retrieveDeviceAssignmentResponse = (RetrieveDeviceAssignmentResponse) o;
    return Objects.equals(this.issuedDeviceAllocation, retrieveDeviceAssignmentResponse.issuedDeviceAllocation) &&
        Objects.equals(this.deviceAssignment, retrieveDeviceAssignmentResponse.deviceAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceAllocation, deviceAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveDeviceAssignmentResponse {\n");
    
    sb.append("    issuedDeviceAllocation: ").append(toIndentedString(issuedDeviceAllocation)).append("\n");
    sb.append("    deviceAssignment: ").append(toIndentedString(deviceAssignment)).append("\n");
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

