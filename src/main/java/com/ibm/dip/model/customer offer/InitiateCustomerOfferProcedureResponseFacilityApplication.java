package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerOfferProcedureResponseFacilityApplication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class InitiateCustomerOfferProcedureResponseFacilityApplication   {
  @JsonProperty("FacilityOption")
  private String facilityOption;

  @JsonProperty("FacilityOptionDescription")
  private String facilityOptionDescription;

  @JsonProperty("FacilityPricing")
  private String facilityPricing;

  @JsonProperty("NegotiationGuidelinesOrRules")
  private String negotiationGuidelinesOrRules;

  public InitiateCustomerOfferProcedureResponseFacilityApplication facilityOption(String facilityOption) {
    this.facilityOption = facilityOption;
    return this;
  }

  /**
   * Get facilityOption
   * @return facilityOption
  */
  @ApiModelProperty(value = "")


  public String getFacilityOption() {
    return facilityOption;
  }

  public void setFacilityOption(String facilityOption) {
    this.facilityOption = facilityOption;
  }

  public InitiateCustomerOfferProcedureResponseFacilityApplication facilityOptionDescription(String facilityOptionDescription) {
    this.facilityOptionDescription = facilityOptionDescription;
    return this;
  }

  /**
   * Get facilityOptionDescription
   * @return facilityOptionDescription
  */
  @ApiModelProperty(value = "")


  public String getFacilityOptionDescription() {
    return facilityOptionDescription;
  }

  public void setFacilityOptionDescription(String facilityOptionDescription) {
    this.facilityOptionDescription = facilityOptionDescription;
  }

  public InitiateCustomerOfferProcedureResponseFacilityApplication facilityPricing(String facilityPricing) {
    this.facilityPricing = facilityPricing;
    return this;
  }

  /**
   * Get facilityPricing
   * @return facilityPricing
  */
  @ApiModelProperty(value = "")


  public String getFacilityPricing() {
    return facilityPricing;
  }

  public void setFacilityPricing(String facilityPricing) {
    this.facilityPricing = facilityPricing;
  }

  public InitiateCustomerOfferProcedureResponseFacilityApplication negotiationGuidelinesOrRules(String negotiationGuidelinesOrRules) {
    this.negotiationGuidelinesOrRules = negotiationGuidelinesOrRules;
    return this;
  }

  /**
   * Get negotiationGuidelinesOrRules
   * @return negotiationGuidelinesOrRules
  */
  @ApiModelProperty(value = "")


  public String getNegotiationGuidelinesOrRules() {
    return negotiationGuidelinesOrRules;
  }

  public void setNegotiationGuidelinesOrRules(String negotiationGuidelinesOrRules) {
    this.negotiationGuidelinesOrRules = negotiationGuidelinesOrRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerOfferProcedureResponseFacilityApplication initiateCustomerOfferProcedureResponseFacilityApplication = (InitiateCustomerOfferProcedureResponseFacilityApplication) o;
    return Objects.equals(this.facilityOption, initiateCustomerOfferProcedureResponseFacilityApplication.facilityOption) &&
        Objects.equals(this.facilityOptionDescription, initiateCustomerOfferProcedureResponseFacilityApplication.facilityOptionDescription) &&
        Objects.equals(this.facilityPricing, initiateCustomerOfferProcedureResponseFacilityApplication.facilityPricing) &&
        Objects.equals(this.negotiationGuidelinesOrRules, initiateCustomerOfferProcedureResponseFacilityApplication.negotiationGuidelinesOrRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facilityOption, facilityOptionDescription, facilityPricing, negotiationGuidelinesOrRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerOfferProcedureResponseFacilityApplication {\n");
    
    sb.append("    facilityOption: ").append(toIndentedString(facilityOption)).append("\n");
    sb.append("    facilityOptionDescription: ").append(toIndentedString(facilityOptionDescription)).append("\n");
    sb.append("    facilityPricing: ").append(toIndentedString(facilityPricing)).append("\n");
    sb.append("    negotiationGuidelinesOrRules: ").append(toIndentedString(negotiationGuidelinesOrRules)).append("\n");
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

