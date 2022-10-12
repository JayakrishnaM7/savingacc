package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PartyReferenceDataDirectoryEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class PartyReferenceDataDirectoryEntry   {
  @JsonProperty("PartyReference")
  private Object partyReference;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("Date")
  private String date;

  public PartyReferenceDataDirectoryEntry partyReference(Object partyReference) {
    this.partyReference = partyReference;
    return this;
  }

  /**
   * Get partyReference
   * @return partyReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(Object partyReference) {
    this.partyReference = partyReference;
  }

  public PartyReferenceDataDirectoryEntry dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public PartyReferenceDataDirectoryEntry date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry = (PartyReferenceDataDirectoryEntry) o;
    return Objects.equals(this.partyReference, partyReferenceDataDirectoryEntry.partyReference) &&
        Objects.equals(this.dateType, partyReferenceDataDirectoryEntry.dateType) &&
        Objects.equals(this.date, partyReferenceDataDirectoryEntry.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyReference, dateType, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyReferenceDataDirectoryEntry {\n");
    
    sb.append("    partyReference: ").append(toIndentedString(partyReference)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

