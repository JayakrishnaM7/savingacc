package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveChequesAssignmentResponseChequesAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class RetrieveChequesAssignmentResponseChequesAssignment   {
  @JsonProperty("IssuedDeviceTemplateOrValues")
  private String issuedDeviceTemplateOrValues;

  @JsonProperty("IssueLocation")
  private String issueLocation;

  @JsonProperty("SequenceNumber")
  private String sequenceNumber;

  public RetrieveChequesAssignmentResponseChequesAssignment issuedDeviceTemplateOrValues(String issuedDeviceTemplateOrValues) {
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

  public RetrieveChequesAssignmentResponseChequesAssignment issueLocation(String issueLocation) {
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

  public RetrieveChequesAssignmentResponseChequesAssignment sequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  /**
   * Get sequenceNumber
   * @return sequenceNumber
  */
  @ApiModelProperty(value = "")


  public String getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveChequesAssignmentResponseChequesAssignment retrieveChequesAssignmentResponseChequesAssignment = (RetrieveChequesAssignmentResponseChequesAssignment) o;
    return Objects.equals(this.issuedDeviceTemplateOrValues, retrieveChequesAssignmentResponseChequesAssignment.issuedDeviceTemplateOrValues) &&
        Objects.equals(this.issueLocation, retrieveChequesAssignmentResponseChequesAssignment.issueLocation) &&
        Objects.equals(this.sequenceNumber, retrieveChequesAssignmentResponseChequesAssignment.sequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceTemplateOrValues, issueLocation, sequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveChequesAssignmentResponseChequesAssignment {\n");
    
    sb.append("    issuedDeviceTemplateOrValues: ").append(toIndentedString(issuedDeviceTemplateOrValues)).append("\n");
    sb.append("    issueLocation: ").append(toIndentedString(issueLocation)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
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

