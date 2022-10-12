package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer offer.UpdateFacilityApplicationRequestCustomerOfferProcedure;
import com.ibm.dip.model.customer offer.UpdateProductInitializationRequestProductInitialization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateProductInitializationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class UpdateProductInitializationResponse   {
  @JsonProperty("CustomerOfferProcedure")
  private UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure;

  @JsonProperty("ProductInitialization")
  private UpdateProductInitializationRequestProductInitialization productInitialization;

  public UpdateProductInitializationResponse customerOfferProcedure(UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
    return this;
  }

  /**
   * Get customerOfferProcedure
   * @return customerOfferProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateFacilityApplicationRequestCustomerOfferProcedure getCustomerOfferProcedure() {
    return customerOfferProcedure;
  }

  public void setCustomerOfferProcedure(UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
  }

  public UpdateProductInitializationResponse productInitialization(UpdateProductInitializationRequestProductInitialization productInitialization) {
    this.productInitialization = productInitialization;
    return this;
  }

  /**
   * Get productInitialization
   * @return productInitialization
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateProductInitializationRequestProductInitialization getProductInitialization() {
    return productInitialization;
  }

  public void setProductInitialization(UpdateProductInitializationRequestProductInitialization productInitialization) {
    this.productInitialization = productInitialization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateProductInitializationResponse updateProductInitializationResponse = (UpdateProductInitializationResponse) o;
    return Objects.equals(this.customerOfferProcedure, updateProductInitializationResponse.customerOfferProcedure) &&
        Objects.equals(this.productInitialization, updateProductInitializationResponse.productInitialization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedure, productInitialization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProductInitializationResponse {\n");
    
    sb.append("    customerOfferProcedure: ").append(toIndentedString(customerOfferProcedure)).append("\n");
    sb.append("    productInitialization: ").append(toIndentedString(productInitialization)).append("\n");
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

