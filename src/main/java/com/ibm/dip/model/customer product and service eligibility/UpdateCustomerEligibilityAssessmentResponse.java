package com.ibm.dip.model.customer product and service eligibility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer product and service eligibility.EvaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateCustomerEligibilityAssessmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:34.796Z[GMT]")

public class UpdateCustomerEligibilityAssessmentResponse   {
  @JsonProperty("CustomerEligibilityAssessment")
  private EvaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment customerEligibilityAssessment;

  public UpdateCustomerEligibilityAssessmentResponse customerEligibilityAssessment(EvaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment customerEligibilityAssessment) {
    this.customerEligibilityAssessment = customerEligibilityAssessment;
    return this;
  }

  /**
   * Get customerEligibilityAssessment
   * @return customerEligibilityAssessment
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment getCustomerEligibilityAssessment() {
    return customerEligibilityAssessment;
  }

  public void setCustomerEligibilityAssessment(EvaluateCustomerEligibilityAssessmentRequestCustomerEligibilityAssessment customerEligibilityAssessment) {
    this.customerEligibilityAssessment = customerEligibilityAssessment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomerEligibilityAssessmentResponse updateCustomerEligibilityAssessmentResponse = (UpdateCustomerEligibilityAssessmentResponse) o;
    return Objects.equals(this.customerEligibilityAssessment, updateCustomerEligibilityAssessmentResponse.customerEligibilityAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerEligibilityAssessment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerEligibilityAssessmentResponse {\n");
    
    sb.append("    customerEligibilityAssessment: ").append(toIndentedString(customerEligibilityAssessment)).append("\n");
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

