package com.ibm.dip.model.savings account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.savings account.InitiatePaymentsResponsePayments;
import com.ibm.dip.model.savings account.InitiatePaymentsResponseSavingsAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePaymentsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:38.895Z[GMT]")

public class InitiatePaymentsResponse   {
  @JsonProperty("SavingsAccountFacility")
  private InitiatePaymentsResponseSavingsAccountFacility savingsAccountFacility;

  @JsonProperty("Payments")
  private InitiatePaymentsResponsePayments payments;

  public InitiatePaymentsResponse savingsAccountFacility(InitiatePaymentsResponseSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
    return this;
  }

  /**
   * Get savingsAccountFacility
   * @return savingsAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePaymentsResponseSavingsAccountFacility getSavingsAccountFacility() {
    return savingsAccountFacility;
  }

  public void setSavingsAccountFacility(InitiatePaymentsResponseSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
  }

  public InitiatePaymentsResponse payments(InitiatePaymentsResponsePayments payments) {
    this.payments = payments;
    return this;
  }

  /**
   * Get payments
   * @return payments
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePaymentsResponsePayments getPayments() {
    return payments;
  }

  public void setPayments(InitiatePaymentsResponsePayments payments) {
    this.payments = payments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentsResponse initiatePaymentsResponse = (InitiatePaymentsResponse) o;
    return Objects.equals(this.savingsAccountFacility, initiatePaymentsResponse.savingsAccountFacility) &&
        Objects.equals(this.payments, initiatePaymentsResponse.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savingsAccountFacility, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentsResponse {\n");
    
    sb.append("    savingsAccountFacility: ").append(toIndentedString(savingsAccountFacility)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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

