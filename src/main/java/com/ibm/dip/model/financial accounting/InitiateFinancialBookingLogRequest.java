package com.ibm.dip.model.financial accounting;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.financial accounting.InitiateFinancialBookingLogRequestFinancialBookingLog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateFinancialBookingLogRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:42:00.295Z[GMT]")

public class InitiateFinancialBookingLogRequest   {
  @JsonProperty("FinancialBookingLog")
  private InitiateFinancialBookingLogRequestFinancialBookingLog financialBookingLog;

  public InitiateFinancialBookingLogRequest financialBookingLog(InitiateFinancialBookingLogRequestFinancialBookingLog financialBookingLog) {
    this.financialBookingLog = financialBookingLog;
    return this;
  }

  /**
   * Get financialBookingLog
   * @return financialBookingLog
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateFinancialBookingLogRequestFinancialBookingLog getFinancialBookingLog() {
    return financialBookingLog;
  }

  public void setFinancialBookingLog(InitiateFinancialBookingLogRequestFinancialBookingLog financialBookingLog) {
    this.financialBookingLog = financialBookingLog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateFinancialBookingLogRequest initiateFinancialBookingLogRequest = (InitiateFinancialBookingLogRequest) o;
    return Objects.equals(this.financialBookingLog, initiateFinancialBookingLogRequest.financialBookingLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialBookingLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateFinancialBookingLogRequest {\n");
    
    sb.append("    financialBookingLog: ").append(toIndentedString(financialBookingLog)).append("\n");
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

