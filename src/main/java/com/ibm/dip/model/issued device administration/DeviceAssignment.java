package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeviceAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class DeviceAssignment   {
  @JsonProperty("IssuedDeviceSerialNumber")
  private String issuedDeviceSerialNumber;

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

  public DeviceAssignment issuedDeviceSerialNumber(String issuedDeviceSerialNumber) {
    this.issuedDeviceSerialNumber = issuedDeviceSerialNumber;
    return this;
  }

  /**
   * Get issuedDeviceSerialNumber
   * @return issuedDeviceSerialNumber
  */
  @ApiModelProperty(value = "")


  public String getIssuedDeviceSerialNumber() {
    return issuedDeviceSerialNumber;
  }

  public void setIssuedDeviceSerialNumber(String issuedDeviceSerialNumber) {
    this.issuedDeviceSerialNumber = issuedDeviceSerialNumber;
  }

  public DeviceAssignment versionNumber(String versionNumber) {
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

  public DeviceAssignment customerCustomizationReference(Object customerCustomizationReference) {
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

  public DeviceAssignment deliverymethod(String deliverymethod) {
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

  public DeviceAssignment issueLocation(String issueLocation) {
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

  public DeviceAssignment issuedDeviceConfiguration(String issuedDeviceConfiguration) {
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

  public DeviceAssignment usageLog(String usageLog) {
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
    DeviceAssignment deviceAssignment = (DeviceAssignment) o;
    return Objects.equals(this.issuedDeviceSerialNumber, deviceAssignment.issuedDeviceSerialNumber) &&
        Objects.equals(this.versionNumber, deviceAssignment.versionNumber) &&
        Objects.equals(this.customerCustomizationReference, deviceAssignment.customerCustomizationReference) &&
        Objects.equals(this.deliverymethod, deviceAssignment.deliverymethod) &&
        Objects.equals(this.issueLocation, deviceAssignment.issueLocation) &&
        Objects.equals(this.issuedDeviceConfiguration, deviceAssignment.issuedDeviceConfiguration) &&
        Objects.equals(this.usageLog, deviceAssignment.usageLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceSerialNumber, versionNumber, customerCustomizationReference, deliverymethod, issueLocation, issuedDeviceConfiguration, usageLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceAssignment {\n");
    
    sb.append("    issuedDeviceSerialNumber: ").append(toIndentedString(issuedDeviceSerialNumber)).append("\n");
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

