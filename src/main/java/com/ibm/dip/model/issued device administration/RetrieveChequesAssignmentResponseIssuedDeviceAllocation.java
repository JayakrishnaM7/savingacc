package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveChequesAssignmentResponseIssuedDeviceAllocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class RetrieveChequesAssignmentResponseIssuedDeviceAllocation   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("IssuedDeviceType")
  private String issuedDeviceType;

  @JsonProperty("ValidFrom-ToDate")
  private String validFromToDate;

  public RetrieveChequesAssignmentResponseIssuedDeviceAllocation customerReference(Object customerReference) {
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

  public RetrieveChequesAssignmentResponseIssuedDeviceAllocation productInstanceReference(Object productInstanceReference) {
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

  public RetrieveChequesAssignmentResponseIssuedDeviceAllocation issuedDeviceType(String issuedDeviceType) {
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

  public RetrieveChequesAssignmentResponseIssuedDeviceAllocation validFromToDate(String validFromToDate) {
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
    RetrieveChequesAssignmentResponseIssuedDeviceAllocation retrieveChequesAssignmentResponseIssuedDeviceAllocation = (RetrieveChequesAssignmentResponseIssuedDeviceAllocation) o;
    return Objects.equals(this.customerReference, retrieveChequesAssignmentResponseIssuedDeviceAllocation.customerReference) &&
        Objects.equals(this.productInstanceReference, retrieveChequesAssignmentResponseIssuedDeviceAllocation.productInstanceReference) &&
        Objects.equals(this.issuedDeviceType, retrieveChequesAssignmentResponseIssuedDeviceAllocation.issuedDeviceType) &&
        Objects.equals(this.validFromToDate, retrieveChequesAssignmentResponseIssuedDeviceAllocation.validFromToDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, productInstanceReference, issuedDeviceType, validFromToDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveChequesAssignmentResponseIssuedDeviceAllocation {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    issuedDeviceType: ").append(toIndentedString(issuedDeviceType)).append("\n");
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

