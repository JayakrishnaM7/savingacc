package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry   {
  @JsonProperty("DateType")
  private String dateType;

  public RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry dateType(String dateType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry registerPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry = (RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry) o;
    return Objects.equals(this.dateType, registerPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry {\n");
    
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
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

