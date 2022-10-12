package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:56.799Z[GMT]")

public class InitiateCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession   {
  @JsonProperty("CorrespondenceServiceSessionStatistics")
  private String correspondenceServiceSessionStatistics;

  @JsonProperty("CorrespondenceServiceSessionReportType")
  private String correspondenceServiceSessionReportType;

  @JsonProperty("CorrespondenceServiceSessionDate")
  private String correspondenceServiceSessionDate;

  public InitiateCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession correspondenceServiceSessionStatistics(String correspondenceServiceSessionStatistics) {
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

  public InitiateCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession correspondenceServiceSessionReportType(String correspondenceServiceSessionReportType) {
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

  public InitiateCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession correspondenceServiceSessionDate(String correspondenceServiceSessionDate) {
    this.correspondenceServiceSessionDate = correspondenceServiceSessionDate;
    return this;
  }

  /**
   * Get correspondenceServiceSessionDate
   * @return correspondenceServiceSessionDate
  */
  @ApiModelProperty(value = "")


  public String getCorrespondenceServiceSessionDate() {
    return correspondenceServiceSessionDate;
  }

  public void setCorrespondenceServiceSessionDate(String correspondenceServiceSessionDate) {
    this.correspondenceServiceSessionDate = correspondenceServiceSessionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession initiateCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession = (InitiateCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession) o;
    return Objects.equals(this.correspondenceServiceSessionStatistics, initiateCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession.correspondenceServiceSessionStatistics) &&
        Objects.equals(this.correspondenceServiceSessionReportType, initiateCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession.correspondenceServiceSessionReportType) &&
        Objects.equals(this.correspondenceServiceSessionDate, initiateCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession.correspondenceServiceSessionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceServiceSessionStatistics, correspondenceServiceSessionReportType, correspondenceServiceSessionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession {\n");
    
    sb.append("    correspondenceServiceSessionStatistics: ").append(toIndentedString(correspondenceServiceSessionStatistics)).append("\n");
    sb.append("    correspondenceServiceSessionReportType: ").append(toIndentedString(correspondenceServiceSessionReportType)).append("\n");
    sb.append("    correspondenceServiceSessionDate: ").append(toIndentedString(correspondenceServiceSessionDate)).append("\n");
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

