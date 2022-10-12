package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.sales product agreement.EvaluatePolicyTermsRequestPolicyTerms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdatePolicyTermsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class UpdatePolicyTermsRequest   {
  @JsonProperty("PolicyTerms")
  private EvaluatePolicyTermsRequestPolicyTerms policyTerms;

  public UpdatePolicyTermsRequest policyTerms(EvaluatePolicyTermsRequestPolicyTerms policyTerms) {
    this.policyTerms = policyTerms;
    return this;
  }

  /**
   * Get policyTerms
   * @return policyTerms
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluatePolicyTermsRequestPolicyTerms getPolicyTerms() {
    return policyTerms;
  }

  public void setPolicyTerms(EvaluatePolicyTermsRequestPolicyTerms policyTerms) {
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
    UpdatePolicyTermsRequest updatePolicyTermsRequest = (UpdatePolicyTermsRequest) o;
    return Objects.equals(this.policyTerms, updatePolicyTermsRequest.policyTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePolicyTermsRequest {\n");
    
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

