package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.correspondence.InitiateBlockMailingRequestBlockMailing;
import com.ibm.dip.model.correspondence.InitiateOutboundRequestCorrespondenceOperatingSession;
import com.ibm.dip.model.correspondence.InitiateOutboundWithResponseRequestOutbound;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateBlockMailingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:56.799Z[GMT]")

public class UpdateBlockMailingResponse   {
  @JsonProperty("CorrespondenceOperatingSession")
  private InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession;

  @JsonProperty("Outbound")
  private InitiateOutboundWithResponseRequestOutbound outbound;

  @JsonProperty("BlockMailing")
  private InitiateBlockMailingRequestBlockMailing blockMailing;

  public UpdateBlockMailingResponse correspondenceOperatingSession(InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession) {
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

  public UpdateBlockMailingResponse outbound(InitiateOutboundWithResponseRequestOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

  /**
   * Get outbound
   * @return outbound
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundWithResponseRequestOutbound getOutbound() {
    return outbound;
  }

  public void setOutbound(InitiateOutboundWithResponseRequestOutbound outbound) {
    this.outbound = outbound;
  }

  public UpdateBlockMailingResponse blockMailing(InitiateBlockMailingRequestBlockMailing blockMailing) {
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
    UpdateBlockMailingResponse updateBlockMailingResponse = (UpdateBlockMailingResponse) o;
    return Objects.equals(this.correspondenceOperatingSession, updateBlockMailingResponse.correspondenceOperatingSession) &&
        Objects.equals(this.outbound, updateBlockMailingResponse.outbound) &&
        Objects.equals(this.blockMailing, updateBlockMailingResponse.blockMailing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceOperatingSession, outbound, blockMailing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBlockMailingResponse {\n");
    
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

