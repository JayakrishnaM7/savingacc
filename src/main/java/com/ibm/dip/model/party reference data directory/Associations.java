package com.ibm.dip.model.party reference data directory;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Associations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:30.500Z[GMT]")

public class Associations   {
  @JsonProperty("EmployeeReference")
  private Object employeeReference;

  @JsonProperty("AssociateReference")
  private Object associateReference;

  @JsonProperty("AssociateType")
  private String associateType;

  @JsonProperty("AssociateObligation/DependencyDescription")
  private String associateObligationDependencyDescription;

  @JsonProperty("AssociationValidFrom/ToDate")
  private String associationValidFromToDate;

  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("PreferredBeneficiary")
  private Object preferredBeneficiary;

  @JsonProperty("Proxy/Representative/PowerofAttorneyReference")
  private Object proxyRepresentativePowerofAttorneyReference;

  public Associations employeeReference(Object employeeReference) {
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

  public Associations associateReference(Object associateReference) {
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

  public Associations associateType(String associateType) {
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

  public Associations associateObligationDependencyDescription(String associateObligationDependencyDescription) {
    this.associateObligationDependencyDescription = associateObligationDependencyDescription;
    return this;
  }

  /**
   * Get associateObligationDependencyDescription
   * @return associateObligationDependencyDescription
  */
  @ApiModelProperty(value = "")


  public String getAssociateObligationDependencyDescription() {
    return associateObligationDependencyDescription;
  }

  public void setAssociateObligationDependencyDescription(String associateObligationDependencyDescription) {
    this.associateObligationDependencyDescription = associateObligationDependencyDescription;
  }

  public Associations associationValidFromToDate(String associationValidFromToDate) {
    this.associationValidFromToDate = associationValidFromToDate;
    return this;
  }

  /**
   * Get associationValidFromToDate
   * @return associationValidFromToDate
  */
  @ApiModelProperty(value = "")


  public String getAssociationValidFromToDate() {
    return associationValidFromToDate;
  }

  public void setAssociationValidFromToDate(String associationValidFromToDate) {
    this.associationValidFromToDate = associationValidFromToDate;
  }

  public Associations productInstanceReference(Object productInstanceReference) {
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

  public Associations preferredBeneficiary(Object preferredBeneficiary) {
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

  public Associations proxyRepresentativePowerofAttorneyReference(Object proxyRepresentativePowerofAttorneyReference) {
    this.proxyRepresentativePowerofAttorneyReference = proxyRepresentativePowerofAttorneyReference;
    return this;
  }

  /**
   * Get proxyRepresentativePowerofAttorneyReference
   * @return proxyRepresentativePowerofAttorneyReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProxyRepresentativePowerofAttorneyReference() {
    return proxyRepresentativePowerofAttorneyReference;
  }

  public void setProxyRepresentativePowerofAttorneyReference(Object proxyRepresentativePowerofAttorneyReference) {
    this.proxyRepresentativePowerofAttorneyReference = proxyRepresentativePowerofAttorneyReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Associations associations = (Associations) o;
    return Objects.equals(this.employeeReference, associations.employeeReference) &&
        Objects.equals(this.associateReference, associations.associateReference) &&
        Objects.equals(this.associateType, associations.associateType) &&
        Objects.equals(this.associateObligationDependencyDescription, associations.associateObligationDependencyDescription) &&
        Objects.equals(this.associationValidFromToDate, associations.associationValidFromToDate) &&
        Objects.equals(this.productInstanceReference, associations.productInstanceReference) &&
        Objects.equals(this.preferredBeneficiary, associations.preferredBeneficiary) &&
        Objects.equals(this.proxyRepresentativePowerofAttorneyReference, associations.proxyRepresentativePowerofAttorneyReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeReference, associateReference, associateType, associateObligationDependencyDescription, associationValidFromToDate, productInstanceReference, preferredBeneficiary, proxyRepresentativePowerofAttorneyReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Associations {\n");
    
    sb.append("    employeeReference: ").append(toIndentedString(employeeReference)).append("\n");
    sb.append("    associateReference: ").append(toIndentedString(associateReference)).append("\n");
    sb.append("    associateType: ").append(toIndentedString(associateType)).append("\n");
    sb.append("    associateObligationDependencyDescription: ").append(toIndentedString(associateObligationDependencyDescription)).append("\n");
    sb.append("    associationValidFromToDate: ").append(toIndentedString(associationValidFromToDate)).append("\n");
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    preferredBeneficiary: ").append(toIndentedString(preferredBeneficiary)).append("\n");
    sb.append("    proxyRepresentativePowerofAttorneyReference: ").append(toIndentedString(proxyRepresentativePowerofAttorneyReference)).append("\n");
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

