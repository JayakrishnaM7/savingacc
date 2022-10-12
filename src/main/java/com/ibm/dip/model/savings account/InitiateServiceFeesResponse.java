package com.ibm.dip.model.savings account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.savings account.InitiateServiceFeesResponseSavingsAccountFacility;
import com.ibm.dip.model.savings account.InitiateServiceFeesResponseServiceFees;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateServiceFeesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:38.895Z[GMT]")

public class InitiateServiceFeesResponse   {
  @JsonProperty("SavingsAccountFacility")
  private InitiateServiceFeesResponseSavingsAccountFacility savingsAccountFacility;

  @JsonProperty("ServiceFees")
  private InitiateServiceFeesResponseServiceFees serviceFees;

  public InitiateServiceFeesResponse savingsAccountFacility(InitiateServiceFeesResponseSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
    return this;
  }

  /**
   * Get savingsAccountFacility
   * @return savingsAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateServiceFeesResponseSavingsAccountFacility getSavingsAccountFacility() {
    return savingsAccountFacility;
  }

  public void setSavingsAccountFacility(InitiateServiceFeesResponseSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
  }

  public InitiateServiceFeesResponse serviceFees(InitiateServiceFeesResponseServiceFees serviceFees) {
    this.serviceFees = serviceFees;
    return this;
  }

  /**
   * Get serviceFees
   * @return serviceFees
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateServiceFeesResponseServiceFees getServiceFees() {
    return serviceFees;
  }

  public void setServiceFees(InitiateServiceFeesResponseServiceFees serviceFees) {
    this.serviceFees = serviceFees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateServiceFeesResponse initiateServiceFeesResponse = (InitiateServiceFeesResponse) o;
    return Objects.equals(this.savingsAccountFacility, initiateServiceFeesResponse.savingsAccountFacility) &&
        Objects.equals(this.serviceFees, initiateServiceFeesResponse.serviceFees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savingsAccountFacility, serviceFees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateServiceFeesResponse {\n");
    
    sb.append("    savingsAccountFacility: ").append(toIndentedString(savingsAccountFacility)).append("\n");
    sb.append("    serviceFees: ").append(toIndentedString(serviceFees)).append("\n");
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

