package com.ibm.dip.model.party lifecycle management;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteDocumentationRequestDocumentation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:32.808Z[GMT]")

public class ExecuteDocumentationRequestDocumentation   {
  @JsonProperty("PartyLife-cycleRequiredDocumentation")
  private String partyLifeCycleRequiredDocumentation;

  @JsonProperty("PartyLife-cycleDocumentSchedule")
  private String partyLifeCycleDocumentSchedule;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private Object documentDirectoryEntryInstanceReference;

  public ExecuteDocumentationRequestDocumentation partyLifeCycleRequiredDocumentation(String partyLifeCycleRequiredDocumentation) {
    this.partyLifeCycleRequiredDocumentation = partyLifeCycleRequiredDocumentation;
    return this;
  }

  /**
   * Get partyLifeCycleRequiredDocumentation
   * @return partyLifeCycleRequiredDocumentation
  */
  @ApiModelProperty(value = "")


  public String getPartyLifeCycleRequiredDocumentation() {
    return partyLifeCycleRequiredDocumentation;
  }

  public void setPartyLifeCycleRequiredDocumentation(String partyLifeCycleRequiredDocumentation) {
    this.partyLifeCycleRequiredDocumentation = partyLifeCycleRequiredDocumentation;
  }

  public ExecuteDocumentationRequestDocumentation partyLifeCycleDocumentSchedule(String partyLifeCycleDocumentSchedule) {
    this.partyLifeCycleDocumentSchedule = partyLifeCycleDocumentSchedule;
    return this;
  }

  /**
   * Get partyLifeCycleDocumentSchedule
   * @return partyLifeCycleDocumentSchedule
  */
  @ApiModelProperty(value = "")


  public String getPartyLifeCycleDocumentSchedule() {
    return partyLifeCycleDocumentSchedule;
  }

  public void setPartyLifeCycleDocumentSchedule(String partyLifeCycleDocumentSchedule) {
    this.partyLifeCycleDocumentSchedule = partyLifeCycleDocumentSchedule;
  }

  public ExecuteDocumentationRequestDocumentation documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
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
    ExecuteDocumentationRequestDocumentation executeDocumentationRequestDocumentation = (ExecuteDocumentationRequestDocumentation) o;
    return Objects.equals(this.partyLifeCycleRequiredDocumentation, executeDocumentationRequestDocumentation.partyLifeCycleRequiredDocumentation) &&
        Objects.equals(this.partyLifeCycleDocumentSchedule, executeDocumentationRequestDocumentation.partyLifeCycleDocumentSchedule) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, executeDocumentationRequestDocumentation.documentDirectoryEntryInstanceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyLifeCycleRequiredDocumentation, partyLifeCycleDocumentSchedule, documentDirectoryEntryInstanceReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteDocumentationRequestDocumentation {\n");
    
    sb.append("    partyLifeCycleRequiredDocumentation: ").append(toIndentedString(partyLifeCycleRequiredDocumentation)).append("\n");
    sb.append("    partyLifeCycleDocumentSchedule: ").append(toIndentedString(partyLifeCycleDocumentSchedule)).append("\n");
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

