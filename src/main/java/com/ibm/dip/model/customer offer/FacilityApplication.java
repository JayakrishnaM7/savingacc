package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FacilityApplication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class FacilityApplication   {
  @JsonProperty("FacilityOption")
  private String facilityOption;

  @JsonProperty("FacilityOptionDescription")
  private String facilityOptionDescription;

  @JsonProperty("FacilityOptionSetting")
  private String facilityOptionSetting;

  @JsonProperty("FacilityPricing")
  private String facilityPricing;

  @JsonProperty("NegotiationGuidelines/Rules")
  private String negotiationGuidelinesRules;

  @JsonProperty("AgreedPricing")
  private String agreedPricing;

  @JsonProperty("PricingAdjustments")
  private String pricingAdjustments;

  @JsonProperty("FacilitySchedule")
  private String facilitySchedule;

  public FacilityApplication facilityOption(String facilityOption) {
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

  public FacilityApplication facilityOptionDescription(String facilityOptionDescription) {
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

  public FacilityApplication facilityOptionSetting(String facilityOptionSetting) {
    this.facilityOptionSetting = facilityOptionSetting;
    return this;
  }

  /**
   * Get facilityOptionSetting
   * @return facilityOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getFacilityOptionSetting() {
    return facilityOptionSetting;
  }

  public void setFacilityOptionSetting(String facilityOptionSetting) {
    this.facilityOptionSetting = facilityOptionSetting;
  }

  public FacilityApplication facilityPricing(String facilityPricing) {
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

  public FacilityApplication negotiationGuidelinesRules(String negotiationGuidelinesRules) {
    this.negotiationGuidelinesRules = negotiationGuidelinesRules;
    return this;
  }

  /**
   * Get negotiationGuidelinesRules
   * @return negotiationGuidelinesRules
  */
  @ApiModelProperty(value = "")


  public String getNegotiationGuidelinesRules() {
    return negotiationGuidelinesRules;
  }

  public void setNegotiationGuidelinesRules(String negotiationGuidelinesRules) {
    this.negotiationGuidelinesRules = negotiationGuidelinesRules;
  }

  public FacilityApplication agreedPricing(String agreedPricing) {
    this.agreedPricing = agreedPricing;
    return this;
  }

  /**
   * Get agreedPricing
   * @return agreedPricing
  */
  @ApiModelProperty(value = "")


  public String getAgreedPricing() {
    return agreedPricing;
  }

  public void setAgreedPricing(String agreedPricing) {
    this.agreedPricing = agreedPricing;
  }

  public FacilityApplication pricingAdjustments(String pricingAdjustments) {
    this.pricingAdjustments = pricingAdjustments;
    return this;
  }

  /**
   * Get pricingAdjustments
   * @return pricingAdjustments
  */
  @ApiModelProperty(value = "")


  public String getPricingAdjustments() {
    return pricingAdjustments;
  }

  public void setPricingAdjustments(String pricingAdjustments) {
    this.pricingAdjustments = pricingAdjustments;
  }

  public FacilityApplication facilitySchedule(String facilitySchedule) {
    this.facilitySchedule = facilitySchedule;
    return this;
  }

  /**
   * Get facilitySchedule
   * @return facilitySchedule
  */
  @ApiModelProperty(value = "")


  public String getFacilitySchedule() {
    return facilitySchedule;
  }

  public void setFacilitySchedule(String facilitySchedule) {
    this.facilitySchedule = facilitySchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacilityApplication facilityApplication = (FacilityApplication) o;
    return Objects.equals(this.facilityOption, facilityApplication.facilityOption) &&
        Objects.equals(this.facilityOptionDescription, facilityApplication.facilityOptionDescription) &&
        Objects.equals(this.facilityOptionSetting, facilityApplication.facilityOptionSetting) &&
        Objects.equals(this.facilityPricing, facilityApplication.facilityPricing) &&
        Objects.equals(this.negotiationGuidelinesRules, facilityApplication.negotiationGuidelinesRules) &&
        Objects.equals(this.agreedPricing, facilityApplication.agreedPricing) &&
        Objects.equals(this.pricingAdjustments, facilityApplication.pricingAdjustments) &&
        Objects.equals(this.facilitySchedule, facilityApplication.facilitySchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facilityOption, facilityOptionDescription, facilityOptionSetting, facilityPricing, negotiationGuidelinesRules, agreedPricing, pricingAdjustments, facilitySchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacilityApplication {\n");
    
    sb.append("    facilityOption: ").append(toIndentedString(facilityOption)).append("\n");
    sb.append("    facilityOptionDescription: ").append(toIndentedString(facilityOptionDescription)).append("\n");
    sb.append("    facilityOptionSetting: ").append(toIndentedString(facilityOptionSetting)).append("\n");
    sb.append("    facilityPricing: ").append(toIndentedString(facilityPricing)).append("\n");
    sb.append("    negotiationGuidelinesRules: ").append(toIndentedString(negotiationGuidelinesRules)).append("\n");
    sb.append("    agreedPricing: ").append(toIndentedString(agreedPricing)).append("\n");
    sb.append("    pricingAdjustments: ").append(toIndentedString(pricingAdjustments)).append("\n");
    sb.append("    facilitySchedule: ").append(toIndentedString(facilitySchedule)).append("\n");
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

