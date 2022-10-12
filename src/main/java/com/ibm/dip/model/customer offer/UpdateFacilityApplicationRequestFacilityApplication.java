package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateFacilityApplicationRequestFacilityApplication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class UpdateFacilityApplicationRequestFacilityApplication   {
  @JsonProperty("FacilityOption")
  private String facilityOption;

  @JsonProperty("FacilityOptionDescription")
  private String facilityOptionDescription;

  @JsonProperty("FacilityOptionSetting")
  private String facilityOptionSetting;

  @JsonProperty("FacilityPricing")
  private String facilityPricing;

  @JsonProperty("NegotiationGuidelinesOrRules")
  private String negotiationGuidelinesOrRules;

  @JsonProperty("AgreedPricing")
  private String agreedPricing;

  @JsonProperty("PricingAdjustments")
  private String pricingAdjustments;

  public UpdateFacilityApplicationRequestFacilityApplication facilityOption(String facilityOption) {
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

  public UpdateFacilityApplicationRequestFacilityApplication facilityOptionDescription(String facilityOptionDescription) {
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

  public UpdateFacilityApplicationRequestFacilityApplication facilityOptionSetting(String facilityOptionSetting) {
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

  public UpdateFacilityApplicationRequestFacilityApplication facilityPricing(String facilityPricing) {
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

  public UpdateFacilityApplicationRequestFacilityApplication negotiationGuidelinesOrRules(String negotiationGuidelinesOrRules) {
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

  public UpdateFacilityApplicationRequestFacilityApplication agreedPricing(String agreedPricing) {
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

  public UpdateFacilityApplicationRequestFacilityApplication pricingAdjustments(String pricingAdjustments) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFacilityApplicationRequestFacilityApplication updateFacilityApplicationRequestFacilityApplication = (UpdateFacilityApplicationRequestFacilityApplication) o;
    return Objects.equals(this.facilityOption, updateFacilityApplicationRequestFacilityApplication.facilityOption) &&
        Objects.equals(this.facilityOptionDescription, updateFacilityApplicationRequestFacilityApplication.facilityOptionDescription) &&
        Objects.equals(this.facilityOptionSetting, updateFacilityApplicationRequestFacilityApplication.facilityOptionSetting) &&
        Objects.equals(this.facilityPricing, updateFacilityApplicationRequestFacilityApplication.facilityPricing) &&
        Objects.equals(this.negotiationGuidelinesOrRules, updateFacilityApplicationRequestFacilityApplication.negotiationGuidelinesOrRules) &&
        Objects.equals(this.agreedPricing, updateFacilityApplicationRequestFacilityApplication.agreedPricing) &&
        Objects.equals(this.pricingAdjustments, updateFacilityApplicationRequestFacilityApplication.pricingAdjustments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facilityOption, facilityOptionDescription, facilityOptionSetting, facilityPricing, negotiationGuidelinesOrRules, agreedPricing, pricingAdjustments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFacilityApplicationRequestFacilityApplication {\n");
    
    sb.append("    facilityOption: ").append(toIndentedString(facilityOption)).append("\n");
    sb.append("    facilityOptionDescription: ").append(toIndentedString(facilityOptionDescription)).append("\n");
    sb.append("    facilityOptionSetting: ").append(toIndentedString(facilityOptionSetting)).append("\n");
    sb.append("    facilityPricing: ").append(toIndentedString(facilityPricing)).append("\n");
    sb.append("    negotiationGuidelinesOrRules: ").append(toIndentedString(negotiationGuidelinesOrRules)).append("\n");
    sb.append("    agreedPricing: ").append(toIndentedString(agreedPricing)).append("\n");
    sb.append("    pricingAdjustments: ").append(toIndentedString(pricingAdjustments)).append("\n");
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

