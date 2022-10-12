package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerOfferProcedureRequestCompliance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class InitiateCustomerOfferProcedureRequestCompliance   {
  @JsonProperty("RegulatoryComplianceCheckType")
  private String regulatoryComplianceCheckType;

  @JsonProperty("RegulatoryComplianceCheckRequirement")
  private String regulatoryComplianceCheckRequirement;

  public InitiateCustomerOfferProcedureRequestCompliance regulatoryComplianceCheckType(String regulatoryComplianceCheckType) {
    this.regulatoryComplianceCheckType = regulatoryComplianceCheckType;
    return this;
  }

  /**
   * Get regulatoryComplianceCheckType
   * @return regulatoryComplianceCheckType
  */
  @ApiModelProperty(value = "")


  public String getRegulatoryComplianceCheckType() {
    return regulatoryComplianceCheckType;
  }

  public void setRegulatoryComplianceCheckType(String regulatoryComplianceCheckType) {
    this.regulatoryComplianceCheckType = regulatoryComplianceCheckType;
  }

  public InitiateCustomerOfferProcedureRequestCompliance regulatoryComplianceCheckRequirement(String regulatoryComplianceCheckRequirement) {
    this.regulatoryComplianceCheckRequirement = regulatoryComplianceCheckRequirement;
    return this;
  }

  /**
   * Get regulatoryComplianceCheckRequirement
   * @return regulatoryComplianceCheckRequirement
  */
  @ApiModelProperty(value = "")


  public String getRegulatoryComplianceCheckRequirement() {
    return regulatoryComplianceCheckRequirement;
  }

  public void setRegulatoryComplianceCheckRequirement(String regulatoryComplianceCheckRequirement) {
    this.regulatoryComplianceCheckRequirement = regulatoryComplianceCheckRequirement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerOfferProcedureRequestCompliance initiateCustomerOfferProcedureRequestCompliance = (InitiateCustomerOfferProcedureRequestCompliance) o;
    return Objects.equals(this.regulatoryComplianceCheckType, initiateCustomerOfferProcedureRequestCompliance.regulatoryComplianceCheckType) &&
        Objects.equals(this.regulatoryComplianceCheckRequirement, initiateCustomerOfferProcedureRequestCompliance.regulatoryComplianceCheckRequirement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatoryComplianceCheckType, regulatoryComplianceCheckRequirement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerOfferProcedureRequestCompliance {\n");
    
    sb.append("    regulatoryComplianceCheckType: ").append(toIndentedString(regulatoryComplianceCheckType)).append("\n");
    sb.append("    regulatoryComplianceCheckRequirement: ").append(toIndentedString(regulatoryComplianceCheckRequirement)).append("\n");
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

