package com.ibm.dip.model.savings account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAccountLienResponseSavingsAccountFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:38.895Z[GMT]")

public class InitiateAccountLienResponseSavingsAccountFacility   {
  @JsonProperty("EntitlementOptionDefinition")
  private String entitlementOptionDefinition;

  @JsonProperty("RestrictionOptionDefinition")
  private String restrictionOptionDefinition;

  @JsonProperty("LinkedAccounts")
  private String linkedAccounts;

  @JsonProperty("PositionLimitSettings")
  private String positionLimitSettings;

  @JsonProperty("PositionLimitValue")
  private String positionLimitValue;

  @JsonProperty("DateType")
  private String dateType;

  public InitiateAccountLienResponseSavingsAccountFacility entitlementOptionDefinition(String entitlementOptionDefinition) {
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

  public InitiateAccountLienResponseSavingsAccountFacility restrictionOptionDefinition(String restrictionOptionDefinition) {
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

  public InitiateAccountLienResponseSavingsAccountFacility linkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
    return this;
  }

  /**
   * Get linkedAccounts
   * @return linkedAccounts
  */
  @ApiModelProperty(value = "")


  public String getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }

  public InitiateAccountLienResponseSavingsAccountFacility positionLimitSettings(String positionLimitSettings) {
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

  public InitiateAccountLienResponseSavingsAccountFacility positionLimitValue(String positionLimitValue) {
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

  public InitiateAccountLienResponseSavingsAccountFacility dateType(String dateType) {
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
    InitiateAccountLienResponseSavingsAccountFacility initiateAccountLienResponseSavingsAccountFacility = (InitiateAccountLienResponseSavingsAccountFacility) o;
    return Objects.equals(this.entitlementOptionDefinition, initiateAccountLienResponseSavingsAccountFacility.entitlementOptionDefinition) &&
        Objects.equals(this.restrictionOptionDefinition, initiateAccountLienResponseSavingsAccountFacility.restrictionOptionDefinition) &&
        Objects.equals(this.linkedAccounts, initiateAccountLienResponseSavingsAccountFacility.linkedAccounts) &&
        Objects.equals(this.positionLimitSettings, initiateAccountLienResponseSavingsAccountFacility.positionLimitSettings) &&
        Objects.equals(this.positionLimitValue, initiateAccountLienResponseSavingsAccountFacility.positionLimitValue) &&
        Objects.equals(this.dateType, initiateAccountLienResponseSavingsAccountFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitlementOptionDefinition, restrictionOptionDefinition, linkedAccounts, positionLimitSettings, positionLimitValue, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountLienResponseSavingsAccountFacility {\n");
    
    sb.append("    entitlementOptionDefinition: ").append(toIndentedString(entitlementOptionDefinition)).append("\n");
    sb.append("    restrictionOptionDefinition: ").append(toIndentedString(restrictionOptionDefinition)).append("\n");
    sb.append("    linkedAccounts: ").append(toIndentedString(linkedAccounts)).append("\n");
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

