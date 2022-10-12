package com.ibm.dip.model.party lifecycle management;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.party lifecycle management.InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestPartyRelationshipProcedureResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:32.808Z[GMT]")

public class RequestPartyRelationshipProcedureResponse   {
  @JsonProperty("PartyRelationshipProcedure")
  private InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure partyRelationshipProcedure;

  public RequestPartyRelationshipProcedureResponse partyRelationshipProcedure(InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure partyRelationshipProcedure) {
    this.partyRelationshipProcedure = partyRelationshipProcedure;
    return this;
  }

  /**
   * Get partyRelationshipProcedure
   * @return partyRelationshipProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure getPartyRelationshipProcedure() {
    return partyRelationshipProcedure;
  }

  public void setPartyRelationshipProcedure(InitiatePartyRelationshipProcedureResponsePartyRelationshipProcedure partyRelationshipProcedure) {
    this.partyRelationshipProcedure = partyRelationshipProcedure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPartyRelationshipProcedureResponse requestPartyRelationshipProcedureResponse = (RequestPartyRelationshipProcedureResponse) o;
    return Objects.equals(this.partyRelationshipProcedure, requestPartyRelationshipProcedureResponse.partyRelationshipProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyRelationshipProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPartyRelationshipProcedureResponse {\n");
    
    sb.append("    partyRelationshipProcedure: ").append(toIndentedString(partyRelationshipProcedure)).append("\n");
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

