package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateOutboundRequestCorrespondenceOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:56.799Z[GMT]")

public class InitiateOutboundRequestCorrespondenceOperatingSession   {
  @JsonProperty("CorrespondenceServiceSessionStatistics")
  private String correspondenceServiceSessionStatistics;

  public InitiateOutboundRequestCorrespondenceOperatingSession correspondenceServiceSessionStatistics(String correspondenceServiceSessionStatistics) {
    this.correspondenceServiceSessionStatistics = correspondenceServiceSessionStatistics;
    return this;
  }

  /**
   * Get correspondenceServiceSessionStatistics
   * @return correspondenceServiceSessionStatistics
  */
  @ApiModelProperty(value = "")


  public String getCorrespondenceServiceSessionStatistics() {
    return correspondenceServiceSessionStatistics;
  }

  public void setCorrespondenceServiceSessionStatistics(String correspondenceServiceSessionStatistics) {
    this.correspondenceServiceSessionStatistics = correspondenceServiceSessionStatistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateOutboundRequestCorrespondenceOperatingSession initiateOutboundRequestCorrespondenceOperatingSession = (InitiateOutboundRequestCorrespondenceOperatingSession) o;
    return Objects.equals(this.correspondenceServiceSessionStatistics, initiateOutboundRequestCorrespondenceOperatingSession.correspondenceServiceSessionStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceServiceSessionStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateOutboundRequestCorrespondenceOperatingSession {\n");
    
    sb.append("    correspondenceServiceSessionStatistics: ").append(toIndentedString(correspondenceServiceSessionStatistics)).append("\n");
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

