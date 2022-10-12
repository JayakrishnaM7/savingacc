package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateAgreementRequestAgreement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class UpdateAgreementRequestAgreement   {
  @JsonProperty("CustomerAgreementInstanceReference")
  private Object customerAgreementInstanceReference;

  @JsonProperty("SalesProductAgreementInstanceReference")
  private Object salesProductAgreementInstanceReference;

  public UpdateAgreementRequestAgreement customerAgreementInstanceReference(Object customerAgreementInstanceReference) {
    this.customerAgreementInstanceReference = customerAgreementInstanceReference;
    return this;
  }

  /**
   * Get customerAgreementInstanceReference
   * @return customerAgreementInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerAgreementInstanceReference() {
    return customerAgreementInstanceReference;
  }

  public void setCustomerAgreementInstanceReference(Object customerAgreementInstanceReference) {
    this.customerAgreementInstanceReference = customerAgreementInstanceReference;
  }

  public UpdateAgreementRequestAgreement salesProductAgreementInstanceReference(Object salesProductAgreementInstanceReference) {
    this.salesProductAgreementInstanceReference = salesProductAgreementInstanceReference;
    return this;
  }

  /**
   * Get salesProductAgreementInstanceReference
   * @return salesProductAgreementInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSalesProductAgreementInstanceReference() {
    return salesProductAgreementInstanceReference;
  }

  public void setSalesProductAgreementInstanceReference(Object salesProductAgreementInstanceReference) {
    this.salesProductAgreementInstanceReference = salesProductAgreementInstanceReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAgreementRequestAgreement updateAgreementRequestAgreement = (UpdateAgreementRequestAgreement) o;
    return Objects.equals(this.customerAgreementInstanceReference, updateAgreementRequestAgreement.customerAgreementInstanceReference) &&
        Objects.equals(this.salesProductAgreementInstanceReference, updateAgreementRequestAgreement.salesProductAgreementInstanceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAgreementInstanceReference, salesProductAgreementInstanceReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAgreementRequestAgreement {\n");
    
    sb.append("    customerAgreementInstanceReference: ").append(toIndentedString(customerAgreementInstanceReference)).append("\n");
    sb.append("    salesProductAgreementInstanceReference: ").append(toIndentedString(salesProductAgreementInstanceReference)).append("\n");
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

