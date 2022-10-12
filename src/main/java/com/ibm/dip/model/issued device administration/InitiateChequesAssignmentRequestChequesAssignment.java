package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateChequesAssignmentRequestChequesAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class InitiateChequesAssignmentRequestChequesAssignment   {
  @JsonProperty("IssuedDeviceTemplateOrValues")
  private String issuedDeviceTemplateOrValues;

  @JsonProperty("IssueLocation")
  private String issueLocation;

  public InitiateChequesAssignmentRequestChequesAssignment issuedDeviceTemplateOrValues(String issuedDeviceTemplateOrValues) {
    this.issuedDeviceTemplateOrValues = issuedDeviceTemplateOrValues;
    return this;
  }

  /**
   * Get issuedDeviceTemplateOrValues
   * @return issuedDeviceTemplateOrValues
  */
  @ApiModelProperty(value = "")


  public String getIssuedDeviceTemplateOrValues() {
    return issuedDeviceTemplateOrValues;
  }

  public void setIssuedDeviceTemplateOrValues(String issuedDeviceTemplateOrValues) {
    this.issuedDeviceTemplateOrValues = issuedDeviceTemplateOrValues;
  }

  public InitiateChequesAssignmentRequestChequesAssignment issueLocation(String issueLocation) {
    this.issueLocation = issueLocation;
    return this;
  }

  /**
   * Get issueLocation
   * @return issueLocation
  */
  @ApiModelProperty(value = "")


  public String getIssueLocation() {
    return issueLocation;
  }

  public void setIssueLocation(String issueLocation) {
    this.issueLocation = issueLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateChequesAssignmentRequestChequesAssignment initiateChequesAssignmentRequestChequesAssignment = (InitiateChequesAssignmentRequestChequesAssignment) o;
    return Objects.equals(this.issuedDeviceTemplateOrValues, initiateChequesAssignmentRequestChequesAssignment.issuedDeviceTemplateOrValues) &&
        Objects.equals(this.issueLocation, initiateChequesAssignmentRequestChequesAssignment.issueLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceTemplateOrValues, issueLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateChequesAssignmentRequestChequesAssignment {\n");
    
    sb.append("    issuedDeviceTemplateOrValues: ").append(toIndentedString(issuedDeviceTemplateOrValues)).append("\n");
    sb.append("    issueLocation: ").append(toIndentedString(issueLocation)).append("\n");
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

