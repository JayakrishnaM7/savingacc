package com.ibm.dip.model.customer products and services;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerProductsAndServicesDirectoryEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:27.999Z[GMT]")

public class CustomerProductsAndServicesDirectoryEntry   {
  @JsonProperty("CustomerProductsAndServicesDirectoryEntryDescription")
  private String customerProductsAndServicesDirectoryEntryDescription;

  @JsonProperty("CustomerProductsAndServicesDirectoryEntrySchedule")
  private Object customerProductsAndServicesDirectoryEntrySchedule;

  @JsonProperty("CustomerProductsAndServicesDirectoryEntryVersion")
  private String customerProductsAndServicesDirectoryEntryVersion;

  @JsonProperty("CustomerProductsAndServicesDirectoryEntryStatus")
  private String customerProductsAndServicesDirectoryEntryStatus;

  @JsonProperty("CustomerProductsAndServicesDirectoryEntryUsageLog")
  private String customerProductsAndServicesDirectoryEntryUsageLog;

  @JsonProperty("CustomerProductsAndServicesDirectoryEntryUpdateLog")
  private String customerProductsAndServicesDirectoryEntryUpdateLog;

  @JsonProperty("CustomerProductsAndServicesDirectoryEntryServiceConfiguration")
  private String customerProductsAndServicesDirectoryEntryServiceConfiguration;

  @JsonProperty("CustomerProductsAndServicesDirectoryEntryReference")
  private String customerProductsAndServicesDirectoryEntryReference;

  public CustomerProductsAndServicesDirectoryEntry customerProductsAndServicesDirectoryEntryDescription(String customerProductsAndServicesDirectoryEntryDescription) {
    this.customerProductsAndServicesDirectoryEntryDescription = customerProductsAndServicesDirectoryEntryDescription;
    return this;
  }

  /**
   * Get customerProductsAndServicesDirectoryEntryDescription
   * @return customerProductsAndServicesDirectoryEntryDescription
  */
  @ApiModelProperty(value = "")


  public String getCustomerProductsAndServicesDirectoryEntryDescription() {
    return customerProductsAndServicesDirectoryEntryDescription;
  }

  public void setCustomerProductsAndServicesDirectoryEntryDescription(String customerProductsAndServicesDirectoryEntryDescription) {
    this.customerProductsAndServicesDirectoryEntryDescription = customerProductsAndServicesDirectoryEntryDescription;
  }

  public CustomerProductsAndServicesDirectoryEntry customerProductsAndServicesDirectoryEntrySchedule(Object customerProductsAndServicesDirectoryEntrySchedule) {
    this.customerProductsAndServicesDirectoryEntrySchedule = customerProductsAndServicesDirectoryEntrySchedule;
    return this;
  }

  /**
   * Get customerProductsAndServicesDirectoryEntrySchedule
   * @return customerProductsAndServicesDirectoryEntrySchedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerProductsAndServicesDirectoryEntrySchedule() {
    return customerProductsAndServicesDirectoryEntrySchedule;
  }

  public void setCustomerProductsAndServicesDirectoryEntrySchedule(Object customerProductsAndServicesDirectoryEntrySchedule) {
    this.customerProductsAndServicesDirectoryEntrySchedule = customerProductsAndServicesDirectoryEntrySchedule;
  }

  public CustomerProductsAndServicesDirectoryEntry customerProductsAndServicesDirectoryEntryVersion(String customerProductsAndServicesDirectoryEntryVersion) {
    this.customerProductsAndServicesDirectoryEntryVersion = customerProductsAndServicesDirectoryEntryVersion;
    return this;
  }

  /**
   * Get customerProductsAndServicesDirectoryEntryVersion
   * @return customerProductsAndServicesDirectoryEntryVersion
  */
  @ApiModelProperty(value = "")


  public String getCustomerProductsAndServicesDirectoryEntryVersion() {
    return customerProductsAndServicesDirectoryEntryVersion;
  }

  public void setCustomerProductsAndServicesDirectoryEntryVersion(String customerProductsAndServicesDirectoryEntryVersion) {
    this.customerProductsAndServicesDirectoryEntryVersion = customerProductsAndServicesDirectoryEntryVersion;
  }

  public CustomerProductsAndServicesDirectoryEntry customerProductsAndServicesDirectoryEntryStatus(String customerProductsAndServicesDirectoryEntryStatus) {
    this.customerProductsAndServicesDirectoryEntryStatus = customerProductsAndServicesDirectoryEntryStatus;
    return this;
  }

  /**
   * Get customerProductsAndServicesDirectoryEntryStatus
   * @return customerProductsAndServicesDirectoryEntryStatus
  */
  @ApiModelProperty(value = "")


  public String getCustomerProductsAndServicesDirectoryEntryStatus() {
    return customerProductsAndServicesDirectoryEntryStatus;
  }

  public void setCustomerProductsAndServicesDirectoryEntryStatus(String customerProductsAndServicesDirectoryEntryStatus) {
    this.customerProductsAndServicesDirectoryEntryStatus = customerProductsAndServicesDirectoryEntryStatus;
  }

  public CustomerProductsAndServicesDirectoryEntry customerProductsAndServicesDirectoryEntryUsageLog(String customerProductsAndServicesDirectoryEntryUsageLog) {
    this.customerProductsAndServicesDirectoryEntryUsageLog = customerProductsAndServicesDirectoryEntryUsageLog;
    return this;
  }

  /**
   * Get customerProductsAndServicesDirectoryEntryUsageLog
   * @return customerProductsAndServicesDirectoryEntryUsageLog
  */
  @ApiModelProperty(value = "")


  public String getCustomerProductsAndServicesDirectoryEntryUsageLog() {
    return customerProductsAndServicesDirectoryEntryUsageLog;
  }

  public void setCustomerProductsAndServicesDirectoryEntryUsageLog(String customerProductsAndServicesDirectoryEntryUsageLog) {
    this.customerProductsAndServicesDirectoryEntryUsageLog = customerProductsAndServicesDirectoryEntryUsageLog;
  }

  public CustomerProductsAndServicesDirectoryEntry customerProductsAndServicesDirectoryEntryUpdateLog(String customerProductsAndServicesDirectoryEntryUpdateLog) {
    this.customerProductsAndServicesDirectoryEntryUpdateLog = customerProductsAndServicesDirectoryEntryUpdateLog;
    return this;
  }

  /**
   * Get customerProductsAndServicesDirectoryEntryUpdateLog
   * @return customerProductsAndServicesDirectoryEntryUpdateLog
  */
  @ApiModelProperty(value = "")


  public String getCustomerProductsAndServicesDirectoryEntryUpdateLog() {
    return customerProductsAndServicesDirectoryEntryUpdateLog;
  }

  public void setCustomerProductsAndServicesDirectoryEntryUpdateLog(String customerProductsAndServicesDirectoryEntryUpdateLog) {
    this.customerProductsAndServicesDirectoryEntryUpdateLog = customerProductsAndServicesDirectoryEntryUpdateLog;
  }

  public CustomerProductsAndServicesDirectoryEntry customerProductsAndServicesDirectoryEntryServiceConfiguration(String customerProductsAndServicesDirectoryEntryServiceConfiguration) {
    this.customerProductsAndServicesDirectoryEntryServiceConfiguration = customerProductsAndServicesDirectoryEntryServiceConfiguration;
    return this;
  }

  /**
   * Get customerProductsAndServicesDirectoryEntryServiceConfiguration
   * @return customerProductsAndServicesDirectoryEntryServiceConfiguration
  */
  @ApiModelProperty(value = "")


  public String getCustomerProductsAndServicesDirectoryEntryServiceConfiguration() {
    return customerProductsAndServicesDirectoryEntryServiceConfiguration;
  }

  public void setCustomerProductsAndServicesDirectoryEntryServiceConfiguration(String customerProductsAndServicesDirectoryEntryServiceConfiguration) {
    this.customerProductsAndServicesDirectoryEntryServiceConfiguration = customerProductsAndServicesDirectoryEntryServiceConfiguration;
  }

  public CustomerProductsAndServicesDirectoryEntry customerProductsAndServicesDirectoryEntryReference(String customerProductsAndServicesDirectoryEntryReference) {
    this.customerProductsAndServicesDirectoryEntryReference = customerProductsAndServicesDirectoryEntryReference;
    return this;
  }

  /**
   * Get customerProductsAndServicesDirectoryEntryReference
   * @return customerProductsAndServicesDirectoryEntryReference
  */
  @ApiModelProperty(value = "")


  public String getCustomerProductsAndServicesDirectoryEntryReference() {
    return customerProductsAndServicesDirectoryEntryReference;
  }

  public void setCustomerProductsAndServicesDirectoryEntryReference(String customerProductsAndServicesDirectoryEntryReference) {
    this.customerProductsAndServicesDirectoryEntryReference = customerProductsAndServicesDirectoryEntryReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerProductsAndServicesDirectoryEntry customerProductsAndServicesDirectoryEntry = (CustomerProductsAndServicesDirectoryEntry) o;
    return Objects.equals(this.customerProductsAndServicesDirectoryEntryDescription, customerProductsAndServicesDirectoryEntry.customerProductsAndServicesDirectoryEntryDescription) &&
        Objects.equals(this.customerProductsAndServicesDirectoryEntrySchedule, customerProductsAndServicesDirectoryEntry.customerProductsAndServicesDirectoryEntrySchedule) &&
        Objects.equals(this.customerProductsAndServicesDirectoryEntryVersion, customerProductsAndServicesDirectoryEntry.customerProductsAndServicesDirectoryEntryVersion) &&
        Objects.equals(this.customerProductsAndServicesDirectoryEntryStatus, customerProductsAndServicesDirectoryEntry.customerProductsAndServicesDirectoryEntryStatus) &&
        Objects.equals(this.customerProductsAndServicesDirectoryEntryUsageLog, customerProductsAndServicesDirectoryEntry.customerProductsAndServicesDirectoryEntryUsageLog) &&
        Objects.equals(this.customerProductsAndServicesDirectoryEntryUpdateLog, customerProductsAndServicesDirectoryEntry.customerProductsAndServicesDirectoryEntryUpdateLog) &&
        Objects.equals(this.customerProductsAndServicesDirectoryEntryServiceConfiguration, customerProductsAndServicesDirectoryEntry.customerProductsAndServicesDirectoryEntryServiceConfiguration) &&
        Objects.equals(this.customerProductsAndServicesDirectoryEntryReference, customerProductsAndServicesDirectoryEntry.customerProductsAndServicesDirectoryEntryReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerProductsAndServicesDirectoryEntryDescription, customerProductsAndServicesDirectoryEntrySchedule, customerProductsAndServicesDirectoryEntryVersion, customerProductsAndServicesDirectoryEntryStatus, customerProductsAndServicesDirectoryEntryUsageLog, customerProductsAndServicesDirectoryEntryUpdateLog, customerProductsAndServicesDirectoryEntryServiceConfiguration, customerProductsAndServicesDirectoryEntryReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerProductsAndServicesDirectoryEntry {\n");
    
    sb.append("    customerProductsAndServicesDirectoryEntryDescription: ").append(toIndentedString(customerProductsAndServicesDirectoryEntryDescription)).append("\n");
    sb.append("    customerProductsAndServicesDirectoryEntrySchedule: ").append(toIndentedString(customerProductsAndServicesDirectoryEntrySchedule)).append("\n");
    sb.append("    customerProductsAndServicesDirectoryEntryVersion: ").append(toIndentedString(customerProductsAndServicesDirectoryEntryVersion)).append("\n");
    sb.append("    customerProductsAndServicesDirectoryEntryStatus: ").append(toIndentedString(customerProductsAndServicesDirectoryEntryStatus)).append("\n");
    sb.append("    customerProductsAndServicesDirectoryEntryUsageLog: ").append(toIndentedString(customerProductsAndServicesDirectoryEntryUsageLog)).append("\n");
    sb.append("    customerProductsAndServicesDirectoryEntryUpdateLog: ").append(toIndentedString(customerProductsAndServicesDirectoryEntryUpdateLog)).append("\n");
    sb.append("    customerProductsAndServicesDirectoryEntryServiceConfiguration: ").append(toIndentedString(customerProductsAndServicesDirectoryEntryServiceConfiguration)).append("\n");
    sb.append("    customerProductsAndServicesDirectoryEntryReference: ").append(toIndentedString(customerProductsAndServicesDirectoryEntryReference)).append("\n");
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

