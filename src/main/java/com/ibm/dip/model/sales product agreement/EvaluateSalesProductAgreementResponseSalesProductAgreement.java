package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateSalesProductAgreementResponseSalesProductAgreement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class EvaluateSalesProductAgreementResponseSalesProductAgreement   {
  @JsonProperty("AgreementJurisdiction")
  private String agreementJurisdiction;

  @JsonProperty("AgreementValidFromOrToDate")
  private String agreementValidFromOrToDate;

  @JsonProperty("AgreementSignatoriesOrResponsibleParties")
  private String agreementSignatoriesOrResponsibleParties;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private Object documentDirectoryEntryInstanceReference;

  public EvaluateSalesProductAgreementResponseSalesProductAgreement agreementJurisdiction(String agreementJurisdiction) {
    this.agreementJurisdiction = agreementJurisdiction;
    return this;
  }

  /**
   * Get agreementJurisdiction
   * @return agreementJurisdiction
  */
  @ApiModelProperty(value = "")


  public String getAgreementJurisdiction() {
    return agreementJurisdiction;
  }

  public void setAgreementJurisdiction(String agreementJurisdiction) {
    this.agreementJurisdiction = agreementJurisdiction;
  }

  public EvaluateSalesProductAgreementResponseSalesProductAgreement agreementValidFromOrToDate(String agreementValidFromOrToDate) {
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

  public EvaluateSalesProductAgreementResponseSalesProductAgreement agreementSignatoriesOrResponsibleParties(String agreementSignatoriesOrResponsibleParties) {
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

  public EvaluateSalesProductAgreementResponseSalesProductAgreement documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateSalesProductAgreementResponseSalesProductAgreement evaluateSalesProductAgreementResponseSalesProductAgreement = (EvaluateSalesProductAgreementResponseSalesProductAgreement) o;
    return Objects.equals(this.agreementJurisdiction, evaluateSalesProductAgreementResponseSalesProductAgreement.agreementJurisdiction) &&
        Objects.equals(this.agreementValidFromOrToDate, evaluateSalesProductAgreementResponseSalesProductAgreement.agreementValidFromOrToDate) &&
        Objects.equals(this.agreementSignatoriesOrResponsibleParties, evaluateSalesProductAgreementResponseSalesProductAgreement.agreementSignatoriesOrResponsibleParties) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, evaluateSalesProductAgreementResponseSalesProductAgreement.documentDirectoryEntryInstanceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementJurisdiction, agreementValidFromOrToDate, agreementSignatoriesOrResponsibleParties, documentDirectoryEntryInstanceReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateSalesProductAgreementResponseSalesProductAgreement {\n");
    
    sb.append("    agreementJurisdiction: ").append(toIndentedString(agreementJurisdiction)).append("\n");
    sb.append("    agreementValidFromOrToDate: ").append(toIndentedString(agreementValidFromOrToDate)).append("\n");
    sb.append("    agreementSignatoriesOrResponsibleParties: ").append(toIndentedString(agreementSignatoriesOrResponsibleParties)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
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

