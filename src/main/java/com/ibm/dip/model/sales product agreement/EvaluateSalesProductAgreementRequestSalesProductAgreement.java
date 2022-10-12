package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateSalesProductAgreementRequestSalesProductAgreement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class EvaluateSalesProductAgreementRequestSalesProductAgreement   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("LegalEntityReference")
  private Object legalEntityReference;

  @JsonProperty("ProductandServiceType")
  private String productandServiceType;

  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("AgreementType")
  private String agreementType;

  @JsonProperty("AgreementValidFromOrToDate")
  private String agreementValidFromOrToDate;

  @JsonProperty("AgreementSignatoriesOrResponsibleParties")
  private String agreementSignatoriesOrResponsibleParties;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private Object documentDirectoryEntryInstanceReference;

  @JsonProperty("CustomerAgreementReference")
  private Object customerAgreementReference;

  @JsonProperty("PartyLife-cycleManagementReference")
  private Object partyLifeCycleManagementReference;

  public EvaluateSalesProductAgreementRequestSalesProductAgreement customerReference(Object customerReference) {
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

  public EvaluateSalesProductAgreementRequestSalesProductAgreement legalEntityReference(Object legalEntityReference) {
    this.legalEntityReference = legalEntityReference;
    return this;
  }

  /**
   * Get legalEntityReference
   * @return legalEntityReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getLegalEntityReference() {
    return legalEntityReference;
  }

  public void setLegalEntityReference(Object legalEntityReference) {
    this.legalEntityReference = legalEntityReference;
  }

  public EvaluateSalesProductAgreementRequestSalesProductAgreement productandServiceType(String productandServiceType) {
    this.productandServiceType = productandServiceType;
    return this;
  }

  /**
   * Get productandServiceType
   * @return productandServiceType
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceType() {
    return productandServiceType;
  }

  public void setProductandServiceType(String productandServiceType) {
    this.productandServiceType = productandServiceType;
  }

  public EvaluateSalesProductAgreementRequestSalesProductAgreement productInstanceReference(Object productInstanceReference) {
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

  public EvaluateSalesProductAgreementRequestSalesProductAgreement agreementType(String agreementType) {
    this.agreementType = agreementType;
    return this;
  }

  /**
   * Get agreementType
   * @return agreementType
  */
  @ApiModelProperty(value = "")


  public String getAgreementType() {
    return agreementType;
  }

  public void setAgreementType(String agreementType) {
    this.agreementType = agreementType;
  }

  public EvaluateSalesProductAgreementRequestSalesProductAgreement agreementValidFromOrToDate(String agreementValidFromOrToDate) {
    this.agreementValidFromOrToDate = agreementValidFromOrToDate;
    return this;
  }

  /**
   * Get agreementValidFromOrToDate
   * @return agreementValidFromOrToDate
  */
  @ApiModelProperty(value = "")


  public String getAgreementValidFromOrToDate() {
    return agreementValidFromOrToDate;
  }

  public void setAgreementValidFromOrToDate(String agreementValidFromOrToDate) {
    this.agreementValidFromOrToDate = agreementValidFromOrToDate;
  }

  public EvaluateSalesProductAgreementRequestSalesProductAgreement agreementSignatoriesOrResponsibleParties(String agreementSignatoriesOrResponsibleParties) {
    this.agreementSignatoriesOrResponsibleParties = agreementSignatoriesOrResponsibleParties;
    return this;
  }

  /**
   * Get agreementSignatoriesOrResponsibleParties
   * @return agreementSignatoriesOrResponsibleParties
  */
  @ApiModelProperty(value = "")


  public String getAgreementSignatoriesOrResponsibleParties() {
    return agreementSignatoriesOrResponsibleParties;
  }

  public void setAgreementSignatoriesOrResponsibleParties(String agreementSignatoriesOrResponsibleParties) {
    this.agreementSignatoriesOrResponsibleParties = agreementSignatoriesOrResponsibleParties;
  }

  public EvaluateSalesProductAgreementRequestSalesProductAgreement documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
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

  public EvaluateSalesProductAgreementRequestSalesProductAgreement customerAgreementReference(Object customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
    return this;
  }

  /**
   * Get customerAgreementReference
   * @return customerAgreementReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerAgreementReference() {
    return customerAgreementReference;
  }

  public void setCustomerAgreementReference(Object customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
  }

  public EvaluateSalesProductAgreementRequestSalesProductAgreement partyLifeCycleManagementReference(Object partyLifeCycleManagementReference) {
    this.partyLifeCycleManagementReference = partyLifeCycleManagementReference;
    return this;
  }

  /**
   * Get partyLifeCycleManagementReference
   * @return partyLifeCycleManagementReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPartyLifeCycleManagementReference() {
    return partyLifeCycleManagementReference;
  }

  public void setPartyLifeCycleManagementReference(Object partyLifeCycleManagementReference) {
    this.partyLifeCycleManagementReference = partyLifeCycleManagementReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateSalesProductAgreementRequestSalesProductAgreement evaluateSalesProductAgreementRequestSalesProductAgreement = (EvaluateSalesProductAgreementRequestSalesProductAgreement) o;
    return Objects.equals(this.customerReference, evaluateSalesProductAgreementRequestSalesProductAgreement.customerReference) &&
        Objects.equals(this.legalEntityReference, evaluateSalesProductAgreementRequestSalesProductAgreement.legalEntityReference) &&
        Objects.equals(this.productandServiceType, evaluateSalesProductAgreementRequestSalesProductAgreement.productandServiceType) &&
        Objects.equals(this.productInstanceReference, evaluateSalesProductAgreementRequestSalesProductAgreement.productInstanceReference) &&
        Objects.equals(this.agreementType, evaluateSalesProductAgreementRequestSalesProductAgreement.agreementType) &&
        Objects.equals(this.agreementValidFromOrToDate, evaluateSalesProductAgreementRequestSalesProductAgreement.agreementValidFromOrToDate) &&
        Objects.equals(this.agreementSignatoriesOrResponsibleParties, evaluateSalesProductAgreementRequestSalesProductAgreement.agreementSignatoriesOrResponsibleParties) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, evaluateSalesProductAgreementRequestSalesProductAgreement.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.customerAgreementReference, evaluateSalesProductAgreementRequestSalesProductAgreement.customerAgreementReference) &&
        Objects.equals(this.partyLifeCycleManagementReference, evaluateSalesProductAgreementRequestSalesProductAgreement.partyLifeCycleManagementReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, legalEntityReference, productandServiceType, productInstanceReference, agreementType, agreementValidFromOrToDate, agreementSignatoriesOrResponsibleParties, documentDirectoryEntryInstanceReference, customerAgreementReference, partyLifeCycleManagementReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateSalesProductAgreementRequestSalesProductAgreement {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    legalEntityReference: ").append(toIndentedString(legalEntityReference)).append("\n");
    sb.append("    productandServiceType: ").append(toIndentedString(productandServiceType)).append("\n");
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    agreementType: ").append(toIndentedString(agreementType)).append("\n");
    sb.append("    agreementValidFromOrToDate: ").append(toIndentedString(agreementValidFromOrToDate)).append("\n");
    sb.append("    agreementSignatoriesOrResponsibleParties: ").append(toIndentedString(agreementSignatoriesOrResponsibleParties)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
    sb.append("    customerAgreementReference: ").append(toIndentedString(customerAgreementReference)).append("\n");
    sb.append("    partyLifeCycleManagementReference: ").append(toIndentedString(partyLifeCycleManagementReference)).append("\n");
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

