package com.ibm.dip.model.customer offer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Underwriting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:24.395Z[GMT]")

public class Underwriting   {
  @JsonProperty("CustomerIncomeStatement")
  private String customerIncomeStatement;

  @JsonProperty("CustomerDebtStatement")
  private String customerDebtStatement;

  @JsonProperty("CustomerAssetStatement")
  private String customerAssetStatement;

  @JsonProperty("UnderwritingAssessmentReference")
  private Object underwritingAssessmentReference;

  public Underwriting customerIncomeStatement(String customerIncomeStatement) {
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

  public Underwriting customerDebtStatement(String customerDebtStatement) {
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

  public Underwriting customerAssetStatement(String customerAssetStatement) {
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

  public Underwriting underwritingAssessmentReference(Object underwritingAssessmentReference) {
    this.underwritingAssessmentReference = underwritingAssessmentReference;
    return this;
  }

  /**
   * Get underwritingAssessmentReference
   * @return underwritingAssessmentReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getUnderwritingAssessmentReference() {
    return underwritingAssessmentReference;
  }

  public void setUnderwritingAssessmentReference(Object underwritingAssessmentReference) {
    this.underwritingAssessmentReference = underwritingAssessmentReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Underwriting underwriting = (Underwriting) o;
    return Objects.equals(this.customerIncomeStatement, underwriting.customerIncomeStatement) &&
        Objects.equals(this.customerDebtStatement, underwriting.customerDebtStatement) &&
        Objects.equals(this.customerAssetStatement, underwriting.customerAssetStatement) &&
        Objects.equals(this.underwritingAssessmentReference, underwriting.underwritingAssessmentReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerIncomeStatement, customerDebtStatement, customerAssetStatement, underwritingAssessmentReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Underwriting {\n");
    
    sb.append("    customerIncomeStatement: ").append(toIndentedString(customerIncomeStatement)).append("\n");
    sb.append("    customerDebtStatement: ").append(toIndentedString(customerDebtStatement)).append("\n");
    sb.append("    customerAssetStatement: ").append(toIndentedString(customerAssetStatement)).append("\n");
    sb.append("    underwritingAssessmentReference: ").append(toIndentedString(underwritingAssessmentReference)).append("\n");
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

