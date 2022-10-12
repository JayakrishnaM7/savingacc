package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.party reference data directory.ExecutePartyReferenceDataDirectoryEntryRequestAssociations;
import com.ibm.dip.model.party reference data directory.ExecutePartyReferenceDataDirectoryEntryRequestBankRelations;
import com.ibm.dip.model.party reference data directory.ExecutePartyReferenceDataDirectoryEntryRequestDemographics;
import com.ibm.dip.model.party reference data directory.ExecutePartyReferenceDataDirectoryEntryRequestReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecutePartyReferenceDataDirectoryEntryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class ExecutePartyReferenceDataDirectoryEntryRequest   {
  @JsonProperty("Reference")
  private ExecutePartyReferenceDataDirectoryEntryRequestReference reference;

  @JsonProperty("Associations")
  private ExecutePartyReferenceDataDirectoryEntryRequestAssociations associations;

  @JsonProperty("Demographics")
  private ExecutePartyReferenceDataDirectoryEntryRequestDemographics demographics;

  @JsonProperty("BankRelations")
  private ExecutePartyReferenceDataDirectoryEntryRequestBankRelations bankRelations;

  public ExecutePartyReferenceDataDirectoryEntryRequest reference(ExecutePartyReferenceDataDirectoryEntryRequestReference reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutePartyReferenceDataDirectoryEntryRequestReference getReference() {
    return reference;
  }

  public void setReference(ExecutePartyReferenceDataDirectoryEntryRequestReference reference) {
    this.reference = reference;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequest associations(ExecutePartyReferenceDataDirectoryEntryRequestAssociations associations) {
    this.associations = associations;
    return this;
  }

  /**
   * Get associations
   * @return associations
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(ExecutePartyReferenceDataDirectoryEntryRequestAssociations associations) {
    this.associations = associations;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequest demographics(ExecutePartyReferenceDataDirectoryEntryRequestDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

  /**
   * Get demographics
   * @return demographics
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutePartyReferenceDataDirectoryEntryRequestDemographics getDemographics() {
    return demographics;
  }

  public void setDemographics(ExecutePartyReferenceDataDirectoryEntryRequestDemographics demographics) {
    this.demographics = demographics;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequest bankRelations(ExecutePartyReferenceDataDirectoryEntryRequestBankRelations bankRelations) {
    this.bankRelations = bankRelations;
    return this;
  }

  /**
   * Get bankRelations
   * @return bankRelations
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecutePartyReferenceDataDirectoryEntryRequestBankRelations getBankRelations() {
    return bankRelations;
  }

  public void setBankRelations(ExecutePartyReferenceDataDirectoryEntryRequestBankRelations bankRelations) {
    this.bankRelations = bankRelations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutePartyReferenceDataDirectoryEntryRequest executePartyReferenceDataDirectoryEntryRequest = (ExecutePartyReferenceDataDirectoryEntryRequest) o;
    return Objects.equals(this.reference, executePartyReferenceDataDirectoryEntryRequest.reference) &&
        Objects.equals(this.associations, executePartyReferenceDataDirectoryEntryRequest.associations) &&
        Objects.equals(this.demographics, executePartyReferenceDataDirectoryEntryRequest.demographics) &&
        Objects.equals(this.bankRelations, executePartyReferenceDataDirectoryEntryRequest.bankRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, associations, demographics, bankRelations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutePartyReferenceDataDirectoryEntryRequest {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    bankRelations: ").append(toIndentedString(bankRelations)).append("\n");
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

