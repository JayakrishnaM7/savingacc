package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateDisclosuresRequestDisclosures
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class UpdateDisclosuresRequestDisclosures   {
  @JsonProperty("DisclosureType")
  private String disclosureType;

  @JsonProperty("DisclosureTextOrDescription")
  private String disclosureTextOrDescription;

  @JsonProperty("CustomerAcceptanceIndicator")
  private Boolean customerAcceptanceIndicator;

  @JsonProperty("DocumentReference(forcustomersignatureOracceptancerecord)")
  private Object documentReferenceForcustomersignatureOracceptancerecord;

  public UpdateDisclosuresRequestDisclosures disclosureType(String disclosureType) {
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

  public UpdateDisclosuresRequestDisclosures disclosureTextOrDescription(String disclosureTextOrDescription) {
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

  public UpdateDisclosuresRequestDisclosures customerAcceptanceIndicator(Boolean customerAcceptanceIndicator) {
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

  public UpdateDisclosuresRequestDisclosures documentReferenceForcustomersignatureOracceptancerecord(Object documentReferenceForcustomersignatureOracceptancerecord) {
    this.documentReferenceForcustomersignatureOracceptancerecord = documentReferenceForcustomersignatureOracceptancerecord;
    return this;
  }

  /**
   * Get documentReferenceForcustomersignatureOracceptancerecord
   * @return documentReferenceForcustomersignatureOracceptancerecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDocumentReferenceForcustomersignatureOracceptancerecord() {
    return documentReferenceForcustomersignatureOracceptancerecord;
  }

  public void setDocumentReferenceForcustomersignatureOracceptancerecord(Object documentReferenceForcustomersignatureOracceptancerecord) {
    this.documentReferenceForcustomersignatureOracceptancerecord = documentReferenceForcustomersignatureOracceptancerecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDisclosuresRequestDisclosures updateDisclosuresRequestDisclosures = (UpdateDisclosuresRequestDisclosures) o;
    return Objects.equals(this.disclosureType, updateDisclosuresRequestDisclosures.disclosureType) &&
        Objects.equals(this.disclosureTextOrDescription, updateDisclosuresRequestDisclosures.disclosureTextOrDescription) &&
        Objects.equals(this.customerAcceptanceIndicator, updateDisclosuresRequestDisclosures.customerAcceptanceIndicator) &&
        Objects.equals(this.documentReferenceForcustomersignatureOracceptancerecord, updateDisclosuresRequestDisclosures.documentReferenceForcustomersignatureOracceptancerecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disclosureType, disclosureTextOrDescription, customerAcceptanceIndicator, documentReferenceForcustomersignatureOracceptancerecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDisclosuresRequestDisclosures {\n");
    
    sb.append("    disclosureType: ").append(toIndentedString(disclosureType)).append("\n");
    sb.append("    disclosureTextOrDescription: ").append(toIndentedString(disclosureTextOrDescription)).append("\n");
    sb.append("    customerAcceptanceIndicator: ").append(toIndentedString(customerAcceptanceIndicator)).append("\n");
    sb.append("    documentReferenceForcustomersignatureOracceptancerecord: ").append(toIndentedString(documentReferenceForcustomersignatureOracceptancerecord)).append("\n");
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

