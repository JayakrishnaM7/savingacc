package com.ibm.dip.model.party lifecycle management;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.party lifecycle management.ExecuteDocumentationRequestDocumentation;
import com.ibm.dip.model.party lifecycle management.ExecuteDocumentationRequestPartyRelationshipProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestDocumentationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:32.808Z[GMT]")

public class RequestDocumentationRequest   {
  @JsonProperty("PartyRelationshipProcedure")
  private ExecuteDocumentationRequestPartyRelationshipProcedure partyRelationshipProcedure;

  @JsonProperty("Documentation")
  private ExecuteDocumentationRequestDocumentation documentation;

  public RequestDocumentationRequest partyRelationshipProcedure(ExecuteDocumentationRequestPartyRelationshipProcedure partyRelationshipProcedure) {
    this.partyRelationshipProcedure = partyRelationshipProcedure;
    return this;
  }

  /**
   * Get partyRelationshipProcedure
   * @return partyRelationshipProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteDocumentationRequestPartyRelationshipProcedure getPartyRelationshipProcedure() {
    return partyRelationshipProcedure;
  }

  public void setPartyRelationshipProcedure(ExecuteDocumentationRequestPartyRelationshipProcedure partyRelationshipProcedure) {
    this.partyRelationshipProcedure = partyRelationshipProcedure;
  }

  public RequestDocumentationRequest documentation(ExecuteDocumentationRequestDocumentation documentation) {
    this.documentation = documentation;
    return this;
  }

  /**
   * Get documentation
   * @return documentation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteDocumentationRequestDocumentation getDocumentation() {
    return documentation;
  }

  public void setDocumentation(ExecuteDocumentationRequestDocumentation documentation) {
    this.documentation = documentation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestDocumentationRequest requestDocumentationRequest = (RequestDocumentationRequest) o;
    return Objects.equals(this.partyRelationshipProcedure, requestDocumentationRequest.partyRelationshipProcedure) &&
        Objects.equals(this.documentation, requestDocumentationRequest.documentation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyRelationshipProcedure, documentation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestDocumentationRequest {\n");
    
    sb.append("    partyRelationshipProcedure: ").append(toIndentedString(partyRelationshipProcedure)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
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

