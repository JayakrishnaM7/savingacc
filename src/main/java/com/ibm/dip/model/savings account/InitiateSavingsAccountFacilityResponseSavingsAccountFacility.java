package com.ibm.dip.model.savings account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateSavingsAccountFacilityResponseSavingsAccountFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:38.895Z[GMT]")

public class InitiateSavingsAccountFacilityResponseSavingsAccountFacility   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("SavingsAccountNumber")
  private String savingsAccountNumber;

  @JsonProperty("AccountCurrency")
  private String accountCurrency;

  @JsonProperty("EntitlementOptionDefinition")
  private String entitlementOptionDefinition;

  @JsonProperty("EntitlementOptionSetting")
  private String entitlementOptionSetting;

  @JsonProperty("RestrictionOptionDefinition")
  private String restrictionOptionDefinition;

  @JsonProperty("RestrictionOptionSetting")
  private String restrictionOptionSetting;

  @JsonProperty("PositionLimitType")
  private String positionLimitType;

  @JsonProperty("PositionLimitSettings")
  private String positionLimitSettings;

  @JsonProperty("PositionLimitValue")
  private String positionLimitValue;

  @JsonProperty("DateType")
  private String dateType;

  public InitiateSavingsAccountFacilityResponseSavingsAccountFacility productInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * Get productInstanceReference
   * @return productInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public InitiateSavingsAccountFacilityResponseSavingsAccountFacility savingsAccountNumber(String savingsAccountNumber) {
    this.savingsAccountNumber = savingsAccountNumber;
    return this;
  }

  /**
   * Get savingsAccountNumber
   * @return savingsAccountNumber
  */
  @ApiModelProperty(value = "")


  public String getSavingsAccountNumber() {
    return savingsAccountNumber;
  }

  public void setSavingsAccountNumber(String savingsAccountNumber) {
    this.savingsAccountNumber = savingsAccountNumber;
  }

  public InitiateSavingsAccountFacilityResponseSavingsAccountFacility accountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
    return this;
  }

  /**
   * Get accountCurrency
   * @return accountCurrency
  */
  @ApiModelProperty(value = "")


  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }

  public InitiateSavingsAccountFacilityResponseSavingsAccountFacility entitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
    return this;
  }

  /**
   * Get entitlementOptionDefinition
   * @return entitlementOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }

  public InitiateSavingsAccountFacilityResponseSavingsAccountFacility entitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
    return this;
  }

  /**
   * Get entitlementOptionSetting
   * @return entitlementOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }

  public InitiateSavingsAccountFacilityResponseSavingsAccountFacility restrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
    return this;
  }

  /**
   * Get restrictionOptionDefinition
   * @return restrictionOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }

  public InitiateSavingsAccountFacilityResponseSavingsAccountFacility restrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
    return this;
  }

  /**
   * Get restrictionOptionSetting
   * @return restrictionOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }

  public InitiateSavingsAccountFacilityResponseSavingsAccountFacility positionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
    return this;
  }

  /**
   * Get positionLimitType
   * @return positionLimitType
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitType() {
    return positionLimitType;
  }

  public void setPositionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
  }

  public InitiateSavingsAccountFacilityResponseSavingsAccountFacility positionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
    return this;
  }

  /**
   * Get positionLimitSettings
   * @return positionLimitSettings
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitSettings() {
    return positionLimitSettings;
  }

  public void setPositionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
  }

  public InitiateSavingsAccountFacilityResponseSavingsAccountFacility positionLimitValue(String positionLimitValue) {
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

  public InitiateSavingsAccountFacilityResponseSavingsAccountFacility dateType(String dateType) {
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
    InitiateSavingsAccountFacilityResponseSavingsAccountFacility initiateSavingsAccountFacilityResponseSavingsAccountFacility = (InitiateSavingsAccountFacilityResponseSavingsAccountFacility) o;
    return Objects.equals(this.productInstanceReference, initiateSavingsAccountFacilityResponseSavingsAccountFacility.productInstanceReference) &&
        Objects.equals(this.savingsAccountNumber, initiateSavingsAccountFacilityResponseSavingsAccountFacility.savingsAccountNumber) &&
        Objects.equals(this.accountCurrency, initiateSavingsAccountFacilityResponseSavingsAccountFacility.accountCurrency) &&
        Objects.equals(this.entitlementOptionDefinition, initiateSavingsAccountFacilityResponseSavingsAccountFacility.entitlementOptionDefinition) &&
        Objects.equals(this.entitlementOptionSetting, initiateSavingsAccountFacilityResponseSavingsAccountFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionDefinition, initiateSavingsAccountFacilityResponseSavingsAccountFacility.restrictionOptionDefinition) &&
        Objects.equals(this.restrictionOptionSetting, initiateSavingsAccountFacilityResponseSavingsAccountFacility.restrictionOptionSetting) &&
        Objects.equals(this.positionLimitType, initiateSavingsAccountFacilityResponseSavingsAccountFacility.positionLimitType) &&
        Objects.equals(this.positionLimitSettings, initiateSavingsAccountFacilityResponseSavingsAccountFacility.positionLimitSettings) &&
        Objects.equals(this.positionLimitValue, initiateSavingsAccountFacilityResponseSavingsAccountFacility.positionLimitValue) &&
        Objects.equals(this.dateType, initiateSavingsAccountFacilityResponseSavingsAccountFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, savingsAccountNumber, accountCurrency, entitlementOptionDefinition, entitlementOptionSetting, restrictionOptionDefinition, restrictionOptionSetting, positionLimitType, positionLimitSettings, positionLimitValue, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateSavingsAccountFacilityResponseSavingsAccountFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    savingsAccountNumber: ").append(toIndentedString(savingsAccountNumber)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    entitlementOptionDefinition: ").append(toIndentedString(entitlementOptionDefinition)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionDefinition: ").append(toIndentedString(restrictionOptionDefinition)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    positionLimitType: ").append(toIndentedString(positionLimitType)).append("\n");
    sb.append("    positionLimitSettings: ").append(toIndentedString(positionLimitSettings)).append("\n");
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

