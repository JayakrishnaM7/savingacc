package com.ibm.dip.model.financial accounting;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateFinancialBookingLogResponseFinancialBookingLog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:42:00.295Z[GMT]")

public class InitiateFinancialBookingLogResponseFinancialBookingLog   {
  @JsonProperty("Status")
  private String status;

  public InitiateFinancialBookingLogResponseFinancialBookingLog status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateFinancialBookingLogResponseFinancialBookingLog initiateFinancialBookingLogResponseFinancialBookingLog = (InitiateFinancialBookingLogResponseFinancialBookingLog) o;
    return Objects.equals(this.status, initiateFinancialBookingLogResponseFinancialBookingLog.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateFinancialBookingLogResponseFinancialBookingLog {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

