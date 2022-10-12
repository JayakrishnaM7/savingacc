package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.sales product agreement.EvaluateLegalTermsRequestSalesProductAgreement;
import com.ibm.dip.model.sales product agreement.EvaluatePolicyTermsRequestPolicyTerms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluatePolicyTermsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class EvaluatePolicyTermsRequest   {
  @JsonProperty("SalesProductAgreement")
  private EvaluateLegalTermsRequestSalesProductAgreement salesProductAgreement;

  @JsonProperty("PolicyTerms")
  private EvaluatePolicyTermsRequestPolicyTerms policyTerms;

  public EvaluatePolicyTermsRequest salesProductAgreement(EvaluateLegalTermsRequestSalesProductAgreement salesProductAgreement) {
    this.salesProductAgreement = salesProductAgreement;
    return this;
  }

  /**
   * Get salesProductAgreement
   * @return salesProductAgreement
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateLegalTermsRequestSalesProductAgreement getSalesProductAgreement() {
    return salesProductAgreement;
  }

  public void setSalesProductAgreement(EvaluateLegalTermsRequestSalesProductAgreement salesProductAgreement) {
    this.salesProductAgreement = salesProductAgreement;
  }

  public EvaluatePolicyTermsRequest policyTerms(EvaluatePolicyTermsRequestPolicyTerms policyTerms) {
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
    EvaluatePolicyTermsRequest evaluatePolicyTermsRequest = (EvaluatePolicyTermsRequest) o;
    return Objects.equals(this.salesProductAgreement, evaluatePolicyTermsRequest.salesProductAgreement) &&
        Objects.equals(this.policyTerms, evaluatePolicyTermsRequest.policyTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesProductAgreement, policyTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluatePolicyTermsRequest {\n");
    
    sb.append("    salesProductAgreement: ").append(toIndentedString(salesProductAgreement)).append("\n");
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

