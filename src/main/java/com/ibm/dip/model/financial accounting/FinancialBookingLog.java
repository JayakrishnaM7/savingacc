package com.ibm.dip.model.financial accounting;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FinancialBookingLog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:42:00.295Z[GMT]")

public class FinancialBookingLog   {
  @JsonProperty("FinancialAccountType")
  private String financialAccountType;

  @JsonProperty("ProductandServiceReference")
  private Object productandServiceReference;

  @JsonProperty("BusinessUnitReference")
  private Object businessUnitReference;

  @JsonProperty("ChartofAccountOrBookingRules")
  private String chartofAccountOrBookingRules;

  @JsonProperty("BaseCurrency")
  private String baseCurrency;

  @JsonProperty("Status")
  private String status;

  public FinancialBookingLog financialAccountType(String financialAccountType) {
    this.financialAccountType = financialAccountType;
    return this;
  }

  /**
   * Get financialAccountType
   * @return financialAccountType
  */
  @ApiModelProperty(value = "")


  public String getFinancialAccountType() {
    return financialAccountType;
  }

  public void setFinancialAccountType(String financialAccountType) {
    this.financialAccountType = financialAccountType;
  }

  public FinancialBookingLog productandServiceReference(Object productandServiceReference) {
    this.productandServiceReference = productandServiceReference;
    return this;
  }

  /**
   * Get productandServiceReference
   * @return productandServiceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductandServiceReference() {
    return productandServiceReference;
  }

  public void setProductandServiceReference(Object productandServiceReference) {
    this.productandServiceReference = productandServiceReference;
  }

  public FinancialBookingLog businessUnitReference(Object businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
    return this;
  }

  /**
   * Get businessUnitReference
   * @return businessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(Object businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }

  public FinancialBookingLog chartofAccountOrBookingRules(String chartofAccountOrBookingRules) {
    this.chartofAccountOrBookingRules = chartofAccountOrBookingRules;
    return this;
  }

  /**
   * Get chartofAccountOrBookingRules
   * @return chartofAccountOrBookingRules
  */
  @ApiModelProperty(value = "")


  public String getChartofAccountOrBookingRules() {
    return chartofAccountOrBookingRules;
  }

  public void setChartofAccountOrBookingRules(String chartofAccountOrBookingRules) {
    this.chartofAccountOrBookingRules = chartofAccountOrBookingRules;
  }

  public FinancialBookingLog baseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

  /**
   * Get baseCurrency
   * @return baseCurrency
  */
  @ApiModelProperty(value = "")


  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  public FinancialBookingLog status(String status) {
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
    FinancialBookingLog financialBookingLog = (FinancialBookingLog) o;
    return Objects.equals(this.financialAccountType, financialBookingLog.financialAccountType) &&
        Objects.equals(this.productandServiceReference, financialBookingLog.productandServiceReference) &&
        Objects.equals(this.businessUnitReference, financialBookingLog.businessUnitReference) &&
        Objects.equals(this.chartofAccountOrBookingRules, financialBookingLog.chartofAccountOrBookingRules) &&
        Objects.equals(this.baseCurrency, financialBookingLog.baseCurrency) &&
        Objects.equals(this.status, financialBookingLog.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialAccountType, productandServiceReference, businessUnitReference, chartofAccountOrBookingRules, baseCurrency, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialBookingLog {\n");
    
    sb.append("    financialAccountType: ").append(toIndentedString(financialAccountType)).append("\n");
    sb.append("    productandServiceReference: ").append(toIndentedString(productandServiceReference)).append("\n");
    sb.append("    businessUnitReference: ").append(toIndentedString(businessUnitReference)).append("\n");
    sb.append("    chartofAccountOrBookingRules: ").append(toIndentedString(chartofAccountOrBookingRules)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
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

