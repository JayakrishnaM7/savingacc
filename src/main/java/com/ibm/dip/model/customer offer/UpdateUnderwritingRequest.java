package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer offer.UpdateFacilityApplicationRequestCustomerOfferProcedure;
import com.ibm.dip.model.customer offer.UpdateUnderwritingRequestUnderwriting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateUnderwritingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class UpdateUnderwritingRequest   {
  @JsonProperty("CustomerOfferProcedure")
  private UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure;

  @JsonProperty("Underwriting")
  private UpdateUnderwritingRequestUnderwriting underwriting;

  public UpdateUnderwritingRequest customerOfferProcedure(UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure) {
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

  public UpdateUnderwritingRequest underwriting(UpdateUnderwritingRequestUnderwriting underwriting) {
    this.underwriting = underwriting;
    return this;
  }

  /**
   * Get underwriting
   * @return underwriting
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateUnderwritingRequestUnderwriting getUnderwriting() {
    return underwriting;
  }

  public void setUnderwriting(UpdateUnderwritingRequestUnderwriting underwriting) {
    this.underwriting = underwriting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUnderwritingRequest updateUnderwritingRequest = (UpdateUnderwritingRequest) o;
    return Objects.equals(this.customerOfferProcedure, updateUnderwritingRequest.customerOfferProcedure) &&
        Objects.equals(this.underwriting, updateUnderwritingRequest.underwriting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedure, underwriting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUnderwritingRequest {\n");
    
    sb.append("    customerOfferProcedure: ").append(toIndentedString(customerOfferProcedure)).append("\n");
    sb.append("    underwriting: ").append(toIndentedString(underwriting)).append("\n");
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

