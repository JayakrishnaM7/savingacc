package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Booking
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class Booking   {
  @JsonProperty("BusinessUnitReference")
  private Object businessUnitReference;

  @JsonProperty("Asset/LiabilityType")
  private String assetLiabilityType;

  @JsonProperty("Amount")
  private String amount;

  public Booking businessUnitReference(Object businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
    return this;
  }

  /**
   * Get businessUnitReference
   * @return businessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(Object businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }

  public Booking assetLiabilityType(String assetLiabilityType) {
    this.assetLiabilityType = assetLiabilityType;
    return this;
  }

  /**
   * Get assetLiabilityType
   * @return assetLiabilityType
  */
  @ApiModelProperty(value = "")


  public String getAssetLiabilityType() {
    return assetLiabilityType;
  }

  public void setAssetLiabilityType(String assetLiabilityType) {
    this.assetLiabilityType = assetLiabilityType;
  }

  public Booking amount(String amount) {
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
    Booking booking = (Booking) o;
    return Objects.equals(this.businessUnitReference, booking.businessUnitReference) &&
        Objects.equals(this.assetLiabilityType, booking.assetLiabilityType) &&
        Objects.equals(this.amount, booking.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessUnitReference, assetLiabilityType, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Booking {\n");
    
    sb.append("    businessUnitReference: ").append(toIndentedString(businessUnitReference)).append("\n");
    sb.append("    assetLiabilityType: ").append(toIndentedString(assetLiabilityType)).append("\n");
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

