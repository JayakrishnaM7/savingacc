package com.ibm.dip.model.customer product and service eligibility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateCustomerEligibilityAssessmentResponseCustomerEligibilityAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:34.796Z[GMT]")

public class EvaluateCustomerEligibilityAssessmentResponseCustomerEligibilityAssessment   {
  @JsonProperty("CustomerProductandServiceTypeEligibility")
  private String customerProductandServiceTypeEligibility;

  @JsonProperty("CustomerProductandServiceTypeUsage")
  private String customerProductandServiceTypeUsage;

  @JsonProperty("Date")
  private String date;

  public EvaluateCustomerEligibilityAssessmentResponseCustomerEligibilityAssessment customerProductandServiceTypeEligibility(String customerProductandServiceTypeEligibility) {
    this.customerProductandServiceTypeEligibility = customerProductandServiceTypeEligibility;
    return this;
  }

  /**
   * Get customerProductandServiceTypeEligibility
   * @return customerProductandServiceTypeEligibility
  */
  @ApiModelProperty(value = "")


  public String getCustomerProductandServiceTypeEligibility() {
    return customerProductandServiceTypeEligibility;
  }

  public void setCustomerProductandServiceTypeEligibility(String customerProductandServiceTypeEligibility) {
    this.customerProductandServiceTypeEligibility = customerProductandServiceTypeEligibility;
  }

  public EvaluateCustomerEligibilityAssessmentResponseCustomerEligibilityAssessment customerProductandServiceTypeUsage(String customerProductandServiceTypeUsage) {
    this.customerProductandServiceTypeUsage = customerProductandServiceTypeUsage;
    return this;
  }

  /**
   * Get customerProductandServiceTypeUsage
   * @return customerProductandServiceTypeUsage
  */
  @ApiModelProperty(value = "")


  public String getCustomerProductandServiceTypeUsage() {
    return customerProductandServiceTypeUsage;
  }

  public void setCustomerProductandServiceTypeUsage(String customerProductandServiceTypeUsage) {
    this.customerProductandServiceTypeUsage = customerProductandServiceTypeUsage;
  }

  public EvaluateCustomerEligibilityAssessmentResponseCustomerEligibilityAssessment date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateCustomerEligibilityAssessmentResponseCustomerEligibilityAssessment evaluateCustomerEligibilityAssessmentResponseCustomerEligibilityAssessment = (EvaluateCustomerEligibilityAssessmentResponseCustomerEligibilityAssessment) o;
    return Objects.equals(this.customerProductandServiceTypeEligibility, evaluateCustomerEligibilityAssessmentResponseCustomerEligibilityAssessment.customerProductandServiceTypeEligibility) &&
        Objects.equals(this.customerProductandServiceTypeUsage, evaluateCustomerEligibilityAssessmentResponseCustomerEligibilityAssessment.customerProductandServiceTypeUsage) &&
        Objects.equals(this.date, evaluateCustomerEligibilityAssessmentResponseCustomerEligibilityAssessment.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerProductandServiceTypeEligibility, customerProductandServiceTypeUsage, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateCustomerEligibilityAssessmentResponseCustomerEligibilityAssessment {\n");
    
    sb.append("    customerProductandServiceTypeEligibility: ").append(toIndentedString(customerProductandServiceTypeEligibility)).append("\n");
    sb.append("    customerProductandServiceTypeUsage: ").append(toIndentedString(customerProductandServiceTypeUsage)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

