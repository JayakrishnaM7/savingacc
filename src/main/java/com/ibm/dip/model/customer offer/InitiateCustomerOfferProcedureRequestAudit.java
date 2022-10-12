package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerOfferProcedureRequestAudit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class InitiateCustomerOfferProcedureRequestAudit   {
  @JsonProperty("GuidelineComplianceCheckType")
  private String guidelineComplianceCheckType;

  @JsonProperty("GuidelineComplianceCheckRequirement")
  private String guidelineComplianceCheckRequirement;

  public InitiateCustomerOfferProcedureRequestAudit guidelineComplianceCheckType(String guidelineComplianceCheckType) {
    this.guidelineComplianceCheckType = guidelineComplianceCheckType;
    return this;
  }

  /**
   * Get guidelineComplianceCheckType
   * @return guidelineComplianceCheckType
  */
  @ApiModelProperty(value = "")


  public String getGuidelineComplianceCheckType() {
    return guidelineComplianceCheckType;
  }

  public void setGuidelineComplianceCheckType(String guidelineComplianceCheckType) {
    this.guidelineComplianceCheckType = guidelineComplianceCheckType;
  }

  public InitiateCustomerOfferProcedureRequestAudit guidelineComplianceCheckRequirement(String guidelineComplianceCheckRequirement) {
    this.guidelineComplianceCheckRequirement = guidelineComplianceCheckRequirement;
    return this;
  }

  /**
   * Get guidelineComplianceCheckRequirement
   * @return guidelineComplianceCheckRequirement
  */
  @ApiModelProperty(value = "")


  public String getGuidelineComplianceCheckRequirement() {
    return guidelineComplianceCheckRequirement;
  }

  public void setGuidelineComplianceCheckRequirement(String guidelineComplianceCheckRequirement) {
    this.guidelineComplianceCheckRequirement = guidelineComplianceCheckRequirement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerOfferProcedureRequestAudit initiateCustomerOfferProcedureRequestAudit = (InitiateCustomerOfferProcedureRequestAudit) o;
    return Objects.equals(this.guidelineComplianceCheckType, initiateCustomerOfferProcedureRequestAudit.guidelineComplianceCheckType) &&
        Objects.equals(this.guidelineComplianceCheckRequirement, initiateCustomerOfferProcedureRequestAudit.guidelineComplianceCheckRequirement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guidelineComplianceCheckType, guidelineComplianceCheckRequirement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerOfferProcedureRequestAudit {\n");
    
    sb.append("    guidelineComplianceCheckType: ").append(toIndentedString(guidelineComplianceCheckType)).append("\n");
    sb.append("    guidelineComplianceCheckRequirement: ").append(toIndentedString(guidelineComplianceCheckRequirement)).append("\n");
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

