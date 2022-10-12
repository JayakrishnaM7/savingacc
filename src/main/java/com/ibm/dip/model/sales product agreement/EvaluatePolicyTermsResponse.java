package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.sales product agreement.EvaluatePolicyTermsResponsePolicyTerms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluatePolicyTermsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class EvaluatePolicyTermsResponse   {
  @JsonProperty("PolicyTerms")
  private EvaluatePolicyTermsResponsePolicyTerms policyTerms;

  public EvaluatePolicyTermsResponse policyTerms(EvaluatePolicyTermsResponsePolicyTerms policyTerms) {
    this.policyTerms = policyTerms;
    return this;
  }

  /**
   * Get policyTerms
   * @return policyTerms
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluatePolicyTermsResponsePolicyTerms getPolicyTerms() {
    return policyTerms;
  }

  public void setPolicyTerms(EvaluatePolicyTermsResponsePolicyTerms policyTerms) {
    this.policyTerms = policyTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluatePolicyTermsResponse evaluatePolicyTermsResponse = (EvaluatePolicyTermsResponse) o;
    return Objects.equals(this.policyTerms, evaluatePolicyTermsResponse.policyTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluatePolicyTermsResponse {\n");
    
    sb.append("    policyTerms: ").append(toIndentedString(policyTerms)).append("\n");
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

