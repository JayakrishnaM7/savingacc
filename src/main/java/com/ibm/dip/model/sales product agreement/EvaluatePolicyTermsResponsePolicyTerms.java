package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluatePolicyTermsResponsePolicyTerms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class EvaluatePolicyTermsResponsePolicyTerms   {
  @JsonProperty("ApplicableBankPolicy-RuleInterpretation")
  private String applicableBankPolicyRuleInterpretation;

  public EvaluatePolicyTermsResponsePolicyTerms applicableBankPolicyRuleInterpretation(String applicableBankPolicyRuleInterpretation) {
    this.applicableBankPolicyRuleInterpretation = applicableBankPolicyRuleInterpretation;
    return this;
  }

  /**
   * Get applicableBankPolicyRuleInterpretation
   * @return applicableBankPolicyRuleInterpretation
  */
  @ApiModelProperty(value = "")


  public String getApplicableBankPolicyRuleInterpretation() {
    return applicableBankPolicyRuleInterpretation;
  }

  public void setApplicableBankPolicyRuleInterpretation(String applicableBankPolicyRuleInterpretation) {
    this.applicableBankPolicyRuleInterpretation = applicableBankPolicyRuleInterpretation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluatePolicyTermsResponsePolicyTerms evaluatePolicyTermsResponsePolicyTerms = (EvaluatePolicyTermsResponsePolicyTerms) o;
    return Objects.equals(this.applicableBankPolicyRuleInterpretation, evaluatePolicyTermsResponsePolicyTerms.applicableBankPolicyRuleInterpretation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicableBankPolicyRuleInterpretation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluatePolicyTermsResponsePolicyTerms {\n");
    
    sb.append("    applicableBankPolicyRuleInterpretation: ").append(toIndentedString(applicableBankPolicyRuleInterpretation)).append("\n");
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

