package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("IssuedDeviceType")
  private String issuedDeviceType;

  @JsonProperty("AssociatedPermissions")
  private String associatedPermissions;

  @JsonProperty("ValidFrom-ToDate")
  private String validFromToDate;

  public InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation productInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * Get productInstanceReference
   * @return productInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation issuedDeviceType(String issuedDeviceType) {
    this.issuedDeviceType = issuedDeviceType;
    return this;
  }

  /**
   * Get issuedDeviceType
   * @return issuedDeviceType
  */
  @ApiModelProperty(value = "")


  public String getIssuedDeviceType() {
    return issuedDeviceType;
  }

  public void setIssuedDeviceType(String issuedDeviceType) {
    this.issuedDeviceType = issuedDeviceType;
  }

  public InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation associatedPermissions(String associatedPermissions) {
    this.associatedPermissions = associatedPermissions;
    return this;
  }

  /**
   * Get associatedPermissions
   * @return associatedPermissions
  */
  @ApiModelProperty(value = "")


  public String getAssociatedPermissions() {
    return associatedPermissions;
  }

  public void setAssociatedPermissions(String associatedPermissions) {
    this.associatedPermissions = associatedPermissions;
  }

  public InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation validFromToDate(String validFromToDate) {
    this.validFromToDate = validFromToDate;
    return this;
  }

  /**
   * Get validFromToDate
   * @return validFromToDate
  */
  @ApiModelProperty(value = "")


  public String getValidFromToDate() {
    return validFromToDate;
  }

  public void setValidFromToDate(String validFromToDate) {
    this.validFromToDate = validFromToDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation initiateIssuedDeviceAllocationRequestIssuedDeviceAllocation = (InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation) o;
    return Objects.equals(this.customerReference, initiateIssuedDeviceAllocationRequestIssuedDeviceAllocation.customerReference) &&
        Objects.equals(this.productInstanceReference, initiateIssuedDeviceAllocationRequestIssuedDeviceAllocation.productInstanceReference) &&
        Objects.equals(this.issuedDeviceType, initiateIssuedDeviceAllocationRequestIssuedDeviceAllocation.issuedDeviceType) &&
        Objects.equals(this.associatedPermissions, initiateIssuedDeviceAllocationRequestIssuedDeviceAllocation.associatedPermissions) &&
        Objects.equals(this.validFromToDate, initiateIssuedDeviceAllocationRequestIssuedDeviceAllocation.validFromToDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, productInstanceReference, issuedDeviceType, associatedPermissions, validFromToDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    issuedDeviceType: ").append(toIndentedString(issuedDeviceType)).append("\n");
    sb.append("    associatedPermissions: ").append(toIndentedString(associatedPermissions)).append("\n");
    sb.append("    validFromToDate: ").append(toIndentedString(validFromToDate)).append("\n");
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

