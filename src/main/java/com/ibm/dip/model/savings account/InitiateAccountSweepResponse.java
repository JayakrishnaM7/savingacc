package com.ibm.dip.model.savings account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.savings account.InitiateAccountSweepResponseAccountSweep;
import com.ibm.dip.model.savings account.InitiateServiceFeesResponseSavingsAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAccountSweepResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:38.895Z[GMT]")

public class InitiateAccountSweepResponse   {
  @JsonProperty("SavingsAccountFacility")
  private InitiateServiceFeesResponseSavingsAccountFacility savingsAccountFacility;

  @JsonProperty("AccountSweep")
  private InitiateAccountSweepResponseAccountSweep accountSweep;

  public InitiateAccountSweepResponse savingsAccountFacility(InitiateServiceFeesResponseSavingsAccountFacility savingsAccountFacility) {
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

  public InitiateAccountSweepResponse accountSweep(InitiateAccountSweepResponseAccountSweep accountSweep) {
    this.accountSweep = accountSweep;
    return this;
  }

  /**
   * Get accountSweep
   * @return accountSweep
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountSweepResponseAccountSweep getAccountSweep() {
    return accountSweep;
  }

  public void setAccountSweep(InitiateAccountSweepResponseAccountSweep accountSweep) {
    this.accountSweep = accountSweep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateAccountSweepResponse initiateAccountSweepResponse = (InitiateAccountSweepResponse) o;
    return Objects.equals(this.savingsAccountFacility, initiateAccountSweepResponse.savingsAccountFacility) &&
        Objects.equals(this.accountSweep, initiateAccountSweepResponse.accountSweep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savingsAccountFacility, accountSweep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountSweepResponse {\n");
    
    sb.append("    savingsAccountFacility: ").append(toIndentedString(savingsAccountFacility)).append("\n");
    sb.append("    accountSweep: ").append(toIndentedString(accountSweep)).append("\n");
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

