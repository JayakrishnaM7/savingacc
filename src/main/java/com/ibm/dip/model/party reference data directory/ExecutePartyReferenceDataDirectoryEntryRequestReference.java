package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecutePartyReferenceDataDirectoryEntryRequestReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class ExecutePartyReferenceDataDirectoryEntryRequestReference   {
  @JsonProperty("PartyLegalEntityReference")
  private Object partyLegalEntityReference;

  @JsonProperty("PartyNameOrSalutation")
  private String partyNameOrSalutation;

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

  @JsonProperty("CellOrPhoneNumber")
  private String cellOrPhoneNumber;

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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference partyLegalEntityReference(Object partyLegalEntityReference) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference partyNameOrSalutation(String partyNameOrSalutation) {
    this.partyNameOrSalutation = partyNameOrSalutation;
    return this;
  }

  /**
   * Get partyNameOrSalutation
   * @return partyNameOrSalutation
  */
  @ApiModelProperty(value = "")


  public String getPartyNameOrSalutation() {
    return partyNameOrSalutation;
  }

  public void setPartyNameOrSalutation(String partyNameOrSalutation) {
    this.partyNameOrSalutation = partyNameOrSalutation;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference governmentIssuedIdentityReference(Object governmentIssuedIdentityReference) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference governmentIssuedDocumentDetails(String governmentIssuedDocumentDetails) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference residencyStatus(String residencyStatus) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference dateofBirth(String dateofBirth) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference nationality(String nationality) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference residentialAddress(String residentialAddress) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference eMailAddress(String eMailAddress) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference cellOrPhoneNumber(String cellOrPhoneNumber) {
    this.cellOrPhoneNumber = cellOrPhoneNumber;
    return this;
  }

  /**
   * Get cellOrPhoneNumber
   * @return cellOrPhoneNumber
  */
  @ApiModelProperty(value = "")


  public String getCellOrPhoneNumber() {
    return cellOrPhoneNumber;
  }

  public void setCellOrPhoneNumber(String cellOrPhoneNumber) {
    this.cellOrPhoneNumber = cellOrPhoneNumber;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference socialNetworkContacts(String socialNetworkContacts) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference politicalExposureType(String politicalExposureType) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference politicalExposureDescriptionRecord(String politicalExposureDescriptionRecord) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference corporateCustomerReference(Object corporateCustomerReference) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference corporateCustomerLegalEntityReference(Object corporateCustomerLegalEntityReference) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference corporateAddress(String corporateAddress) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference companyOfficerReference(Object companyOfficerReference) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference companyOfficerRole(String companyOfficerRole) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference customerSinceDate(String customerSinceDate) {
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
    ExecutePartyReferenceDataDirectoryEntryRequestReference executePartyReferenceDataDirectoryEntryRequestReference = (ExecutePartyReferenceDataDirectoryEntryRequestReference) o;
    return Objects.equals(this.partyLegalEntityReference, executePartyReferenceDataDirectoryEntryRequestReference.partyLegalEntityReference) &&
        Objects.equals(this.partyNameOrSalutation, executePartyReferenceDataDirectoryEntryRequestReference.partyNameOrSalutation) &&
        Objects.equals(this.governmentIssuedIdentityReference, executePartyReferenceDataDirectoryEntryRequestReference.governmentIssuedIdentityReference) &&
        Objects.equals(this.governmentIssuedDocumentDetails, executePartyReferenceDataDirectoryEntryRequestReference.governmentIssuedDocumentDetails) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, executePartyReferenceDataDirectoryEntryRequestReference.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.residencyStatus, executePartyReferenceDataDirectoryEntryRequestReference.residencyStatus) &&
        Objects.equals(this.dateofBirth, executePartyReferenceDataDirectoryEntryRequestReference.dateofBirth) &&
        Objects.equals(this.nationality, executePartyReferenceDataDirectoryEntryRequestReference.nationality) &&
        Objects.equals(this.residentialAddress, executePartyReferenceDataDirectoryEntryRequestReference.residentialAddress) &&
        Objects.equals(this.eMailAddress, executePartyReferenceDataDirectoryEntryRequestReference.eMailAddress) &&
        Objects.equals(this.cellOrPhoneNumber, executePartyReferenceDataDirectoryEntryRequestReference.cellOrPhoneNumber) &&
        Objects.equals(this.socialNetworkContacts, executePartyReferenceDataDirectoryEntryRequestReference.socialNetworkContacts) &&
        Objects.equals(this.politicalExposureType, executePartyReferenceDataDirectoryEntryRequestReference.politicalExposureType) &&
        Objects.equals(this.politicalExposureDescriptionRecord, executePartyReferenceDataDirectoryEntryRequestReference.politicalExposureDescriptionRecord) &&
        Objects.equals(this.corporateCustomerReference, executePartyReferenceDataDirectoryEntryRequestReference.corporateCustomerReference) &&
        Objects.equals(this.corporateCustomerLegalEntityReference, executePartyReferenceDataDirectoryEntryRequestReference.corporateCustomerLegalEntityReference) &&
        Objects.equals(this.corporateAddress, executePartyReferenceDataDirectoryEntryRequestReference.corporateAddress) &&
        Objects.equals(this.companyOfficerReference, executePartyReferenceDataDirectoryEntryRequestReference.companyOfficerReference) &&
        Objects.equals(this.companyOfficerRole, executePartyReferenceDataDirectoryEntryRequestReference.companyOfficerRole) &&
        Objects.equals(this.customerSinceDate, executePartyReferenceDataDirectoryEntryRequestReference.customerSinceDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyLegalEntityReference, partyNameOrSalutation, governmentIssuedIdentityReference, governmentIssuedDocumentDetails, documentDirectoryEntryInstanceReference, residencyStatus, dateofBirth, nationality, residentialAddress, eMailAddress, cellOrPhoneNumber, socialNetworkContacts, politicalExposureType, politicalExposureDescriptionRecord, corporateCustomerReference, corporateCustomerLegalEntityReference, corporateAddress, companyOfficerReference, companyOfficerRole, customerSinceDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutePartyReferenceDataDirectoryEntryRequestReference {\n");
    
    sb.append("    partyLegalEntityReference: ").append(toIndentedString(partyLegalEntityReference)).append("\n");
    sb.append("    partyNameOrSalutation: ").append(toIndentedString(partyNameOrSalutation)).append("\n");
    sb.append("    governmentIssuedIdentityReference: ").append(toIndentedString(governmentIssuedIdentityReference)).append("\n");
    sb.append("    governmentIssuedDocumentDetails: ").append(toIndentedString(governmentIssuedDocumentDetails)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
    sb.append("    residencyStatus: ").append(toIndentedString(residencyStatus)).append("\n");
    sb.append("    dateofBirth: ").append(toIndentedString(dateofBirth)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    residentialAddress: ").append(toIndentedString(residentialAddress)).append("\n");
    sb.append("    eMailAddress: ").append(toIndentedString(eMailAddress)).append("\n");
    sb.append("    cellOrPhoneNumber: ").append(toIndentedString(cellOrPhoneNumber)).append("\n");
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

