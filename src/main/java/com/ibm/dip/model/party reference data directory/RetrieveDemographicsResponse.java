package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.party reference data directory.ExecutePartyReferenceDataDirectoryEntryRequestDemographics;
import com.ibm.dip.model.party reference data directory.RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveDemographicsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class RetrieveDemographicsResponse   {
  @JsonProperty("PartyReferenceDataDirectoryEntry")
  private RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry;

  @JsonProperty("Demographics")
  private ExecutePartyReferenceDataDirectoryEntryRequestDemographics demographics;

  public RetrieveDemographicsResponse partyReferenceDataDirectoryEntry(RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry) {
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

  public RetrieveDemographicsResponse demographics(ExecutePartyReferenceDataDirectoryEntryRequestDemographics demographics) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveDemographicsResponse retrieveDemographicsResponse = (RetrieveDemographicsResponse) o;
    return Objects.equals(this.partyReferenceDataDirectoryEntry, retrieveDemographicsResponse.partyReferenceDataDirectoryEntry) &&
        Objects.equals(this.demographics, retrieveDemographicsResponse.demographics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyReferenceDataDirectoryEntry, demographics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveDemographicsResponse {\n");
    
    sb.append("    partyReferenceDataDirectoryEntry: ").append(toIndentedString(partyReferenceDataDirectoryEntry)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
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

