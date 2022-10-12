package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer offer.RetrieveFacilityApplicationResponseCustomerOfferProcedure;
import com.ibm.dip.model.customer offer.UpdateCreditRequestCredit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveCreditResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class RetrieveCreditResponse   {
  @JsonProperty("CustomerOfferProcedure")
  private RetrieveFacilityApplicationResponseCustomerOfferProcedure customerOfferProcedure;

  @JsonProperty("Credit")
  private UpdateCreditRequestCredit credit;

  public RetrieveCreditResponse customerOfferProcedure(RetrieveFacilityApplicationResponseCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
    return this;
  }

  /**
   * Get customerOfferProcedure
   * @return customerOfferProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveFacilityApplicationResponseCustomerOfferProcedure getCustomerOfferProcedure() {
    return customerOfferProcedure;
  }

  public void setCustomerOfferProcedure(RetrieveFacilityApplicationResponseCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
  }

  public RetrieveCreditResponse credit(UpdateCreditRequestCredit credit) {
    this.credit = credit;
    return this;
  }

  /**
   * Get credit
   * @return credit
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateCreditRequestCredit getCredit() {
    return credit;
  }

  public void setCredit(UpdateCreditRequestCredit credit) {
    this.credit = credit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveCreditResponse retrieveCreditResponse = (RetrieveCreditResponse) o;
    return Objects.equals(this.customerOfferProcedure, retrieveCreditResponse.customerOfferProcedure) &&
        Objects.equals(this.credit, retrieveCreditResponse.credit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedure, credit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveCreditResponse {\n");
    
    sb.append("    customerOfferProcedure: ").append(toIndentedString(customerOfferProcedure)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
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

