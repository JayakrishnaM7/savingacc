package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer offer.UpdateComplianceRequestCompliance;
import com.ibm.dip.model.customer offer.UpdateFacilityApplicationRequestCustomerOfferProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateComplianceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class UpdateComplianceRequest   {
  @JsonProperty("CustomerOfferProcedure")
  private UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure;

  @JsonProperty("Compliance")
  private UpdateComplianceRequestCompliance compliance;

  public UpdateComplianceRequest customerOfferProcedure(UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure) {
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

  public UpdateComplianceRequest compliance(UpdateComplianceRequestCompliance compliance) {
    this.compliance = compliance;
    return this;
  }

  /**
   * Get compliance
   * @return compliance
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateComplianceRequestCompliance getCompliance() {
    return compliance;
  }

  public void setCompliance(UpdateComplianceRequestCompliance compliance) {
    this.compliance = compliance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateComplianceRequest updateComplianceRequest = (UpdateComplianceRequest) o;
    return Objects.equals(this.customerOfferProcedure, updateComplianceRequest.customerOfferProcedure) &&
        Objects.equals(this.compliance, updateComplianceRequest.compliance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedure, compliance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateComplianceRequest {\n");
    
    sb.append("    customerOfferProcedure: ").append(toIndentedString(customerOfferProcedure)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
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

