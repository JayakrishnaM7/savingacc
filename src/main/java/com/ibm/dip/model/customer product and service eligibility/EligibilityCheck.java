package com.ibm.dip.model.customer product and service eligibility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EligibilityCheck
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:34.796Z[GMT]")

public class EligibilityCheck   {
  @JsonProperty("CustomerProductandServiceEligibilityAssessmentResult")
  private String customerProductandServiceEligibilityAssessmentResult;

  public EligibilityCheck customerProductandServiceEligibilityAssessmentResult(String customerProductandServiceEligibilityAssessmentResult) {
    this.customerProductandServiceEligibilityAssessmentResult = customerProductandServiceEligibilityAssessmentResult;
    return this;
  }

  /**
   * Get customerProductandServiceEligibilityAssessmentResult
   * @return customerProductandServiceEligibilityAssessmentResult
  */
  @ApiModelProperty(value = "")


  public String getCustomerProductandServiceEligibilityAssessmentResult() {
    return customerProductandServiceEligibilityAssessmentResult;
  }

  public void setCustomerProductandServiceEligibilityAssessmentResult(String customerProductandServiceEligibilityAssessmentResult) {
    this.customerProductandServiceEligibilityAssessmentResult = customerProductandServiceEligibilityAssessmentResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EligibilityCheck eligibilityCheck = (EligibilityCheck) o;
    return Objects.equals(this.customerProductandServiceEligibilityAssessmentResult, eligibilityCheck.customerProductandServiceEligibilityAssessmentResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerProductandServiceEligibilityAssessmentResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityCheck {\n");
    
    sb.append("    customerProductandServiceEligibilityAssessmentResult: ").append(toIndentedString(customerProductandServiceEligibilityAssessmentResult)).append("\n");
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

