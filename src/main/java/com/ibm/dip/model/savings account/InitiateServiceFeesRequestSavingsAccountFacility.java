package com.ibm.dip.model.savings account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateServiceFeesRequestSavingsAccountFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:38.895Z[GMT]")

public class InitiateServiceFeesRequestSavingsAccountFacility   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("SavingsAccountNumber")
  private String savingsAccountNumber;

  @JsonProperty("AccountType")
  private String accountType;

  @JsonProperty("AccountCurrency")
  private String accountCurrency;

  @JsonProperty("TaxReference")
  private Object taxReference;

  @JsonProperty("RestrictionOptionSetting")
  private String restrictionOptionSetting;

  @JsonProperty("LinkedAccounts")
  private String linkedAccounts;

  @JsonProperty("LinkType")
  private String linkType;

  @JsonProperty("AccountDetails")
  private String accountDetails;

  @JsonProperty("PositionLimitType")
  private String positionLimitType;

  @JsonProperty("PositionLimitSettings")
  private String positionLimitSettings;

  @JsonProperty("PositionLimitValue")
  private String positionLimitValue;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("StatementsSchedule")
  private String statementsSchedule;

  @JsonProperty("StatementType")
  private String statementType;

  @JsonProperty("StatementTransactionType")
  private String statementTransactionType;

  @JsonProperty("StatementPeriod")
  private String statementPeriod;

  @JsonProperty("StatementReport")
  private String statementReport;

  public InitiateServiceFeesRequestSavingsAccountFacility productInstanceReference(Object productInstanceReference) {
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

  public InitiateServiceFeesRequestSavingsAccountFacility savingsAccountNumber(String savingsAccountNumber) {
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

  public InitiateServiceFeesRequestSavingsAccountFacility accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  */
  @ApiModelProperty(value = "")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public InitiateServiceFeesRequestSavingsAccountFacility accountCurrency(String accountCurrency) {
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

  public InitiateServiceFeesRequestSavingsAccountFacility taxReference(Object taxReference) {
    this.taxReference = taxReference;
    return this;
  }

  /**
   * Get taxReference
   * @return taxReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(Object taxReference) {
    this.taxReference = taxReference;
  }

  public InitiateServiceFeesRequestSavingsAccountFacility restrictionOptionSetting(String restrictionOptionSetting) {
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

  public InitiateServiceFeesRequestSavingsAccountFacility linkedAccounts(String linkedAccounts) {
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

  public InitiateServiceFeesRequestSavingsAccountFacility linkType(String linkType) {
    this.linkType = linkType;
    return this;
  }

  /**
   * Get linkType
   * @return linkType
  */
  @ApiModelProperty(value = "")


  public String getLinkType() {
    return linkType;
  }

  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }

  public InitiateServiceFeesRequestSavingsAccountFacility accountDetails(String accountDetails) {
    this.accountDetails = accountDetails;
    return this;
  }

  /**
   * Get accountDetails
   * @return accountDetails
  */
  @ApiModelProperty(value = "")


  public String getAccountDetails() {
    return accountDetails;
  }

  public void setAccountDetails(String accountDetails) {
    this.accountDetails = accountDetails;
  }

  public InitiateServiceFeesRequestSavingsAccountFacility positionLimitType(String positionLimitType) {
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

  public InitiateServiceFeesRequestSavingsAccountFacility positionLimitSettings(String positionLimitSettings) {
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

  public InitiateServiceFeesRequestSavingsAccountFacility positionLimitValue(String positionLimitValue) {
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

  public InitiateServiceFeesRequestSavingsAccountFacility dateType(String dateType) {
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

  public InitiateServiceFeesRequestSavingsAccountFacility statementsSchedule(String statementsSchedule) {
    this.statementsSchedule = statementsSchedule;
    return this;
  }

  /**
   * Get statementsSchedule
   * @return statementsSchedule
  */
  @ApiModelProperty(value = "")


  public String getStatementsSchedule() {
    return statementsSchedule;
  }

  public void setStatementsSchedule(String statementsSchedule) {
    this.statementsSchedule = statementsSchedule;
  }

  public InitiateServiceFeesRequestSavingsAccountFacility statementType(String statementType) {
    this.statementType = statementType;
    return this;
  }

  /**
   * Get statementType
   * @return statementType
  */
  @ApiModelProperty(value = "")


  public String getStatementType() {
    return statementType;
  }

  public void setStatementType(String statementType) {
    this.statementType = statementType;
  }

  public InitiateServiceFeesRequestSavingsAccountFacility statementTransactionType(String statementTransactionType) {
    this.statementTransactionType = statementTransactionType;
    return this;
  }

  /**
   * Get statementTransactionType
   * @return statementTransactionType
  */
  @ApiModelProperty(value = "")


  public String getStatementTransactionType() {
    return statementTransactionType;
  }

  public void setStatementTransactionType(String statementTransactionType) {
    this.statementTransactionType = statementTransactionType;
  }

  public InitiateServiceFeesRequestSavingsAccountFacility statementPeriod(String statementPeriod) {
    this.statementPeriod = statementPeriod;
    return this;
  }

  /**
   * Get statementPeriod
   * @return statementPeriod
  */
  @ApiModelProperty(value = "")


  public String getStatementPeriod() {
    return statementPeriod;
  }

  public void setStatementPeriod(String statementPeriod) {
    this.statementPeriod = statementPeriod;
  }

  public InitiateServiceFeesRequestSavingsAccountFacility statementReport(String statementReport) {
    this.statementReport = statementReport;
    return this;
  }

  /**
   * Get statementReport
   * @return statementReport
  */
  @ApiModelProperty(value = "")


  public String getStatementReport() {
    return statementReport;
  }

  public void setStatementReport(String statementReport) {
    this.statementReport = statementReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateServiceFeesRequestSavingsAccountFacility initiateServiceFeesRequestSavingsAccountFacility = (InitiateServiceFeesRequestSavingsAccountFacility) o;
    return Objects.equals(this.productInstanceReference, initiateServiceFeesRequestSavingsAccountFacility.productInstanceReference) &&
        Objects.equals(this.savingsAccountNumber, initiateServiceFeesRequestSavingsAccountFacility.savingsAccountNumber) &&
        Objects.equals(this.accountType, initiateServiceFeesRequestSavingsAccountFacility.accountType) &&
        Objects.equals(this.accountCurrency, initiateServiceFeesRequestSavingsAccountFacility.accountCurrency) &&
        Objects.equals(this.taxReference, initiateServiceFeesRequestSavingsAccountFacility.taxReference) &&
        Objects.equals(this.restrictionOptionSetting, initiateServiceFeesRequestSavingsAccountFacility.restrictionOptionSetting) &&
        Objects.equals(this.linkedAccounts, initiateServiceFeesRequestSavingsAccountFacility.linkedAccounts) &&
        Objects.equals(this.linkType, initiateServiceFeesRequestSavingsAccountFacility.linkType) &&
        Objects.equals(this.accountDetails, initiateServiceFeesRequestSavingsAccountFacility.accountDetails) &&
        Objects.equals(this.positionLimitType, initiateServiceFeesRequestSavingsAccountFacility.positionLimitType) &&
        Objects.equals(this.positionLimitSettings, initiateServiceFeesRequestSavingsAccountFacility.positionLimitSettings) &&
        Objects.equals(this.positionLimitValue, initiateServiceFeesRequestSavingsAccountFacility.positionLimitValue) &&
        Objects.equals(this.dateType, initiateServiceFeesRequestSavingsAccountFacility.dateType) &&
        Objects.equals(this.statementsSchedule, initiateServiceFeesRequestSavingsAccountFacility.statementsSchedule) &&
        Objects.equals(this.statementType, initiateServiceFeesRequestSavingsAccountFacility.statementType) &&
        Objects.equals(this.statementTransactionType, initiateServiceFeesRequestSavingsAccountFacility.statementTransactionType) &&
        Objects.equals(this.statementPeriod, initiateServiceFeesRequestSavingsAccountFacility.statementPeriod) &&
        Objects.equals(this.statementReport, initiateServiceFeesRequestSavingsAccountFacility.statementReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, savingsAccountNumber, accountType, accountCurrency, taxReference, restrictionOptionSetting, linkedAccounts, linkType, accountDetails, positionLimitType, positionLimitSettings, positionLimitValue, dateType, statementsSchedule, statementType, statementTransactionType, statementPeriod, statementReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateServiceFeesRequestSavingsAccountFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    savingsAccountNumber: ").append(toIndentedString(savingsAccountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    taxReference: ").append(toIndentedString(taxReference)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    linkedAccounts: ").append(toIndentedString(linkedAccounts)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
    sb.append("    positionLimitType: ").append(toIndentedString(positionLimitType)).append("\n");
    sb.append("    positionLimitSettings: ").append(toIndentedString(positionLimitSettings)).append("\n");
    sb.append("    positionLimitValue: ").append(toIndentedString(positionLimitValue)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    statementsSchedule: ").append(toIndentedString(statementsSchedule)).append("\n");
    sb.append("    statementType: ").append(toIndentedString(statementType)).append("\n");
    sb.append("    statementTransactionType: ").append(toIndentedString(statementTransactionType)).append("\n");
    sb.append("    statementPeriod: ").append(toIndentedString(statementPeriod)).append("\n");
    sb.append("    statementReport: ").append(toIndentedString(statementReport)).append("\n");
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

