package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerOfferProcedureRequestBooking
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class InitiateCustomerOfferProcedureRequestBooking   {
  @JsonProperty("AssetOrLiabilityType")
  private String assetOrLiabilityType;

  @JsonProperty("Amount")
  private String amount;

  public InitiateCustomerOfferProcedureRequestBooking assetOrLiabilityType(String assetOrLiabilityType) {
    this.assetOrLiabilityType = assetOrLiabilityType;
    return this;
  }

  /**
   * Get assetOrLiabilityType
   * @return assetOrLiabilityType
  */
  @ApiModelProperty(value = "")


  public String getAssetOrLiabilityType() {
    return assetOrLiabilityType;
  }

  public void setAssetOrLiabilityType(String assetOrLiabilityType) {
    this.assetOrLiabilityType = assetOrLiabilityType;
  }

  public InitiateCustomerOfferProcedureRequestBooking amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerOfferProcedureRequestBooking initiateCustomerOfferProcedureRequestBooking = (InitiateCustomerOfferProcedureRequestBooking) o;
    return Objects.equals(this.assetOrLiabilityType, initiateCustomerOfferProcedureRequestBooking.assetOrLiabilityType) &&
        Objects.equals(this.amount, initiateCustomerOfferProcedureRequestBooking.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetOrLiabilityType, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerOfferProcedureRequestBooking {\n");
    
    sb.append("    assetOrLiabilityType: ").append(toIndentedString(assetOrLiabilityType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

