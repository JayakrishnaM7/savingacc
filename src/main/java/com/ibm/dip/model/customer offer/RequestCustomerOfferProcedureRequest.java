package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer offer.InitiateCustomerOfferProcedureRequestCustomerOfferProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestCustomerOfferProcedureRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class RequestCustomerOfferProcedureRequest   {
  @JsonProperty("CustomerOfferProcedure")
  private InitiateCustomerOfferProcedureRequestCustomerOfferProcedure customerOfferProcedure;

  public RequestCustomerOfferProcedureRequest customerOfferProcedure(InitiateCustomerOfferProcedureRequestCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
    return this;
  }

  /**
   * Get customerOfferProcedure
   * @return customerOfferProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCustomerOfferProcedureRequestCustomerOfferProcedure getCustomerOfferProcedure() {
    return customerOfferProcedure;
  }

  public void setCustomerOfferProcedure(InitiateCustomerOfferProcedureRequestCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCustomerOfferProcedureRequest requestCustomerOfferProcedureRequest = (RequestCustomerOfferProcedureRequest) o;
    return Objects.equals(this.customerOfferProcedure, requestCustomerOfferProcedureRequest.customerOfferProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCustomerOfferProcedureRequest {\n");
    
    sb.append("    customerOfferProcedure: ").append(toIndentedString(customerOfferProcedure)).append("\n");
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

