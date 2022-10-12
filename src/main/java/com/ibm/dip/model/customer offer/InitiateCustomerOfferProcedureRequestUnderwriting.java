package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerOfferProcedureRequestUnderwriting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class InitiateCustomerOfferProcedureRequestUnderwriting   {
  @JsonProperty("CustomerIncomeStatement")
  private String customerIncomeStatement;

  @JsonProperty("CustomerDebtStatement")
  private String customerDebtStatement;

  @JsonProperty("CustomerAssetStatement")
  private String customerAssetStatement;

  public InitiateCustomerOfferProcedureRequestUnderwriting customerIncomeStatement(String customerIncomeStatement) {
    this.customerIncomeStatement = customerIncomeStatement;
    return this;
  }

  /**
   * Get customerIncomeStatement
   * @return customerIncomeStatement
  */
  @ApiModelProperty(value = "")


  public String getCustomerIncomeStatement() {
    return customerIncomeStatement;
  }

  public void setCustomerIncomeStatement(String customerIncomeStatement) {
    this.customerIncomeStatement = customerIncomeStatement;
  }

  public InitiateCustomerOfferProcedureRequestUnderwriting customerDebtStatement(String customerDebtStatement) {
    this.customerDebtStatement = customerDebtStatement;
    return this;
  }

  /**
   * Get customerDebtStatement
   * @return customerDebtStatement
  */
  @ApiModelProperty(value = "")


  public String getCustomerDebtStatement() {
    return customerDebtStatement;
  }

  public void setCustomerDebtStatement(String customerDebtStatement) {
    this.customerDebtStatement = customerDebtStatement;
  }

  public InitiateCustomerOfferProcedureRequestUnderwriting customerAssetStatement(String customerAssetStatement) {
    this.customerAssetStatement = customerAssetStatement;
    return this;
  }

  /**
   * Get customerAssetStatement
   * @return customerAssetStatement
  */
  @ApiModelProperty(value = "")


  public String getCustomerAssetStatement() {
    return customerAssetStatement;
  }

  public void setCustomerAssetStatement(String customerAssetStatement) {
    this.customerAssetStatement = customerAssetStatement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerOfferProcedureRequestUnderwriting initiateCustomerOfferProcedureRequestUnderwriting = (InitiateCustomerOfferProcedureRequestUnderwriting) o;
    return Objects.equals(this.customerIncomeStatement, initiateCustomerOfferProcedureRequestUnderwriting.customerIncomeStatement) &&
        Objects.equals(this.customerDebtStatement, initiateCustomerOfferProcedureRequestUnderwriting.customerDebtStatement) &&
        Objects.equals(this.customerAssetStatement, initiateCustomerOfferProcedureRequestUnderwriting.customerAssetStatement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerIncomeStatement, customerDebtStatement, customerAssetStatement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerOfferProcedureRequestUnderwriting {\n");
    
    sb.append("    customerIncomeStatement: ").append(toIndentedString(customerIncomeStatement)).append("\n");
    sb.append("    customerDebtStatement: ").append(toIndentedString(customerDebtStatement)).append("\n");
    sb.append("    customerAssetStatement: ").append(toIndentedString(customerAssetStatement)).append("\n");
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

