package com.ibm.dip.model.savings account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.savings account.InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals;
import com.ibm.dip.model.savings account.InitiateDepositsandWithdrawalsRequestSavingsAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateDepositsandWithdrawalsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:38.895Z[GMT]")

public class InitiateDepositsandWithdrawalsRequest   {
  @JsonProperty("SavingsAccountFacility")
  private InitiateDepositsandWithdrawalsRequestSavingsAccountFacility savingsAccountFacility;

  @JsonProperty("DepositsandWithdrawals")
  private InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals;

  public InitiateDepositsandWithdrawalsRequest savingsAccountFacility(InitiateDepositsandWithdrawalsRequestSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
    return this;
  }

  /**
   * Get savingsAccountFacility
   * @return savingsAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateDepositsandWithdrawalsRequestSavingsAccountFacility getSavingsAccountFacility() {
    return savingsAccountFacility;
  }

  public void setSavingsAccountFacility(InitiateDepositsandWithdrawalsRequestSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
  }

  public InitiateDepositsandWithdrawalsRequest depositsandWithdrawals(InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals) {
    this.depositsandWithdrawals = depositsandWithdrawals;
    return this;
  }

  /**
   * Get depositsandWithdrawals
   * @return depositsandWithdrawals
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals getDepositsandWithdrawals() {
    return depositsandWithdrawals;
  }

  public void setDepositsandWithdrawals(InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals) {
    this.depositsandWithdrawals = depositsandWithdrawals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateDepositsandWithdrawalsRequest initiateDepositsandWithdrawalsRequest = (InitiateDepositsandWithdrawalsRequest) o;
    return Objects.equals(this.savingsAccountFacility, initiateDepositsandWithdrawalsRequest.savingsAccountFacility) &&
        Objects.equals(this.depositsandWithdrawals, initiateDepositsandWithdrawalsRequest.depositsandWithdrawals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savingsAccountFacility, depositsandWithdrawals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateDepositsandWithdrawalsRequest {\n");
    
    sb.append("    savingsAccountFacility: ").append(toIndentedString(savingsAccountFacility)).append("\n");
    sb.append("    depositsandWithdrawals: ").append(toIndentedString(depositsandWithdrawals)).append("\n");
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

