package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.party reference data directory.ExecutePartyReferenceDataDirectoryEntryRequestBankRelations;
import com.ibm.dip.model.party reference data directory.UpdateReferenceRequestPartyReferenceDataDirectoryEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateBankRelationsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class UpdateBankRelationsRequest   {
  @JsonProperty("PartyReferenceDataDirectoryEntry")
  private UpdateReferenceRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry;

  @JsonProperty("BankRelations")
  private ExecutePartyReferenceDataDirectoryEntryRequestBankRelations bankRelations;

  public UpdateBankRelationsRequest partyReferenceDataDirectoryEntry(UpdateReferenceRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry) {
    this.partyReferenceDataDirectoryEntry = partyReferenceDataDirectoryEntry;
    return this;
  }

  /**
   * Get partyReferenceDataDirectoryEntry
   * @return partyReferenceDataDirectoryEntry
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateReferenceRequestPartyReferenceDataDirectoryEntry getPartyReferenceDataDirectoryEntry() {
    return partyReferenceDataDirectoryEntry;
  }

  public void setPartyReferenceDataDirectoryEntry(UpdateReferenceRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry) {
    this.partyReferenceDataDirectoryEntry = partyReferenceDataDirectoryEntry;
  }

  public UpdateBankRelationsRequest bankRelations(ExecutePartyReferenceDataDirectoryEntryRequestBankRelations bankRelations) {
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
    UpdateBankRelationsRequest updateBankRelationsRequest = (UpdateBankRelationsRequest) o;
    return Objects.equals(this.partyReferenceDataDirectoryEntry, updateBankRelationsRequest.partyReferenceDataDirectoryEntry) &&
        Objects.equals(this.bankRelations, updateBankRelationsRequest.bankRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyReferenceDataDirectoryEntry, bankRelations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBankRelationsRequest {\n");
    
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

