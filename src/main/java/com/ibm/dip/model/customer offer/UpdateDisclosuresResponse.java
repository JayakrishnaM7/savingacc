package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer offer.UpdateDisclosuresRequestDisclosures;
import com.ibm.dip.model.customer offer.UpdateFacilityApplicationRequestCustomerOfferProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateDisclosuresResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class UpdateDisclosuresResponse   {
  @JsonProperty("CustomerOfferProcedure")
  private UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure;

  @JsonProperty("Disclosures")
  private UpdateDisclosuresRequestDisclosures disclosures;

  public UpdateDisclosuresResponse customerOfferProcedure(UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure) {
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

  public UpdateDisclosuresResponse disclosures(UpdateDisclosuresRequestDisclosures disclosures) {
    this.disclosures = disclosures;
    return this;
  }

  /**
   * Get disclosures
   * @return disclosures
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateDisclosuresRequestDisclosures getDisclosures() {
    return disclosures;
  }

  public void setDisclosures(UpdateDisclosuresRequestDisclosures disclosures) {
    this.disclosures = disclosures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDisclosuresResponse updateDisclosuresResponse = (UpdateDisclosuresResponse) o;
    return Objects.equals(this.customerOfferProcedure, updateDisclosuresResponse.customerOfferProcedure) &&
        Objects.equals(this.disclosures, updateDisclosuresResponse.disclosures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedure, disclosures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDisclosuresResponse {\n");
    
    sb.append("    customerOfferProcedure: ").append(toIndentedString(customerOfferProcedure)).append("\n");
    sb.append("    disclosures: ").append(toIndentedString(disclosures)).append("\n");
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

