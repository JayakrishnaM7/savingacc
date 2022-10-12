package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCorrespondenceOperatingSessionRequestCorrespondenceOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:56.799Z[GMT]")

public class InitiateCorrespondenceOperatingSessionRequestCorrespondenceOperatingSession   {
  @JsonProperty("CorrespondenceServiceSessionReportType")
  private String correspondenceServiceSessionReportType;

  public InitiateCorrespondenceOperatingSessionRequestCorrespondenceOperatingSession correspondenceServiceSessionReportType(String correspondenceServiceSessionReportType) {
    this.correspondenceServiceSessionReportType = correspondenceServiceSessionReportType;
    return this;
  }

  /**
   * Get correspondenceServiceSessionReportType
   * @return correspondenceServiceSessionReportType
  */
  @ApiModelProperty(value = "")


  public String getCorrespondenceServiceSessionReportType() {
    return correspondenceServiceSessionReportType;
  }

  public void setCorrespondenceServiceSessionReportType(String correspondenceServiceSessionReportType) {
    this.correspondenceServiceSessionReportType = correspondenceServiceSessionReportType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCorrespondenceOperatingSessionRequestCorrespondenceOperatingSession initiateCorrespondenceOperatingSessionRequestCorrespondenceOperatingSession = (InitiateCorrespondenceOperatingSessionRequestCorrespondenceOperatingSession) o;
    return Objects.equals(this.correspondenceServiceSessionReportType, initiateCorrespondenceOperatingSessionRequestCorrespondenceOperatingSession.correspondenceServiceSessionReportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceServiceSessionReportType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCorrespondenceOperatingSessionRequestCorrespondenceOperatingSession {\n");
    
    sb.append("    correspondenceServiceSessionReportType: ").append(toIndentedString(correspondenceServiceSessionReportType)).append("\n");
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

