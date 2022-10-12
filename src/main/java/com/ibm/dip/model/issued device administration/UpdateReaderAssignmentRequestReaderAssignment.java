package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateReaderAssignmentRequestReaderAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class UpdateReaderAssignmentRequestReaderAssignment   {
  @JsonProperty("VersionNumber")
  private String versionNumber;

  @JsonProperty("IssueLocation")
  private String issueLocation;

  @JsonProperty("IssuedDeviceConfiguration")
  private String issuedDeviceConfiguration;

  @JsonProperty("UsageLog")
  private String usageLog;

  public UpdateReaderAssignmentRequestReaderAssignment versionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * Get versionNumber
   * @return versionNumber
  */
  @ApiModelProperty(value = "")


  public String getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
  }

  public UpdateReaderAssignmentRequestReaderAssignment issueLocation(String issueLocation) {
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

  public UpdateReaderAssignmentRequestReaderAssignment issuedDeviceConfiguration(String issuedDeviceConfiguration) {
    this.issuedDeviceConfiguration = issuedDeviceConfiguration;
    return this;
  }

  /**
   * Get issuedDeviceConfiguration
   * @return issuedDeviceConfiguration
  */
  @ApiModelProperty(value = "")


  public String getIssuedDeviceConfiguration() {
    return issuedDeviceConfiguration;
  }

  public void setIssuedDeviceConfiguration(String issuedDeviceConfiguration) {
    this.issuedDeviceConfiguration = issuedDeviceConfiguration;
  }

  public UpdateReaderAssignmentRequestReaderAssignment usageLog(String usageLog) {
    this.usageLog = usageLog;
    return this;
  }

  /**
   * Get usageLog
   * @return usageLog
  */
  @ApiModelProperty(value = "")


  public String getUsageLog() {
    return usageLog;
  }

  public void setUsageLog(String usageLog) {
    this.usageLog = usageLog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateReaderAssignmentRequestReaderAssignment updateReaderAssignmentRequestReaderAssignment = (UpdateReaderAssignmentRequestReaderAssignment) o;
    return Objects.equals(this.versionNumber, updateReaderAssignmentRequestReaderAssignment.versionNumber) &&
        Objects.equals(this.issueLocation, updateReaderAssignmentRequestReaderAssignment.issueLocation) &&
        Objects.equals(this.issuedDeviceConfiguration, updateReaderAssignmentRequestReaderAssignment.issuedDeviceConfiguration) &&
        Objects.equals(this.usageLog, updateReaderAssignmentRequestReaderAssignment.usageLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber, issueLocation, issuedDeviceConfiguration, usageLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateReaderAssignmentRequestReaderAssignment {\n");
    
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    issueLocation: ").append(toIndentedString(issueLocation)).append("\n");
    sb.append("    issuedDeviceConfiguration: ").append(toIndentedString(issuedDeviceConfiguration)).append("\n");
    sb.append("    usageLog: ").append(toIndentedString(usageLog)).append("\n");
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

