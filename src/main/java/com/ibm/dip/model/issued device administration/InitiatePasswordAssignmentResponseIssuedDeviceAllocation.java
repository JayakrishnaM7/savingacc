package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePasswordAssignmentResponseIssuedDeviceAllocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class InitiatePasswordAssignmentResponseIssuedDeviceAllocation   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("AssociatedPermissions")
  private String associatedPermissions;

  @JsonProperty("IssueDate")
  private String issueDate;

  @JsonProperty("ValidFrom-ToDate")
  private String validFromToDate;

  public InitiatePasswordAssignmentResponseIssuedDeviceAllocation customerReference(Object customerReference) {
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

  public InitiatePasswordAssignmentResponseIssuedDeviceAllocation productInstanceReference(Object productInstanceReference) {
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

  public InitiatePasswordAssignmentResponseIssuedDeviceAllocation associatedPermissions(String associatedPermissions) {
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

  public InitiatePasswordAssignmentResponseIssuedDeviceAllocation issueDate(String issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  /**
   * Get issueDate
   * @return issueDate
  */
  @ApiModelProperty(value = "")


  public String getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }

  public InitiatePasswordAssignmentResponseIssuedDeviceAllocation validFromToDate(String validFromToDate) {
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
    InitiatePasswordAssignmentResponseIssuedDeviceAllocation initiatePasswordAssignmentResponseIssuedDeviceAllocation = (InitiatePasswordAssignmentResponseIssuedDeviceAllocation) o;
    return Objects.equals(this.customerReference, initiatePasswordAssignmentResponseIssuedDeviceAllocation.customerReference) &&
        Objects.equals(this.productInstanceReference, initiatePasswordAssignmentResponseIssuedDeviceAllocation.productInstanceReference) &&
        Objects.equals(this.associatedPermissions, initiatePasswordAssignmentResponseIssuedDeviceAllocation.associatedPermissions) &&
        Objects.equals(this.issueDate, initiatePasswordAssignmentResponseIssuedDeviceAllocation.issueDate) &&
        Objects.equals(this.validFromToDate, initiatePasswordAssignmentResponseIssuedDeviceAllocation.validFromToDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, productInstanceReference, associatedPermissions, issueDate, validFromToDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePasswordAssignmentResponseIssuedDeviceAllocation {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    associatedPermissions: ").append(toIndentedString(associatedPermissions)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
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

