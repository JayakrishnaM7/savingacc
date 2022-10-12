package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateDeviceAssignmentRequestDeviceAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class UpdateDeviceAssignmentRequestDeviceAssignment   {
  @JsonProperty("VersionNumber")
  private String versionNumber;

  @JsonProperty("CustomerCustomizationReference")
  private Object customerCustomizationReference;

  @JsonProperty("Deliverymethod")
  private String deliverymethod;

  @JsonProperty("IssueLocation")
  private String issueLocation;

  @JsonProperty("IssuedDeviceConfiguration")
  private String issuedDeviceConfiguration;

  @JsonProperty("UsageLog")
  private String usageLog;

  public UpdateDeviceAssignmentRequestDeviceAssignment versionNumber(String versionNumber) {
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

  public UpdateDeviceAssignmentRequestDeviceAssignment customerCustomizationReference(Object customerCustomizationReference) {
    this.customerCustomizationReference = customerCustomizationReference;
    return this;
  }

  /**
   * Get customerCustomizationReference
   * @return customerCustomizationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerCustomizationReference() {
    return customerCustomizationReference;
  }

  public void setCustomerCustomizationReference(Object customerCustomizationReference) {
    this.customerCustomizationReference = customerCustomizationReference;
  }

  public UpdateDeviceAssignmentRequestDeviceAssignment deliverymethod(String deliverymethod) {
    this.deliverymethod = deliverymethod;
    return this;
  }

  /**
   * Get deliverymethod
   * @return deliverymethod
  */
  @ApiModelProperty(value = "")


  public String getDeliverymethod() {
    return deliverymethod;
  }

  public void setDeliverymethod(String deliverymethod) {
    this.deliverymethod = deliverymethod;
  }

  public UpdateDeviceAssignmentRequestDeviceAssignment issueLocation(String issueLocation) {
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

  public UpdateDeviceAssignmentRequestDeviceAssignment issuedDeviceConfiguration(String issuedDeviceConfiguration) {
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

  public UpdateDeviceAssignmentRequestDeviceAssignment usageLog(String usageLog) {
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
    UpdateDeviceAssignmentRequestDeviceAssignment updateDeviceAssignmentRequestDeviceAssignment = (UpdateDeviceAssignmentRequestDeviceAssignment) o;
    return Objects.equals(this.versionNumber, updateDeviceAssignmentRequestDeviceAssignment.versionNumber) &&
        Objects.equals(this.customerCustomizationReference, updateDeviceAssignmentRequestDeviceAssignment.customerCustomizationReference) &&
        Objects.equals(this.deliverymethod, updateDeviceAssignmentRequestDeviceAssignment.deliverymethod) &&
        Objects.equals(this.issueLocation, updateDeviceAssignmentRequestDeviceAssignment.issueLocation) &&
        Objects.equals(this.issuedDeviceConfiguration, updateDeviceAssignmentRequestDeviceAssignment.issuedDeviceConfiguration) &&
        Objects.equals(this.usageLog, updateDeviceAssignmentRequestDeviceAssignment.usageLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber, customerCustomizationReference, deliverymethod, issueLocation, issuedDeviceConfiguration, usageLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDeviceAssignmentRequestDeviceAssignment {\n");
    
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    customerCustomizationReference: ").append(toIndentedString(customerCustomizationReference)).append("\n");
    sb.append("    deliverymethod: ").append(toIndentedString(deliverymethod)).append("\n");
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

