package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.party reference data directory.ExecutePartyReferenceDataDirectoryEntryRequestBankRelations;
import com.ibm.dip.model.party reference data directory.RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveBankRelationsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class RetrieveBankRelationsResponse   {
  @JsonProperty("PartyReferenceDataDirectoryEntry")
  private RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry;

  @JsonProperty("BankRelations")
  private ExecutePartyReferenceDataDirectoryEntryRequestBankRelations bankRelations;

  public RetrieveBankRelationsResponse partyReferenceDataDirectoryEntry(RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry) {
    this.partyReferenceDataDirectoryEntry = partyReferenceDataDirectoryEntry;
    return this;
  }

  /**
   * Get partyReferenceDataDirectoryEntry
   * @return partyReferenceDataDirectoryEntry
  */
  @ApiModelProperty(value = "")

  @Valid

  public RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry getPartyReferenceDataDirectoryEntry() {
    return partyReferenceDataDirectoryEntry;
  }

  public void setPartyReferenceDataDirectoryEntry(RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry) {
    this.partyReferenceDataDirectoryEntry = partyReferenceDataDirectoryEntry;
  }

  public RetrieveBankRelationsResponse bankRelations(ExecutePartyReferenceDataDirectoryEntryRequestBankRelations bankRelations) {
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
    RetrieveBankRelationsResponse retrieveBankRelationsResponse = (RetrieveBankRelationsResponse) o;
    return Objects.equals(this.partyReferenceDataDirectoryEntry, retrieveBankRelationsResponse.partyReferenceDataDirectoryEntry) &&
        Objects.equals(this.bankRelations, retrieveBankRelationsResponse.bankRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyReferenceDataDirectoryEntry, bankRelations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveBankRelationsResponse {\n");
    
    sb.append("    partyReferenceDataDirectoryEntry: ").append(toIndentedString(partyReferenceDataDirectoryEntry)).append("\n");
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

