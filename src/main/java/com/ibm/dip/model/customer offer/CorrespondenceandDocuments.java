package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CorrespondenceandDocuments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class CorrespondenceandDocuments   {
  @JsonProperty("CustomerOfferRequiredDocuments")
  private String customerOfferRequiredDocuments;

  @JsonProperty("CorrespondenceInstanceReference")
  private Object correspondenceInstanceReference;

  @JsonProperty("CorrespondenceContent")
  private String correspondenceContent;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private Object documentDirectoryEntryInstanceReference;

  @JsonProperty("DocumentContent")
  private String documentContent;

  public CorrespondenceandDocuments customerOfferRequiredDocuments(String customerOfferRequiredDocuments) {
    this.customerOfferRequiredDocuments = customerOfferRequiredDocuments;
    return this;
  }

  /**
   * Get customerOfferRequiredDocuments
   * @return customerOfferRequiredDocuments
  */
  @ApiModelProperty(value = "")


  public String getCustomerOfferRequiredDocuments() {
    return customerOfferRequiredDocuments;
  }

  public void setCustomerOfferRequiredDocuments(String customerOfferRequiredDocuments) {
    this.customerOfferRequiredDocuments = customerOfferRequiredDocuments;
  }

  public CorrespondenceandDocuments correspondenceInstanceReference(Object correspondenceInstanceReference) {
    this.correspondenceInstanceReference = correspondenceInstanceReference;
    return this;
  }

  /**
   * Get correspondenceInstanceReference
   * @return correspondenceInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCorrespondenceInstanceReference() {
    return correspondenceInstanceReference;
  }

  public void setCorrespondenceInstanceReference(Object correspondenceInstanceReference) {
    this.correspondenceInstanceReference = correspondenceInstanceReference;
  }

  public CorrespondenceandDocuments correspondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
    return this;
  }

  /**
   * Get correspondenceContent
   * @return correspondenceContent
  */
  @ApiModelProperty(value = "")


  public String getCorrespondenceContent() {
    return correspondenceContent;
  }

  public void setCorrespondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
  }

  public CorrespondenceandDocuments documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
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

  public CorrespondenceandDocuments documentContent(String documentContent) {
    this.documentContent = documentContent;
    return this;
  }

  /**
   * Get documentContent
   * @return documentContent
  */
  @ApiModelProperty(value = "")


  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorrespondenceandDocuments correspondenceandDocuments = (CorrespondenceandDocuments) o;
    return Objects.equals(this.customerOfferRequiredDocuments, correspondenceandDocuments.customerOfferRequiredDocuments) &&
        Objects.equals(this.correspondenceInstanceReference, correspondenceandDocuments.correspondenceInstanceReference) &&
        Objects.equals(this.correspondenceContent, correspondenceandDocuments.correspondenceContent) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, correspondenceandDocuments.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.documentContent, correspondenceandDocuments.documentContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferRequiredDocuments, correspondenceInstanceReference, correspondenceContent, documentDirectoryEntryInstanceReference, documentContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrespondenceandDocuments {\n");
    
    sb.append("    customerOfferRequiredDocuments: ").append(toIndentedString(customerOfferRequiredDocuments)).append("\n");
    sb.append("    correspondenceInstanceReference: ").append(toIndentedString(correspondenceInstanceReference)).append("\n");
    sb.append("    correspondenceContent: ").append(toIndentedString(correspondenceContent)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
    sb.append("    documentContent: ").append(toIndentedString(documentContent)).append("\n");
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

