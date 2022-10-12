package com.ibm.dip.model.savings account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.savings account.InitiateAccountLienResponseAccountLien;
import com.ibm.dip.model.savings account.InitiateAccountLienResponseSavingsAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAccountLienResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:38.895Z[GMT]")

public class InitiateAccountLienResponse   {
  @JsonProperty("SavingsAccountFacility")
  private InitiateAccountLienResponseSavingsAccountFacility savingsAccountFacility;

  @JsonProperty("AccountLien")
  private InitiateAccountLienResponseAccountLien accountLien;

  public InitiateAccountLienResponse savingsAccountFacility(InitiateAccountLienResponseSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
    return this;
  }

  /**
   * Get savingsAccountFacility
   * @return savingsAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountLienResponseSavingsAccountFacility getSavingsAccountFacility() {
    return savingsAccountFacility;
  }

  public void setSavingsAccountFacility(InitiateAccountLienResponseSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
  }

  public InitiateAccountLienResponse accountLien(InitiateAccountLienResponseAccountLien accountLien) {
    this.accountLien = accountLien;
    return this;
  }

  /**
   * Get accountLien
   * @return accountLien
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountLienResponseAccountLien getAccountLien() {
    return accountLien;
  }

  public void setAccountLien(InitiateAccountLienResponseAccountLien accountLien) {
    this.accountLien = accountLien;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateAccountLienResponse initiateAccountLienResponse = (InitiateAccountLienResponse) o;
    return Objects.equals(this.savingsAccountFacility, initiateAccountLienResponse.savingsAccountFacility) &&
        Objects.equals(this.accountLien, initiateAccountLienResponse.accountLien);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savingsAccountFacility, accountLien);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountLienResponse {\n");
    
    sb.append("    savingsAccountFacility: ").append(toIndentedString(savingsAccountFacility)).append("\n");
    sb.append("    accountLien: ").append(toIndentedString(accountLien)).append("\n");
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

