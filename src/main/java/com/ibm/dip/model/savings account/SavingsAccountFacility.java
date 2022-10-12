package com.ibm.dip.model.savings account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavingsAccountFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:38.895Z[GMT]")

public class SavingsAccountFacility   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("SavingsAccountNumber")
  private String savingsAccountNumber;

  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("BankBranchOrLocationReference")
  private Object bankBranchOrLocationReference;

  @JsonProperty("AccountType")
  private String accountType;

  @JsonProperty("AccountCurrency")
  private String accountCurrency;

  @JsonProperty("TaxReference")
  private Object taxReference;

  @JsonProperty("EntitlementOptionDefinition")
  private String entitlementOptionDefinition;

  @JsonProperty("EntitlementOptionSetting")
  private String entitlementOptionSetting;

  @JsonProperty("RestrictionOptionDefinition")
  private String restrictionOptionDefinition;

  @JsonProperty("RestrictionOptionSetting")
  private String restrictionOptionSetting;

  @JsonProperty("Associations")
  private String associations;

  @JsonProperty("AssociationType")
  private String associationType;

  @JsonProperty("AssociationObligationOrEntitlement")
  private String associationObligationOrEntitlement;

  @JsonProperty("AssociationReference")
  private Object associationReference;

  @JsonProperty("LinkedAccounts")
  private String linkedAccounts;

  @JsonProperty("LinkType")
  private String linkType;

  @JsonProperty("AccountDetails")
  private String accountDetails;

  @JsonProperty("PositionLimits")
  private String positionLimits;

  @JsonProperty("PositionLimitType")
  private String positionLimitType;

  @JsonProperty("PositionLimitSettings")
  private String positionLimitSettings;

  @JsonProperty("PositionLimitValue")
  private String positionLimitValue;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("Date")
  private String date;

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

  public SavingsAccountFacility productInstanceReference(Object productInstanceReference) {
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

  public SavingsAccountFacility savingsAccountNumber(String savingsAccountNumber) {
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

  public SavingsAccountFacility customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public SavingsAccountFacility bankBranchOrLocationReference(Object bankBranchOrLocationReference) {
    this.bankBranchOrLocationReference = bankBranchOrLocationReference;
    return this;
  }

  /**
   * Get bankBranchOrLocationReference
   * @return bankBranchOrLocationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBankBranchOrLocationReference() {
    return bankBranchOrLocationReference;
  }

  public void setBankBranchOrLocationReference(Object bankBranchOrLocationReference) {
    this.bankBranchOrLocationReference = bankBranchOrLocationReference;
  }

  public SavingsAccountFacility accountType(String accountType) {
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

  public SavingsAccountFacility accountCurrency(String accountCurrency) {
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

  public SavingsAccountFacility taxReference(Object taxReference) {
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

  public SavingsAccountFacility entitlementOptionDefinition(String entitlementOptionDefinition) {
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

  public SavingsAccountFacility entitlementOptionSetting(String entitlementOptionSetting) {
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

  public SavingsAccountFacility restrictionOptionDefinition(String restrictionOptionDefinition) {
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

  public SavingsAccountFacility restrictionOptionSetting(String restrictionOptionSetting) {
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

  public SavingsAccountFacility associations(String associations) {
    this.associations = associations;
    return this;
  }

  /**
   * Get associations
   * @return associations
  */
  @ApiModelProperty(value = "")


  public String getAssociations() {
    return associations;
  }

  public void setAssociations(String associations) {
    this.associations = associations;
  }

  public SavingsAccountFacility associationType(String associationType) {
    this.associationType = associationType;
    return this;
  }

  /**
   * Get associationType
   * @return associationType
  */
  @ApiModelProperty(value = "")


  public String getAssociationType() {
    return associationType;
  }

  public void setAssociationType(String associationType) {
    this.associationType = associationType;
  }

  public SavingsAccountFacility associationObligationOrEntitlement(String associationObligationOrEntitlement) {
    this.associationObligationOrEntitlement = associationObligationOrEntitlement;
    return this;
  }

  /**
   * Get associationObligationOrEntitlement
   * @return associationObligationOrEntitlement
  */
  @ApiModelProperty(value = "")


  public String getAssociationObligationOrEntitlement() {
    return associationObligationOrEntitlement;
  }

  public void setAssociationObligationOrEntitlement(String associationObligationOrEntitlement) {
    this.associationObligationOrEntitlement = associationObligationOrEntitlement;
  }

  public SavingsAccountFacility associationReference(Object associationReference) {
    this.associationReference = associationReference;
    return this;
  }

  /**
   * Get associationReference
   * @return associationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getAssociationReference() {
    return associationReference;
  }

  public void setAssociationReference(Object associationReference) {
    this.associationReference = associationReference;
  }

  public SavingsAccountFacility linkedAccounts(String linkedAccounts) {
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

  public SavingsAccountFacility linkType(String linkType) {
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

  public SavingsAccountFacility accountDetails(String accountDetails) {
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

  public SavingsAccountFacility positionLimits(String positionLimits) {
    this.positionLimits = positionLimits;
    return this;
  }

  /**
   * Get positionLimits
   * @return positionLimits
  */
  @ApiModelProperty(value = "")


  public String getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(String positionLimits) {
    this.positionLimits = positionLimits;
  }

  public SavingsAccountFacility positionLimitType(String positionLimitType) {
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

  public SavingsAccountFacility positionLimitSettings(String positionLimitSettings) {
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

  public SavingsAccountFacility positionLimitValue(String positionLimitValue) {
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

  public SavingsAccountFacility dateType(String dateType) {
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

  public SavingsAccountFacility date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public SavingsAccountFacility statementsSchedule(String statementsSchedule) {
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

  public SavingsAccountFacility statementType(String statementType) {
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

  public SavingsAccountFacility statementTransactionType(String statementTransactionType) {
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

  public SavingsAccountFacility statementPeriod(String statementPeriod) {
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

  public SavingsAccountFacility statementReport(String statementReport) {
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
    SavingsAccountFacility savingsAccountFacility = (SavingsAccountFacility) o;
    return Objects.equals(this.productInstanceReference, savingsAccountFacility.productInstanceReference) &&
        Objects.equals(this.savingsAccountNumber, savingsAccountFacility.savingsAccountNumber) &&
        Objects.equals(this.customerReference, savingsAccountFacility.customerReference) &&
        Objects.equals(this.bankBranchOrLocationReference, savingsAccountFacility.bankBranchOrLocationReference) &&
        Objects.equals(this.accountType, savingsAccountFacility.accountType) &&
        Objects.equals(this.accountCurrency, savingsAccountFacility.accountCurrency) &&
        Objects.equals(this.taxReference, savingsAccountFacility.taxReference) &&
        Objects.equals(this.entitlementOptionDefinition, savingsAccountFacility.entitlementOptionDefinition) &&
        Objects.equals(this.entitlementOptionSetting, savingsAccountFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionDefinition, savingsAccountFacility.restrictionOptionDefinition) &&
        Objects.equals(this.restrictionOptionSetting, savingsAccountFacility.restrictionOptionSetting) &&
        Objects.equals(this.associations, savingsAccountFacility.associations) &&
        Objects.equals(this.associationType, savingsAccountFacility.associationType) &&
        Objects.equals(this.associationObligationOrEntitlement, savingsAccountFacility.associationObligationOrEntitlement) &&
        Objects.equals(this.associationReference, savingsAccountFacility.associationReference) &&
        Objects.equals(this.linkedAccounts, savingsAccountFacility.linkedAccounts) &&
        Objects.equals(this.linkType, savingsAccountFacility.linkType) &&
        Objects.equals(this.accountDetails, savingsAccountFacility.accountDetails) &&
        Objects.equals(this.positionLimits, savingsAccountFacility.positionLimits) &&
        Objects.equals(this.positionLimitType, savingsAccountFacility.positionLimitType) &&
        Objects.equals(this.positionLimitSettings, savingsAccountFacility.positionLimitSettings) &&
        Objects.equals(this.positionLimitValue, savingsAccountFacility.positionLimitValue) &&
        Objects.equals(this.dateType, savingsAccountFacility.dateType) &&
        Objects.equals(this.date, savingsAccountFacility.date) &&
        Objects.equals(this.statementsSchedule, savingsAccountFacility.statementsSchedule) &&
        Objects.equals(this.statementType, savingsAccountFacility.statementType) &&
        Objects.equals(this.statementTransactionType, savingsAccountFacility.statementTransactionType) &&
        Objects.equals(this.statementPeriod, savingsAccountFacility.statementPeriod) &&
        Objects.equals(this.statementReport, savingsAccountFacility.statementReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, savingsAccountNumber, customerReference, bankBranchOrLocationReference, accountType, accountCurrency, taxReference, entitlementOptionDefinition, entitlementOptionSetting, restrictionOptionDefinition, restrictionOptionSetting, associations, associationType, associationObligationOrEntitlement, associationReference, linkedAccounts, linkType, accountDetails, positionLimits, positionLimitType, positionLimitSettings, positionLimitValue, dateType, date, statementsSchedule, statementType, statementTransactionType, statementPeriod, statementReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingsAccountFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    savingsAccountNumber: ").append(toIndentedString(savingsAccountNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    bankBranchOrLocationReference: ").append(toIndentedString(bankBranchOrLocationReference)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    taxReference: ").append(toIndentedString(taxReference)).append("\n");
    sb.append("    entitlementOptionDefinition: ").append(toIndentedString(entitlementOptionDefinition)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionDefinition: ").append(toIndentedString(restrictionOptionDefinition)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    associationObligationOrEntitlement: ").append(toIndentedString(associationObligationOrEntitlement)).append("\n");
    sb.append("    associationReference: ").append(toIndentedString(associationReference)).append("\n");
    sb.append("    linkedAccounts: ").append(toIndentedString(linkedAccounts)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
    sb.append("    positionLimits: ").append(toIndentedString(positionLimits)).append("\n");
    sb.append("    positionLimitType: ").append(toIndentedString(positionLimitType)).append("\n");
    sb.append("    positionLimitSettings: ").append(toIndentedString(positionLimitSettings)).append("\n");
    sb.append("    positionLimitValue: ").append(toIndentedString(positionLimitValue)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

