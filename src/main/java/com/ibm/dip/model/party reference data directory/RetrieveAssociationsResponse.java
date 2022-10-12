package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.party reference data directory.ExecutePartyReferenceDataDirectoryEntryRequestAssociations;
import com.ibm.dip.model.party reference data directory.RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveAssociationsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class RetrieveAssociationsResponse   {
  @JsonProperty("PartyReferenceDataDirectoryEntry")
  private RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry;

  @JsonProperty("Associations")
  private ExecutePartyReferenceDataDirectoryEntryRequestAssociations associations;

  public RetrieveAssociationsResponse partyReferenceDataDirectoryEntry(RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry) {
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

  public RetrieveAssociationsResponse associations(ExecutePartyReferenceDataDirectoryEntryRequestAssociations associations) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAssociationsResponse retrieveAssociationsResponse = (RetrieveAssociationsResponse) o;
    return Objects.equals(this.partyReferenceDataDirectoryEntry, retrieveAssociationsResponse.partyReferenceDataDirectoryEntry) &&
        Objects.equals(this.associations, retrieveAssociationsResponse.associations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyReferenceDataDirectoryEntry, associations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAssociationsResponse {\n");
    
    sb.append("    partyReferenceDataDirectoryEntry: ").append(toIndentedString(partyReferenceDataDirectoryEntry)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
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

