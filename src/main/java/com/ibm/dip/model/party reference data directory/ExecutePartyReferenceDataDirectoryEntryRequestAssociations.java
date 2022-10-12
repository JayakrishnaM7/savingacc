package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecutePartyReferenceDataDirectoryEntryRequestAssociations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class ExecutePartyReferenceDataDirectoryEntryRequestAssociations   {
  @JsonProperty("EmployeeReference")
  private Object employeeReference;

  @JsonProperty("AssociateReference")
  private Object associateReference;

  @JsonProperty("AssociateType")
  private String associateType;

  @JsonProperty("AssociateObligationOrDependencyDescription")
  private String associateObligationOrDependencyDescription;

  @JsonProperty("AssociationValidFromOrToDate")
  private String associationValidFromOrToDate;

  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("PreferredBeneficiary")
  private Object preferredBeneficiary;

  @JsonProperty("ProxyOrRepresentativeOrPowerofAttorneyReference")
  private Object proxyOrRepresentativeOrPowerofAttorneyReference;

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations employeeReference(Object employeeReference) {
    this.employeeReference = employeeReference;
    return this;
  }

  /**
   * Get employeeReference
   * @return employeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeeReference() {
    return employeeReference;
  }

  public void setEmployeeReference(Object employeeReference) {
    this.employeeReference = employeeReference;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations associateReference(Object associateReference) {
    this.associateReference = associateReference;
    return this;
  }

  /**
   * Get associateReference
   * @return associateReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getAssociateReference() {
    return associateReference;
  }

  public void setAssociateReference(Object associateReference) {
    this.associateReference = associateReference;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations associateType(String associateType) {
    this.associateType = associateType;
    return this;
  }

  /**
   * Get associateType
   * @return associateType
  */
  @ApiModelProperty(value = "")


  public String getAssociateType() {
    return associateType;
  }

  public void setAssociateType(String associateType) {
    this.associateType = associateType;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations associateObligationOrDependencyDescription(String associateObligationOrDependencyDescription) {
    this.associateObligationOrDependencyDescription = associateObligationOrDependencyDescription;
    return this;
  }

  /**
   * Get associateObligationOrDependencyDescription
   * @return associateObligationOrDependencyDescription
  */
  @ApiModelProperty(value = "")


  public String getAssociateObligationOrDependencyDescription() {
    return associateObligationOrDependencyDescription;
  }

  public void setAssociateObligationOrDependencyDescription(String associateObligationOrDependencyDescription) {
    this.associateObligationOrDependencyDescription = associateObligationOrDependencyDescription;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations associationValidFromOrToDate(String associationValidFromOrToDate) {
    this.associationValidFromOrToDate = associationValidFromOrToDate;
    return this;
  }

  /**
   * Get associationValidFromOrToDate
   * @return associationValidFromOrToDate
  */
  @ApiModelProperty(value = "")


  public String getAssociationValidFromOrToDate() {
    return associationValidFromOrToDate;
  }

  public void setAssociationValidFromOrToDate(String associationValidFromOrToDate) {
    this.associationValidFromOrToDate = associationValidFromOrToDate;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations productInstanceReference(Object productInstanceReference) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations preferredBeneficiary(Object preferredBeneficiary) {
    this.preferredBeneficiary = preferredBeneficiary;
    return this;
  }

  /**
   * Get preferredBeneficiary
   * @return preferredBeneficiary
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPreferredBeneficiary() {
    return preferredBeneficiary;
  }

  public void setPreferredBeneficiary(Object preferredBeneficiary) {
    this.preferredBeneficiary = preferredBeneficiary;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations proxyOrRepresentativeOrPowerofAttorneyReference(Object proxyOrRepresentativeOrPowerofAttorneyReference) {
    this.proxyOrRepresentativeOrPowerofAttorneyReference = proxyOrRepresentativeOrPowerofAttorneyReference;
    return this;
  }

  /**
   * Get proxyOrRepresentativeOrPowerofAttorneyReference
   * @return proxyOrRepresentativeOrPowerofAttorneyReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProxyOrRepresentativeOrPowerofAttorneyReference() {
    return proxyOrRepresentativeOrPowerofAttorneyReference;
  }

  public void setProxyOrRepresentativeOrPowerofAttorneyReference(Object proxyOrRepresentativeOrPowerofAttorneyReference) {
    this.proxyOrRepresentativeOrPowerofAttorneyReference = proxyOrRepresentativeOrPowerofAttorneyReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutePartyReferenceDataDirectoryEntryRequestAssociations executePartyReferenceDataDirectoryEntryRequestAssociations = (ExecutePartyReferenceDataDirectoryEntryRequestAssociations) o;
    return Objects.equals(this.employeeReference, executePartyReferenceDataDirectoryEntryRequestAssociations.employeeReference) &&
        Objects.equals(this.associateReference, executePartyReferenceDataDirectoryEntryRequestAssociations.associateReference) &&
        Objects.equals(this.associateType, executePartyReferenceDataDirectoryEntryRequestAssociations.associateType) &&
        Objects.equals(this.associateObligationOrDependencyDescription, executePartyReferenceDataDirectoryEntryRequestAssociations.associateObligationOrDependencyDescription) &&
        Objects.equals(this.associationValidFromOrToDate, executePartyReferenceDataDirectoryEntryRequestAssociations.associationValidFromOrToDate) &&
        Objects.equals(this.productInstanceReference, executePartyReferenceDataDirectoryEntryRequestAssociations.productInstanceReference) &&
        Objects.equals(this.preferredBeneficiary, executePartyReferenceDataDirectoryEntryRequestAssociations.preferredBeneficiary) &&
        Objects.equals(this.proxyOrRepresentativeOrPowerofAttorneyReference, executePartyReferenceDataDirectoryEntryRequestAssociations.proxyOrRepresentativeOrPowerofAttorneyReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeReference, associateReference, associateType, associateObligationOrDependencyDescription, associationValidFromOrToDate, productInstanceReference, preferredBeneficiary, proxyOrRepresentativeOrPowerofAttorneyReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutePartyReferenceDataDirectoryEntryRequestAssociations {\n");
    
    sb.append("    employeeReference: ").append(toIndentedString(employeeReference)).append("\n");
    sb.append("    associateReference: ").append(toIndentedString(associateReference)).append("\n");
    sb.append("    associateType: ").append(toIndentedString(associateType)).append("\n");
    sb.append("    associateObligationOrDependencyDescription: ").append(toIndentedString(associateObligationOrDependencyDescription)).append("\n");
    sb.append("    associationValidFromOrToDate: ").append(toIndentedString(associationValidFromOrToDate)).append("\n");
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    preferredBeneficiary: ").append(toIndentedString(preferredBeneficiary)).append("\n");
    sb.append("    proxyOrRepresentativeOrPowerofAttorneyReference: ").append(toIndentedString(proxyOrRepresentativeOrPowerofAttorneyReference)).append("\n");
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

