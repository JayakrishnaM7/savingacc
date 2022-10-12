package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer offer.InitiateCustomerOfferProcedureResponseCustomerOfferProcedure;
import com.ibm.dip.model.customer offer.InitiateCustomerOfferProcedureResponseDisclosures;
import com.ibm.dip.model.customer offer.InitiateCustomerOfferProcedureResponseFacilityApplication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerOfferProcedureResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class InitiateCustomerOfferProcedureResponse   {
  @JsonProperty("CustomerOfferProcedure")
  private InitiateCustomerOfferProcedureResponseCustomerOfferProcedure customerOfferProcedure;

  @JsonProperty("FacilityApplication")
  private InitiateCustomerOfferProcedureResponseFacilityApplication facilityApplication;

  @JsonProperty("Disclosures")
  private InitiateCustomerOfferProcedureResponseDisclosures disclosures;

  public InitiateCustomerOfferProcedureResponse customerOfferProcedure(InitiateCustomerOfferProcedureResponseCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
    return this;
  }

  /**
   * Get customerOfferProcedure
   * @return customerOfferProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCustomerOfferProcedureResponseCustomerOfferProcedure getCustomerOfferProcedure() {
    return customerOfferProcedure;
  }

  public void setCustomerOfferProcedure(InitiateCustomerOfferProcedureResponseCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
  }

  public InitiateCustomerOfferProcedureResponse facilityApplication(InitiateCustomerOfferProcedureResponseFacilityApplication facilityApplication) {
    this.facilityApplication = facilityApplication;
    return this;
  }

  /**
   * Get facilityApplication
   * @return facilityApplication
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCustomerOfferProcedureResponseFacilityApplication getFacilityApplication() {
    return facilityApplication;
  }

  public void setFacilityApplication(InitiateCustomerOfferProcedureResponseFacilityApplication facilityApplication) {
    this.facilityApplication = facilityApplication;
  }

  public InitiateCustomerOfferProcedureResponse disclosures(InitiateCustomerOfferProcedureResponseDisclosures disclosures) {
    this.disclosures = disclosures;
    return this;
  }

  /**
   * Get disclosures
   * @return disclosures
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCustomerOfferProcedureResponseDisclosures getDisclosures() {
    return disclosures;
  }

  public void setDisclosures(InitiateCustomerOfferProcedureResponseDisclosures disclosures) {
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
    InitiateCustomerOfferProcedureResponse initiateCustomerOfferProcedureResponse = (InitiateCustomerOfferProcedureResponse) o;
    return Objects.equals(this.customerOfferProcedure, initiateCustomerOfferProcedureResponse.customerOfferProcedure) &&
        Objects.equals(this.facilityApplication, initiateCustomerOfferProcedureResponse.facilityApplication) &&
        Objects.equals(this.disclosures, initiateCustomerOfferProcedureResponse.disclosures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedure, facilityApplication, disclosures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerOfferProcedureResponse {\n");
    
    sb.append("    customerOfferProcedure: ").append(toIndentedString(customerOfferProcedure)).append("\n");
    sb.append("    facilityApplication: ").append(toIndentedString(facilityApplication)).append("\n");
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

