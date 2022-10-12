package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.sales product agreement.EvaluateLegalTermsRequestLegalTerms;
import com.ibm.dip.model.sales product agreement.EvaluateLegalTermsRequestSalesProductAgreement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateLegalTermsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class EvaluateLegalTermsRequest   {
  @JsonProperty("SalesProductAgreement")
  private EvaluateLegalTermsRequestSalesProductAgreement salesProductAgreement;

  @JsonProperty("LegalTerms")
  private EvaluateLegalTermsRequestLegalTerms legalTerms;

  public EvaluateLegalTermsRequest salesProductAgreement(EvaluateLegalTermsRequestSalesProductAgreement salesProductAgreement) {
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

  public EvaluateLegalTermsRequest legalTerms(EvaluateLegalTermsRequestLegalTerms legalTerms) {
    this.legalTerms = legalTerms;
    return this;
  }

  /**
   * Get legalTerms
   * @return legalTerms
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateLegalTermsRequestLegalTerms getLegalTerms() {
    return legalTerms;
  }

  public void setLegalTerms(EvaluateLegalTermsRequestLegalTerms legalTerms) {
    this.legalTerms = legalTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateLegalTermsRequest evaluateLegalTermsRequest = (EvaluateLegalTermsRequest) o;
    return Objects.equals(this.salesProductAgreement, evaluateLegalTermsRequest.salesProductAgreement) &&
        Objects.equals(this.legalTerms, evaluateLegalTermsRequest.legalTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesProductAgreement, legalTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateLegalTermsRequest {\n");
    
    sb.append("    salesProductAgreement: ").append(toIndentedString(salesProductAgreement)).append("\n");
    sb.append("    legalTerms: ").append(toIndentedString(legalTerms)).append("\n");
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

