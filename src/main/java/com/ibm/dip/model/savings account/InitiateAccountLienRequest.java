package com.ibm.dip.model.savings account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.savings account.InitiateAccountLienRequestAccountLien;
import com.ibm.dip.model.savings account.InitiateAccountLienRequestSavingsAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAccountLienRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:38.895Z[GMT]")

public class InitiateAccountLienRequest   {
  @JsonProperty("SavingsAccountFacility")
  private InitiateAccountLienRequestSavingsAccountFacility savingsAccountFacility;

  @JsonProperty("AccountLien")
  private InitiateAccountLienRequestAccountLien accountLien;

  public InitiateAccountLienRequest savingsAccountFacility(InitiateAccountLienRequestSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
    return this;
  }

  /**
   * Get savingsAccountFacility
   * @return savingsAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountLienRequestSavingsAccountFacility getSavingsAccountFacility() {
    return savingsAccountFacility;
  }

  public void setSavingsAccountFacility(InitiateAccountLienRequestSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
  }

  public InitiateAccountLienRequest accountLien(InitiateAccountLienRequestAccountLien accountLien) {
    this.accountLien = accountLien;
    return this;
  }

  /**
   * Get accountLien
   * @return accountLien
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountLienRequestAccountLien getAccountLien() {
    return accountLien;
  }

  public void setAccountLien(InitiateAccountLienRequestAccountLien accountLien) {
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
    InitiateAccountLienRequest initiateAccountLienRequest = (InitiateAccountLienRequest) o;
    return Objects.equals(this.savingsAccountFacility, initiateAccountLienRequest.savingsAccountFacility) &&
        Objects.equals(this.accountLien, initiateAccountLienRequest.accountLien);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savingsAccountFacility, accountLien);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountLienRequest {\n");
    
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

