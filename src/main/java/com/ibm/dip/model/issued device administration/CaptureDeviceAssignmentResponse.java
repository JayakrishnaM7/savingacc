package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issued device administration.CapturePasswordAssignmentRequestPasswordAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaptureDeviceAssignmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class CaptureDeviceAssignmentResponse   {
  @JsonProperty("DeviceAssignment")
  private CapturePasswordAssignmentRequestPasswordAssignment deviceAssignment;

  public CaptureDeviceAssignmentResponse deviceAssignment(CapturePasswordAssignmentRequestPasswordAssignment deviceAssignment) {
    this.deviceAssignment = deviceAssignment;
    return this;
  }

  /**
   * Get deviceAssignment
   * @return deviceAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public CapturePasswordAssignmentRequestPasswordAssignment getDeviceAssignment() {
    return deviceAssignment;
  }

  public void setDeviceAssignment(CapturePasswordAssignmentRequestPasswordAssignment deviceAssignment) {
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
    CaptureDeviceAssignmentResponse captureDeviceAssignmentResponse = (CaptureDeviceAssignmentResponse) o;
    return Objects.equals(this.deviceAssignment, captureDeviceAssignmentResponse.deviceAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptureDeviceAssignmentResponse {\n");
    
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

