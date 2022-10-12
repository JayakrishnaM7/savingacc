package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerOfferProcedureResponseDisclosures
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class InitiateCustomerOfferProcedureResponseDisclosures   {
  @JsonProperty("DisclosureType")
  private String disclosureType;

  @JsonProperty("DisclosureTextOrDescription")
  private String disclosureTextOrDescription;

  public InitiateCustomerOfferProcedureResponseDisclosures disclosureType(String disclosureType) {
    this.disclosureType = disclosureType;
    return this;
  }

  /**
   * Get disclosureType
   * @return disclosureType
  */
  @ApiModelProperty(value = "")


  public String getDisclosureType() {
    return disclosureType;
  }

  public void setDisclosureType(String disclosureType) {
    this.disclosureType = disclosureType;
  }

  public InitiateCustomerOfferProcedureResponseDisclosures disclosureTextOrDescription(String disclosureTextOrDescription) {
    this.disclosureTextOrDescription = disclosureTextOrDescription;
    return this;
  }

  /**
   * Get disclosureTextOrDescription
   * @return disclosureTextOrDescription
  */
  @ApiModelProperty(value = "")


  public String getDisclosureTextOrDescription() {
    return disclosureTextOrDescription;
  }

  public void setDisclosureTextOrDescription(String disclosureTextOrDescription) {
    this.disclosureTextOrDescription = disclosureTextOrDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerOfferProcedureResponseDisclosures initiateCustomerOfferProcedureResponseDisclosures = (InitiateCustomerOfferProcedureResponseDisclosures) o;
    return Objects.equals(this.disclosureType, initiateCustomerOfferProcedureResponseDisclosures.disclosureType) &&
        Objects.equals(this.disclosureTextOrDescription, initiateCustomerOfferProcedureResponseDisclosures.disclosureTextOrDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disclosureType, disclosureTextOrDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerOfferProcedureResponseDisclosures {\n");
    
    sb.append("    disclosureType: ").append(toIndentedString(disclosureType)).append("\n");
    sb.append("    disclosureTextOrDescription: ").append(toIndentedString(disclosureTextOrDescription)).append("\n");
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

