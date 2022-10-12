package com.ibm.dip.model.savings account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateDepositsandWithdrawalsResponseSavingsAccountFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:38.895Z[GMT]")

public class InitiateDepositsandWithdrawalsResponseSavingsAccountFacility   {
  @JsonProperty("PositionLimitValue")
  private String positionLimitValue;

  @JsonProperty("DateType")
  private String dateType;

  public InitiateDepositsandWithdrawalsResponseSavingsAccountFacility positionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
    return this;
  }

  /**
   * Get positionLimitValue
   * @return positionLimitValue
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitValue() {
    return positionLimitValue;
  }

  public void setPositionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
  }

  public InitiateDepositsandWithdrawalsResponseSavingsAccountFacility dateType(String dateType) {
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
    InitiateDepositsandWithdrawalsResponseSavingsAccountFacility initiateDepositsandWithdrawalsResponseSavingsAccountFacility = (InitiateDepositsandWithdrawalsResponseSavingsAccountFacility) o;
    return Objects.equals(this.positionLimitValue, initiateDepositsandWithdrawalsResponseSavingsAccountFacility.positionLimitValue) &&
        Objects.equals(this.dateType, initiateDepositsandWithdrawalsResponseSavingsAccountFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionLimitValue, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateDepositsandWithdrawalsResponseSavingsAccountFacility {\n");
    
    sb.append("    positionLimitValue: ").append(toIndentedString(positionLimitValue)).append("\n");
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

