package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Disclosures
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class Disclosures   {
  @JsonProperty("DisclosureType")
  private String disclosureType;

  @JsonProperty("DisclosureText/Description")
  private String disclosureTextDescription;

  @JsonProperty("CustomerAcceptanceIndicator")
  private Boolean customerAcceptanceIndicator;

  @JsonProperty("DocumentReference(forcustomersignature/acceptancerecord)")
  private Object documentReferenceForcustomersignatureAcceptancerecord;

  public Disclosures disclosureType(String disclosureType) {
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

  public Disclosures disclosureTextDescription(String disclosureTextDescription) {
    this.disclosureTextDescription = disclosureTextDescription;
    return this;
  }

  /**
   * Get disclosureTextDescription
   * @return disclosureTextDescription
  */
  @ApiModelProperty(value = "")


  public String getDisclosureTextDescription() {
    return disclosureTextDescription;
  }

  public void setDisclosureTextDescription(String disclosureTextDescription) {
    this.disclosureTextDescription = disclosureTextDescription;
  }

  public Disclosures customerAcceptanceIndicator(Boolean customerAcceptanceIndicator) {
    this.customerAcceptanceIndicator = customerAcceptanceIndicator;
    return this;
  }

  /**
   * Get customerAcceptanceIndicator
   * @return customerAcceptanceIndicator
  */
  @ApiModelProperty(value = "")


  public Boolean getCustomerAcceptanceIndicator() {
    return customerAcceptanceIndicator;
  }

  public void setCustomerAcceptanceIndicator(Boolean customerAcceptanceIndicator) {
    this.customerAcceptanceIndicator = customerAcceptanceIndicator;
  }

  public Disclosures documentReferenceForcustomersignatureAcceptancerecord(Object documentReferenceForcustomersignatureAcceptancerecord) {
    this.documentReferenceForcustomersignatureAcceptancerecord = documentReferenceForcustomersignatureAcceptancerecord;
    return this;
  }

  /**
   * Get documentReferenceForcustomersignatureAcceptancerecord
   * @return documentReferenceForcustomersignatureAcceptancerecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDocumentReferenceForcustomersignatureAcceptancerecord() {
    return documentReferenceForcustomersignatureAcceptancerecord;
  }

  public void setDocumentReferenceForcustomersignatureAcceptancerecord(Object documentReferenceForcustomersignatureAcceptancerecord) {
    this.documentReferenceForcustomersignatureAcceptancerecord = documentReferenceForcustomersignatureAcceptancerecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Disclosures disclosures = (Disclosures) o;
    return Objects.equals(this.disclosureType, disclosures.disclosureType) &&
        Objects.equals(this.disclosureTextDescription, disclosures.disclosureTextDescription) &&
        Objects.equals(this.customerAcceptanceIndicator, disclosures.customerAcceptanceIndicator) &&
        Objects.equals(this.documentReferenceForcustomersignatureAcceptancerecord, disclosures.documentReferenceForcustomersignatureAcceptancerecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disclosureType, disclosureTextDescription, customerAcceptanceIndicator, documentReferenceForcustomersignatureAcceptancerecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Disclosures {\n");
    
    sb.append("    disclosureType: ").append(toIndentedString(disclosureType)).append("\n");
    sb.append("    disclosureTextDescription: ").append(toIndentedString(disclosureTextDescription)).append("\n");
    sb.append("    customerAcceptanceIndicator: ").append(toIndentedString(customerAcceptanceIndicator)).append("\n");
    sb.append("    documentReferenceForcustomersignatureAcceptancerecord: ").append(toIndentedString(documentReferenceForcustomersignatureAcceptancerecord)).append("\n");
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

