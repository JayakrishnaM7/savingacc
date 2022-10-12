package com.ibm.dip.model.savings account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAccountSweepRequestSavingsAccountFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:38.895Z[GMT]")

public class InitiateAccountSweepRequestSavingsAccountFacility   {
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

  @JsonProperty("EntitlementOptionSetting")
  private String entitlementOptionSetting;

  @JsonProperty("RestrictionOptionSetting")
  private String restrictionOptionSetting;

  @JsonProperty("LinkedAccounts")
  private String linkedAccounts;

  @JsonProperty("LinkType")
  private String linkType;

  @JsonProperty("AccountDetails")
  private String accountDetails;

  @JsonProperty("DateType")
  private String dateType;

  public InitiateAccountSweepRequestSavingsAccountFacility productInstanceReference(Object productInstanceReference) {
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

  public InitiateAccountSweepRequestSavingsAccountFacility savingsAccountNumber(String savingsAccountNumber) {
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

  public InitiateAccountSweepRequestSavingsAccountFacility customerReference(Object customerReference) {
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

  public InitiateAccountSweepRequestSavingsAccountFacility bankBranchOrLocationReference(Object bankBranchOrLocationReference) {
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

  public InitiateAccountSweepRequestSavingsAccountFacility accountType(String accountType) {
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

  public InitiateAccountSweepRequestSavingsAccountFacility accountCurrency(String accountCurrency) {
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

  public InitiateAccountSweepRequestSavingsAccountFacility taxReference(Object taxReference) {
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

  public InitiateAccountSweepRequestSavingsAccountFacility entitlementOptionSetting(String entitlementOptionSetting) {
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

  public InitiateAccountSweepRequestSavingsAccountFacility restrictionOptionSetting(String restrictionOptionSetting) {
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

  public InitiateAccountSweepRequestSavingsAccountFacility linkedAccounts(String linkedAccounts) {
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

  public InitiateAccountSweepRequestSavingsAccountFacility linkType(String linkType) {
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

  public InitiateAccountSweepRequestSavingsAccountFacility accountDetails(String accountDetails) {
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

  public InitiateAccountSweepRequestSavingsAccountFacility dateType(String dateType) {
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
    InitiateAccountSweepRequestSavingsAccountFacility initiateAccountSweepRequestSavingsAccountFacility = (InitiateAccountSweepRequestSavingsAccountFacility) o;
    return Objects.equals(this.productInstanceReference, initiateAccountSweepRequestSavingsAccountFacility.productInstanceReference) &&
        Objects.equals(this.savingsAccountNumber, initiateAccountSweepRequestSavingsAccountFacility.savingsAccountNumber) &&
        Objects.equals(this.customerReference, initiateAccountSweepRequestSavingsAccountFacility.customerReference) &&
        Objects.equals(this.bankBranchOrLocationReference, initiateAccountSweepRequestSavingsAccountFacility.bankBranchOrLocationReference) &&
        Objects.equals(this.accountType, initiateAccountSweepRequestSavingsAccountFacility.accountType) &&
        Objects.equals(this.accountCurrency, initiateAccountSweepRequestSavingsAccountFacility.accountCurrency) &&
        Objects.equals(this.taxReference, initiateAccountSweepRequestSavingsAccountFacility.taxReference) &&
        Objects.equals(this.entitlementOptionSetting, initiateAccountSweepRequestSavingsAccountFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionSetting, initiateAccountSweepRequestSavingsAccountFacility.restrictionOptionSetting) &&
        Objects.equals(this.linkedAccounts, initiateAccountSweepRequestSavingsAccountFacility.linkedAccounts) &&
        Objects.equals(this.linkType, initiateAccountSweepRequestSavingsAccountFacility.linkType) &&
        Objects.equals(this.accountDetails, initiateAccountSweepRequestSavingsAccountFacility.accountDetails) &&
        Objects.equals(this.dateType, initiateAccountSweepRequestSavingsAccountFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, savingsAccountNumber, customerReference, bankBranchOrLocationReference, accountType, accountCurrency, taxReference, entitlementOptionSetting, restrictionOptionSetting, linkedAccounts, linkType, accountDetails, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountSweepRequestSavingsAccountFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    savingsAccountNumber: ").append(toIndentedString(savingsAccountNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    bankBranchOrLocationReference: ").append(toIndentedString(bankBranchOrLocationReference)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    taxReference: ").append(toIndentedString(taxReference)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    linkedAccounts: ").append(toIndentedString(linkedAccounts)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
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

