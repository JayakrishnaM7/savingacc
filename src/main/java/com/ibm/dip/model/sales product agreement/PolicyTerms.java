package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PolicyTerms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class PolicyTerms   {
  @JsonProperty("BankPolicy-RuleType")
  private String bankPolicyRuleType;

  @JsonProperty("ApplicableBankPolicy-RuleReference")
  private Object applicableBankPolicyRuleReference;

  @JsonProperty("ApplicableBankPolicy-RuleInterpretation")
  private String applicableBankPolicyRuleInterpretation;

  public PolicyTerms bankPolicyRuleType(String bankPolicyRuleType) {
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

  public PolicyTerms applicableBankPolicyRuleReference(Object applicableBankPolicyRuleReference) {
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

  public PolicyTerms applicableBankPolicyRuleInterpretation(String applicableBankPolicyRuleInterpretation) {
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
    PolicyTerms policyTerms = (PolicyTerms) o;
    return Objects.equals(this.bankPolicyRuleType, policyTerms.bankPolicyRuleType) &&
        Objects.equals(this.applicableBankPolicyRuleReference, policyTerms.applicableBankPolicyRuleReference) &&
        Objects.equals(this.applicableBankPolicyRuleInterpretation, policyTerms.applicableBankPolicyRuleInterpretation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankPolicyRuleType, applicableBankPolicyRuleReference, applicableBankPolicyRuleInterpretation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyTerms {\n");
    
    sb.append("    bankPolicyRuleType: ").append(toIndentedString(bankPolicyRuleType)).append("\n");
    sb.append("    applicableBankPolicyRuleReference: ").append(toIndentedString(applicableBankPolicyRuleReference)).append("\n");
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

