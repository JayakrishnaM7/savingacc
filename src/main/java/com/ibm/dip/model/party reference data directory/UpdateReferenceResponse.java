package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.party reference data directory.ExecutePartyReferenceDataDirectoryEntryRequestReference;
import com.ibm.dip.model.party reference data directory.UpdateReferenceRequestPartyReferenceDataDirectoryEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateReferenceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class UpdateReferenceResponse   {
  @JsonProperty("PartyReferenceDataDirectoryEntry")
  private UpdateReferenceRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry;

  @JsonProperty("Reference")
  private ExecutePartyReferenceDataDirectoryEntryRequestReference reference;

  public UpdateReferenceResponse partyReferenceDataDirectoryEntry(UpdateReferenceRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry) {
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

  public UpdateReferenceResponse reference(ExecutePartyReferenceDataDirectoryEntryRequestReference reference) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateReferenceResponse updateReferenceResponse = (UpdateReferenceResponse) o;
    return Objects.equals(this.partyReferenceDataDirectoryEntry, updateReferenceResponse.partyReferenceDataDirectoryEntry) &&
        Objects.equals(this.reference, updateReferenceResponse.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyReferenceDataDirectoryEntry, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateReferenceResponse {\n");
    
    sb.append("    partyReferenceDataDirectoryEntry: ").append(toIndentedString(partyReferenceDataDirectoryEntry)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

