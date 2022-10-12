package com.ibm.dip.model.customer products and services;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InForceProductproperty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:27.999Z[GMT]")

public class InForceProductproperty   {
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

  @JsonProperty("In-forceProductpropertyReference")
  private Object inForceProductpropertyReference;

  @JsonProperty("In-forceProductpropertyType")
  private String inForceProductpropertyType;

  public InForceProductproperty preconditions(Object preconditions) {
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

  public InForceProductproperty schedule(Object schedule) {
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

  public InForceProductproperty versionNumber(String versionNumber) {
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

  public InForceProductproperty businessService(Object businessService) {
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

  public InForceProductproperty customerProductsAndServicesDirectoryEntryReference(String customerProductsAndServicesDirectoryEntryReference) {
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

  public InForceProductproperty inForceProductpropertyReference(Object inForceProductpropertyReference) {
    this.inForceProductpropertyReference = inForceProductpropertyReference;
    return this;
  }

  /**
   * Get inForceProductpropertyReference
   * @return inForceProductpropertyReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInForceProductpropertyReference() {
    return inForceProductpropertyReference;
  }

  public void setInForceProductpropertyReference(Object inForceProductpropertyReference) {
    this.inForceProductpropertyReference = inForceProductpropertyReference;
  }

  public InForceProductproperty inForceProductpropertyType(String inForceProductpropertyType) {
    this.inForceProductpropertyType = inForceProductpropertyType;
    return this;
  }

  /**
   * Get inForceProductpropertyType
   * @return inForceProductpropertyType
  */
  @ApiModelProperty(value = "")


  public String getInForceProductpropertyType() {
    return inForceProductpropertyType;
  }

  public void setInForceProductpropertyType(String inForceProductpropertyType) {
    this.inForceProductpropertyType = inForceProductpropertyType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InForceProductproperty inForceProductproperty = (InForceProductproperty) o;
    return Objects.equals(this.preconditions, inForceProductproperty.preconditions) &&
        Objects.equals(this.schedule, inForceProductproperty.schedule) &&
        Objects.equals(this.versionNumber, inForceProductproperty.versionNumber) &&
        Objects.equals(this.businessService, inForceProductproperty.businessService) &&
        Objects.equals(this.customerProductsAndServicesDirectoryEntryReference, inForceProductproperty.customerProductsAndServicesDirectoryEntryReference) &&
        Objects.equals(this.inForceProductpropertyReference, inForceProductproperty.inForceProductpropertyReference) &&
        Objects.equals(this.inForceProductpropertyType, inForceProductproperty.inForceProductpropertyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, versionNumber, businessService, customerProductsAndServicesDirectoryEntryReference, inForceProductpropertyReference, inForceProductpropertyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InForceProductproperty {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    customerProductsAndServicesDirectoryEntryReference: ").append(toIndentedString(customerProductsAndServicesDirectoryEntryReference)).append("\n");
    sb.append("    inForceProductpropertyReference: ").append(toIndentedString(inForceProductpropertyReference)).append("\n");
    sb.append("    inForceProductpropertyType: ").append(toIndentedString(inForceProductpropertyType)).append("\n");
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

