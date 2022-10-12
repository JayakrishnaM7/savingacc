package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.correspondence.InitiateBlockMailingRequestBlockMailing;
import com.ibm.dip.model.correspondence.InitiateOutboundRequestCorrespondenceOperatingSession;
import com.ibm.dip.model.correspondence.InitiateOutboundResponseOutbound;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateBlockMailingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:56.799Z[GMT]")

public class InitiateBlockMailingResponse   {
  @JsonProperty("CorrespondenceOperatingSession")
  private InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession;

  @JsonProperty("Outbound")
  private InitiateOutboundResponseOutbound outbound;

  @JsonProperty("BlockMailing")
  private InitiateBlockMailingRequestBlockMailing blockMailing;

  public InitiateBlockMailingResponse correspondenceOperatingSession(InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession) {
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

  public InitiateBlockMailingResponse outbound(InitiateOutboundResponseOutbound outbound) {
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

  public InitiateBlockMailingResponse blockMailing(InitiateBlockMailingRequestBlockMailing blockMailing) {
    this.blockMailing = blockMailing;
    return this;
  }

  /**
   * Get blockMailing
   * @return blockMailing
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateBlockMailingRequestBlockMailing getBlockMailing() {
    return blockMailing;
  }

  public void setBlockMailing(InitiateBlockMailingRequestBlockMailing blockMailing) {
    this.blockMailing = blockMailing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateBlockMailingResponse initiateBlockMailingResponse = (InitiateBlockMailingResponse) o;
    return Objects.equals(this.correspondenceOperatingSession, initiateBlockMailingResponse.correspondenceOperatingSession) &&
        Objects.equals(this.outbound, initiateBlockMailingResponse.outbound) &&
        Objects.equals(this.blockMailing, initiateBlockMailingResponse.blockMailing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceOperatingSession, outbound, blockMailing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateBlockMailingResponse {\n");
    
    sb.append("    correspondenceOperatingSession: ").append(toIndentedString(correspondenceOperatingSession)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
    sb.append("    blockMailing: ").append(toIndentedString(blockMailing)).append("\n");
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

