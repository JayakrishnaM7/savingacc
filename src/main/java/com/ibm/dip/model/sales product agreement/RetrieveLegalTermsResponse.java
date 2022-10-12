package com.ibm.dip.model.sales product agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.sales product agreement.EvaluateLegalTermsRequestSalesProductAgreement;
import com.ibm.dip.model.sales product agreement.RetrieveLegalTermsResponseLegalTerms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveLegalTermsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T10:41:46.196Z[GMT]")

public class RetrieveLegalTermsResponse   {
  @JsonProperty("SalesProductAgreement")
  private EvaluateLegalTermsRequestSalesProductAgreement salesProductAgreement;

  @JsonProperty("LegalTerms")
  private RetrieveLegalTermsResponseLegalTerms legalTerms;

  public RetrieveLegalTermsResponse salesProductAgreement(EvaluateLegalTermsRequestSalesProductAgreement salesProductAgreement) {
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

  public RetrieveLegalTermsResponse legalTerms(RetrieveLegalTermsResponseLegalTerms legalTerms) {
    this.legalTerms = legalTerms;
    return this;
  }

  /**
   * Get legalTerms
   * @return legalTerms
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveLegalTermsResponseLegalTerms getLegalTerms() {
    return legalTerms;
  }

  public void setLegalTerms(RetrieveLegalTermsResponseLegalTerms legalTerms) {
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
    RetrieveLegalTermsResponse retrieveLegalTermsResponse = (RetrieveLegalTermsResponse) o;
    return Objects.equals(this.salesProductAgreement, retrieveLegalTermsResponse.salesProductAgreement) &&
        Objects.equals(this.legalTerms, retrieveLegalTermsResponse.legalTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesProductAgreement, legalTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveLegalTermsResponse {\n");
    
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

