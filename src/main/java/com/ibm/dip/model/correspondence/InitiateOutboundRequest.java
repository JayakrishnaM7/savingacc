package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.correspondence.InitiateOutboundRequestCorrespondenceOperatingSession;
import com.ibm.dip.model.correspondence.RetrieveCorrespondenceOperatingSessionResponseOutbound;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateOutboundRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:56.799Z[GMT]")

public class InitiateOutboundRequest   {
  @JsonProperty("CorrespondenceOperatingSession")
  private InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession;

  @JsonProperty("Outbound")
  private RetrieveCorrespondenceOperatingSessionResponseOutbound outbound;

  public InitiateOutboundRequest correspondenceOperatingSession(InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession) {
    this.correspondenceOperatingSession = correspondenceOperatingSession;
    return this;
  }

  /**
   * Get correspondenceOperatingSession
   * @return correspondenceOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundRequestCorrespondenceOperatingSession getCorrespondenceOperatingSession() {
    return correspondenceOperatingSession;
  }

  public void setCorrespondenceOperatingSession(InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession) {
    this.correspondenceOperatingSession = correspondenceOperatingSession;
  }

  public InitiateOutboundRequest outbound(RetrieveCorrespondenceOperatingSessionResponseOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

  /**
   * Get outbound
   * @return outbound
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveCorrespondenceOperatingSessionResponseOutbound getOutbound() {
    return outbound;
  }

  public void setOutbound(RetrieveCorrespondenceOperatingSessionResponseOutbound outbound) {
    this.outbound = outbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateOutboundRequest initiateOutboundRequest = (InitiateOutboundRequest) o;
    return Objects.equals(this.correspondenceOperatingSession, initiateOutboundRequest.correspondenceOperatingSession) &&
        Objects.equals(this.outbound, initiateOutboundRequest.outbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceOperatingSession, outbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateOutboundRequest {\n");
    
    sb.append("    correspondenceOperatingSession: ").append(toIndentedString(correspondenceOperatingSession)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
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

