package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluatePolicyTermsRequestPolicyTerms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class EvaluatePolicyTermsRequestPolicyTerms   {
  @JsonProperty("BankPolicy-RuleType")
  private String bankPolicyRuleType;

  @JsonProperty("ApplicableBankPolicy-RuleReference")
  private Object applicableBankPolicyRuleReference;

  public EvaluatePolicyTermsRequestPolicyTerms bankPolicyRuleType(String bankPolicyRuleType) {
    this.bankPolicyRuleType = bankPolicyRuleType;
    return this;
  }

  /**
   * Get bankPolicyRuleType
   * @return bankPolicyRuleType
  */
  @ApiModelProperty(value = "")


  public String getBankPolicyRuleType() {
    return bankPolicyRuleType;
  }

  public void setBankPolicyRuleType(String bankPolicyRuleType) {
    this.bankPolicyRuleType = bankPolicyRuleType;
  }

  public EvaluatePolicyTermsRequestPolicyTerms applicableBankPolicyRuleReference(Object applicableBankPolicyRuleReference) {
    this.applicableBankPolicyRuleReference = applicableBankPolicyRuleReference;
    return this;
  }

  /**
   * Get applicableBankPolicyRuleReference
   * @return applicableBankPolicyRuleReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getApplicableBankPolicyRuleReference() {
    return applicableBankPolicyRuleReference;
  }

  public void setApplicableBankPolicyRuleReference(Object applicableBankPolicyRuleReference) {
    this.applicableBankPolicyRuleReference = applicableBankPolicyRuleReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluatePolicyTermsRequestPolicyTerms evaluatePolicyTermsRequestPolicyTerms = (EvaluatePolicyTermsRequestPolicyTerms) o;
    return Objects.equals(this.bankPolicyRuleType, evaluatePolicyTermsRequestPolicyTerms.bankPolicyRuleType) &&
        Objects.equals(this.applicableBankPolicyRuleReference, evaluatePolicyTermsRequestPolicyTerms.applicableBankPolicyRuleReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankPolicyRuleType, applicableBankPolicyRuleReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluatePolicyTermsRequestPolicyTerms {\n");
    
    sb.append("    bankPolicyRuleType: ").append(toIndentedString(bankPolicyRuleType)).append("\n");
    sb.append("    applicableBankPolicyRuleReference: ").append(toIndentedString(applicableBankPolicyRuleReference)).append("\n");
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

