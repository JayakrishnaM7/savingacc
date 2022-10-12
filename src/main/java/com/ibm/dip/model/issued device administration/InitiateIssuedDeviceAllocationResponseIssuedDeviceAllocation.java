package com.ibm.dip.model.issued device administration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateIssuedDeviceAllocationResponseIssuedDeviceAllocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:52.898Z[GMT]")

public class InitiateIssuedDeviceAllocationResponseIssuedDeviceAllocation   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("AssociatedPermissions")
  private String associatedPermissions;

  @JsonProperty("IssueDate")
  private String issueDate;

  @JsonProperty("ValidFrom-ToDate")
  private String validFromToDate;

  public InitiateIssuedDeviceAllocationResponseIssuedDeviceAllocation productInstanceReference(Object productInstanceReference) {
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

  public InitiateIssuedDeviceAllocationResponseIssuedDeviceAllocation associatedPermissions(String associatedPermissions) {
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

  public InitiateIssuedDeviceAllocationResponseIssuedDeviceAllocation issueDate(String issueDate) {
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

  public InitiateIssuedDeviceAllocationResponseIssuedDeviceAllocation validFromToDate(String validFromToDate) {
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
    InitiateIssuedDeviceAllocationResponseIssuedDeviceAllocation initiateIssuedDeviceAllocationResponseIssuedDeviceAllocation = (InitiateIssuedDeviceAllocationResponseIssuedDeviceAllocation) o;
    return Objects.equals(this.productInstanceReference, initiateIssuedDeviceAllocationResponseIssuedDeviceAllocation.productInstanceReference) &&
        Objects.equals(this.associatedPermissions, initiateIssuedDeviceAllocationResponseIssuedDeviceAllocation.associatedPermissions) &&
        Objects.equals(this.issueDate, initiateIssuedDeviceAllocationResponseIssuedDeviceAllocation.issueDate) &&
        Objects.equals(this.validFromToDate, initiateIssuedDeviceAllocationResponseIssuedDeviceAllocation.validFromToDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, associatedPermissions, issueDate, validFromToDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateIssuedDeviceAllocationResponseIssuedDeviceAllocation {\n");
    
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

