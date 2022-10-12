package com.ibm.dip.model.customer products and services;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InForceServiceproperty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:27.999Z[GMT]")

public class InForceServiceproperty   {
  @JsonProperty("Preconditions")
  private Object preconditions;

  @JsonProperty("Schedule")
  private Object schedule;

  @JsonProperty("VersionNumber")
  private String versionNumber;

  @JsonProperty("BusinessService")
  private Object businessService;

  @JsonProperty("CustomerProductsAndServicesDirectoryEntryReference")
  private String customerProductsAndServicesDirectoryEntryReference;

  @JsonProperty("In-forceServicepropertyReference")
  private Object inForceServicepropertyReference;

  @JsonProperty("In-forceServicepropertyType")
  private String inForceServicepropertyType;

  public InForceServiceproperty preconditions(Object preconditions) {
    this.preconditions = preconditions;
    return this;
  }

  /**
   * Get preconditions
   * @return preconditions
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPreconditions() {
    return preconditions;
  }

  public void setPreconditions(Object preconditions) {
    this.preconditions = preconditions;
  }

  public InForceServiceproperty schedule(Object schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSchedule() {
    return schedule;
  }

  public void setSchedule(Object schedule) {
    this.schedule = schedule;
  }

  public InForceServiceproperty versionNumber(String versionNumber) {
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

  public InForceServiceproperty businessService(Object businessService) {
    this.businessService = businessService;
    return this;
  }

  /**
   * Get businessService
   * @return businessService
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBusinessService() {
    return businessService;
  }

  public void setBusinessService(Object businessService) {
    this.businessService = businessService;
  }

  public InForceServiceproperty customerProductsAndServicesDirectoryEntryReference(String customerProductsAndServicesDirectoryEntryReference) {
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

  public InForceServiceproperty inForceServicepropertyReference(Object inForceServicepropertyReference) {
    this.inForceServicepropertyReference = inForceServicepropertyReference;
    return this;
  }

  /**
   * Get inForceServicepropertyReference
   * @return inForceServicepropertyReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInForceServicepropertyReference() {
    return inForceServicepropertyReference;
  }

  public void setInForceServicepropertyReference(Object inForceServicepropertyReference) {
    this.inForceServicepropertyReference = inForceServicepropertyReference;
  }

  public InForceServiceproperty inForceServicepropertyType(String inForceServicepropertyType) {
    this.inForceServicepropertyType = inForceServicepropertyType;
    return this;
  }

  /**
   * Get inForceServicepropertyType
   * @return inForceServicepropertyType
  */
  @ApiModelProperty(value = "")


  public String getInForceServicepropertyType() {
    return inForceServicepropertyType;
  }

  public void setInForceServicepropertyType(String inForceServicepropertyType) {
    this.inForceServicepropertyType = inForceServicepropertyType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InForceServiceproperty inForceServiceproperty = (InForceServiceproperty) o;
    return Objects.equals(this.preconditions, inForceServiceproperty.preconditions) &&
        Objects.equals(this.schedule, inForceServiceproperty.schedule) &&
        Objects.equals(this.versionNumber, inForceServiceproperty.versionNumber) &&
        Objects.equals(this.businessService, inForceServiceproperty.businessService) &&
        Objects.equals(this.customerProductsAndServicesDirectoryEntryReference, inForceServiceproperty.customerProductsAndServicesDirectoryEntryReference) &&
        Objects.equals(this.inForceServicepropertyReference, inForceServiceproperty.inForceServicepropertyReference) &&
        Objects.equals(this.inForceServicepropertyType, inForceServiceproperty.inForceServicepropertyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, versionNumber, businessService, customerProductsAndServicesDirectoryEntryReference, inForceServicepropertyReference, inForceServicepropertyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InForceServiceproperty {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    customerProductsAndServicesDirectoryEntryReference: ").append(toIndentedString(customerProductsAndServicesDirectoryEntryReference)).append("\n");
    sb.append("    inForceServicepropertyReference: ").append(toIndentedString(inForceServicepropertyReference)).append("\n");
    sb.append("    inForceServicepropertyType: ").append(toIndentedString(inForceServicepropertyType)).append("\n");
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

