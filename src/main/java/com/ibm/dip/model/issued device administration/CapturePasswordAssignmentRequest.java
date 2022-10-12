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
 * CapturePasswordAssignmentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class CapturePasswordAssignmentRequest   {
  @JsonProperty("PasswordAssignment")
  private CapturePasswordAssignmentRequestPasswordAssignment passwordAssignment;

  public CapturePasswordAssignmentRequest passwordAssignment(CapturePasswordAssignmentRequestPasswordAssignment passwordAssignment) {
    this.passwordAssignment = passwordAssignment;
    return this;
  }

  /**
   * Get passwordAssignment
   * @return passwordAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public CapturePasswordAssignmentRequestPasswordAssignment getPasswordAssignment() {
    return passwordAssignment;
  }

  public void setPasswordAssignment(CapturePasswordAssignmentRequestPasswordAssignment passwordAssignment) {
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
    CapturePasswordAssignmentRequest capturePasswordAssignmentRequest = (CapturePasswordAssignmentRequest) o;
    return Objects.equals(this.passwordAssignment, capturePasswordAssignmentRequest.passwordAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapturePasswordAssignmentRequest {\n");
    
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

