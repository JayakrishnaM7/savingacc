package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CorrespondenceOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:56.799Z[GMT]")

public class CorrespondenceOperatingSession   {
  @JsonProperty("CorrespondenceServiceSessionStatistics")
  private String correspondenceServiceSessionStatistics;

  @JsonProperty("CorrespondenceServiceSessionReportType")
  private String correspondenceServiceSessionReportType;

  @JsonProperty("CorrespondenceServiceSessionReport")
  private String correspondenceServiceSessionReport;

  @JsonProperty("CorrespondenceServiceSessionDate")
  private String correspondenceServiceSessionDate;

  public CorrespondenceOperatingSession correspondenceServiceSessionStatistics(String correspondenceServiceSessionStatistics) {
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

  public CorrespondenceOperatingSession correspondenceServiceSessionReportType(String correspondenceServiceSessionReportType) {
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

  public CorrespondenceOperatingSession correspondenceServiceSessionReport(String correspondenceServiceSessionReport) {
    this.correspondenceServiceSessionReport = correspondenceServiceSessionReport;
    return this;
  }

  /**
   * Get correspondenceServiceSessionReport
   * @return correspondenceServiceSessionReport
  */
  @ApiModelProperty(value = "")


  public String getCorrespondenceServiceSessionReport() {
    return correspondenceServiceSessionReport;
  }

  public void setCorrespondenceServiceSessionReport(String correspondenceServiceSessionReport) {
    this.correspondenceServiceSessionReport = correspondenceServiceSessionReport;
  }

  public CorrespondenceOperatingSession correspondenceServiceSessionDate(String correspondenceServiceSessionDate) {
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
    CorrespondenceOperatingSession correspondenceOperatingSession = (CorrespondenceOperatingSession) o;
    return Objects.equals(this.correspondenceServiceSessionStatistics, correspondenceOperatingSession.correspondenceServiceSessionStatistics) &&
        Objects.equals(this.correspondenceServiceSessionReportType, correspondenceOperatingSession.correspondenceServiceSessionReportType) &&
        Objects.equals(this.correspondenceServiceSessionReport, correspondenceOperatingSession.correspondenceServiceSessionReport) &&
        Objects.equals(this.correspondenceServiceSessionDate, correspondenceOperatingSession.correspondenceServiceSessionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceServiceSessionStatistics, correspondenceServiceSessionReportType, correspondenceServiceSessionReport, correspondenceServiceSessionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrespondenceOperatingSession {\n");
    
    sb.append("    correspondenceServiceSessionStatistics: ").append(toIndentedString(correspondenceServiceSessionStatistics)).append("\n");
    sb.append("    correspondenceServiceSessionReportType: ").append(toIndentedString(correspondenceServiceSessionReportType)).append("\n");
    sb.append("    correspondenceServiceSessionReport: ").append(toIndentedString(correspondenceServiceSessionReport)).append("\n");
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

