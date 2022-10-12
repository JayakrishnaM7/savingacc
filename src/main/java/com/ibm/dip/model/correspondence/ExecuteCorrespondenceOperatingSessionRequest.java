package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.correspondence.InitiateCorrespondenceOperatingSessionRequestCorrespondenceOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteCorrespondenceOperatingSessionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:56.799Z[GMT]")

public class ExecuteCorrespondenceOperatingSessionRequest   {
  @JsonProperty("CorrespondenceOperatingSession")
  private InitiateCorrespondenceOperatingSessionRequestCorrespondenceOperatingSession correspondenceOperatingSession;

  public ExecuteCorrespondenceOperatingSessionRequest correspondenceOperatingSession(InitiateCorrespondenceOperatingSessionRequestCorrespondenceOperatingSession correspondenceOperatingSession) {
    this.correspondenceOperatingSession = correspondenceOperatingSession;
    return this;
  }

  /**
   * Get correspondenceOperatingSession
   * @return correspondenceOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCorrespondenceOperatingSessionRequestCorrespondenceOperatingSession getCorrespondenceOperatingSession() {
    return correspondenceOperatingSession;
  }

  public void setCorrespondenceOperatingSession(InitiateCorrespondenceOperatingSessionRequestCorrespondenceOperatingSession correspondenceOperatingSession) {
    this.correspondenceOperatingSession = correspondenceOperatingSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteCorrespondenceOperatingSessionRequest executeCorrespondenceOperatingSessionRequest = (ExecuteCorrespondenceOperatingSessionRequest) o;
    return Objects.equals(this.correspondenceOperatingSession, executeCorrespondenceOperatingSessionRequest.correspondenceOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteCorrespondenceOperatingSessionRequest {\n");
    
    sb.append("    correspondenceOperatingSession: ").append(toIndentedString(correspondenceOperatingSession)).append("\n");
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

