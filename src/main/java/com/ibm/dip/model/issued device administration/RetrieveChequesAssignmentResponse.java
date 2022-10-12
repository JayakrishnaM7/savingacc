package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issued device administration.RetrieveChequesAssignmentResponseChequesAssignment;
import com.ibm.dip.model.issued device administration.RetrieveChequesAssignmentResponseIssuedDeviceAllocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveChequesAssignmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class RetrieveChequesAssignmentResponse   {
  @JsonProperty("IssuedDeviceAllocation")
  private RetrieveChequesAssignmentResponseIssuedDeviceAllocation issuedDeviceAllocation;

  @JsonProperty("ChequesAssignment")
  private RetrieveChequesAssignmentResponseChequesAssignment chequesAssignment;

  public RetrieveChequesAssignmentResponse issuedDeviceAllocation(RetrieveChequesAssignmentResponseIssuedDeviceAllocation issuedDeviceAllocation) {
    this.issuedDeviceAllocation = issuedDeviceAllocation;
    return this;
  }

  /**
   * Get issuedDeviceAllocation
   * @return issuedDeviceAllocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveChequesAssignmentResponseIssuedDeviceAllocation getIssuedDeviceAllocation() {
    return issuedDeviceAllocation;
  }

  public void setIssuedDeviceAllocation(RetrieveChequesAssignmentResponseIssuedDeviceAllocation issuedDeviceAllocation) {
    this.issuedDeviceAllocation = issuedDeviceAllocation;
  }

  public RetrieveChequesAssignmentResponse chequesAssignment(RetrieveChequesAssignmentResponseChequesAssignment chequesAssignment) {
    this.chequesAssignment = chequesAssignment;
    return this;
  }

  /**
   * Get chequesAssignment
   * @return chequesAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveChequesAssignmentResponseChequesAssignment getChequesAssignment() {
    return chequesAssignment;
  }

  public void setChequesAssignment(RetrieveChequesAssignmentResponseChequesAssignment chequesAssignment) {
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
    RetrieveChequesAssignmentResponse retrieveChequesAssignmentResponse = (RetrieveChequesAssignmentResponse) o;
    return Objects.equals(this.issuedDeviceAllocation, retrieveChequesAssignmentResponse.issuedDeviceAllocation) &&
        Objects.equals(this.chequesAssignment, retrieveChequesAssignmentResponse.chequesAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceAllocation, chequesAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveChequesAssignmentResponse {\n");
    
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

