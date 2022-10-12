package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerOfferProcedureRequestAgreement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class InitiateCustomerOfferProcedureRequestAgreement   {
  @JsonProperty("CustomerAgreementInstanceReference")
  private Object customerAgreementInstanceReference;

  public InitiateCustomerOfferProcedureRequestAgreement customerAgreementInstanceReference(Object customerAgreementInstanceReference) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerOfferProcedureRequestAgreement initiateCustomerOfferProcedureRequestAgreement = (InitiateCustomerOfferProcedureRequestAgreement) o;
    return Objects.equals(this.customerAgreementInstanceReference, initiateCustomerOfferProcedureRequestAgreement.customerAgreementInstanceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAgreementInstanceReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerOfferProcedureRequestAgreement {\n");
    
    sb.append("    customerAgreementInstanceReference: ").append(toIndentedString(customerAgreementInstanceReference)).append("\n");
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

