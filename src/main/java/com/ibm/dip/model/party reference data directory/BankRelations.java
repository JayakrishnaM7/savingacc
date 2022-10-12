package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankRelations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class BankRelations   {
  @JsonProperty("BankRelationType")
  private String bankRelationType;

  @JsonProperty("BusinessUnit/EmployeeReference")
  private Object businessUnitEmployeeReference;

  public BankRelations bankRelationType(String bankRelationType) {
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

  public BankRelations businessUnitEmployeeReference(Object businessUnitEmployeeReference) {
    this.businessUnitEmployeeReference = businessUnitEmployeeReference;
    return this;
  }

  /**
   * Get businessUnitEmployeeReference
   * @return businessUnitEmployeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBusinessUnitEmployeeReference() {
    return businessUnitEmployeeReference;
  }

  public void setBusinessUnitEmployeeReference(Object businessUnitEmployeeReference) {
    this.businessUnitEmployeeReference = businessUnitEmployeeReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankRelations bankRelations = (BankRelations) o;
    return Objects.equals(this.bankRelationType, bankRelations.bankRelationType) &&
        Objects.equals(this.businessUnitEmployeeReference, bankRelations.businessUnitEmployeeReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankRelationType, businessUnitEmployeeReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankRelations {\n");
    
    sb.append("    bankRelationType: ").append(toIndentedString(bankRelationType)).append("\n");
    sb.append("    businessUnitEmployeeReference: ").append(toIndentedString(businessUnitEmployeeReference)).append("\n");
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

