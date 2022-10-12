package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerOfferProcedureRequestCorrespondenceandDocuments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class InitiateCustomerOfferProcedureRequestCorrespondenceandDocuments   {
  @JsonProperty("CustomerOfferRequiredDocuments")
  private String customerOfferRequiredDocuments;

  public InitiateCustomerOfferProcedureRequestCorrespondenceandDocuments customerOfferRequiredDocuments(String customerOfferRequiredDocuments) {
    this.customerOfferRequiredDocuments = customerOfferRequiredDocuments;
    return this;
  }

  /**
   * Get customerOfferRequiredDocuments
   * @return customerOfferRequiredDocuments
  */
  @ApiModelProperty(value = "")


  public String getCustomerOfferRequiredDocuments() {
    return customerOfferRequiredDocuments;
  }

  public void setCustomerOfferRequiredDocuments(String customerOfferRequiredDocuments) {
    this.customerOfferRequiredDocuments = customerOfferRequiredDocuments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerOfferProcedureRequestCorrespondenceandDocuments initiateCustomerOfferProcedureRequestCorrespondenceandDocuments = (InitiateCustomerOfferProcedureRequestCorrespondenceandDocuments) o;
    return Objects.equals(this.customerOfferRequiredDocuments, initiateCustomerOfferProcedureRequestCorrespondenceandDocuments.customerOfferRequiredDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferRequiredDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerOfferProcedureRequestCorrespondenceandDocuments {\n");
    
    sb.append("    customerOfferRequiredDocuments: ").append(toIndentedString(customerOfferRequiredDocuments)).append("\n");
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

