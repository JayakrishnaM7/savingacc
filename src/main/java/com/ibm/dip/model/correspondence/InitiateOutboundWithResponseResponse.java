package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.correspondence.InitiateOutboundRequestCorrespondenceOperatingSession;
import com.ibm.dip.model.correspondence.InitiateOutboundResponseOutbound;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateOutboundWithResponseResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:56.799Z[GMT]")

public class InitiateOutboundWithResponseResponse   {
  @JsonProperty("CorrespondenceOperatingSession")
  private InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession;

  @JsonProperty("Outbound")
  private InitiateOutboundResponseOutbound outbound;

  public InitiateOutboundWithResponseResponse correspondenceOperatingSession(InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession) {
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

  public InitiateOutboundWithResponseResponse outbound(InitiateOutboundResponseOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

  /**
   * Get outbound
   * @return outbound
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundResponseOutbound getOutbound() {
    return outbound;
  }

  public void setOutbound(InitiateOutboundResponseOutbound outbound) {
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
    InitiateOutboundWithResponseResponse initiateOutboundWithResponseResponse = (InitiateOutboundWithResponseResponse) o;
    return Objects.equals(this.correspondenceOperatingSession, initiateOutboundWithResponseResponse.correspondenceOperatingSession) &&
        Objects.equals(this.outbound, initiateOutboundWithResponseResponse.outbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceOperatingSession, outbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateOutboundWithResponseResponse {\n");
    
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

