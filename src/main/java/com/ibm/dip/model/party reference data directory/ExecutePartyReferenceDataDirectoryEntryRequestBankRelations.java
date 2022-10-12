package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecutePartyReferenceDataDirectoryEntryRequestBankRelations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class ExecutePartyReferenceDataDirectoryEntryRequestBankRelations   {
  @JsonProperty("BankRelationType")
  private String bankRelationType;

  @JsonProperty("BusinessUnitOrEmployeeReference")
  private Object businessUnitOrEmployeeReference;

  public ExecutePartyReferenceDataDirectoryEntryRequestBankRelations bankRelationType(String bankRelationType) {
    this.bankRelationType = bankRelationType;
    return this;
  }

  /**
   * Get bankRelationType
   * @return bankRelationType
  */
  @ApiModelProperty(value = "")


  public String getBankRelationType() {
    return bankRelationType;
  }

  public void setBankRelationType(String bankRelationType) {
    this.bankRelationType = bankRelationType;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestBankRelations businessUnitOrEmployeeReference(Object businessUnitOrEmployeeReference) {
    this.businessUnitOrEmployeeReference = businessUnitOrEmployeeReference;
    return this;
  }

  /**
   * Get businessUnitOrEmployeeReference
   * @return businessUnitOrEmployeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBusinessUnitOrEmployeeReference() {
    return businessUnitOrEmployeeReference;
  }

  public void setBusinessUnitOrEmployeeReference(Object businessUnitOrEmployeeReference) {
    this.businessUnitOrEmployeeReference = businessUnitOrEmployeeReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutePartyReferenceDataDirectoryEntryRequestBankRelations executePartyReferenceDataDirectoryEntryRequestBankRelations = (ExecutePartyReferenceDataDirectoryEntryRequestBankRelations) o;
    return Objects.equals(this.bankRelationType, executePartyReferenceDataDirectoryEntryRequestBankRelations.bankRelationType) &&
        Objects.equals(this.businessUnitOrEmployeeReference, executePartyReferenceDataDirectoryEntryRequestBankRelations.businessUnitOrEmployeeReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankRelationType, businessUnitOrEmployeeReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutePartyReferenceDataDirectoryEntryRequestBankRelations {\n");
    
    sb.append("    bankRelationType: ").append(toIndentedString(bankRelationType)).append("\n");
    sb.append("    businessUnitOrEmployeeReference: ").append(toIndentedString(businessUnitOrEmployeeReference)).append("\n");
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

