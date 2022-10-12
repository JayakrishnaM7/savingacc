package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Reference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class Reference   {
  @JsonProperty("PartyLegalEntityReference")
  private Object partyLegalEntityReference;

  @JsonProperty("PartyName/Salutation")
  private String partyNameSalutation;

  @JsonProperty("GovernmentIssuedIdentityReference")
  private Object governmentIssuedIdentityReference;

  @JsonProperty("GovernmentIssuedDocumentDetails")
  private String governmentIssuedDocumentDetails;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private Object documentDirectoryEntryInstanceReference;

  @JsonProperty("ResidencyStatus")
  private String residencyStatus;

  @JsonProperty("DateofBirth")
  private String dateofBirth;

  @JsonProperty("Nationality")
  private String nationality;

  @JsonProperty("ResidentialAddress")
  private String residentialAddress;

  @JsonProperty("eMailAddress")
  private String eMailAddress;

  @JsonProperty("Cell/PhoneNumber")
  private String cellPhoneNumber;

  @JsonProperty("SocialNetworkContacts")
  private String socialNetworkContacts;

  @JsonProperty("PoliticalExposureType")
  private String politicalExposureType;

  @JsonProperty("PoliticalExposureDescriptionRecord")
  private String politicalExposureDescriptionRecord;

  @JsonProperty("CorporateCustomerReference")
  private Object corporateCustomerReference;

  @JsonProperty("CorporateCustomerLegalEntityReference")
  private Object corporateCustomerLegalEntityReference;

  @JsonProperty("CorporateAddress")
  private String corporateAddress;

  @JsonProperty("CompanyOfficerReference")
  private Object companyOfficerReference;

  @JsonProperty("CompanyOfficerRole")
  private String companyOfficerRole;

  @JsonProperty("CustomerSinceDate")
  private String customerSinceDate;

  public Reference partyLegalEntityReference(Object partyLegalEntityReference) {
    this.partyLegalEntityReference = partyLegalEntityReference;
    return this;
  }

  /**
   * Get partyLegalEntityReference
   * @return partyLegalEntityReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPartyLegalEntityReference() {
    return partyLegalEntityReference;
  }

  public void setPartyLegalEntityReference(Object partyLegalEntityReference) {
    this.partyLegalEntityReference = partyLegalEntityReference;
  }

  public Reference partyNameSalutation(String partyNameSalutation) {
    this.partyNameSalutation = partyNameSalutation;
    return this;
  }

  /**
   * Get partyNameSalutation
   * @return partyNameSalutation
  */
  @ApiModelProperty(value = "")


  public String getPartyNameSalutation() {
    return partyNameSalutation;
  }

  public void setPartyNameSalutation(String partyNameSalutation) {
    this.partyNameSalutation = partyNameSalutation;
  }

  public Reference governmentIssuedIdentityReference(Object governmentIssuedIdentityReference) {
    this.governmentIssuedIdentityReference = governmentIssuedIdentityReference;
    return this;
  }

  /**
   * Get governmentIssuedIdentityReference
   * @return governmentIssuedIdentityReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getGovernmentIssuedIdentityReference() {
    return governmentIssuedIdentityReference;
  }

  public void setGovernmentIssuedIdentityReference(Object governmentIssuedIdentityReference) {
    this.governmentIssuedIdentityReference = governmentIssuedIdentityReference;
  }

  public Reference governmentIssuedDocumentDetails(String governmentIssuedDocumentDetails) {
    this.governmentIssuedDocumentDetails = governmentIssuedDocumentDetails;
    return this;
  }

  /**
   * Get governmentIssuedDocumentDetails
   * @return governmentIssuedDocumentDetails
  */
  @ApiModelProperty(value = "")


  public String getGovernmentIssuedDocumentDetails() {
    return governmentIssuedDocumentDetails;
  }

  public void setGovernmentIssuedDocumentDetails(String governmentIssuedDocumentDetails) {
    this.governmentIssuedDocumentDetails = governmentIssuedDocumentDetails;
  }

  public Reference documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    return this;
  }

  /**
   * Get documentDirectoryEntryInstanceReference
   * @return documentDirectoryEntryInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }

  public Reference residencyStatus(String residencyStatus) {
    this.residencyStatus = residencyStatus;
    return this;
  }

  /**
   * Get residencyStatus
   * @return residencyStatus
  */
  @ApiModelProperty(value = "")


  public String getResidencyStatus() {
    return residencyStatus;
  }

  public void setResidencyStatus(String residencyStatus) {
    this.residencyStatus = residencyStatus;
  }

  public Reference dateofBirth(String dateofBirth) {
    this.dateofBirth = dateofBirth;
    return this;
  }

  /**
   * Get dateofBirth
   * @return dateofBirth
  */
  @ApiModelProperty(value = "")


  public String getDateofBirth() {
    return dateofBirth;
  }

  public void setDateofBirth(String dateofBirth) {
    this.dateofBirth = dateofBirth;
  }

  public Reference nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
  */
  @ApiModelProperty(value = "")


  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public Reference residentialAddress(String residentialAddress) {
    this.residentialAddress = residentialAddress;
    return this;
  }

  /**
   * Get residentialAddress
   * @return residentialAddress
  */
  @ApiModelProperty(value = "")


  public String getResidentialAddress() {
    return residentialAddress;
  }

  public void setResidentialAddress(String residentialAddress) {
    this.residentialAddress = residentialAddress;
  }

  public Reference eMailAddress(String eMailAddress) {
    this.eMailAddress = eMailAddress;
    return this;
  }

  /**
   * Get eMailAddress
   * @return eMailAddress
  */
  @ApiModelProperty(value = "")


  public String geteMailAddress() {
    return eMailAddress;
  }

  public void seteMailAddress(String eMailAddress) {
    this.eMailAddress = eMailAddress;
  }

  public Reference cellPhoneNumber(String cellPhoneNumber) {
    this.cellPhoneNumber = cellPhoneNumber;
    return this;
  }

  /**
   * Get cellPhoneNumber
   * @return cellPhoneNumber
  */
  @ApiModelProperty(value = "")


  public String getCellPhoneNumber() {
    return cellPhoneNumber;
  }

  public void setCellPhoneNumber(String cellPhoneNumber) {
    this.cellPhoneNumber = cellPhoneNumber;
  }

  public Reference socialNetworkContacts(String socialNetworkContacts) {
    this.socialNetworkContacts = socialNetworkContacts;
    return this;
  }

  /**
   * Get socialNetworkContacts
   * @return socialNetworkContacts
  */
  @ApiModelProperty(value = "")


  public String getSocialNetworkContacts() {
    return socialNetworkContacts;
  }

  public void setSocialNetworkContacts(String socialNetworkContacts) {
    this.socialNetworkContacts = socialNetworkContacts;
  }

  public Reference politicalExposureType(String politicalExposureType) {
    this.politicalExposureType = politicalExposureType;
    return this;
  }

  /**
   * Get politicalExposureType
   * @return politicalExposureType
  */
  @ApiModelProperty(value = "")


  public String getPoliticalExposureType() {
    return politicalExposureType;
  }

  public void setPoliticalExposureType(String politicalExposureType) {
    this.politicalExposureType = politicalExposureType;
  }

  public Reference politicalExposureDescriptionRecord(String politicalExposureDescriptionRecord) {
    this.politicalExposureDescriptionRecord = politicalExposureDescriptionRecord;
    return this;
  }

  /**
   * Get politicalExposureDescriptionRecord
   * @return politicalExposureDescriptionRecord
  */
  @ApiModelProperty(value = "")


  public String getPoliticalExposureDescriptionRecord() {
    return politicalExposureDescriptionRecord;
  }

  public void setPoliticalExposureDescriptionRecord(String politicalExposureDescriptionRecord) {
    this.politicalExposureDescriptionRecord = politicalExposureDescriptionRecord;
  }

  public Reference corporateCustomerReference(Object corporateCustomerReference) {
    this.corporateCustomerReference = corporateCustomerReference;
    return this;
  }

  /**
   * Get corporateCustomerReference
   * @return corporateCustomerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCorporateCustomerReference() {
    return corporateCustomerReference;
  }

  public void setCorporateCustomerReference(Object corporateCustomerReference) {
    this.corporateCustomerReference = corporateCustomerReference;
  }

  public Reference corporateCustomerLegalEntityReference(Object corporateCustomerLegalEntityReference) {
    this.corporateCustomerLegalEntityReference = corporateCustomerLegalEntityReference;
    return this;
  }

  /**
   * Get corporateCustomerLegalEntityReference
   * @return corporateCustomerLegalEntityReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCorporateCustomerLegalEntityReference() {
    return corporateCustomerLegalEntityReference;
  }

  public void setCorporateCustomerLegalEntityReference(Object corporateCustomerLegalEntityReference) {
    this.corporateCustomerLegalEntityReference = corporateCustomerLegalEntityReference;
  }

  public Reference corporateAddress(String corporateAddress) {
    this.corporateAddress = corporateAddress;
    return this;
  }

  /**
   * Get corporateAddress
   * @return corporateAddress
  */
  @ApiModelProperty(value = "")


  public String getCorporateAddress() {
    return corporateAddress;
  }

  public void setCorporateAddress(String corporateAddress) {
    this.corporateAddress = corporateAddress;
  }

  public Reference companyOfficerReference(Object companyOfficerReference) {
    this.companyOfficerReference = companyOfficerReference;
    return this;
  }

  /**
   * Get companyOfficerReference
   * @return companyOfficerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCompanyOfficerReference() {
    return companyOfficerReference;
  }

  public void setCompanyOfficerReference(Object companyOfficerReference) {
    this.companyOfficerReference = companyOfficerReference;
  }

  public Reference companyOfficerRole(String companyOfficerRole) {
    this.companyOfficerRole = companyOfficerRole;
    return this;
  }

  /**
   * Get companyOfficerRole
   * @return companyOfficerRole
  */
  @ApiModelProperty(value = "")


  public String getCompanyOfficerRole() {
    return companyOfficerRole;
  }

  public void setCompanyOfficerRole(String companyOfficerRole) {
    this.companyOfficerRole = companyOfficerRole;
  }

  public Reference customerSinceDate(String customerSinceDate) {
    this.customerSinceDate = customerSinceDate;
    return this;
  }

  /**
   * Get customerSinceDate
   * @return customerSinceDate
  */
  @ApiModelProperty(value = "")


  public String getCustomerSinceDate() {
    return customerSinceDate;
  }

  public void setCustomerSinceDate(String customerSinceDate) {
    this.customerSinceDate = customerSinceDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.partyLegalEntityReference, reference.partyLegalEntityReference) &&
        Objects.equals(this.partyNameSalutation, reference.partyNameSalutation) &&
        Objects.equals(this.governmentIssuedIdentityReference, reference.governmentIssuedIdentityReference) &&
        Objects.equals(this.governmentIssuedDocumentDetails, reference.governmentIssuedDocumentDetails) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, reference.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.residencyStatus, reference.residencyStatus) &&
        Objects.equals(this.dateofBirth, reference.dateofBirth) &&
        Objects.equals(this.nationality, reference.nationality) &&
        Objects.equals(this.residentialAddress, reference.residentialAddress) &&
        Objects.equals(this.eMailAddress, reference.eMailAddress) &&
        Objects.equals(this.cellPhoneNumber, reference.cellPhoneNumber) &&
        Objects.equals(this.socialNetworkContacts, reference.socialNetworkContacts) &&
        Objects.equals(this.politicalExposureType, reference.politicalExposureType) &&
        Objects.equals(this.politicalExposureDescriptionRecord, reference.politicalExposureDescriptionRecord) &&
        Objects.equals(this.corporateCustomerReference, reference.corporateCustomerReference) &&
        Objects.equals(this.corporateCustomerLegalEntityReference, reference.corporateCustomerLegalEntityReference) &&
        Objects.equals(this.corporateAddress, reference.corporateAddress) &&
        Objects.equals(this.companyOfficerReference, reference.companyOfficerReference) &&
        Objects.equals(this.companyOfficerRole, reference.companyOfficerRole) &&
        Objects.equals(this.customerSinceDate, reference.customerSinceDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyLegalEntityReference, partyNameSalutation, governmentIssuedIdentityReference, governmentIssuedDocumentDetails, documentDirectoryEntryInstanceReference, residencyStatus, dateofBirth, nationality, residentialAddress, eMailAddress, cellPhoneNumber, socialNetworkContacts, politicalExposureType, politicalExposureDescriptionRecord, corporateCustomerReference, corporateCustomerLegalEntityReference, corporateAddress, companyOfficerReference, companyOfficerRole, customerSinceDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    
    sb.append("    partyLegalEntityReference: ").append(toIndentedString(partyLegalEntityReference)).append("\n");
    sb.append("    partyNameSalutation: ").append(toIndentedString(partyNameSalutation)).append("\n");
    sb.append("    governmentIssuedIdentityReference: ").append(toIndentedString(governmentIssuedIdentityReference)).append("\n");
    sb.append("    governmentIssuedDocumentDetails: ").append(toIndentedString(governmentIssuedDocumentDetails)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
    sb.append("    residencyStatus: ").append(toIndentedString(residencyStatus)).append("\n");
    sb.append("    dateofBirth: ").append(toIndentedString(dateofBirth)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    residentialAddress: ").append(toIndentedString(residentialAddress)).append("\n");
    sb.append("    eMailAddress: ").append(toIndentedString(eMailAddress)).append("\n");
    sb.append("    cellPhoneNumber: ").append(toIndentedString(cellPhoneNumber)).append("\n");
    sb.append("    socialNetworkContacts: ").append(toIndentedString(socialNetworkContacts)).append("\n");
    sb.append("    politicalExposureType: ").append(toIndentedString(politicalExposureType)).append("\n");
    sb.append("    politicalExposureDescriptionRecord: ").append(toIndentedString(politicalExposureDescriptionRecord)).append("\n");
    sb.append("    corporateCustomerReference: ").append(toIndentedString(corporateCustomerReference)).append("\n");
    sb.append("    corporateCustomerLegalEntityReference: ").append(toIndentedString(corporateCustomerLegalEntityReference)).append("\n");
    sb.append("    corporateAddress: ").append(toIndentedString(corporateAddress)).append("\n");
    sb.append("    companyOfficerReference: ").append(toIndentedString(companyOfficerReference)).append("\n");
    sb.append("    companyOfficerRole: ").append(toIndentedString(companyOfficerRole)).append("\n");
    sb.append("    customerSinceDate: ").append(toIndentedString(customerSinceDate)).append("\n");
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

